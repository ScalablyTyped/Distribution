package typings.openui5.sapUiLayoutLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockBackgroundType extends StObject
@JSImport("sap/ui/layout/library", "BlockBackgroundType")
@js.native
object BlockBackgroundType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlockBackgroundType & String] = js.native
  
  /**
    * Background with pre-defined accent colors
    */
  @js.native
  sealed trait Accent
    extends StObject
       with BlockBackgroundType
  /* "Accent" */ val Accent: typings.openui5.sapUiLayoutLibraryMod.BlockBackgroundType.Accent & String = js.native
  
  /**
    * For applications that want to make use of e.g. charts in the Blocks, this layout type has spacings around
    * the Blocks
    */
  @js.native
  sealed trait Dashboard
    extends StObject
       with BlockBackgroundType
  /* "Dashboard" */ val Dashboard: typings.openui5.sapUiLayoutLibraryMod.BlockBackgroundType.Dashboard & String = js.native
  
  /**
    * Background is transparent
    */
  @js.native
  sealed trait Default
    extends StObject
       with BlockBackgroundType
  /* "Default" */ val Default: typings.openui5.sapUiLayoutLibraryMod.BlockBackgroundType.Default & String = js.native
  
  /**
    * Background is with predefined light colors
    */
  @js.native
  sealed trait Light
    extends StObject
       with BlockBackgroundType
  /* "Light" */ val Light: typings.openui5.sapUiLayoutLibraryMod.BlockBackgroundType.Light & String = js.native
  
  /**
    * @deprecated (since 1.50)
    *
    * Background with bright and dark background colors
    */
  @js.native
  sealed trait Mixed
    extends StObject
       with BlockBackgroundType
  /* "Mixed" */ val Mixed: typings.openui5.sapUiLayoutLibraryMod.BlockBackgroundType.Mixed & String = js.native
}
