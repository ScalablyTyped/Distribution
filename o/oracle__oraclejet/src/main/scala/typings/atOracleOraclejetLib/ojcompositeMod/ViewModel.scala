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
    activated: ViewModelContext => js.Promise[_] | scala.Unit,
    bindingsApplied: ViewModelContext => scala.Unit,
    connected: ViewModelContext => scala.Unit,
    disconnected: stdLib.Element => scala.Unit,
    propertyChanged: PropertyChangedContext => scala.Unit
  ): ViewModel = {
    val __obj = js.Dynamic.literal(activated = js.Any.fromFunction1(activated), bindingsApplied = js.Any.fromFunction1(bindingsApplied), connected = js.Any.fromFunction1(connected), disconnected = js.Any.fromFunction1(disconnected), propertyChanged = js.Any.fromFunction1(propertyChanged))
  
    __obj.asInstanceOf[ViewModel]
  }
}

