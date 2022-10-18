package typings.openui5.sapUiUx3LibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShellHeaderType extends StObject
@JSImport("sap/ui/ux3/library", "ShellHeaderType")
@js.native
object ShellHeaderType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShellHeaderType & String] = js.native
  
  /**
    * Only the branding area is visible. Top-level navigation bar, header items, title and icon are not shown.
    */
  @js.native
  sealed trait BrandOnly
    extends StObject
       with ShellHeaderType
  /* "BrandOnly" */ val BrandOnly: typings.openui5.sapUiUx3LibraryMod.ShellHeaderType.BrandOnly & String = js.native
  
  /**
    * Like the Standard Area but without top-level navigation bar.
    */
  @js.native
  sealed trait NoNavigation
    extends StObject
       with ShellHeaderType
  /* "NoNavigation" */ val NoNavigation: typings.openui5.sapUiUx3LibraryMod.ShellHeaderType.NoNavigation & String = js.native
  
  /**
    * Like the Standard Area but with a leaner top-level navigation bar.
    */
  @js.native
  sealed trait SlimNavigation
    extends StObject
       with ShellHeaderType
  /* "SlimNavigation" */ val SlimNavigation: typings.openui5.sapUiUx3LibraryMod.ShellHeaderType.SlimNavigation & String = js.native
  
  /**
    * The standard Shell header.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with ShellHeaderType
  /* "Standard" */ val Standard: typings.openui5.sapUiUx3LibraryMod.ShellHeaderType.Standard & String = js.native
}
