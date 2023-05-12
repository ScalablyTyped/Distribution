package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PRECISION extends StObject
@JSImport("@pixi/constants", "PRECISION")
@js.native
object PRECISION extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PRECISION & String] = js.native
  
  /**
    * highp is at least a 32 bit value.
    * For floating point values they can range from: -2^62 to +2^62,
    * for integer values they are similar to Uint32Array or Int32Array
    * @default highp
    */
  @js.native
  sealed trait HIGH
    extends StObject
       with PRECISION
  /* "highp" */ val HIGH: typings.pixiConstants.mod.PRECISION.HIGH & String = js.native
  
  /**
    * lowp is at least an 9 bit value.
    * For floating point values they can range from: -2 to +2,
    * for integer values they are similar to Uint8Array or Int8Array
    * @default lowp
    */
  @js.native
  sealed trait LOW
    extends StObject
       with PRECISION
  /* "lowp" */ val LOW: typings.pixiConstants.mod.PRECISION.LOW & String = js.native
  
  /**
    * mediump is at least a 16 bit value.
    * For floating point values they can range from: -2^14 to +2^14,
    * for integer values they are similar to Uint16Array or Int16Array
    * @default mediump
    */
  @js.native
  sealed trait MEDIUM
    extends StObject
       with PRECISION
  /* "mediump" */ val MEDIUM: typings.pixiConstants.mod.PRECISION.MEDIUM & String = js.native
}
