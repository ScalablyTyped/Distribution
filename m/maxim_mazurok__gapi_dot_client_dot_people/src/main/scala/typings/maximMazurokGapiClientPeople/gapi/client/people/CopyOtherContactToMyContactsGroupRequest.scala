package typings.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyOtherContactToMyContactsGroupRequest extends js.Object {
  
  /** Required. A field mask to restrict which fields are copied into the new contact. Valid values are: * emailAddresses * names * phoneNumbers */
  var copyMask: js.UndefOr[String] = js.native
  
  /**
    * Optional. A field mask to restrict which fields on the person are returned. Multiple fields can be specified by separating them with commas. Defaults to the copy mask with metadata
    * and membership fields if not set. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events *
    * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos
    * * relations * sipAddresses * skills * urls * userDefined
    */
  var readMask: js.UndefOr[String] = js.native
  
  /** Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set. */
  var sources: js.UndefOr[js.Array[String]] = js.native
}
object CopyOtherContactToMyContactsGroupRequest {
  
  @scala.inline
  def apply(): CopyOtherContactToMyContactsGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOtherContactToMyContactsGroupRequest]
  }
  
  @scala.inline
  implicit class CopyOtherContactToMyContactsGroupRequestOps[Self <: CopyOtherContactToMyContactsGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCopyMask(value: String): Self = this.set("copyMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyMask: Self = this.set("copyMask", js.undefined)
    
    @scala.inline
    def setReadMask(value: String): Self = this.set("readMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadMask: Self = this.set("readMask", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: String*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[String]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
}
