package typings.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BingMapsImageryMetadataResponse extends js.Object {
  var authenticationResultCode: String = js.native
  var resourceSets: js.Array[ResourceSet] = js.native
  var statusCode: Double = js.native
  var statusDescription: String = js.native
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
  @scala.inline
  implicit class BingMapsImageryMetadataResponseOps[Self <: BingMapsImageryMetadataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthenticationResultCode(value: String): Self = this.set("authenticationResultCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceSetsVarargs(value: ResourceSet*): Self = this.set("resourceSets", js.Array(value :_*))
    @scala.inline
    def setResourceSets(value: js.Array[ResourceSet]): Self = this.set("resourceSets", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusDescription(value: String): Self = this.set("statusDescription", value.asInstanceOf[js.Any])
  }
  
}

