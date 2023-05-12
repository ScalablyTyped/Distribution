package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TYPES extends StObject
@JSImport("@pixi/constants", "TYPES")
@js.native
object TYPES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPES & Double] = js.native
  
  /**
    * @default 5120
    */
  @js.native
  sealed trait BYTE
    extends StObject
       with TYPES
  /* 5120 */ val BYTE: typings.pixiConstants.mod.TYPES.BYTE & Double = js.native
  
  /**
    * @default 5126
    */
  @js.native
  sealed trait FLOAT
    extends StObject
       with TYPES
  /* 5126 */ val FLOAT: typings.pixiConstants.mod.TYPES.FLOAT & Double = js.native
  
  /**
    * @default 36269
    */
  @js.native
  sealed trait FLOAT_32_UNSIGNED_INT_24_8_REV
    extends StObject
       with TYPES
  /* 36269 */ val FLOAT_32_UNSIGNED_INT_24_8_REV: typings.pixiConstants.mod.TYPES.FLOAT_32_UNSIGNED_INT_24_8_REV & Double = js.native
  
  /**
    * @default 36193
    */
  @js.native
  sealed trait HALF_FLOAT
    extends StObject
       with TYPES
  /* 36193 */ val HALF_FLOAT: typings.pixiConstants.mod.TYPES.HALF_FLOAT & Double = js.native
  
  /**
    * @default 5124
    */
  @js.native
  sealed trait INT
    extends StObject
       with TYPES
  /* 5124 */ val INT: typings.pixiConstants.mod.TYPES.INT & Double = js.native
  
  /**
    * @default 5122
    */
  @js.native
  sealed trait SHORT
    extends StObject
       with TYPES
  /* 5122 */ val SHORT: typings.pixiConstants.mod.TYPES.SHORT & Double = js.native
  
  /**
    * 8 bits per channel for gl.RGBA
    * @default 5121
    */
  @js.native
  sealed trait UNSIGNED_BYTE
    extends StObject
       with TYPES
  /* 5121 */ val UNSIGNED_BYTE: typings.pixiConstants.mod.TYPES.UNSIGNED_BYTE & Double = js.native
  
  /**
    * @default 5125
    */
  @js.native
  sealed trait UNSIGNED_INT
    extends StObject
       with TYPES
  /* 5125 */ val UNSIGNED_INT: typings.pixiConstants.mod.TYPES.UNSIGNED_INT & Double = js.native
  
  /**
    * @default 35899
    */
  @js.native
  sealed trait UNSIGNED_INT_10F_11F_11F_REV
    extends StObject
       with TYPES
  /* 35899 */ val UNSIGNED_INT_10F_11F_11F_REV: typings.pixiConstants.mod.TYPES.UNSIGNED_INT_10F_11F_11F_REV & Double = js.native
  
  /**
    * @default 34042
    */
  @js.native
  sealed trait UNSIGNED_INT_24_8
    extends StObject
       with TYPES
  /* 34042 */ val UNSIGNED_INT_24_8: typings.pixiConstants.mod.TYPES.UNSIGNED_INT_24_8 & Double = js.native
  
  /**
    * @default 33640
    */
  @js.native
  sealed trait UNSIGNED_INT_2_10_10_10_REV
    extends StObject
       with TYPES
  /* 33640 */ val UNSIGNED_INT_2_10_10_10_REV: typings.pixiConstants.mod.TYPES.UNSIGNED_INT_2_10_10_10_REV & Double = js.native
  
  /**
    * @default 35902
    */
  @js.native
  sealed trait UNSIGNED_INT_5_9_9_9_REV
    extends StObject
       with TYPES
  /* 35902 */ val UNSIGNED_INT_5_9_9_9_REV: typings.pixiConstants.mod.TYPES.UNSIGNED_INT_5_9_9_9_REV & Double = js.native
  
  /**
    * @default 5123
    */
  @js.native
  sealed trait UNSIGNED_SHORT
    extends StObject
       with TYPES
  /* 5123 */ val UNSIGNED_SHORT: typings.pixiConstants.mod.TYPES.UNSIGNED_SHORT & Double = js.native
  
  /**
    * 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    * @default 32819
    */
  @js.native
  sealed trait UNSIGNED_SHORT_4_4_4_4
    extends StObject
       with TYPES
  /* 32819 */ val UNSIGNED_SHORT_4_4_4_4: typings.pixiConstants.mod.TYPES.UNSIGNED_SHORT_4_4_4_4 & Double = js.native
  
  /**
    * 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    * @default 32820
    */
  @js.native
  sealed trait UNSIGNED_SHORT_5_5_5_1
    extends StObject
       with TYPES
  /* 32820 */ val UNSIGNED_SHORT_5_5_5_1: typings.pixiConstants.mod.TYPES.UNSIGNED_SHORT_5_5_5_1 & Double = js.native
  
  /**
    * 5 red bits, 6 green bits, 5 blue bits.
    * @default 33635
    */
  @js.native
  sealed trait UNSIGNED_SHORT_5_6_5
    extends StObject
       with TYPES
  /* 33635 */ val UNSIGNED_SHORT_5_6_5: typings.pixiConstants.mod.TYPES.UNSIGNED_SHORT_5_6_5 & Double = js.native
}
