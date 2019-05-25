package typings
package olLib.sourceImageMapGuideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMapGuide
  extends olLib.sourceImageMod.default {
  def getImageLoadFunction(): olLib.imageMod.LoadFunction = js.native
  def getParams(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def getUrl(
    baseUrl: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    extent: olLib.extentMod.Extent,
    size: olLib.sizeMod.Size,
    projection: olLib.projProjectionMod.default
  ): java.lang.String = js.native
  @JSName("on")
  def on_imageloadend(
    `type`: olLib.olLibStrings.imageloadend,
    listener: js.Function1[/* evt */ olLib.sourceImageMod.ImageSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_imageloaderror(
    `type`: olLib.olLibStrings.imageloaderror,
    listener: js.Function1[/* evt */ olLib.sourceImageMod.ImageSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_imageloadstart(
    `type`: olLib.olLibStrings.imageloadstart,
    listener: js.Function1[/* evt */ olLib.sourceImageMod.ImageSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_imageloadend(
    `type`: olLib.olLibStrings.imageloadend,
    listener: js.Function1[/* evt */ olLib.sourceImageMod.ImageSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_imageloaderror(
    `type`: olLib.olLibStrings.imageloaderror,
    listener: js.Function1[/* evt */ olLib.sourceImageMod.ImageSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_imageloadstart(
    `type`: olLib.olLibStrings.imageloadstart,
    listener: js.Function1[/* evt */ olLib.sourceImageMod.ImageSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setImageLoadFunction(imageLoadFunction: olLib.imageMod.LoadFunction): scala.Unit = js.native
  @JSName("un")
  def un_imageloadend(
    `type`: olLib.olLibStrings.imageloadend,
    listener: js.Function1[/* evt */ olLib.sourceImageMod.ImageSourceEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_imageloaderror(
    `type`: olLib.olLibStrings.imageloaderror,
    listener: js.Function1[/* evt */ olLib.sourceImageMod.ImageSourceEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_imageloadstart(
    `type`: olLib.olLibStrings.imageloadstart,
    listener: js.Function1[/* evt */ olLib.sourceImageMod.ImageSourceEvent, scala.Unit]
  ): scala.Unit = js.native
  def updateParams(params: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
}

