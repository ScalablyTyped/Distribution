package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToolbarDesign extends StObject
@JSImport("sap/m/library", "ToolbarDesign")
@js.native
object ToolbarDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarDesign & String] = js.native
  
  /**
    * The toolbar can be inserted into other controls and if the design is "Auto" then it inherits the design
    * from parent control.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with ToolbarDesign
  /* "Auto" */ val Auto: typings.openui5.sapMLibraryMod.ToolbarDesign.Auto & String = js.native
  
  /**
    * The toolbar appears smaller than the regular size to show information(e.g: text, icon).
    */
  @js.native
  sealed trait Info
    extends StObject
       with ToolbarDesign
  /* "Info" */ val Info: typings.openui5.sapMLibraryMod.ToolbarDesign.Info & String = js.native
  
  /**
    * @SINCE 1.22
    *
    * The toolbar has a solid background. Its content will be rendered in a standard way.
    */
  @js.native
  sealed trait Solid
    extends StObject
       with ToolbarDesign
  /* "Solid" */ val Solid: typings.openui5.sapMLibraryMod.ToolbarDesign.Solid & String = js.native
  
  /**
    * The toolbar and its content will be displayed transparent.
    */
  @js.native
  sealed trait Transparent
    extends StObject
       with ToolbarDesign
  /* "Transparent" */ val Transparent: typings.openui5.sapMLibraryMod.ToolbarDesign.Transparent & String = js.native
}
