package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateShortDynamicLinkRequest extends StObject {
  
  /** Information about the Dynamic Link to be shortened. [Learn more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener). */
  var dynamicLinkInfo: js.UndefOr[DynamicLinkInfo] = js.undefined
  
  /**
    * Full long Dynamic Link URL with desired query parameters specified. For example, "https://sample.app.goo.gl/?link=http://www.google.com&apn=com.sample", [Learn
    * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
    */
  var longDynamicLink: js.UndefOr[String] = js.undefined
  
  /** Google SDK version. Version takes the form "$major.$minor.$patch" */
  var sdkVersion: js.UndefOr[String] = js.undefined
  
  /** Short Dynamic Link suffix. Optional. */
  var suffix: js.UndefOr[Suffix] = js.undefined
}
object CreateShortDynamicLinkRequest {
  
  @scala.inline
  def apply(): CreateShortDynamicLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateShortDynamicLinkRequest]
  }
  
  @scala.inline
  implicit class CreateShortDynamicLinkRequestMutableBuilder[Self <: CreateShortDynamicLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicLinkInfo(value: DynamicLinkInfo): Self = StObject.set(x, "dynamicLinkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicLinkInfoUndefined: Self = StObject.set(x, "dynamicLinkInfo", js.undefined)
    
    @scala.inline
    def setLongDynamicLink(value: String): Self = StObject.set(x, "longDynamicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDynamicLinkUndefined: Self = StObject.set(x, "longDynamicLink", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    @scala.inline
    def setSuffix(value: Suffix): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
