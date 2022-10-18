package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FacetFilterType extends StObject
@JSImport("sap/m/library", "FacetFilterType")
@js.native
object FacetFilterType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FacetFilterType & String] = js.native
  
  /**
    * Forces FacetFilter to display in light mode.
    */
  @js.native
  sealed trait Light
    extends StObject
       with FacetFilterType
  /* "Light" */ val Light: typings.openui5.sapMLibraryMod.FacetFilterType.Light & String = js.native
  
  /**
    * Forces FacetFilter to display facet lists as a row of buttons, one button per facet.
    *
    * The FacetFilter will automatically adapt to the Light type when it detects smart phone sized displays.
    */
  @js.native
  sealed trait Simple
    extends StObject
       with FacetFilterType
  /* "Simple" */ val Simple: typings.openui5.sapMLibraryMod.FacetFilterType.Simple & String = js.native
}
