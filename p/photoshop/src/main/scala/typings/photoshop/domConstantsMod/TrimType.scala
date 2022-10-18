package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TrimType extends StObject
@JSImport("photoshop/dom/Constants", "TrimType")
@js.native
object TrimType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TrimType & String] = js.native
  
  /**
    * Bottom right pixel color.
    */
  @js.native
  sealed trait BOTTOMRIGHT
    extends StObject
       with TrimType
  /* "bottom-right" */ val BOTTOMRIGHT: typings.photoshop.domConstantsMod.TrimType.BOTTOMRIGHT & String = js.native
  
  /**
    * Top left pixel color.
    */
  @js.native
  sealed trait TOPLEFT
    extends StObject
       with TrimType
  /* "top-left" */ val TOPLEFT: typings.photoshop.domConstantsMod.TrimType.TOPLEFT & String = js.native
  
  /**
    * Transparent pixels.
    */
  @js.native
  sealed trait TRANSPARENT
    extends StObject
       with TrimType
  /* "transparent" */ val TRANSPARENT: typings.photoshop.domConstantsMod.TrimType.TRANSPARENT & String = js.native
}
