package typings.ol.mousePositionMod

import typings.ol.coordinateMod.CoordinateFormat
import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColoncoordinateFormat
import typings.ol.olStrings.changeColonprojection
import typings.ol.projMod.ProjectionLike
import typings.std.Event
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MousePosition
  extends typings.ol.controlControlMod.default {
  
  /**
    * Return the coordinate format type used to render the current position or
    * undefined.
    */
  def getCoordinateFormat(): js.UndefOr[CoordinateFormat] = js.native
  
  /**
    * Return the projection that is used to report the mouse position.
    */
  def getProjection(): js.UndefOr[typings.ol.projectionMod.default] = js.native
  
  /* protected */ def handleMouseMove(event: MouseEvent): Unit = js.native
  
  /* protected */ def handleMouseOut(event: Event): Unit = js.native
  
  @JSName("on")
  def on_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  /**
    * Set the coordinate format type used to render the current position.
    */
  def setCoordinateFormat(format: CoordinateFormat): Unit = js.native
  
  /**
    * Set the projection that is used to report the mouse position.
    */
  def setProjection(projection: ProjectionLike): Unit = js.native
  
  @JSName("un")
  def un_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
