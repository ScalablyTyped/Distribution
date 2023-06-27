package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexRendertype extends StObject
@JSImport("sap/m/library", "FlexRendertype")
@js.native
object FlexRendertype extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FlexRendertype & String] = js.native
  
  /**
    * @since 1.42.1
    *
    * The UI5 controls are not wrapped in an additional HTML element, the surrounding Flex Box is a DIV element.
    */
  @js.native
  sealed trait Bare
    extends StObject
       with FlexRendertype
  /* "Bare" */ val Bare: typings.openui5.sapMLibraryMod.FlexRendertype.Bare & String = js.native
  
  /**
    * The UI5 controls are wrapped in DIV elements.
    */
  @js.native
  sealed trait Div
    extends StObject
       with FlexRendertype
  /* "Div" */ val Div: typings.openui5.sapMLibraryMod.FlexRendertype.Div & String = js.native
  
  /**
    * The UI5 controls are wrapped in LI elements, the surrounding Flex Box is an unordered list (UL).
    */
  @js.native
  sealed trait List
    extends StObject
       with FlexRendertype
  /* "List" */ val List: typings.openui5.sapMLibraryMod.FlexRendertype.List & String = js.native
}
