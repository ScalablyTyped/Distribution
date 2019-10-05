package typings.atOracleOraclejet.ojrouterMod

import typings.atOracleOraclejet.Anon_HasChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("RouterState")
trait RouterState_ extends js.Object {
  var canEnter: js.Function0[Boolean | js.Promise[Boolean]]
  var canExit: js.Function0[Boolean | js.Promise[Boolean]]
  var enter: js.Function0[js.Promise[Unit] | Unit]
  var exit: js.Function0[js.Promise[Unit] | Unit]
  val id: String
  var label: js.UndefOr[String] = js.undefined
  var parameters: js.Object
  var title: String | js.Function0[js.UndefOr[String]]
  var value: js.Any
  // constructor(id: string, options?: RouterState.ConfigOptions, router?: Router);
  def go(): js.Promise[Anon_HasChanged]
  def isCurrent(): Boolean
}

object RouterState_ {
  @scala.inline
  def apply(
    canEnter: () => Boolean | js.Promise[Boolean],
    canExit: () => Boolean | js.Promise[Boolean],
    enter: () => js.Promise[Unit] | Unit,
    exit: () => js.Promise[Unit] | Unit,
    go: () => js.Promise[Anon_HasChanged],
    id: String,
    isCurrent: () => Boolean,
    parameters: js.Object,
    title: String | js.Function0[js.UndefOr[String]],
    value: js.Any,
    label: String = null
  ): RouterState_ = {
    val __obj = js.Dynamic.literal(canEnter = js.Any.fromFunction0(canEnter), canExit = js.Any.fromFunction0(canExit), enter = js.Any.fromFunction0(enter), exit = js.Any.fromFunction0(exit), go = js.Any.fromFunction0(go), id = id, isCurrent = js.Any.fromFunction0(isCurrent), parameters = parameters, title = title.asInstanceOf[js.Any], value = value)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[RouterState_]
  }
}

