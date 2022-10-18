package typings.openui5.sapUiWebcFioriLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BarDesign extends StObject
@JSImport("sap/ui/webc/fiori/library", "BarDesign")
@js.native
object BarDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BarDesign & String] = js.native
  
  /**
    * Floating Footer type - there is visible border on all sides
    */
  @js.native
  sealed trait FloatingFooter
    extends StObject
       with BarDesign
  /* "FloatingFooter" */ val FloatingFooter: typings.openui5.sapUiWebcFioriLibraryMod.BarDesign.FloatingFooter & String = js.native
  
  /**
    * Footer type
    */
  @js.native
  sealed trait Footer
    extends StObject
       with BarDesign
  /* "Footer" */ val Footer: typings.openui5.sapUiWebcFioriLibraryMod.BarDesign.Footer & String = js.native
  
  /**
    * Default type
    */
  @js.native
  sealed trait Header
    extends StObject
       with BarDesign
  /* "Header" */ val Header: typings.openui5.sapUiWebcFioriLibraryMod.BarDesign.Header & String = js.native
  
  /**
    * Subheader type
    */
  @js.native
  sealed trait Subheader
    extends StObject
       with BarDesign
  /* "Subheader" */ val Subheader: typings.openui5.sapUiWebcFioriLibraryMod.BarDesign.Subheader & String = js.native
}
