package typings
package olLib.sourceBingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BingMaps
  extends olLib.sourceTileImageMod.default {
  def getApiKey(): java.lang.String = js.native
  def getImagerySet(): java.lang.String = js.native
  def handleImageryMetadataResponse(response: BingMapsImageryMetadataResponse): scala.Unit = js.native
}

