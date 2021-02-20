package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateManagedShortLinkResponse extends StObject {
  
  /** Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz */
  var managedShortLink: js.UndefOr[ManagedShortLink] = js.native
  
  /** Preview link to show the link flow chart. (debug info.) */
  var previewLink: js.UndefOr[String] = js.native
  
  /** Information about potential warnings on link creation. */
  var warning: js.UndefOr[js.Array[DynamicLinkWarning]] = js.native
}
object CreateManagedShortLinkResponse {
  
  @scala.inline
  def apply(): CreateManagedShortLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateManagedShortLinkResponse]
  }
  
  @scala.inline
  implicit class CreateManagedShortLinkResponseMutableBuilder[Self <: CreateManagedShortLinkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedShortLink(value: ManagedShortLink): Self = StObject.set(x, "managedShortLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedShortLinkUndefined: Self = StObject.set(x, "managedShortLink", js.undefined)
    
    @scala.inline
    def setPreviewLink(value: String): Self = StObject.set(x, "previewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewLinkUndefined: Self = StObject.set(x, "previewLink", js.undefined)
    
    @scala.inline
    def setWarning(value: js.Array[DynamicLinkWarning]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    @scala.inline
    def setWarningVarargs(value: DynamicLinkWarning*): Self = StObject.set(x, "warning", js.Array(value :_*))
  }
}
