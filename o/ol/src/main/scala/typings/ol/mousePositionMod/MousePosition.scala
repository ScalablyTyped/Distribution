package typings.ol.mousePositionMod

import typings.ol.coordinateMod.CoordinateFormat
import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColoncoordinateFormat
import typings.ol.olStrings.changeColonprojection
import typings.ol.projMod.ProjectionLike
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousePosition
  extends typings.ol.controlControlMod.default {
  def getCoordinateFormat(): CoordinateFormat = js.native
  def getProjection(): typings.ol.projectionMod.default = js.native
  /* protected */ def handleMouseMove(event: Event_): Unit = js.native
  /* protected */ def handleMouseOut(event: Event_): Unit = js.native
  @JSName("on")
  def on_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setCoordinateFormat(format: CoordinateFormat): Unit = js.native
  def setProjection(projection: ProjectionLike): Unit = js.native
  @JSName("un")
  def un_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

