package typings.ol.geolocationMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColonaccuracy
import typings.ol.olStrings.changeColonaccuracyGeometry
import typings.ol.olStrings.changeColonaltitude
import typings.ol.olStrings.changeColonaltitudeAccuracy
import typings.ol.olStrings.changeColonheading
import typings.ol.olStrings.changeColonposition
import typings.ol.olStrings.changeColonprojection
import typings.ol.olStrings.changeColonspeed
import typings.ol.olStrings.changeColontracking
import typings.ol.olStrings.changeColontrackingOptions
import typings.ol.projMod.ProjectionLike
import typings.std.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geolocation
  extends typings.ol.objectMod.default {
  
  /**
    * Get the accuracy of the position in meters.
    */
  def getAccuracy(): js.UndefOr[Double] = js.native
  
  /**
    * Get a geometry of the position accuracy.
    */
  def getAccuracyGeometry(): typings.ol.polygonMod.default = js.native
  
  /**
    * Get the altitude associated with the position.
    */
  def getAltitude(): js.UndefOr[Double] = js.native
  
  /**
    * Get the altitude accuracy of the position.
    */
  def getAltitudeAccuracy(): js.UndefOr[Double] = js.native
  
  /**
    * Get the heading as radians clockwise from North.
    * Note: depending on the browser, the heading is only defined if the enableHighAccuracy
    * is set to true in the tracking options.
    */
  def getHeading(): js.UndefOr[Double] = js.native
  
  /**
    * Get the position of the device.
    */
  def getPosition(): js.UndefOr[Coordinate] = js.native
  
  /**
    * Get the projection associated with the position.
    */
  def getProjection(): js.UndefOr[typings.ol.projectionMod.default] = js.native
  
  /**
    * Get the speed in meters per second.
    */
  def getSpeed(): js.UndefOr[Double] = js.native
  
  /**
    * Determine if the device location is being tracked.
    */
  def getTracking(): Boolean = js.native
  
  /**
    * Get the tracking options.
    * See http://www.w3.org/TR/geolocation-API/#position-options.
    */
  def getTrackingOptions(): js.UndefOr[PositionOptions] = js.native
  
  @JSName("on")
  def on_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  /**
    * Set the projection to use for transforming the coordinates.
    */
  def setProjection(projection: ProjectionLike): Unit = js.native
  
  /**
    * Enable or disable tracking.
    */
  def setTracking(tracking: Boolean): Unit = js.native
  
  /**
    * Set the tracking options.
    * See http://www.w3.org/TR/geolocation-API/#position-options.
    */
  def setTrackingOptions(options: PositionOptions): Unit = js.native
  
  @JSName("un")
  def un_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
