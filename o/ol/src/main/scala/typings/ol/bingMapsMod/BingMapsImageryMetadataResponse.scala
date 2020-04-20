package typings.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingMapsImageryMetadataResponse extends js.Object {
  var authenticationResultCode: String
  var resourceSets: js.Array[ResourceSet]
  var statusCode: Double
  var statusDescription: String
}

object BingMapsImageryMetadataResponse {
  @scala.inline
  def apply(
    authenticationResultCode: String,
    resourceSets: js.Array[ResourceSet],
    statusCode: Double,
    statusDescription: String
  ): BingMapsImageryMetadataResponse = {
    val __obj = js.Dynamic.literal(authenticationResultCode = authenticationResultCode.asInstanceOf[js.Any], resourceSets = resourceSets.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusDescription = statusDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingMapsImageryMetadataResponse]
  }
}

