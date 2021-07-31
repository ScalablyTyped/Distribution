package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyOtherContactToMyContactsGroupRequest extends StObject {
  
  /** Required. A field mask to restrict which fields are copied into the new contact. Valid values are: * emailAddresses * names * phoneNumbers */
  var copyMask: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A field mask to restrict which fields on the person are returned. Multiple fields can be specified by separating them with commas. Defaults to the copy mask with metadata
    * and membership fields if not set. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events *
    * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos
    * * relations * sipAddresses * skills * urls * userDefined
    */
  var readMask: js.UndefOr[String] = js.undefined
  
  /** Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set. */
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}
object CopyOtherContactToMyContactsGroupRequest {
  
  @scala.inline
  def apply(): CopyOtherContactToMyContactsGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOtherContactToMyContactsGroupRequest]
  }
  
  @scala.inline
  implicit class CopyOtherContactToMyContactsGroupRequestMutableBuilder[Self <: CopyOtherContactToMyContactsGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyMask(value: String): Self = StObject.set(x, "copyMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyMaskUndefined: Self = StObject.set(x, "copyMask", js.undefined)
    
    @scala.inline
    def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
