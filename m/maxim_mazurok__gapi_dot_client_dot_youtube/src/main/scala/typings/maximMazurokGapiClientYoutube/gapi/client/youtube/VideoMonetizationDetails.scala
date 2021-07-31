package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoMonetizationDetails extends StObject {
  
  /** The value of access indicates whether the video can be monetized or not. */
  var access: js.UndefOr[AccessPolicy] = js.undefined
}
object VideoMonetizationDetails {
  
  @scala.inline
  def apply(): VideoMonetizationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoMonetizationDetails]
  }
  
  @scala.inline
  implicit class VideoMonetizationDetailsMutableBuilder[Self <: VideoMonetizationDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: AccessPolicy): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
  }
}
