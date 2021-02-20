package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.DOMEventListener
import typings.navermaps.naver.maps.MapEventListener
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Event {
  
  @JSGlobal("naver.maps.Event")
  @js.native
  def apply(): Unit = js.native
  
  @JSGlobal("naver.maps.Event.addDOMListener")
  @js.native
  def addDOMListener(element: HTMLElement, eventName: String, listener: js.Function1[/* event */ js.Any, _]): Unit = js.native
  
  @JSGlobal("naver.maps.Event.addListener")
  @js.native
  def addListener(target: js.Any, eventName: String, listener: js.Function1[/* event */ js.Any, _]): MapEventListener = js.native
  
  @JSGlobal("naver.maps.Event.clearInstanceListeners")
  @js.native
  def clearInstanceListeners(target: js.Any): Unit = js.native
  
  @JSGlobal("naver.maps.Event.clearListeners")
  @js.native
  def clearListeners(target: js.Any, fromEventName: String): Unit = js.native
  
  @JSGlobal("naver.maps.Event.forward")
  @js.native
  def forward(source: js.Any, fromEventName: String, target: js.Any, toEventName: String): MapEventListener = js.native
  
  @JSGlobal("naver.maps.Event.hasListener")
  @js.native
  def hasListener(target: js.Any, eventName: String): Boolean = js.native
  
  @JSGlobal("naver.maps.Event.once")
  @js.native
  def once(target: js.Any, eventName: String, listener: js.Function1[/* event */ js.Any, _]): MapEventListener = js.native
  
  @JSGlobal("naver.maps.Event.removeDOMListener")
  @js.native
  def removeDOMListener(element: HTMLElement, eventName: String, listener: js.Function1[/* event */ js.Any, _]): Unit = js.native
  @JSGlobal("naver.maps.Event.removeDOMListener")
  @js.native
  def removeDOMListener(listeners: js.Array[DOMEventListener]): Unit = js.native
  @JSGlobal("naver.maps.Event.removeDOMListener")
  @js.native
  def removeDOMListener(listeners: DOMEventListener): Unit = js.native
  
  @JSGlobal("naver.maps.Event.removeListener")
  @js.native
  def removeListener(listeners: js.Array[MapEventListener]): Unit = js.native
  @JSGlobal("naver.maps.Event.removeListener")
  @js.native
  def removeListener(listeners: MapEventListener): Unit = js.native
  
  @JSGlobal("naver.maps.Event.resumeDispatch")
  @js.native
  def resumeDispatch(target: js.Any, eventName: String): Unit = js.native
  
  @JSGlobal("naver.maps.Event.stopDispatch")
  @js.native
  def stopDispatch(target: js.Any, eventName: String): Unit = js.native
  
  @JSGlobal("naver.maps.Event.trigger")
  @js.native
  def trigger(target: js.Any, eventName: String): Unit = js.native
  @JSGlobal("naver.maps.Event.trigger")
  @js.native
  def trigger(target: js.Any, eventName: String, eventObject: js.Any): Unit = js.native
}
