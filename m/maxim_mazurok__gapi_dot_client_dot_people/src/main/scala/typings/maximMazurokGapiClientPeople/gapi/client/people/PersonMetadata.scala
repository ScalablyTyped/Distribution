package typings.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonMetadata extends js.Object {
  
  /** Output only. True if the person resource has been deleted. Populated only for [`connections.list`](/people/api/rest/v1/people.connections/list) requests that include a sync token. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /** Output only. Resource names of people linked to this resource. */
  var linkedPeopleResourceNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. **DEPRECATED** (Please use `person.metadata.sources.profileMetadata.objectType` instead) The type of the person object. */
  var objectType: js.UndefOr[String] = js.native
  
  /**
    * Output only. Any former resource names this person has had. Populated only for [`connections.list`](/people/api/rest/v1/people.connections/list) requests that include a sync token.
    * The resource name may change when adding or removing fields that link a contact and profile such as a verified email, verified phone number, or profile URL.
    */
  var previousResourceNames: js.UndefOr[js.Array[String]] = js.native
  
  /** The sources of data for the person. */
  var sources: js.UndefOr[js.Array[Source]] = js.native
}
object PersonMetadata {
  
  @scala.inline
  def apply(): PersonMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonMetadata]
  }
  
  @scala.inline
  implicit class PersonMetadataOps[Self <: PersonMetadata] (val x: Self) extends AnyVal {
    
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setLinkedPeopleResourceNamesVarargs(value: String*): Self = this.set("linkedPeopleResourceNames", js.Array(value :_*))
    
    @scala.inline
    def setLinkedPeopleResourceNames(value: js.Array[String]): Self = this.set("linkedPeopleResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedPeopleResourceNames: Self = this.set("linkedPeopleResourceNames", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    
    @scala.inline
    def setPreviousResourceNamesVarargs(value: String*): Self = this.set("previousResourceNames", js.Array(value :_*))
    
    @scala.inline
    def setPreviousResourceNames(value: js.Array[String]): Self = this.set("previousResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousResourceNames: Self = this.set("previousResourceNames", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
}
