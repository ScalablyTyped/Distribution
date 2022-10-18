package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccessibleLandmarkRole extends StObject
@JSImport("sap/ui/core/library", "AccessibleLandmarkRole")
@js.native
object AccessibleLandmarkRole extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AccessibleLandmarkRole & String] = js.native
  
  /**
    * Represents the ARIA role `banner`.
    *
    * A banner usually appears at the top of the page and typically spans the full width.
    */
  @js.native
  sealed trait Banner
    extends StObject
       with AccessibleLandmarkRole
  /* "Banner" */ val Banner: typings.openui5.sapUiCoreLibraryMod.AccessibleLandmarkRole.Banner & String = js.native
  
  /**
    * Represents the ARIA role `complementary`.
    *
    * A section of the page, designed to be complementary to the main content at a similar level in the DOM
    * hierarchy.
    */
  @js.native
  sealed trait Complementary
    extends StObject
       with AccessibleLandmarkRole
  /* "Complementary" */ val Complementary: typings.openui5.sapUiCoreLibraryMod.AccessibleLandmarkRole.Complementary & String = js.native
  
  /**
    * Represents the ARIA role `contentinfo`.
    *
    * A region that contains information about the content on the page.
    */
  @js.native
  sealed trait ContentInfo
    extends StObject
       with AccessibleLandmarkRole
  /* "ContentInfo" */ val ContentInfo: typings.openui5.sapUiCoreLibraryMod.AccessibleLandmarkRole.ContentInfo & String = js.native
  
  /**
    * Represents the ARIA role `form`.
    *
    * A region that contains a collection of items and objects that, as a whole, combine to create a form.
    */
  @js.native
  sealed trait Form
    extends StObject
       with AccessibleLandmarkRole
  /* "Form" */ val Form: typings.openui5.sapUiCoreLibraryMod.AccessibleLandmarkRole.Form & String = js.native
  
  /**
    * Represents the ARIA role `main`.
    *
    * The main content of a page.
    */
  @js.native
  sealed trait Main
    extends StObject
       with AccessibleLandmarkRole
  /* "Main" */ val Main: typings.openui5.sapUiCoreLibraryMod.AccessibleLandmarkRole.Main & String = js.native
  
  /**
    * Represents the ARIA role `navigation`.
    *
    * A region that contains a collection of items and objects that, as a whole, combine to create a navigation
    * facility.
    */
  @js.native
  sealed trait Navigation
    extends StObject
       with AccessibleLandmarkRole
  /* "Navigation" */ val Navigation: typings.openui5.sapUiCoreLibraryMod.AccessibleLandmarkRole.Navigation & String = js.native
  
  /**
    * No explicit role is applicable.
    *
    * The interpretation of this value depends on the control / element which defines a property with this
    * type. Normally this value means that no accessible landmark should be written.
    */
  @js.native
  sealed trait None
    extends StObject
       with AccessibleLandmarkRole
  /* "None" */ val None: typings.openui5.sapUiCoreLibraryMod.AccessibleLandmarkRole.None & String = js.native
  
  /**
    * Represents the ARIA role `region`.
    *
    * A section of a page, that is important enough to be included in a page summary or table of contents.
    */
  @js.native
  sealed trait Region
    extends StObject
       with AccessibleLandmarkRole
  /* "Region" */ val Region: typings.openui5.sapUiCoreLibraryMod.AccessibleLandmarkRole.Region & String = js.native
  
  /**
    * Represents the ARIA role `search`.
    *
    * A region that contains a collection of items and objects that, as a whole, combine to create a search
    * facility.
    */
  @js.native
  sealed trait Search
    extends StObject
       with AccessibleLandmarkRole
  /* "Search" */ val Search: typings.openui5.sapUiCoreLibraryMod.AccessibleLandmarkRole.Search & String = js.native
}
