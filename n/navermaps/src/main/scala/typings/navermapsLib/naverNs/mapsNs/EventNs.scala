package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Event")
@js.native
object EventNs extends js.Object {
  def addDOMListener(
    element: stdLib.HTMLElement,
    eventName: java.lang.String,
    listener: js.Function1[/* event */ js.Any, _]
  ): scala.Unit = js.native
  def addListener(target: js.Any, eventName: java.lang.String, listener: js.Function1[/* event */ js.Any, _]): navermapsLib.naverNs.mapsNs.MapEventListener = js.native
  def clearInstanceListeners(target: js.Any): scala.Unit = js.native
  def clearListeners(target: js.Any, fromEventName: java.lang.String): scala.Unit = js.native
  def forward(source: js.Any, fromEventName: java.lang.String, target: js.Any, toEventName: java.lang.String): navermapsLib.naverNs.mapsNs.MapEventListener = js.native
  def hasListener(target: js.Any, eventName: java.lang.String): scala.Boolean = js.native
  def once(target: js.Any, eventName: java.lang.String, listener: js.Function1[/* event */ js.Any, _]): navermapsLib.naverNs.mapsNs.MapEventListener = js.native
  def removeDOMListener(
    element: stdLib.HTMLElement,
    eventName: java.lang.String,
    listener: js.Function1[/* event */ js.Any, _]
  ): scala.Unit = js.native
  def removeDOMListener(listeners: js.Array[navermapsLib.naverNs.mapsNs.DOMEventListener]): scala.Unit = js.native
  def removeDOMListener(listeners: navermapsLib.naverNs.mapsNs.DOMEventListener): scala.Unit = js.native
  def removeListener(listeners: js.Array[navermapsLib.naverNs.mapsNs.MapEventListener]): scala.Unit = js.native
  def removeListener(listeners: navermapsLib.naverNs.mapsNs.MapEventListener): scala.Unit = js.native
  def resumeDispatch(target: js.Any, eventName: java.lang.String): scala.Unit = js.native
  def stopDispatch(target: js.Any, eventName: java.lang.String): scala.Unit = js.native
  def trigger(target: js.Any, eventName: java.lang.String): scala.Unit = js.native
  def trigger(target: js.Any, eventName: java.lang.String, eventObject: js.Any): scala.Unit = js.native
}

