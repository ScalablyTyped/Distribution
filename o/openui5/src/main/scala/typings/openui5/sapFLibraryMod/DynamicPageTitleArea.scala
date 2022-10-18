package typings.openui5.sapFLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DynamicPageTitleArea extends StObject
@JSImport("sap/f/library", "DynamicPageTitleArea")
@js.native
object DynamicPageTitleArea extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DynamicPageTitleArea & String] = js.native
  
  /**
    * The area includes the `heading`, `expandedContent` and `snappedContent` aggregations, positioned in the
    * beginning area of the {@link sap.f.DynamicPageTitle}.
    */
  @js.native
  sealed trait Begin
    extends StObject
       with DynamicPageTitleArea
  /* "Begin" */ val Begin: typings.openui5.sapFLibraryMod.DynamicPageTitleArea.Begin & String = js.native
  
  /**
    * The area includes the `content` aggregation, positioned in the middle part of the {@link sap.f.DynamicPageTitle}.
    */
  @js.native
  sealed trait Middle
    extends StObject
       with DynamicPageTitleArea
  /* "Middle" */ val Middle: typings.openui5.sapFLibraryMod.DynamicPageTitleArea.Middle & String = js.native
}
