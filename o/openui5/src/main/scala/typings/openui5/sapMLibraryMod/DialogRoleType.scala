package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DialogRoleType extends StObject
@JSImport("sap/m/library", "DialogRoleType")
@js.native
object DialogRoleType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DialogRoleType & String] = js.native
  
  /**
    * Represents the ARIA role `alertdialog`.
    */
  @js.native
  sealed trait AlertDialog
    extends StObject
       with DialogRoleType
  /* "alertdialog" */ val AlertDialog: typings.openui5.sapMLibraryMod.DialogRoleType.AlertDialog & String = js.native
  
  /**
    * Represents the ARIA role `dialog`.
    */
  @js.native
  sealed trait Dialog
    extends StObject
       with DialogRoleType
  /* "dialog" */ val Dialog: typings.openui5.sapMLibraryMod.DialogRoleType.Dialog & String = js.native
}
