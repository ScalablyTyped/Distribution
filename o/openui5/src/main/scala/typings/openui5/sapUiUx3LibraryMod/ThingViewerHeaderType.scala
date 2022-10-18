package typings.openui5.sapUiUx3LibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ThingViewerHeaderType extends StObject
@JSImport("sap/ui/ux3/library", "ThingViewerHeaderType")
@js.native
object ThingViewerHeaderType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ThingViewerHeaderType & String] = js.native
  
  /**
    * The header content is displayed horizontally above the facet content
    */
  @js.native
  sealed trait Horizontal
    extends StObject
       with ThingViewerHeaderType
  /* "Horizontal" */ val Horizontal: typings.openui5.sapUiUx3LibraryMod.ThingViewerHeaderType.Horizontal & String = js.native
  
  /**
    * The standard ThingViewer header.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with ThingViewerHeaderType
  /* "Standard" */ val Standard: typings.openui5.sapUiUx3LibraryMod.ThingViewerHeaderType.Standard & String = js.native
}
