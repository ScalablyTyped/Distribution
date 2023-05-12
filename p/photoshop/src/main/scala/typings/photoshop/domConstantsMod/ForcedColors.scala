package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ForcedColors extends StObject
@JSImport("photoshop/dom/Constants", "ForcedColors")
@js.native
object ForcedColors extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ForcedColors & String] = js.native
  
  /**
    * Pure black and pure white
    */
  @js.native
  sealed trait BLACKANDWHITE
    extends StObject
       with ForcedColors
  /* "blackAndWhite" */ val BLACKANDWHITE: typings.photoshop.domConstantsMod.ForcedColors.BLACKANDWHITE & String = js.native
  
  /**
    * None
    */
  @js.native
  sealed trait NONE
    extends StObject
       with ForcedColors
  /* "none" */ val NONE: typings.photoshop.domConstantsMod.ForcedColors.NONE & String = js.native
  
  /**
    * Red, green, blue, cyan, magenta, yellow, black, and white.
    */
  @js.native
  sealed trait PRIMARIES
    extends StObject
       with ForcedColors
  /* "primaries" */ val PRIMARIES: typings.photoshop.domConstantsMod.ForcedColors.PRIMARIES & String = js.native
  
  /**
    * The 216 web-safe colors
    */
  @js.native
  sealed trait WEB
    extends StObject
       with ForcedColors
  /* "web" */ val WEB: typings.photoshop.domConstantsMod.ForcedColors.WEB & String = js.native
}
