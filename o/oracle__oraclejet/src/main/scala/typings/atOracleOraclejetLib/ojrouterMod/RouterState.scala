package typings
package atOracleOraclejetLib.ojrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterState extends js.Object {
  var canEnter: js.Function0[scala.Boolean | js.Promise[scala.Boolean]]
  var canExit: js.Function0[scala.Boolean | js.Promise[scala.Boolean]]
  var enter: js.Function0[js.Promise[scala.Unit] | scala.Unit]
  var exit: js.Function0[js.Promise[scala.Unit] | scala.Unit]
  val id: java.lang.String
  var label: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.Object
  var title: java.lang.String | js.Function0[js.UndefOr[java.lang.String]]
  var value: js.Any
  // constructor(id: string, options?: RouterState.ConfigOptions, router?: Router);
  def go(): js.Promise[atOracleOraclejetLib.Anon_HasChanged]
  def isCurrent(): scala.Boolean
}

object RouterState {
  @scala.inline
  def apply(
    canEnter: () => scala.Boolean | js.Promise[scala.Boolean],
    canExit: () => scala.Boolean | js.Promise[scala.Boolean],
    enter: () => js.Promise[scala.Unit] | scala.Unit,
    exit: () => js.Promise[scala.Unit] | scala.Unit,
    go: () => js.Promise[atOracleOraclejetLib.Anon_HasChanged],
    id: java.lang.String,
    isCurrent: () => scala.Boolean,
    parameters: js.Object,
    title: java.lang.String | js.Function0[js.UndefOr[java.lang.String]],
    value: js.Any,
    label: java.lang.String = null
  ): RouterState = {
    val __obj = js.Dynamic.literal(canEnter = js.Any.fromFunction0(canEnter), canExit = js.Any.fromFunction0(canExit), enter = js.Any.fromFunction0(enter), exit = js.Any.fromFunction0(exit), go = js.Any.fromFunction0(go), id = id, isCurrent = js.Any.fromFunction0(isCurrent), parameters = parameters, title = title.asInstanceOf[js.Any], value = value)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[RouterState]
  }
}

