package typings.atOracleOraclejet.ojcompositeMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModel extends js.Object {
  def activated(param0: ViewModelContext): js.Promise[_] | Unit
  def bindingsApplied(param0: ViewModelContext): Unit
  def connected(param0: ViewModelContext): Unit
  def disconnected(param0: Element): Unit
  def propertyChanged(param0: PropertyChangedContext): Unit
}

object ViewModel {
  @scala.inline
  def apply(
    activated: ViewModelContext => js.Promise[_] | Unit,
    bindingsApplied: ViewModelContext => Unit,
    connected: ViewModelContext => Unit,
    disconnected: Element => Unit,
    propertyChanged: PropertyChangedContext => Unit
  ): ViewModel = {
    val __obj = js.Dynamic.literal(activated = js.Any.fromFunction1(activated), bindingsApplied = js.Any.fromFunction1(bindingsApplied), connected = js.Any.fromFunction1(connected), disconnected = js.Any.fromFunction1(disconnected), propertyChanged = js.Any.fromFunction1(propertyChanged))
  
    __obj.asInstanceOf[ViewModel]
  }
}

