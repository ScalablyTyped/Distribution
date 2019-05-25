package typings
package olLib.geolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geolocation
  extends olLib.objectMod.default {
  def getAccuracy(): scala.Double = js.native
  def getAccuracyGeometry(): olLib.geomPolygonMod.default = js.native
  def getAltitude(): scala.Double = js.native
  def getAltitudeAccuracy(): scala.Double = js.native
  def getHeading(): scala.Double = js.native
  def getPosition(): olLib.coordinateMod.Coordinate = js.native
  def getProjection(): olLib.projProjectionMod.default = js.native
  def getSpeed(): scala.Double = js.native
  def getTracking(): scala.Boolean = js.native
  def getTrackingOptions(): stdLib.PositionOptions = js.native
  @JSName("on")
  def `on_change:accuracy`(
    `type`: olLib.olLibStrings.`change:accuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:accuracyGeometry`(
    `type`: olLib.olLibStrings.`change:accuracyGeometry`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:altitude`(
    `type`: olLib.olLibStrings.`change:altitude`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:altitudeAccuracy`(
    `type`: olLib.olLibStrings.`change:altitudeAccuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:heading`(
    `type`: olLib.olLibStrings.`change:heading`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:position`(
    `type`: olLib.olLibStrings.`change:position`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:projection`(
    `type`: olLib.olLibStrings.`change:projection`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:speed`(
    `type`: olLib.olLibStrings.`change:speed`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:tracking`(
    `type`: olLib.olLibStrings.`change:tracking`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:trackingOptions`(
    `type`: olLib.olLibStrings.`change:trackingOptions`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_error(`type`: olLib.olLibStrings.error, listener: js.Function1[/* evt */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:accuracy`(
    `type`: olLib.olLibStrings.`change:accuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:accuracyGeometry`(
    `type`: olLib.olLibStrings.`change:accuracyGeometry`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:altitude`(
    `type`: olLib.olLibStrings.`change:altitude`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:altitudeAccuracy`(
    `type`: olLib.olLibStrings.`change:altitudeAccuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:heading`(
    `type`: olLib.olLibStrings.`change:heading`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:position`(
    `type`: olLib.olLibStrings.`change:position`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:projection`(
    `type`: olLib.olLibStrings.`change:projection`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:speed`(
    `type`: olLib.olLibStrings.`change:speed`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:tracking`(
    `type`: olLib.olLibStrings.`change:tracking`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:trackingOptions`(
    `type`: olLib.olLibStrings.`change:trackingOptions`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_error(`type`: olLib.olLibStrings.error, listener: js.Function1[/* evt */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  def setProjection(projection: olLib.projMod.ProjectionLike): scala.Unit = js.native
  def setTracking(tracking: scala.Boolean): scala.Unit = js.native
  def setTrackingOptions(options: stdLib.PositionOptions): scala.Unit = js.native
  @JSName("un")
  def `un_change:accuracy`(
    `type`: olLib.olLibStrings.`change:accuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:accuracyGeometry`(
    `type`: olLib.olLibStrings.`change:accuracyGeometry`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:altitude`(
    `type`: olLib.olLibStrings.`change:altitude`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:altitudeAccuracy`(
    `type`: olLib.olLibStrings.`change:altitudeAccuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:heading`(
    `type`: olLib.olLibStrings.`change:heading`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:position`(
    `type`: olLib.olLibStrings.`change:position`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:projection`(
    `type`: olLib.olLibStrings.`change:projection`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:speed`(
    `type`: olLib.olLibStrings.`change:speed`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:tracking`(
    `type`: olLib.olLibStrings.`change:tracking`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:trackingOptions`(
    `type`: olLib.olLibStrings.`change:trackingOptions`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_error(`type`: olLib.olLibStrings.error, listener: js.Function1[/* evt */ js.Any, scala.Unit]): scala.Unit = js.native
}

