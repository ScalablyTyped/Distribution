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
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Used to set the relative priority order in which the reference will be shown as a preview on the task.
  var previewPriority: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Used to describe the type of the reference. Types include: PowerPoint, Word, Excel, Other.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object PlannerExternalReference {
  
  @scala.inline
  def apply(): PlannerExternalReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerExternalReference]
  }
  
  @scala.inline
  implicit class PlannerExternalReferenceMutableBuilder[Self <: PlannerExternalReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: NullableOption[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNull: Self = StObject.set(x, "alias", null)
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setPreviewPriority(value: NullableOption[String]): Self = StObject.set(x, "previewPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewPriorityNull: Self = StObject.set(x, "previewPriority", null)
    
    @scala.inline
    def setPreviewPriorityUndefined: Self = StObject.set(x, "previewPriority", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
