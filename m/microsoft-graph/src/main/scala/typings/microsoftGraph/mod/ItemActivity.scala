package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemActivity
  extends StObject
     with Entity {
  
  // An item was accessed.
  var access: js.UndefOr[NullableOption[AccessAction]] = js.undefined
  
  // Details about when the activity took place. Read-only.
  var activityDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identity of who performed the action. Read-only.
  var actor: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Exposes the driveItem that was the target of this activity.
  var driveItem: js.UndefOr[NullableOption[DriveItem]] = js.undefined
}
object ItemActivity {
  
  inline def apply(): ItemActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActivity]
  }
  
  extension [Self <: ItemActivity](x: Self) {
    
    inline def setAccess(value: NullableOption[AccessAction]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessNull: Self = StObject.set(x, "access", null)
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setActivityDateTime(value: NullableOption[String]): Self = StObject.set(x, "activityDateTime", value.asInstanceOf[js.Any])
    
    inline def setActivityDateTimeNull: Self = StObject.set(x, "activityDateTime", null)
    
    inline def setActivityDateTimeUndefined: Self = StObject.set(x, "activityDateTime", js.undefined)
    
    inline def setActor(value: NullableOption[IdentitySet]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorNull: Self = StObject.set(x, "actor", null)
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setDriveItem(value: NullableOption[DriveItem]): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    inline def setDriveItemNull: Self = StObject.set(x, "driveItem", null)
    
    inline def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
  }
}
