package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAppOperation
  extends StObject
     with Entity {
  
  // The operation name.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The last time the app operation was modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // The current state of the operation
  var state: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Version of the entity.
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedAppOperation {
  
  @scala.inline
  def apply(): ManagedAppOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppOperation]
  }
  
  @scala.inline
  implicit class ManagedAppOperationMutableBuilder[Self <: ManagedAppOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
