package typings.ol.sourceImageMapGuideMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.imageMod.LoadFunction
import typings.ol.sizeMod.Size
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
  def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
  def updateParams(params: js.Any): Unit = js.native
}

