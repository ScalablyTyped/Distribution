package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BreadcrumbsDesign extends StObject
@JSImport("sap/ui/webc/main/library", "BreadcrumbsDesign")
@js.native
object BreadcrumbsDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BreadcrumbsDesign & String] = js.native
  
  /**
    * All items are displayed as links.
    */
  @js.native
  sealed trait NoCurrentPage
    extends StObject
       with BreadcrumbsDesign
  /* "NoCurrentPage" */ val NoCurrentPage: typings.openui5.sapUiWebcMainLibraryMod.BreadcrumbsDesign.NoCurrentPage & String = js.native
  
  /**
    * Shows the current page as the last item in the trail. The last item contains only plain text and is not
    * a link.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with BreadcrumbsDesign
  /* "Standard" */ val Standard: typings.openui5.sapUiWebcMainLibraryMod.BreadcrumbsDesign.Standard & String = js.native
}
