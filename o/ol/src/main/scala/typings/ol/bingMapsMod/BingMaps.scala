package typings.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BingMaps
  extends typings.ol.tileImageMod.default {
  
  /**
    * Get the api key used for this source.
    */
  def getApiKey(): String = js.native
  
  /**
    * Get the imagery set associated with this source.
    */
  def getImagerySet(): String = js.native
  
  def handleImageryMetadataResponse(response: BingMapsImageryMetadataResponse): Unit = js.native
}
