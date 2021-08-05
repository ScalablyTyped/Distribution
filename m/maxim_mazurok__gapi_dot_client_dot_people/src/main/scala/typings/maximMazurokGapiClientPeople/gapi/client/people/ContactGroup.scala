package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactGroup extends StObject {
  
  /** The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the resource. Used for web cache validation. */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The name translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale for system groups names. Group names set by the owner are
    * the same as name.
    */
  var formattedName: js.UndefOr[String] = js.undefined
  
  /** Output only. The contact group type. */
  var groupType: js.UndefOr[String] = js.undefined
  
  /** Output only. The total number of contacts in the group irrespective of max members in specified in the request. */
  var memberCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. The list of contact person resource names that are members of the contact group. The field is not populated for LIST requests and can only be updated through the
    * [ModifyContactGroupMembers](/people/api/rest/v1/contactgroups/members/modify).
    */
  var memberResourceNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Metadata about the contact group. */
  var metadata: js.UndefOr[ContactGroupMetadata] = js.undefined
  
  /** The contact group name set by the group owner or a system provided name for system groups. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The resource name for the contact group, assigned by the server. An ASCII string, in the form of `contactGroups/{contact_group_id}`. */
  var resourceName: js.UndefOr[String] = js.undefined
}
object ContactGroup {
  
  inline def apply(): ContactGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroup]
  }
  
  extension [Self <: ContactGroup](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFormattedName(value: String): Self = StObject.set(x, "formattedName", value.asInstanceOf[js.Any])
    
    inline def setFormattedNameUndefined: Self = StObject.set(x, "formattedName", js.undefined)
    
    inline def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    inline def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
    
    inline def setMemberCount(value: Double): Self = StObject.set(x, "memberCount", value.asInstanceOf[js.Any])
    
    inline def setMemberCountUndefined: Self = StObject.set(x, "memberCount", js.undefined)
    
    inline def setMemberResourceNames(value: js.Array[String]): Self = StObject.set(x, "memberResourceNames", value.asInstanceOf[js.Any])
    
    inline def setMemberResourceNamesUndefined: Self = StObject.set(x, "memberResourceNames", js.undefined)
    
    inline def setMemberResourceNamesVarargs(value: String*): Self = StObject.set(x, "memberResourceNames", js.Array(value :_*))
    
    inline def setMetadata(value: ContactGroupMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
