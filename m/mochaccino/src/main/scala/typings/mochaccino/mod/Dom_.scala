package typings.mochaccino.mod

import typings.mochaccino.mochaccinoStrings.document
import typings.mochaccino.mochaccinoStrings.navigator
import typings.mochaccino.mochaccinoStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom_ extends js.Object {
  var exposedProperties: js.Tuple3[window, navigator, document]
  def clear(): Unit
  def create(): Unit
  def destroy(): Unit
}

object Dom_ {
  @scala.inline
  def apply(
    clear: () => Unit,
    create: () => Unit,
    destroy: () => Unit,
    exposedProperties: js.Tuple3[window, navigator, document]
  ): Dom_ = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction0(destroy), exposedProperties = exposedProperties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Dom_]
  }
}

