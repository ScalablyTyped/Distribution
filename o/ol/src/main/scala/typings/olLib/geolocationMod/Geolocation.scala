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
  def on_changeaccuracy(
    `type`: olLib.olLibStrings.`change:accuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changeaccuracyGeometry(
    `type`: olLib.olLibStrings.`change:accuracyGeometry`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changealtitude(
    `type`: olLib.olLibStrings.`change:altitude`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changealtitudeAccuracy(
    `type`: olLib.olLibStrings.`change:altitudeAccuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changeheading(
    `type`: olLib.olLibStrings.`change:heading`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changeposition(
    `type`: olLib.olLibStrings.`change:position`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changeprojection(
    `type`: olLib.olLibStrings.`change:projection`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changespeed(
    `type`: olLib.olLibStrings.`change:speed`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changetracking(
    `type`: olLib.olLibStrings.`change:tracking`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changetrackingOptions(
    `type`: olLib.olLibStrings.`change:trackingOptions`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_error(`type`: olLib.olLibStrings.error, listener: js.Function1[/* evt */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeaccuracy(
    `type`: olLib.olLibStrings.`change:accuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeaccuracyGeometry(
    `type`: olLib.olLibStrings.`change:accuracyGeometry`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changealtitude(
    `type`: olLib.olLibStrings.`change:altitude`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changealtitudeAccuracy(
    `type`: olLib.olLibStrings.`change:altitudeAccuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeheading(
    `type`: olLib.olLibStrings.`change:heading`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeposition(
    `type`: olLib.olLibStrings.`change:position`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeprojection(
    `type`: olLib.olLibStrings.`change:projection`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changespeed(
    `type`: olLib.olLibStrings.`change:speed`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changetracking(
    `type`: olLib.olLibStrings.`change:tracking`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changetrackingOptions(
    `type`: olLib.olLibStrings.`change:trackingOptions`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_error(`type`: olLib.olLibStrings.error, listener: js.Function1[/* evt */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  def setProjection(projection: olLib.projMod.ProjectionLike): scala.Unit = js.native
  def setTracking(tracking: scala.Boolean): scala.Unit = js.native
  def setTrackingOptions(options: stdLib.PositionOptions): scala.Unit = js.native
  @JSName("un")
  def un_changeaccuracy(
    `type`: olLib.olLibStrings.`change:accuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changeaccuracyGeometry(
    `type`: olLib.olLibStrings.`change:accuracyGeometry`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changealtitude(
    `type`: olLib.olLibStrings.`change:altitude`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changealtitudeAccuracy(
    `type`: olLib.olLibStrings.`change:altitudeAccuracy`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changeheading(
    `type`: olLib.olLibStrings.`change:heading`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changeposition(
    `type`: olLib.olLibStrings.`change:position`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changeprojection(
    `type`: olLib.olLibStrings.`change:projection`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changespeed(
    `type`: olLib.olLibStrings.`change:speed`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changetracking(
    `type`: olLib.olLibStrings.`change:tracking`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changetrackingOptions(
    `type`: olLib.olLibStrings.`change:trackingOptions`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_error(`type`: olLib.olLibStrings.error, listener: js.Function1[/* evt */ js.Any, scala.Unit]): scala.Unit = js.native
}

