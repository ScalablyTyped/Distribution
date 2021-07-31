package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactGroupMetadata extends StObject {
  
  /**
    * Output only. True if the contact group resource has been deleted. Populated only for [`ListContactGroups`](/people/api/rest/v1/contactgroups/list) requests that include a sync
    * token.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The time the group was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object ContactGroupMetadata {
  
  @scala.inline
  def apply(): ContactGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroupMetadata]
  }
  
  @scala.inline
  implicit class ContactGroupMetadataMutableBuilder[Self <: ContactGroupMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
