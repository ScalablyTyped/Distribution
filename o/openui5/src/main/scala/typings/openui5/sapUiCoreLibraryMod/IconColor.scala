package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IconColor extends StObject
@JSImport("sap/ui/core/library", "IconColor")
@js.native
object IconColor extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IconColor & String] = js.native
  
  /**
    * Contrast color.
    */
  @js.native
  sealed trait Contrast
    extends StObject
       with IconColor
  /* "Contrast" */ val Contrast: typings.openui5.sapUiCoreLibraryMod.IconColor.Contrast & String = js.native
  
  /**
    * Critical color
    */
  @js.native
  sealed trait Critical
    extends StObject
       with IconColor
  /* "Critical" */ val Critical: typings.openui5.sapUiCoreLibraryMod.IconColor.Critical & String = js.native
  
  /**
    * Default color (brand color)
    */
  @js.native
  sealed trait Default
    extends StObject
       with IconColor
  /* "Default" */ val Default: typings.openui5.sapUiCoreLibraryMod.IconColor.Default & String = js.native
  
  /**
    * @SINCE 1.76
    *
    * Color for icon used as a marker
    */
  @js.native
  sealed trait Marker
    extends StObject
       with IconColor
  /* "Marker" */ val Marker: typings.openui5.sapUiCoreLibraryMod.IconColor.Marker & String = js.native
  
  /**
    * Negative color
    */
  @js.native
  sealed trait Negative
    extends StObject
       with IconColor
  /* "Negative" */ val Negative: typings.openui5.sapUiCoreLibraryMod.IconColor.Negative & String = js.native
  
  /**
    * Neutral color.
    */
  @js.native
  sealed trait Neutral
    extends StObject
       with IconColor
  /* "Neutral" */ val Neutral: typings.openui5.sapUiCoreLibraryMod.IconColor.Neutral & String = js.native
  
  /**
    * @SINCE 1.76
    *
    * Color that indicates an icon which isn't interactive
    */
  @js.native
  sealed trait NonInteractive
    extends StObject
       with IconColor
  /* "NonInteractive" */ val NonInteractive: typings.openui5.sapUiCoreLibraryMod.IconColor.NonInteractive & String = js.native
  
  /**
    * Positive color
    */
  @js.native
  sealed trait Positive
    extends StObject
       with IconColor
  /* "Positive" */ val Positive: typings.openui5.sapUiCoreLibraryMod.IconColor.Positive & String = js.native
  
  /**
    * @SINCE 1.76
    *
    * Color for icon used in a Tile
    */
  @js.native
  sealed trait Tile
    extends StObject
       with IconColor
  /* "Tile" */ val Tile: typings.openui5.sapUiCoreLibraryMod.IconColor.Tile & String = js.native
}
