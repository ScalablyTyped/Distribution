package typings.overlayscrollbars.mod

import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension extends js.Object {
  def added(): Unit = js.native
  def added(options: js.Object): Unit = js.native
  def contract(global: js.Any): Boolean = js.native
  def on(callbackName: String): Unit = js.native
  def on(callbackName: String, callbackArgs: DirectionChangedArgs): Unit = js.native
  def on(callbackName: String, callbackArgs: OverflowAmountChangedArgs): Unit = js.native
  def on(callbackName: String, callbackArgs: OverflowChangedArgs): Unit = js.native
  def on(callbackName: String, callbackArgs: SizeChangedArgs): Unit = js.native
  def on(callbackName: String, callbackArgs: UpdatedArgs): Unit = js.native
  def on(callbackName: String, callbackArgs: UIEvent): Unit = js.native
  def removed(): Unit = js.native
}

