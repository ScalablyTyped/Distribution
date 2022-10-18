package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TableRowType extends StObject
@JSImport("sap/ui/webc/main/library", "TableRowType")
@js.native
object TableRowType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TableRowType & String] = js.native
  
  /**
    * Indicates that the table row is clickable via active feedback when item is pressed.
    */
  @js.native
  sealed trait Active
    extends StObject
       with TableRowType
  /* "Active" */ val Active: typings.openui5.sapUiWebcMainLibraryMod.TableRowType.Active & String = js.native
  
  /**
    * Indicates that the table row does not have any active feedback when item is pressed.
    */
  @js.native
  sealed trait Inactive
    extends StObject
       with TableRowType
  /* "Inactive" */ val Inactive: typings.openui5.sapUiWebcMainLibraryMod.TableRowType.Inactive & String = js.native
}
