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
  
  inline def apply(): ContactGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroupMetadata]
  }
  
  extension [Self <: ContactGroupMetadata](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
