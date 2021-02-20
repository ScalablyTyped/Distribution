package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadRef extends StObject {
  
  /** Required. An upload reference should be unique for each user. It follows the form: "https://streetviewpublish.googleapis.com/media/user/{account_id}/photo/{upload_reference}" */
  var uploadUrl: js.UndefOr[String] = js.native
}
object UploadRef {
  
  @scala.inline
  def apply(): UploadRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadRef]
  }
  
  @scala.inline
  implicit class UploadRefMutableBuilder[Self <: UploadRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
