package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackage
  extends StObject
     with Entity {
  
  var assignmentPolicies: js.UndefOr[NullableOption[js.Array[AccessPackageAssignmentPolicy]]] = js.undefined
  
  var catalog: js.UndefOr[NullableOption[AccessPackageCatalog]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The description of the access package.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the access package. Supports $filter (eq, contains).
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether the access package is hidden from the requestor.
  var isHidden: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
    */
  var modifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessPackage {
  
  inline def apply(): AccessPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackage]
  }
  
  extension [Self <: AccessPackage](x: Self) {
    
    inline def setAssignmentPolicies(value: NullableOption[js.Array[AccessPackageAssignmentPolicy]]): Self = StObject.set(x, "assignmentPolicies", value.asInstanceOf[js.Any])
    
    inline def setAssignmentPoliciesNull: Self = StObject.set(x, "assignmentPolicies", null)
    
    inline def setAssignmentPoliciesUndefined: Self = StObject.set(x, "assignmentPolicies", js.undefined)
    
    inline def setAssignmentPoliciesVarargs(value: AccessPackageAssignmentPolicy*): Self = StObject.set(x, "assignmentPolicies", js.Array(value*))
    
    inline def setCatalog(value: NullableOption[AccessPackageCatalog]): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogNull: Self = StObject.set(x, "catalog", null)
    
    inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
    
    inline def setIsHiddenNull: Self = StObject.set(x, "isHidden", null)
    
    inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
    
    inline def setModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "modifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateTimeNull: Self = StObject.set(x, "modifiedDateTime", null)
    
    inline def setModifiedDateTimeUndefined: Self = StObject.set(x, "modifiedDateTime", js.undefined)
  }
}
