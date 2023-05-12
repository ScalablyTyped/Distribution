package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontSize extends StObject
@JSImport("photoshop/dom/Constants", "FontSize")
@js.native
object FontSize extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FontSize & String] = js.native
  
  /**
    * Large size.
    */
  @js.native
  sealed trait LARGE
    extends StObject
       with FontSize
  /* "preferLargePaletteFontType" */ val LARGE: typings.photoshop.domConstantsMod.FontSize.LARGE & String = js.native
  
  /**
    * Medium size.
    */
  @js.native
  sealed trait MEDIUM
    extends StObject
       with FontSize
  /* "preferMediumPaletteFontType" */ val MEDIUM: typings.photoshop.domConstantsMod.FontSize.MEDIUM & String = js.native
  
  /**
    * Small size.
    */
  @js.native
  sealed trait SMALL
    extends StObject
       with FontSize
  /* "preferSmallPaletteFontType" */ val SMALL: typings.photoshop.domConstantsMod.FontSize.SMALL & String = js.native
  
  /**
    * Tiny size.
    */
  @js.native
  sealed trait TINY
    extends StObject
       with FontSize
  /* "preferTinyPaletteFontType" */ val TINY: typings.photoshop.domConstantsMod.FontSize.TINY & String = js.native
}
