package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemActivityStat
  extends StObject
     with Entity {
  
  // Statistics about the access actions in this interval. Read-only.
  var access: js.UndefOr[NullableOption[ItemActionStat]] = js.undefined
  
  // Exposes the itemActivities represented in this itemActivityStat resource.
  var activities: js.UndefOr[NullableOption[js.Array[ItemActivity]]] = js.undefined
  
  // Statistics about the create actions in this interval. Read-only.
  var create: js.UndefOr[NullableOption[ItemActionStat]] = js.undefined
  
  // Statistics about the delete actions in this interval. Read-only.
  var delete: js.UndefOr[NullableOption[ItemActionStat]] = js.undefined
  
  // Statistics about the edit actions in this interval. Read-only.
  var edit: js.UndefOr[NullableOption[ItemActionStat]] = js.undefined
  
  // When the interval ends. Read-only.
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates that the statistics in this interval are based on incomplete data. Read-only.
  var incompleteData: js.UndefOr[NullableOption[IncompleteData]] = js.undefined
  
  // Indicates whether the item is 'trending.' Read-only.
  var isTrending: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Statistics about the move actions in this interval. Read-only.
  var move: js.UndefOr[NullableOption[ItemActionStat]] = js.undefined
  
  // When the interval starts. Read-only.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object ItemActivityStat {
  
  @scala.inline
  def apply(): ItemActivityStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActivityStat]
  }
  
  @scala.inline
  implicit class ItemActivityStatMutableBuilder[Self <: ItemActivityStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: NullableOption[ItemActionStat]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessNull: Self = StObject.set(x, "access", null)
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    @scala.inline
    def setActivities(value: NullableOption[js.Array[ItemActivity]]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesNull: Self = StObject.set(x, "activities", null)
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setActivitiesVarargs(value: ItemActivity*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setCreate(value: NullableOption[ItemActionStat]): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateNull: Self = StObject.set(x, "create", null)
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDelete(value: NullableOption[ItemActionStat]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteNull: Self = StObject.set(x, "delete", null)
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setEdit(value: NullableOption[ItemActionStat]): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditNull: Self = StObject.set(x, "edit", null)
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    @scala.inline
    def setIncompleteData(value: NullableOption[IncompleteData]): Self = StObject.set(x, "incompleteData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompleteDataNull: Self = StObject.set(x, "incompleteData", null)
    
    @scala.inline
    def setIncompleteDataUndefined: Self = StObject.set(x, "incompleteData", js.undefined)
    
    @scala.inline
    def setIsTrending(value: NullableOption[Boolean]): Self = StObject.set(x, "isTrending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTrendingNull: Self = StObject.set(x, "isTrending", null)
    
    @scala.inline
    def setIsTrendingUndefined: Self = StObject.set(x, "isTrending", js.undefined)
    
    @scala.inline
    def setMove(value: NullableOption[ItemActionStat]): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveNull: Self = StObject.set(x, "move", null)
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
