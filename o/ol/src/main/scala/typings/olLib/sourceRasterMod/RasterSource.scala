package typings
package olLib.sourceRasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterSource
  extends olLib.sourceImageMod.default {
  @JSName("on")
  def on_afteroperations(
    `type`: olLib.olLibStrings.afteroperations,
    listener: js.Function1[/* evt */ RasterSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_beforeoperations(
    `type`: olLib.olLibStrings.beforeoperations,
    listener: js.Function1[/* evt */ RasterSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_afteroperations(
    `type`: olLib.olLibStrings.afteroperations,
    listener: js.Function1[/* evt */ RasterSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_beforeoperations(
    `type`: olLib.olLibStrings.beforeoperations,
    listener: js.Function1[/* evt */ RasterSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setOperation(operation: Operation): scala.Unit = js.native
  def setOperation(operation: Operation, opt_lib: js.Any): scala.Unit = js.native
  @JSName("un")
  def un_afteroperations(
    `type`: olLib.olLibStrings.afteroperations,
    listener: js.Function1[/* evt */ RasterSourceEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_beforeoperations(
    `type`: olLib.olLibStrings.beforeoperations,
    listener: js.Function1[/* evt */ RasterSourceEvent, scala.Unit]
  ): scala.Unit = js.native
}

