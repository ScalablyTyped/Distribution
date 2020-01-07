package typings.ol.sourceImageMod

import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.olStrings.imageloadend
import typings.ol.olStrings.imageloaderror
import typings.ol.olStrings.imageloadstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSource
  extends typings.ol.sourceSourceMod.default {
  /* protected */ def findNearestResolution(resolution: Double): Double = js.native
  def getImage(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    projection: typings.ol.projProjectionMod.default
  ): typings.ol.imageBaseMod.default = js.native
  /* protected */ def getImageInternal(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    projection: typings.ol.projProjectionMod.default
  ): typings.ol.imageBaseMod.default = js.native
  /* protected */ def handleImageChange(event: typings.ol.eventsEventMod.default): Unit = js.native
  @JSName("on")
  def on_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("un")
  def un_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
}

