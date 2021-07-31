package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonMetadata extends StObject {
  
  /** Output only. True if the person resource has been deleted. Populated only for [`connections.list`](/people/api/rest/v1/people.connections/list) requests that include a sync token. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Resource names of people linked to this resource. */
  var linkedPeopleResourceNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. **DEPRECATED** (Please use `person.metadata.sources.profileMetadata.objectType` instead) The type of the person object. */
  var objectType: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Any former resource names this person has had. Populated only for [`connections.list`](/people/api/rest/v1/people.connections/list) requests that include a sync token.
    * The resource name may change when adding or removing fields that link a contact and profile such as a verified email, verified phone number, or profile URL.
    */
  var previousResourceNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The sources of data for the person. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}
object PersonMetadata {
  
  @scala.inline
  def apply(): PersonMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonMetadata]
  }
  
  @scala.inline
  implicit class PersonMetadataMutableBuilder[Self <: PersonMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setLinkedPeopleResourceNames(value: js.Array[String]): Self = StObject.set(x, "linkedPeopleResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedPeopleResourceNamesUndefined: Self = StObject.set(x, "linkedPeopleResourceNames", js.undefined)
    
    @scala.inline
    def setLinkedPeopleResourceNamesVarargs(value: String*): Self = StObject.set(x, "linkedPeopleResourceNames", js.Array(value :_*))
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    @scala.inline
    def setPreviousResourceNames(value: js.Array[String]): Self = StObject.set(x, "previousResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousResourceNamesUndefined: Self = StObject.set(x, "previousResourceNames", js.undefined)
    
    @scala.inline
    def setPreviousResourceNamesVarargs(value: String*): Self = StObject.set(x, "previousResourceNames", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
