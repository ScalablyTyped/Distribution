package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BarDesign extends StObject
@JSImport("sap/m/library", "BarDesign")
@js.native
object BarDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BarDesign & String] = js.native
  
  /**
    * The Bar can be inserted into other controls and if the design is "Auto" then it inherits the design from
    * parent control.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with BarDesign
  /* "Auto" */ val Auto: typings.openui5.sapMLibraryMod.BarDesign.Auto & String = js.native
  
  /**
    * The bar will be styled like a footer of the page.
    */
  @js.native
  sealed trait Footer
    extends StObject
       with BarDesign
  /* "Footer" */ val Footer: typings.openui5.sapMLibraryMod.BarDesign.Footer & String = js.native
  
  /**
    * The bar will be styled like a header of the page.
    */
  @js.native
  sealed trait Header
    extends StObject
       with BarDesign
  /* "Header" */ val Header: typings.openui5.sapMLibraryMod.BarDesign.Header & String = js.native
  
  /**
    * The bar will be styled like a subheader of the page.
    */
  @js.native
  sealed trait SubHeader
    extends StObject
       with BarDesign
  /* "SubHeader" */ val SubHeader: typings.openui5.sapMLibraryMod.BarDesign.SubHeader & String = js.native
}
