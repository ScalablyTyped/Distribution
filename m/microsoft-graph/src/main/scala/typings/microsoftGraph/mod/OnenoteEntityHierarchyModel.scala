package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnenoteEntityHierarchyModel
  extends StObject
     with OnenoteEntitySchemaObjectModel {
  
  // Identity of the user, device, and application which created the item. Read-only.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The name of the notebook.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identity of the user, device, and application which created the item. Read-only.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * The date and time when the notebook was last modified. The timestamp represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object OnenoteEntityHierarchyModel {
  
  inline def apply(): OnenoteEntityHierarchyModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteEntityHierarchyModel]
  }
  
  extension [Self <: OnenoteEntityHierarchyModel](x: Self) {
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
  }
}
