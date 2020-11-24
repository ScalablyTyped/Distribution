package typings.openseadragon.mod

import typings.openseadragon.anon.Columns
import typings.openseadragon.anon.Index
import typings.std.Event
import typings.std.EventSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "World")
@js.native
class World protected () extends EventSource {
  def this(options: js.Object) = this()
  
  def addHandler(eventName: WorldEventName, callback: EventHandler[WorldEvent]): Unit = js.native
  def addHandler(eventName: WorldEventName, callback: EventHandler[WorldEvent], userData: js.Object): Unit = js.native
  
  def addItem(item: TiledImage): Unit = js.native
  def addItem(item: TiledImage, options: Index): Unit = js.native
  
  def addOnceHandler(eventName: String, handler: EventHandler[WorldEvent]): Unit = js.native
  def addOnceHandler(
    eventName: String,
    handler: EventHandler[WorldEvent],
    userData: js.UndefOr[scala.Nothing],
    times: Double
  ): Unit = js.native
  def addOnceHandler(eventName: String, handler: EventHandler[WorldEvent], userData: js.Object): Unit = js.native
  def addOnceHandler(eventName: String, handler: EventHandler[WorldEvent], userData: js.Object, times: Double): Unit = js.native
  
  def arrange(options: Columns): Unit = js.native
  
  def draw(): Unit = js.native
  
  def getContentFactor(): Double = js.native
  
  def getHandler(eventName: String): js.Function1[/* event */ Event, Unit] = js.native
  
  def getHomeBounds(): Rect = js.native
  
  def getIndexOfItem(item: TiledImage): Double = js.native
  
  def getItemAt(id: Double): TiledImage = js.native
  
  def getItemCount(): Double = js.native
  
  def needsDraw(): Boolean = js.native
  
  def raiseEvent(eventName: String): Unit = js.native
  def raiseEvent(eventName: String, eventArgs: js.Object): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def removeAllHandlers(eventName: String): Unit = js.native
  
  def removeHandler(eventName: String, handler: EventHandler[WorldEvent]): Unit = js.native
  
  def removeItem(item: TiledImage): Unit = js.native
  
  def resetItems(): Unit = js.native
  
  def setAutoRefigureSizes(): Unit = js.native
  def setAutoRefigureSizes(value: Boolean): Unit = js.native
  
  def setItemIndex(item: TiledImage, index: Double): Unit = js.native
  
  def update(): Unit = js.native
}
