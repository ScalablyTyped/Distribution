package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1SampledShapleyAttribution extends js.Object {
  
  /** The number of feature permutations to consider when approximating the Shapley values. */
  var numPaths: js.UndefOr[Double] = js.native
}
object GoogleCloudMlV1SampledShapleyAttribution {
  
  @scala.inline
  def apply(): GoogleCloudMlV1SampledShapleyAttribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1SampledShapleyAttribution]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1SampledShapleyAttributionOps[Self <: GoogleCloudMlV1SampledShapleyAttribution] (val x: Self) extends AnyVal {
    
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
    def setNumPaths(value: Double): Self = this.set("numPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumPaths: Self = this.set("numPaths", js.undefined)
  }
}
