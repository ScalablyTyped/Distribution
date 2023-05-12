package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapHalfToneType extends StObject
@JSImport("photoshop/dom/Constants", "BitmapHalfToneType")
@js.native
object BitmapHalfToneType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BitmapHalfToneType & String] = js.native
  
  @js.native
  sealed trait CROSS
    extends StObject
       with BitmapHalfToneType
  /* "cross" */ val CROSS: typings.photoshop.domConstantsMod.BitmapHalfToneType.CROSS & String = js.native
  
  @js.native
  sealed trait DIAMOND
    extends StObject
       with BitmapHalfToneType
  /* "diamond" */ val DIAMOND: typings.photoshop.domConstantsMod.BitmapHalfToneType.DIAMOND & String = js.native
  
  @js.native
  sealed trait ELLIPSE
    extends StObject
       with BitmapHalfToneType
  /* "ellipse" */ val ELLIPSE: typings.photoshop.domConstantsMod.BitmapHalfToneType.ELLIPSE & String = js.native
  
  @js.native
  sealed trait LINE
    extends StObject
       with BitmapHalfToneType
  /* "lineClass" */ val LINE: typings.photoshop.domConstantsMod.BitmapHalfToneType.LINE & String = js.native
  
  @js.native
  sealed trait ROUND
    extends StObject
       with BitmapHalfToneType
  /* "round" */ val ROUND: typings.photoshop.domConstantsMod.BitmapHalfToneType.ROUND & String = js.native
  
  @js.native
  sealed trait SQUARE
    extends StObject
       with BitmapHalfToneType
  /* "square" */ val SQUARE: typings.photoshop.domConstantsMod.BitmapHalfToneType.SQUARE & String = js.native
}
