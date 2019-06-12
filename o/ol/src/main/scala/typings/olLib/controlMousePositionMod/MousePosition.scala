package typings
package olLib.controlMousePositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousePosition
  extends olLib.controlControlMod.default {
  def getCoordinateFormat(): olLib.coordinateMod.CoordinateFormat = js.native
  def getProjection(): olLib.projProjectionMod.default = js.native
  /* protected */ def handleMouseMove(event: olLib.eventsEventMod.default): scala.Unit = js.native
  /* protected */ def handleMouseOut(event: olLib.eventsEventMod.default): scala.Unit = js.native
  @JSName("on")
  def on_changecoordinateFormat(
    `type`: olLib.olLibStrings.`change:coordinateFormat`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changeprojection(
    `type`: olLib.olLibStrings.`change:projection`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changecoordinateFormat(
    `type`: olLib.olLibStrings.`change:coordinateFormat`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeprojection(
    `type`: olLib.olLibStrings.`change:projection`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setCoordinateFormat(format: olLib.coordinateMod.CoordinateFormat): scala.Unit = js.native
  def setProjection(projection: olLib.projMod.ProjectionLike): scala.Unit = js.native
  @JSName("un")
  def un_changecoordinateFormat(
    `type`: olLib.olLibStrings.`change:coordinateFormat`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changeprojection(
    `type`: olLib.olLibStrings.`change:projection`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
}

