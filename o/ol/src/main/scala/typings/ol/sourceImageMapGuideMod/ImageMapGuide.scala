package typings.ol.sourceImageMapGuideMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.imageMod.LoadFunction
import typings.ol.olStrings.imageloadend
import typings.ol.olStrings.imageloaderror
import typings.ol.olStrings.imageloadstart
import typings.ol.sizeMod.Size
import typings.ol.sourceImageMod.ImageSourceEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMapGuide
  extends typings.ol.sourceImageMod.default {
  def getImageLoadFunction(): LoadFunction = js.native
  def getParams(): js.Any = js.native
  def getUrl(
    baseUrl: String,
    params: StringDictionary[String | Double],
    extent: Extent,
    size: Size,
    projection: typings.ol.projProjectionMod.default
  ): String = js.native
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
  @JSName("un")
  def un_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  def updateParams(params: js.Any): Unit = js.native
}

