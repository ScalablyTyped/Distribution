package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAppStatus
  extends StObject
     with Entity {
  
  // Friendly name of the status report.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Version of the entity.
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedAppStatus {
  
  @scala.inline
  def apply(): ManagedAppStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppStatus]
  }
  
  @scala.inline
  implicit class ManagedAppStatusMutableBuilder[Self <: ManagedAppStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
