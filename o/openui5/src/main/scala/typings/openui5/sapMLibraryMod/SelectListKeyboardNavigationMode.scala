package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectListKeyboardNavigationMode extends StObject
@JSImport("sap/m/library", "SelectListKeyboardNavigationMode")
@js.native
object SelectListKeyboardNavigationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectListKeyboardNavigationMode & String] = js.native
  
  /**
    * Keyboard navigation is delimited at the last item or first item of the list.
    */
  @js.native
  sealed trait Delimited
    extends StObject
       with SelectListKeyboardNavigationMode
  /* "Delimited" */ val Delimited: typings.openui5.sapMLibraryMod.SelectListKeyboardNavigationMode.Delimited & String = js.native
  
  /**
    * Keyboard navigation is disabled.
    */
  @js.native
  sealed trait None
    extends StObject
       with SelectListKeyboardNavigationMode
  /* "None" */ val None: typings.openui5.sapMLibraryMod.SelectListKeyboardNavigationMode.None & String = js.native
}
