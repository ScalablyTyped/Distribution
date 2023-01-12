package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageCatalog
  extends StObject
     with Entity {
  
  // The access packages in this catalog. Read-only. Nullable.
  var accessPackages: js.UndefOr[NullableOption[js.Array[AccessPackage]]] = js.undefined
  
  /**
    * Whether the catalog is created by a user or entitlement management. The possible values are: userManaged,
    * serviceDefault, serviceManaged, unknownFutureValue.
    */
  var catalogType: js.UndefOr[NullableOption[AccessPackageCatalogType]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The description of the access package catalog.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the access package catalog.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether the access packages in this catalog can be requested by users outside of the tenant.
  var isExternallyVisible: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
    */
  var modifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Has the value published if the access packages are available for management. The possible values are: unpublished,
    * published, unknownFutureValue.
    */
  var state: js.UndefOr[NullableOption[AccessPackageCatalogState]] = js.undefined
}
object AccessPackageCatalog {
  
  inline def apply(): AccessPackageCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageCatalog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageCatalog] (val x: Self) extends AnyVal {
    
    inline def setAccessPackages(value: NullableOption[js.Array[AccessPackage]]): Self = StObject.set(x, "accessPackages", value.asInstanceOf[js.Any])
    
    inline def setAccessPackagesNull: Self = StObject.set(x, "accessPackages", null)
    
    inline def setAccessPackagesUndefined: Self = StObject.set(x, "accessPackages", js.undefined)
    
    inline def setAccessPackagesVarargs(value: AccessPackage*): Self = StObject.set(x, "accessPackages", js.Array(value*))
    
    inline def setCatalogType(value: NullableOption[AccessPackageCatalogType]): Self = StObject.set(x, "catalogType", value.asInstanceOf[js.Any])
    
    inline def setCatalogTypeNull: Self = StObject.set(x, "catalogType", null)
    
    inline def setCatalogTypeUndefined: Self = StObject.set(x, "catalogType", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsExternallyVisible(value: NullableOption[Boolean]): Self = StObject.set(x, "isExternallyVisible", value.asInstanceOf[js.Any])
    
    inline def setIsExternallyVisibleNull: Self = StObject.set(x, "isExternallyVisible", null)
    
    inline def setIsExternallyVisibleUndefined: Self = StObject.set(x, "isExternallyVisible", js.undefined)
    
    inline def setModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "modifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateTimeNull: Self = StObject.set(x, "modifiedDateTime", null)
    
    inline def setModifiedDateTimeUndefined: Self = StObject.set(x, "modifiedDateTime", js.undefined)
    
    inline def setState(value: NullableOption[AccessPackageCatalogState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
