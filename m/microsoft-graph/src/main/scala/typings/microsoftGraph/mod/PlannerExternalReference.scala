package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerExternalReference extends StObject {
  
  // A name alias to describe the reference.
  var alias: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. User ID by which this is last modified.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Read-only. Date and time at which this is last modified. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Used to set the relative priority order in which the reference will be shown as a preview on the task.
  var previewPriority: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Used to describe the type of the reference. Types include: PowerPoint, Word, Excel, Other.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object PlannerExternalReference {
  
  inline def apply(): PlannerExternalReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerExternalReference]
  }
  
  extension [Self <: PlannerExternalReference](x: Self) {
    
    inline def setAlias(value: NullableOption[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setPreviewPriority(value: NullableOption[String]): Self = StObject.set(x, "previewPriority", value.asInstanceOf[js.Any])
    
    inline def setPreviewPriorityNull: Self = StObject.set(x, "previewPriority", null)
    
    inline def setPreviewPriorityUndefined: Self = StObject.set(x, "previewPriority", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
