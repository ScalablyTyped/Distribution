package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlAssignedTargetingOptionDetails extends StObject {
  
  /** Indicates if this option is being negatively targeted. */
  var negative: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. The URL, for example `example.com`. DV360 supports two levels of subdirectory targeting, for example `www.example.com/one-subdirectory-level/second-level`, and five levels
    * of subdomain targeting, for example `five.four.three.two.one.example.com`.
    */
  var url: js.UndefOr[String] = js.native
}
object UrlAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): UrlAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class UrlAssignedTargetingOptionDetailsMutableBuilder[Self <: UrlAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
