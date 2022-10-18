package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListKeyboardMode extends StObject
@JSImport("sap/m/library", "ListKeyboardMode")
@js.native
object ListKeyboardMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListKeyboardMode & String] = js.native
  
  /**
    * This mode is suitable if the number of items is limited and if there are editable fields within the item.
    *
    * While the last/first interactive element within an item has the focus, pressing tab/shift+tab moves the
    * focus to the next/previous element in the tab chain after/before the item .
    */
  @js.native
  sealed trait Edit
    extends StObject
       with ListKeyboardMode
  /* "Edit" */ val Edit: typings.openui5.sapMLibraryMod.ListKeyboardMode.Edit & String = js.native
  
  /**
    * This default mode is suitable if the number of items is unlimited or if there is no editable field within
    * the item.
    *
    * While the last/first interactive element within an item has the focus, pressing tab/shift+tab moves the
    * focus to the next/previous element in the tab chain after/before the `sap.m.List` or `sap.m.Table`.
    */
  @js.native
  sealed trait Navigation
    extends StObject
       with ListKeyboardMode
  /* "Navigation" */ val Navigation: typings.openui5.sapMLibraryMod.ListKeyboardMode.Navigation & String = js.native
}
