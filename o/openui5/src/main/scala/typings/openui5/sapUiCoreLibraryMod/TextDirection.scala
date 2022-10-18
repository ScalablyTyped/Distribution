package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextDirection extends StObject
@JSImport("sap/ui/core/library", "TextDirection")
@js.native
object TextDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextDirection & String] = js.native
  
  /**
    * Inherits the direction from its parent control/container.
    */
  @js.native
  sealed trait Inherit
    extends StObject
       with TextDirection
  /* "Inherit" */ val Inherit: typings.openui5.sapUiCoreLibraryMod.TextDirection.Inherit & String = js.native
  
  /**
    * Specifies left-to-right text direction.
    */
  @js.native
  sealed trait LTR
    extends StObject
       with TextDirection
  /* "LTR" */ val LTR: typings.openui5.sapUiCoreLibraryMod.TextDirection.LTR & String = js.native
  
  /**
    * Specifies right-to-left text direction.
    */
  @js.native
  sealed trait RTL
    extends StObject
       with TextDirection
  /* "RTL" */ val RTL: typings.openui5.sapUiCoreLibraryMod.TextDirection.RTL & String = js.native
}
