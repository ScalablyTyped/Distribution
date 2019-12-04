package typings.ol.controlScaleLineMod

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:units`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleLine
  extends typings.ol.controlControlMod.default {
  def getUnits(): Units = js.native
  @JSName("on")
  def on_changeunits(`type`: `change:units`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeunits(`type`: `change:units`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setUnits(units: Units): Unit = js.native
  @JSName("un")
  def un_changeunits(`type`: `change:units`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

