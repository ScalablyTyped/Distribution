package typings.openseadragon.mod

import typings.openseadragon.anon.Columns
import typings.openseadragon.anon.Index
import typings.openseadragon.openseadragonStrings.`add-item`
import typings.openseadragon.openseadragonStrings.`item-index-change`
import typings.openseadragon.openseadragonStrings.`metrics-change`
import typings.openseadragon.openseadragonStrings.`remove-item`
import typings.std.Event
import typings.std.EventSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "World")
@js.native
open class World protected ()
  extends StObject
     with EventSource {
  def this(options: js.Object) = this()
  
  @JSName("addHandler")
  def addHandler_additem(eventName: `add-item`, callback: EventHandler[AddItemWorldEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_additem(eventName: `add-item`, callback: EventHandler[AddItemWorldEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_itemindexchange(eventName: `item-index-change`, callback: EventHandler[ItemIndexChangeWorldEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_itemindexchange(
    eventName: `item-index-change`,
    callback: EventHandler[ItemIndexChangeWorldEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addHandler")
  def addHandler_metricschange(eventName: `metrics-change`, callback: EventHandler[WorldEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_metricschange(eventName: `metrics-change`, callback: EventHandler[WorldEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_removeitem(eventName: `remove-item`, callback: EventHandler[RemoveItemWorldEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_removeitem(eventName: `remove-item`, callback: EventHandler[RemoveItemWorldEvent], userData: js.Object): Unit = js.native
  
  def addItem(item: TiledImage): Unit = js.native
  def addItem(item: TiledImage, options: Index): Unit = js.native
  
  @JSName("addOnceHandler")
  def addOnceHandler_additem(eventName: `add-item`, callback: EventHandler[AddItemWorldEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_additem(eventName: `add-item`, callback: EventHandler[AddItemWorldEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_additem(
    eventName: `add-item`,
    callback: EventHandler[AddItemWorldEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_additem(eventName: `add-item`, callback: EventHandler[AddItemWorldEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_itemindexchange(eventName: `item-index-change`, callback: EventHandler[ItemIndexChangeWorldEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_itemindexchange(
    eventName: `item-index-change`,
    callback: EventHandler[ItemIndexChangeWorldEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_itemindexchange(
    eventName: `item-index-change`,
    callback: EventHandler[ItemIndexChangeWorldEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_itemindexchange(
    eventName: `item-index-change`,
    callback: EventHandler[ItemIndexChangeWorldEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_metricschange(eventName: `metrics-change`, callback: EventHandler[WorldEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_metricschange(eventName: `metrics-change`, callback: EventHandler[WorldEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_metricschange(
    eventName: `metrics-change`,
    callback: EventHandler[WorldEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_metricschange(eventName: `metrics-change`, callback: EventHandler[WorldEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_removeitem(eventName: `remove-item`, callback: EventHandler[RemoveItemWorldEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_removeitem(eventName: `remove-item`, callback: EventHandler[RemoveItemWorldEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_removeitem(
    eventName: `remove-item`,
    callback: EventHandler[RemoveItemWorldEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_removeitem(
    eventName: `remove-item`,
    callback: EventHandler[RemoveItemWorldEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  
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
  
  def removeAllHandlers(eventName: `add-item` | `item-index-change` | `metrics-change` | `remove-item`): Unit = js.native
  
  @JSName("removeHandler")
  def removeHandler_additem(eventName: `add-item`, callback: EventHandler[AddItemWorldEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_itemindexchange(eventName: `item-index-change`, callback: EventHandler[ItemIndexChangeWorldEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_metricschange(eventName: `metrics-change`, callback: EventHandler[WorldEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_removeitem(eventName: `remove-item`, callback: EventHandler[RemoveItemWorldEvent]): Unit = js.native
  
  def removeItem(item: TiledImage): Unit = js.native
  
  def resetItems(): Unit = js.native
  
  def setAutoRefigureSizes(): Unit = js.native
  def setAutoRefigureSizes(value: Boolean): Unit = js.native
  
  def setItemIndex(item: TiledImage, index: Double): Unit = js.native
  
  def update(): Unit = js.native
}
