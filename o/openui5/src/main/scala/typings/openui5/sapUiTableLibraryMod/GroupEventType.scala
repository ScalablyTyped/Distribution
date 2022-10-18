package typings.openui5.sapUiTableLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupEventType extends StObject
@JSImport("sap/ui/table/library", "GroupEventType")
@js.native
object GroupEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GroupEventType & String] = js.native
  
  /**
    * Group Column
    */
  @js.native
  sealed trait group
    extends StObject
       with GroupEventType
  /* "group" */ val group: typings.openui5.sapUiTableLibraryMod.GroupEventType.group & String = js.native
  
  /**
    * Show grouped column only as group header
    */
  @js.native
  sealed trait hideGroupedColumn
    extends StObject
       with GroupEventType
  /* "hideGroupedColumn" */ val hideGroupedColumn: typings.openui5.sapUiTableLibraryMod.GroupEventType.hideGroupedColumn & String = js.native
  
  /**
    * Change the group order of the columns. Move column one position down in the group sequence
    */
  @js.native
  sealed trait moveDown
    extends StObject
       with GroupEventType
  /* "moveDown" */ val moveDown: typings.openui5.sapUiTableLibraryMod.GroupEventType.moveDown & String = js.native
  
  /**
    * Change the group order of the columns. Move column one position up in the group sequence
    */
  @js.native
  sealed trait moveUp
    extends StObject
       with GroupEventType
  /* "moveUp" */ val moveUp: typings.openui5.sapUiTableLibraryMod.GroupEventType.moveUp & String = js.native
  
  /**
    * Show grouped column also as a column, not just as group header
    */
  @js.native
  sealed trait showGroupedColumn
    extends StObject
       with GroupEventType
  /* "showGroupedColumn" */ val showGroupedColumn: typings.openui5.sapUiTableLibraryMod.GroupEventType.showGroupedColumn & String = js.native
  
  /**
    * Ungroup Column
    */
  @js.native
  sealed trait ungroup
    extends StObject
       with GroupEventType
  /* "ungroup" */ val ungroup: typings.openui5.sapUiTableLibraryMod.GroupEventType.ungroup & String = js.native
  
  /**
    * Ungroup All Columns
    */
  @js.native
  sealed trait ungroupAll
    extends StObject
       with GroupEventType
  /* "ungroupAll" */ val ungroupAll: typings.openui5.sapUiTableLibraryMod.GroupEventType.ungroupAll & String = js.native
}
