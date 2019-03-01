package typings
package atOracleOraclejetLib.ojcompositeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModel extends js.Object {
  def activated(param0: ViewModelContext): js.Promise[_] | scala.Unit
  def bindingsApplied(param0: ViewModelContext): scala.Unit
  def connected(param0: ViewModelContext): scala.Unit
  def disconnected(param0: stdLib.Element): scala.Unit
  def propertyChanged(param0: PropertyChangedContext): scala.Unit
}

object ViewModel {
  @scala.inline
  def apply(
    activated: js.Function1[ViewModelContext, js.Promise[_] | scala.Unit],
    bindingsApplied: js.Function1[ViewModelContext, scala.Unit],
    connected: js.Function1[ViewModelContext, scala.Unit],
    disconnected: js.Function1[stdLib.Element, scala.Unit],
    propertyChanged: js.Function1[PropertyChangedContext, scala.Unit]
  ): ViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activated")(activated)
    __obj.updateDynamic("bindingsApplied")(bindingsApplied)
    __obj.updateDynamic("connected")(connected)
    __obj.updateDynamic("disconnected")(disconnected)
    __obj.updateDynamic("propertyChanged")(propertyChanged)
    __obj.asInstanceOf[ViewModel]
  }
}

