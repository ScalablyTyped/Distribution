package typings.ol.sourceBingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BingMaps
  extends typings.ol.sourceTileImageMod.default {
  def getApiKey(): String = js.native
  def getImagerySet(): String = js.native
  def handleImageryMetadataResponse(response: BingMapsImageryMetadataResponse): Unit = js.native
}

