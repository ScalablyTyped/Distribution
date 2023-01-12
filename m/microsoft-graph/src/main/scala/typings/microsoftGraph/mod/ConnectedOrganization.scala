package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectedOrganization
  extends StObject
     with Entity {
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The description of the connected organization.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the connected organization. Supports $filter (eq).
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var externalSponsors: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * The identity sources in this connected organization, one of azureActiveDirectoryTenant, domainIdentitySource or
    * externalDomainFederation. Nullable.
    */
  var identitySources: js.UndefOr[NullableOption[js.Array[IdentitySource]]] = js.undefined
  
  var internalSponsors: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
    */
  var modifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The state of a connected organization defines whether assignment policies with requestor scope type
    * AllConfiguredConnectedOrganizationSubjects are applicable or not. The possible values are: configured, proposed,
    * unknownFutureValue.
    */
  var state: js.UndefOr[NullableOption[ConnectedOrganizationState]] = js.undefined
}
object ConnectedOrganization {
  
  inline def apply(): ConnectedOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedOrganization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectedOrganization] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExternalSponsors(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "externalSponsors", value.asInstanceOf[js.Any])
    
    inline def setExternalSponsorsNull: Self = StObject.set(x, "externalSponsors", null)
    
    inline def setExternalSponsorsUndefined: Self = StObject.set(x, "externalSponsors", js.undefined)
    
    inline def setExternalSponsorsVarargs(value: DirectoryObject*): Self = StObject.set(x, "externalSponsors", js.Array(value*))
    
    inline def setIdentitySources(value: NullableOption[js.Array[IdentitySource]]): Self = StObject.set(x, "identitySources", value.asInstanceOf[js.Any])
    
    inline def setIdentitySourcesNull: Self = StObject.set(x, "identitySources", null)
    
    inline def setIdentitySourcesUndefined: Self = StObject.set(x, "identitySources", js.undefined)
    
    inline def setIdentitySourcesVarargs(value: IdentitySource*): Self = StObject.set(x, "identitySources", js.Array(value*))
    
    inline def setInternalSponsors(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "internalSponsors", value.asInstanceOf[js.Any])
    
    inline def setInternalSponsorsNull: Self = StObject.set(x, "internalSponsors", null)
    
    inline def setInternalSponsorsUndefined: Self = StObject.set(x, "internalSponsors", js.undefined)
    
    inline def setInternalSponsorsVarargs(value: DirectoryObject*): Self = StObject.set(x, "internalSponsors", js.Array(value*))
    
    inline def setModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "modifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateTimeNull: Self = StObject.set(x, "modifiedDateTime", null)
    
    inline def setModifiedDateTimeUndefined: Self = StObject.set(x, "modifiedDateTime", js.undefined)
    
    inline def setState(value: NullableOption[ConnectedOrganizationState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
