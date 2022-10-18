package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IBarHTMLTag extends StObject
@JSImport("sap/m/library", "IBarHTMLTag")
@js.native
object IBarHTMLTag extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IBarHTMLTag & String] = js.native
  
  /**
    * Renders as a div element.
    */
  @js.native
  sealed trait Div
    extends StObject
       with IBarHTMLTag
  /* "Div" */ val Div: typings.openui5.sapMLibraryMod.IBarHTMLTag.Div & String = js.native
  
  /**
    * Renders as a footer element.
    */
  @js.native
  sealed trait Footer
    extends StObject
       with IBarHTMLTag
  /* "Footer" */ val Footer: typings.openui5.sapMLibraryMod.IBarHTMLTag.Footer & String = js.native
  
  /**
    * Renders as a header element.
    */
  @js.native
  sealed trait Header
    extends StObject
       with IBarHTMLTag
  /* "Header" */ val Header: typings.openui5.sapMLibraryMod.IBarHTMLTag.Header & String = js.native
}
