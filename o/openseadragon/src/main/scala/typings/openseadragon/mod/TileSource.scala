package typings.openseadragon.mod

import typings.std.Document
import typings.std.Event
import typings.std.EventSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "TileSource")
@js.native
class TileSource protected ()
  extends StObject
     with EventSource {
  def this(options: TileSourceOptions) = this()
  
  def addHandler(eventName: String, handler: EventHandler[TileSourceEvent]): Unit = js.native
  def addHandler(eventName: String, handler: EventHandler[TileSourceEvent], userData: js.Object): Unit = js.native
  
  def addOnceHandler(eventName: String, handler: EventHandler[TileSourceEvent]): Unit = js.native
  def addOnceHandler(eventName: String, handler: EventHandler[TileSourceEvent], userData: js.Object): Unit = js.native
  def addOnceHandler(eventName: String, handler: EventHandler[TileSourceEvent], userData: js.Object, times: Double): Unit = js.native
  def addOnceHandler(eventName: String, handler: EventHandler[TileSourceEvent], userData: Unit, times: Double): Unit = js.native
  
  var aspectRatio: Double = js.native
  
  def configure(data: String): js.Object = js.native
  def configure(data: js.Array[js.Any]): js.Object = js.native
  def configure(data: js.Object): js.Object = js.native
  def configure(data: Document): js.Object = js.native
  
  var dimensions: Point = js.native
  
  def getClosestLevel(): Double = js.native
  
  def getHandler(eventName: String): js.Function1[/* event */ Event, Unit] = js.native
  
  def getImageInfo(url: String): Unit = js.native
  
  def getLevelScale(level: Double): Double = js.native
  
  def getNumTiles(level: Double): Double = js.native
  
  def getPixelRatio(level: Double): Double = js.native
  
  def getTileAjaxHeaders(level: Double, x: Double, y: Double): js.Object = js.native
  
  def getTileAtPoint(level: Double, point: Point): Tile = js.native
  
  def getTileBounds(level: Double, x: Double, y: Double): Rect = js.native
  def getTileBounds(level: Double, x: Double, y: Double, isSource: Boolean): Rect = js.native
  
  def getTileHeight(level: Double): Double = js.native
  
  def getTileUrl(level: Double, x: Double, y: Double): String = js.native
  
  def getTileWidth(level: Double): Double = js.native
  
  var maxLevel: Double = js.native
  
  var minlevel: Double = js.native
  
  def raiseEvent(eventName: String, eventArgs: js.Object): Unit = js.native
  
  var ready: Boolean = js.native
  
  def removeAllHandlers(eventName: String): Unit = js.native
  
  def removeHandler(eventName: String, handler: EventHandler[TileSourceEvent]): Unit = js.native
  
  def supports(data: String, url: String): Boolean = js.native
  def supports(data: js.Array[js.Any], url: String): Boolean = js.native
  def supports(data: js.Object, url: String): Boolean = js.native
  def supports(data: Document, url: String): Boolean = js.native
  
  def tileExists(level: Double, x: Double, y: Double): Boolean = js.native
  
  var tileOverlap: Double = js.native
}
