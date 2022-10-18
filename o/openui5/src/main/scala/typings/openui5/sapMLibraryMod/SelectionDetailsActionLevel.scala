package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionDetailsActionLevel extends StObject
@JSImport("sap/m/library", "SelectionDetailsActionLevel")
@js.native
object SelectionDetailsActionLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectionDetailsActionLevel & String] = js.native
  
  /**
    * ActionGroup on SelectionDetails list level.
    */
  @js.native
  sealed trait Group
    extends StObject
       with SelectionDetailsActionLevel
  /* "Group" */ val Group: typings.openui5.sapMLibraryMod.SelectionDetailsActionLevel.Group & String = js.native
  
  /**
    * Action on SelectionDetailsItem level.
    */
  @js.native
  sealed trait Item
    extends StObject
       with SelectionDetailsActionLevel
  /* "Item" */ val Item: typings.openui5.sapMLibraryMod.SelectionDetailsActionLevel.Item & String = js.native
  
  /**
    * Action on SelectionDetails list level.
    */
  @js.native
  sealed trait List
    extends StObject
       with SelectionDetailsActionLevel
  /* "List" */ val List: typings.openui5.sapMLibraryMod.SelectionDetailsActionLevel.List & String = js.native
}
