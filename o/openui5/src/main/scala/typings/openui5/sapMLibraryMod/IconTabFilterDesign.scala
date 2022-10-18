package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IconTabFilterDesign extends StObject
@JSImport("sap/m/library", "IconTabFilterDesign")
@js.native
object IconTabFilterDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IconTabFilterDesign & String] = js.native
  
  /**
    * A horizontally layouted design providing more space for texts.
    */
  @js.native
  sealed trait Horizontal
    extends StObject
       with IconTabFilterDesign
  /* "Horizontal" */ val Horizontal: typings.openui5.sapMLibraryMod.IconTabFilterDesign.Horizontal & String = js.native
  
  /**
    * A vertically layouted design using minimum horizontal space.
    */
  @js.native
  sealed trait Vertical
    extends StObject
       with IconTabFilterDesign
  /* "Vertical" */ val Vertical: typings.openui5.sapMLibraryMod.IconTabFilterDesign.Vertical & String = js.native
}
