package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Event")
@js.native
object Event extends js.Object {
  def apply(): Unit = js.native
  def addDOMListener(element: HTMLElement, eventName: String, listener: js.Function1[/* event */ js.Any, _]): Unit = js.native
  def addListener(target: js.Any, eventName: String, listener: js.Function1[/* event */ js.Any, _]): MapEventListener = js.native
  def clearInstanceListeners(target: js.Any): Unit = js.native
  def clearListeners(target: js.Any, fromEventName: String): Unit = js.native
  def forward(source: js.Any, fromEventName: String, target: js.Any, toEventName: String): MapEventListener = js.native
  def hasListener(target: js.Any, eventName: String): Boolean = js.native
  def once(target: js.Any, eventName: String, listener: js.Function1[/* event */ js.Any, _]): MapEventListener = js.native
  def removeDOMListener(element: HTMLElement, eventName: String, listener: js.Function1[/* event */ js.Any, _]): Unit = js.native
  def removeDOMListener(listeners: js.Array[DOMEventListener]): Unit = js.native
  def removeDOMListener(listeners: DOMEventListener): Unit = js.native
  def removeListener(listeners: js.Array[MapEventListener]): Unit = js.native
  def removeListener(listeners: MapEventListener): Unit = js.native
  def resumeDispatch(target: js.Any, eventName: String): Unit = js.native
  def stopDispatch(target: js.Any, eventName: String): Unit = js.native
  def trigger(target: js.Any, eventName: String): Unit = js.native
  def trigger(target: js.Any, eventName: String, eventObject: js.Any): Unit = js.native
}

