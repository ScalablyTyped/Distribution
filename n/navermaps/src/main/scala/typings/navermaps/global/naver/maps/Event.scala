package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.DOMEventListener
import typings.navermaps.naver.maps.MapEventListener
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Event {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.Event")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDOMListener(element: HTMLElement, eventName: String, listener: js.Function1[/* event */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDOMListener")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addListener(target: js.Any, eventName: String, listener: js.Function1[/* event */ js.Any, js.Any]): MapEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[MapEventListener]
  
  inline def clearInstanceListeners(target: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInstanceListeners")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearListeners(target: js.Any, fromEventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")(target.asInstanceOf[js.Any], fromEventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forward(source: js.Any, fromEventName: String, target: js.Any, toEventName: String): MapEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("forward")(source.asInstanceOf[js.Any], fromEventName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], toEventName.asInstanceOf[js.Any])).asInstanceOf[MapEventListener]
  
  inline def hasListener(target: js.Any, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def once(target: js.Any, eventName: String, listener: js.Function1[/* event */ js.Any, js.Any]): MapEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[MapEventListener]
  
  inline def removeDOMListener(element: HTMLElement, eventName: String, listener: js.Function1[/* event */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDOMListener")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeDOMListener(listeners: js.Array[DOMEventListener]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDOMListener")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeDOMListener(listeners: DOMEventListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDOMListener")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeListener(listeners: js.Array[MapEventListener]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeListener(listeners: MapEventListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resumeDispatch(target: js.Any, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resumeDispatch")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stopDispatch(target: js.Any, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stopDispatch")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trigger(target: js.Any, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(target: js.Any, eventName: String, eventObject: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
