package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateManagedShortLinkRequest extends StObject {
  
  /** Information about the Dynamic Link to be shortened. [Learn more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener). */
  var dynamicLinkInfo: js.UndefOr[DynamicLinkInfo] = js.undefined
  
  /**
    * Full long Dynamic Link URL with desired query parameters specified. For example, "https://sample.app.goo.gl/?link=http://www.google.com&apn=com.sample", [Learn
    * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
    */
  var longDynamicLink: js.UndefOr[String] = js.undefined
  
  /**
    * Link name to associate with the link. It's used for marketer to identify manually-created links in the Firebase console (https://console.firebase.google.com/). Links must be named
    * to be tracked.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Google SDK version. Version takes the form "$major.$minor.$patch" */
  var sdkVersion: js.UndefOr[String] = js.undefined
  
  /** Short Dynamic Link suffix. Optional. */
  var suffix: js.UndefOr[Suffix] = js.undefined
}
object CreateManagedShortLinkRequest {
  
  @scala.inline
  def apply(): CreateManagedShortLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateManagedShortLinkRequest]
  }
  
  @scala.inline
  implicit class CreateManagedShortLinkRequestMutableBuilder[Self <: CreateManagedShortLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicLinkInfo(value: DynamicLinkInfo): Self = StObject.set(x, "dynamicLinkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicLinkInfoUndefined: Self = StObject.set(x, "dynamicLinkInfo", js.undefined)
    
    @scala.inline
    def setLongDynamicLink(value: String): Self = StObject.set(x, "longDynamicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDynamicLinkUndefined: Self = StObject.set(x, "longDynamicLink", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
