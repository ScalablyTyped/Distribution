package typings.openseadragon.mod

import typings.openseadragon.anon.Element
import typings.std.EventSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "Button")
@js.native
open class Button protected ()
  extends StObject
     with EventSource {
  def this(options: Element) = this()
  
  def addHandler(eventName: ButtonEventName, handler: EventHandler[ButtonEvent]): Unit = js.native
  def addHandler(eventName: ButtonEventName, handler: EventHandler[ButtonEvent], userData: js.Object): Unit = js.native
  
  def addOnceHandler(eventName: ButtonEventName, handler: EventHandler[ButtonEvent]): Unit = js.native
  def addOnceHandler(eventName: ButtonEventName, handler: EventHandler[ButtonEvent], userData: js.Object): Unit = js.native
  def addOnceHandler(eventName: ButtonEventName, handler: EventHandler[ButtonEvent], userData: js.Object, times: Double): Unit = js.native
  def addOnceHandler(eventName: ButtonEventName, handler: EventHandler[ButtonEvent], userData: Unit, times: Double): Unit = js.native
  
  var currentState: ButtonState = js.native
  
  def destroy(): Unit = js.native
  
  def disable(): Unit = js.native
  
  var element: typings.std.Element = js.native
  
  def enable(): Unit = js.native
  
  var fadeDelay: Double = js.native
  
  var fadeLength: Double = js.native
  
  def getHandler(eventName: ButtonEventName): js.Function2[/* source */ ButtonEventName, /* repeated */ Any, Unit] = js.native
  
  def notifyGroupEnter(): Unit = js.native
  
  def notifyGroupExit(): Unit = js.native
  
  def raiseEvent(eventName: ButtonEventName, eventArgs: js.Object): Unit = js.native
  
  def removeAllHandlers(eventName: ButtonEventName): Unit = js.native
  
  def removeHandler(eventName: ButtonEventName, handler: EventHandler[ButtonEvent]): Unit = js.native
  
  var tracker: MouseTracker = js.native
}
