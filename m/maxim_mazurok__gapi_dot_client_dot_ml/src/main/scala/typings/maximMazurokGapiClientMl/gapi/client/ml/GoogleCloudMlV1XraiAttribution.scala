package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1XraiAttribution extends js.Object {
  
  /** Number of steps for approximating the path integral. A good value to start is 50 and gradually increase until the sum to diff property is met within the desired error range. */
  var numIntegralSteps: js.UndefOr[Double] = js.native
}
object GoogleCloudMlV1XraiAttribution {
  
  @scala.inline
  def apply(): GoogleCloudMlV1XraiAttribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1XraiAttribution]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1XraiAttributionOps[Self <: GoogleCloudMlV1XraiAttribution] (val x: Self) extends AnyVal {
    
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
    def setNumIntegralSteps(value: Double): Self = this.set("numIntegralSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumIntegralSteps: Self = this.set("numIntegralSteps", js.undefined)
  }
}
