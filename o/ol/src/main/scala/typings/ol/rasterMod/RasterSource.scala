package typings.ol.rasterMod

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.afteroperations
import typings.ol.olStrings.beforeoperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterSource
  extends typings.ol.sourceImageMod.default {
  
  @JSName("on")
  def on_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
  
  /**
    * Set the operation.
    */
  def setOperation(operation: Operation): Unit = js.native
  def setOperation(operation: Operation, opt_lib: js.Any): Unit = js.native
  
  @JSName("un")
  def un_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): Unit = js.native
}
