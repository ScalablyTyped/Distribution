package typings
package olLib.sourceBingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingMapsImageryMetadataResponse extends js.Object {
  var authenticationResultCode: java.lang.String
  var resourceSets: js.Array[ResourceSet]
  var statusCode: scala.Double
  var statusDescription: java.lang.String
}

object BingMapsImageryMetadataResponse {
  @scala.inline
  def apply(
    authenticationResultCode: java.lang.String,
    resourceSets: js.Array[ResourceSet],
    statusCode: scala.Double,
    statusDescription: java.lang.String
  ): BingMapsImageryMetadataResponse = {
    val __obj = js.Dynamic.literal(authenticationResultCode = authenticationResultCode, resourceSets = resourceSets, statusCode = statusCode, statusDescription = statusDescription)
  
    __obj.asInstanceOf[BingMapsImageryMetadataResponse]
  }
}

