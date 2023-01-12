package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateContactsRequest extends StObject {
  
  /** Required. The contact to create. Allows up to 200 contacts in a single request. */
  var contacts: js.UndefOr[js.Array[ContactToCreate]] = js.undefined
  
  /**
    * Required. A field mask to restrict which fields on each person are returned in the response. Multiple fields can be specified by separating them with commas. If read mask is left
    * empty, the post-mutate-get is skipped and no data will be returned in the response. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData *
    * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations
    * * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    */
  var readMask: js.UndefOr[String] = js.undefined
  
  /** Optional. A mask of what source types to return in the post mutate read. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set. */
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}
object BatchCreateContactsRequest {
  
  inline def apply(): BatchCreateContactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateContactsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateContactsRequest] (val x: Self) extends AnyVal {
    
    inline def setContacts(value: js.Array[ContactToCreate]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setContactsVarargs(value: ContactToCreate*): Self = StObject.set(x, "contacts", js.Array(value*))
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
