package typings
package olLib.controlScaleLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleLine
  extends olLib.controlControlMod.default {
  def getUnits(): Units = js.native
  @JSName("on")
  def on_changeunits(
    `type`: olLib.olLibStrings.`change:units`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeunits(
    `type`: olLib.olLibStrings.`change:units`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setUnits(units: Units): scala.Unit = js.native
  @JSName("un")
  def un_changeunits(
    `type`: olLib.olLibStrings.`change:units`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
}

