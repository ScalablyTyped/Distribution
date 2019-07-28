package typings.ol.controlMousePositionMod

import typings.ol.coordinateMod.CoordinateFormat
import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:coordinateFormat`
import typings.ol.olStrings.`change:projection`
import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousePosition
  extends typings.ol.controlControlMod.default {
  def getCoordinateFormat(): CoordinateFormat = js.native
  def getProjection(): typings.ol.projProjectionMod.default = js.native
  /* protected */ def handleMouseMove(event: typings.ol.eventsEventMod.default): Unit = js.native
  /* protected */ def handleMouseOut(event: typings.ol.eventsEventMod.default): Unit = js.native
  @JSName("on")
  def on_changecoordinateFormat(`type`: `change:coordinateFormat`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeprojection(`type`: `change:projection`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changecoordinateFormat(`type`: `change:coordinateFormat`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeprojection(`type`: `change:projection`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setCoordinateFormat(format: CoordinateFormat): Unit = js.native
  def setProjection(projection: ProjectionLike): Unit = js.native
  @JSName("un")
  def un_changecoordinateFormat(`type`: `change:coordinateFormat`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeprojection(`type`: `change:projection`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

