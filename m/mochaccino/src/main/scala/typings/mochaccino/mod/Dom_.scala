package typings.mochaccino.mod

import typings.mochaccino.mochaccinoStrings.document
import typings.mochaccino.mochaccinoStrings.navigator
import typings.mochaccino.mochaccinoStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dom_ extends js.Object {
  var exposedProperties: js.Tuple3[window, navigator, document] = js.native
  def clear(): Unit = js.native
  def create(): Unit = js.native
  def destroy(): Unit = js.native
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
  @scala.inline
  implicit class Dom_Ops[Self <: Dom_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setExposedProperties(value: js.Tuple3[window, navigator, document]): Self = this.set("exposedProperties", value.asInstanceOf[js.Any])
  }
  
}

