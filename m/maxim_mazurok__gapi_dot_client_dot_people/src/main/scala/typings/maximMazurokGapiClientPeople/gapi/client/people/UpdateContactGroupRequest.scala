package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContactGroupRequest extends StObject {
  
  /** Required. The contact group to update. */
  var contactGroup: js.UndefOr[ContactGroup] = js.native
}
object UpdateContactGroupRequest {
  
  @scala.inline
  def apply(): UpdateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContactGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateContactGroupRequestMutableBuilder[Self <: UpdateContactGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactGroup(value: ContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
  }
}
