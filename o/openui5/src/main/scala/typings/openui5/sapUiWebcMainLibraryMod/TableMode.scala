package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TableMode extends StObject
@JSImport("sap/ui/webc/main/library", "TableMode")
@js.native
object TableMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TableMode & String] = js.native
  
  /**
    * Multi selection mode (more than one table row can be selected).
    */
  @js.native
  sealed trait MultiSelect
    extends StObject
       with TableMode
  /* "MultiSelect" */ val MultiSelect: typings.openui5.sapUiWebcMainLibraryMod.TableMode.MultiSelect & String = js.native
  
  /**
    * Default mode (no selection).
    */
  @js.native
  sealed trait None
    extends StObject
       with TableMode
  /* "None" */ val None: typings.openui5.sapUiWebcMainLibraryMod.TableMode.None & String = js.native
  
  /**
    * Single selection mode (only one table row can be selected).
    */
  @js.native
  sealed trait SingleSelect
    extends StObject
       with TableMode
  /* "SingleSelect" */ val SingleSelect: typings.openui5.sapUiWebcMainLibraryMod.TableMode.SingleSelect & String = js.native
}
