package typings.openseadragon.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "removeEvent")
@js.native
object removeEvent extends js.Object {
  def apply(element: String, eventName: String, handler: EventHandler[_]): Unit = js.native
  def apply(element: String, eventName: String, handler: EventHandler[_], useCapture: Boolean): Unit = js.native
  def apply(element: Element, eventName: String, handler: EventHandler[_]): Unit = js.native
  def apply(element: Element, eventName: String, handler: EventHandler[_], useCapture: Boolean): Unit = js.native
}

