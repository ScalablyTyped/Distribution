package typings.ol.imageWMSMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.olImageMod.LoadFunction
import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageWMS
  extends typings.ol.sourceImageMod.default {
  def getFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: js.Any): String = js.native
  def getImageLoadFunction(): LoadFunction = js.native
  def getLegendUrl(): String = js.native
  def getLegendUrl(resolution: js.UndefOr[scala.Nothing], params: js.Any): String = js.native
  def getLegendUrl(resolution: Double): String = js.native
  def getLegendUrl(resolution: Double, params: js.Any): String = js.native
  def getParams(): js.Any = js.native
  def getUrl(): String = js.native
  def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
  def setUrl(): Unit = js.native
  def setUrl(url: String): Unit = js.native
  def updateParams(params: js.Any): Unit = js.native
}

