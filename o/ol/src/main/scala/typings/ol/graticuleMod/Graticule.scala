package typings.ol.graticuleMod

import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.olStrings.postcompose
import typings.ol.olStrings.precompose
import typings.ol.olStrings.rendercomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graticule
  extends typings.ol.vectorMod.default {
  
  /**
    * Get the list of meridians.  Meridians are lines of equal longitude.
    */
  def getMeridians(): js.Array[typings.ol.lineStringMod.default] = js.native
  
  /**
    * Get the list of parallels.  Parallels are lines of equal latitude.
    */
  def getParallels(): js.Array[typings.ol.lineStringMod.default] = js.native
  
  /**
    * Update geometries in the source based on current view
    */
  def loaderFunction(extent: Extent, resolution: Double, projection: typings.ol.projectionMod.default): Unit = js.native
  
  @JSName("on")
  def on_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
  
  /**
    * Strategy function for loading features based on the view's extent and
    * resolution.
    */
  def strategyFunction(extent: Extent, resolution: Double): js.Array[Extent] = js.native
  
  @JSName("un")
  def un_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
}
