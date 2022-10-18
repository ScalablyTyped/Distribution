package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MenuButtonMode extends StObject
@JSImport("sap/m/library", "MenuButtonMode")
@js.native
object MenuButtonMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MenuButtonMode & String] = js.native
  
  /**
    * Default regular type (Menu button appears as a regular button, pressing opens a menu)
    */
  @js.native
  sealed trait Regular
    extends StObject
       with MenuButtonMode
  /* "Regular" */ val Regular: typings.openui5.sapMLibraryMod.MenuButtonMode.Regular & String = js.native
  
  /**
    * Split type (Menu button appears as a split button, pressing fires the default action a menu, pressing
    * the arrow part opens a menu)
    */
  @js.native
  sealed trait Split
    extends StObject
       with MenuButtonMode
  /* "Split" */ val Split: typings.openui5.sapMLibraryMod.MenuButtonMode.Split & String = js.native
}
