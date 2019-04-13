package typings
package atOracleOraclejetLib.ojrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterState extends js.Object {
  var canEnter: js.Function0[scala.Boolean] | js.Function0[js.Promise[scala.Boolean]]
  var canExit: js.Function0[scala.Boolean] | js.Function0[js.Promise[scala.Boolean]]
  var enter: js.Function0[scala.Unit] | js.Function0[js.Promise[scala.Unit]]
  var exit: js.Function0[scala.Unit] | js.Function0[js.Promise[scala.Unit]]
  val id: java.lang.String
  var label: js.UndefOr[java.lang.String]
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
    canEnter: js.Function0[scala.Boolean] | js.Function0[js.Promise[scala.Boolean]],
    canExit: js.Function0[scala.Boolean] | js.Function0[js.Promise[scala.Boolean]],
    enter: js.Function0[scala.Unit] | js.Function0[js.Promise[scala.Unit]],
    exit: js.Function0[scala.Unit] | js.Function0[js.Promise[scala.Unit]],
    go: () => js.Promise[atOracleOraclejetLib.Anon_HasChanged],
    id: java.lang.String,
    isCurrent: () => scala.Boolean,
    parameters: js.Object,
    title: java.lang.String | js.Function0[js.UndefOr[java.lang.String]],
    value: js.Any,
    label: java.lang.String = null
  ): RouterState = {
    val __obj = js.Dynamic.literal(canEnter = canEnter.asInstanceOf[js.Any], canExit = canExit.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], go = js.Any.fromFunction0(go), id = id, isCurrent = js.Any.fromFunction0(isCurrent), parameters = parameters, title = title.asInstanceOf[js.Any], value = value)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[RouterState]
  }
}

