package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocialMetaTagInfo extends StObject {
  
  /** A short description of the link. Optional. */
  var socialDescription: js.UndefOr[String] = js.undefined
  
  /** An image url string. Optional. */
  var socialImageLink: js.UndefOr[String] = js.undefined
  
  /** Title to be displayed. Optional. */
  var socialTitle: js.UndefOr[String] = js.undefined
}
object SocialMetaTagInfo {
  
  @scala.inline
  def apply(): SocialMetaTagInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialMetaTagInfo]
  }
  
  @scala.inline
  implicit class SocialMetaTagInfoMutableBuilder[Self <: SocialMetaTagInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocialDescription(value: String): Self = StObject.set(x, "socialDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialDescriptionUndefined: Self = StObject.set(x, "socialDescription", js.undefined)
    
    @scala.inline
    def setSocialImageLink(value: String): Self = StObject.set(x, "socialImageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialImageLinkUndefined: Self = StObject.set(x, "socialImageLink", js.undefined)
    
    @scala.inline
    def setSocialTitle(value: String): Self = StObject.set(x, "socialTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialTitleUndefined: Self = StObject.set(x, "socialTitle", js.undefined)
  }
}
