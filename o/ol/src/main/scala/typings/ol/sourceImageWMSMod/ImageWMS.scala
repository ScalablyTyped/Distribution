package typings.ol.sourceImageWMSMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.imageMod.LoadFunction
import typings.ol.olStrings.imageloadend
import typings.ol.olStrings.imageloaderror
import typings.ol.olStrings.imageloadstart
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceImageMod.ImageSourceEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageWMS
  extends typings.ol.sourceImageMod.default {
  def getGetFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: js.Any): js.UndefOr[String] = js.native
  def getImageLoadFunction(): LoadFunction = js.native
  def getParams(): js.Any = js.native
  def getUrl(): js.UndefOr[String] = js.native
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
  def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
  def setUrl(): Unit = js.native
  def setUrl(url: String): Unit = js.native
  @JSName("un")
  def un_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  def updateParams(params: js.Any): Unit = js.native
}

