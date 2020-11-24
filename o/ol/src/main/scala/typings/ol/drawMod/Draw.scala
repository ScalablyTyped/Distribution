package typings.ol.drawMod

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.drawabort
import typings.ol.olStrings.drawend
import typings.ol.olStrings.drawstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draw
  extends typings.ol.pointerMod.default {
  
  /**
    * Stop drawing without adding the sketch feature to the target layer.
    */
  def abortDrawing(): Unit = js.native
  
  /**
    * Append coordinates to the end of the geometry that is currently being drawn.
    * This can be used when drawing LineStrings or Polygons. Coordinates will
    * either be appended to the current LineString or the outer ring of the current
    * Polygon.
    */
  def appendCoordinates(coordinates: LineCoordType): Unit = js.native
  
  /**
    * Initiate draw mode by starting from an existing geometry which will
    * receive new additional points. This only works on features with
    * LineString geometries, where the interaction will extend lines by adding
    * points to the end of the coordinates array.
    * This will change the original feature, instead of drawing a copy.
    * The function will dispatch a drawstart event.
    */
  def extend(feature: typings.ol.olFeatureMod.default[typings.ol.lineStringMod.default]): Unit = js.native
  
  /**
    * Stop drawing and add the sketch feature to the target layer.
    * The {@link module:ol/interaction/Draw~DrawEventType.DRAWEND} event is
    * dispatched before inserting the feature.
    */
  def finishDrawing(): Unit = js.native
  
  /**
    * Get the overlay layer that this interaction renders sketch features to.
    */
  def getOverlay(): typings.ol.vectorMod.default = js.native
  
  @JSName("on")
  def on_drawabort(`type`: drawabort, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_drawabort(`type`: drawabort, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  
  /**
    * Remove last point of the feature currently being drawn.
    */
  def removeLastPoint(): Unit = js.native
  
  @JSName("un")
  def un_drawabort(`type`: drawabort, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
}
