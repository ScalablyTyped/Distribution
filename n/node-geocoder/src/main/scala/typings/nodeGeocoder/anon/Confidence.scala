package typings.nodeGeocoder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Confidence extends js.Object {
  
  var confidence: js.UndefOr[Double] = js.native
  
  var googlePlaceId: js.UndefOr[String] = js.native
}
object Confidence {
  
  @scala.inline
  def apply(): Confidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Confidence]
  }
  
  @scala.inline
  implicit class ConfidenceOps[Self <: Confidence] (val x: Self) extends AnyVal {
    
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setGooglePlaceId(value: String): Self = this.set("googlePlaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePlaceId: Self = this.set("googlePlaceId", js.undefined)
  }
}
