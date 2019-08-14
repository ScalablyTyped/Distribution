package typings.ol.geolocationMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:accuracyGeometry`
import typings.ol.olStrings.`change:accuracy`
import typings.ol.olStrings.`change:altitudeAccuracy`
import typings.ol.olStrings.`change:altitude`
import typings.ol.olStrings.`change:heading`
import typings.ol.olStrings.`change:position`
import typings.ol.olStrings.`change:projection`
import typings.ol.olStrings.`change:speed`
import typings.ol.olStrings.`change:trackingOptions`
import typings.ol.olStrings.`change:tracking`
import typings.ol.olStrings.error
import typings.ol.projMod.ProjectionLike
import typings.std.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geolocation
  extends typings.ol.objectMod.default {
  def getAccuracy(): js.UndefOr[Double] = js.native
  def getAccuracyGeometry(): typings.ol.geomPolygonMod.default = js.native
  def getAltitude(): js.UndefOr[Double] = js.native
  def getAltitudeAccuracy(): js.UndefOr[Double] = js.native
  def getHeading(): js.UndefOr[Double] = js.native
  def getPosition(): js.UndefOr[Coordinate] = js.native
  def getProjection(): js.UndefOr[typings.ol.projProjectionMod.default] = js.native
  def getSpeed(): js.UndefOr[Double] = js.native
  def getTracking(): Boolean = js.native
  def getTrackingOptions(): js.UndefOr[PositionOptions] = js.native
  @JSName("on")
  def on_changeaccuracy(`type`: `change:accuracy`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeaccuracyGeometry(`type`: `change:accuracyGeometry`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changealtitude(`type`: `change:altitude`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changealtitudeAccuracy(`type`: `change:altitudeAccuracy`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeheading(`type`: `change:heading`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeposition(`type`: `change:position`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeprojection(`type`: `change:projection`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changespeed(`type`: `change:speed`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changetracking(`type`: `change:tracking`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changetrackingOptions(`type`: `change:trackingOptions`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_error(`type`: error, listener: js.Function1[/* evt */ js.Any, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeaccuracy(`type`: `change:accuracy`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeaccuracyGeometry(`type`: `change:accuracyGeometry`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changealtitude(`type`: `change:altitude`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changealtitudeAccuracy(`type`: `change:altitudeAccuracy`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeheading(`type`: `change:heading`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeposition(`type`: `change:position`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeprojection(`type`: `change:projection`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changespeed(`type`: `change:speed`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetracking(`type`: `change:tracking`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetrackingOptions(`type`: `change:trackingOptions`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_error(`type`: error, listener: js.Function1[/* evt */ js.Any, Unit]): EventsKey = js.native
  def setProjection(projection: ProjectionLike): Unit = js.native
  def setTracking(tracking: Boolean): Unit = js.native
  def setTrackingOptions(options: PositionOptions): Unit = js.native
  @JSName("un")
  def un_changeaccuracy(`type`: `change:accuracy`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeaccuracyGeometry(`type`: `change:accuracyGeometry`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changealtitude(`type`: `change:altitude`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changealtitudeAccuracy(`type`: `change:altitudeAccuracy`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeheading(`type`: `change:heading`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeposition(`type`: `change:position`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeprojection(`type`: `change:projection`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changespeed(`type`: `change:speed`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetracking(`type`: `change:tracking`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetrackingOptions(`type`: `change:trackingOptions`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_error(`type`: error, listener: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
}

