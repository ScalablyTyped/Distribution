package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemActivity extends Entity {
  
  // An item was accessed.
  var access: js.UndefOr[NullableOption[AccessAction]] = js.native
  
  // Details about when the activity took place. Read-only.
  var activityDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Identity of who performed the action. Read-only.
  var actor: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Exposes the driveItem that was the target of this activity.
  var driveItem: js.UndefOr[NullableOption[DriveItem]] = js.native
}
object ItemActivity {
  
  @scala.inline
  def apply(): ItemActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActivity]
  }
  
  @scala.inline
  implicit class ItemActivityMutableBuilder[Self <: ItemActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: NullableOption[AccessAction]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessNull: Self = StObject.set(x, "access", null)
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    @scala.inline
    def setActivityDateTime(value: NullableOption[String]): Self = StObject.set(x, "activityDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityDateTimeNull: Self = StObject.set(x, "activityDateTime", null)
    
    @scala.inline
    def setActivityDateTimeUndefined: Self = StObject.set(x, "activityDateTime", js.undefined)
    
    @scala.inline
    def setActor(value: NullableOption[IdentitySet]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorNull: Self = StObject.set(x, "actor", null)
    
    @scala.inline
    def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    @scala.inline
    def setDriveItem(value: NullableOption[DriveItem]): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveItemNull: Self = StObject.set(x, "driveItem", null)
    
    @scala.inline
    def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
  }
}
