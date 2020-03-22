package typings.pixiJs.PIXI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TYPES extends js.Object

/**
  * Various GL data format types.
  *
  * @memberof PIXI
  * @static
  * @name TYPES
  * @enum {number}
  * @property {number} UNSIGNED_BYTE=5121
  * @property {number} UNSIGNED_SHORT=5123
  * @property {number} UNSIGNED_SHORT_5_6_5=33635
  * @property {number} UNSIGNED_SHORT_4_4_4_4=32819
  * @property {number} UNSIGNED_SHORT_5_5_5_1=32820
  * @property {number} FLOAT=5126
  * @property {number} HALF_FLOAT=36193
  */
@JSGlobal("PIXI.TYPES")
@js.native
object TYPES extends js.Object {
  @js.native
  sealed trait FLOAT extends TYPES
  
  @js.native
  sealed trait HALF_FLOAT extends TYPES
  
  @js.native
  sealed trait UNSIGNED_BYTE extends TYPES
  
  @js.native
  sealed trait UNSIGNED_SHORT extends TYPES
  
  @js.native
  sealed trait UNSIGNED_SHORT_4_4_4_4 extends TYPES
  
  @js.native
  sealed trait UNSIGNED_SHORT_5_5_5_1 extends TYPES
  
  @js.native
  sealed trait UNSIGNED_SHORT_5_6_5 extends TYPES
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPES with Double] = js.native
  /* 5 */ @js.native
  object FLOAT extends TopLevel[FLOAT with Double]
  
  /* 6 */ @js.native
  object HALF_FLOAT extends TopLevel[HALF_FLOAT with Double]
  
  /* 0 */ @js.native
  object UNSIGNED_BYTE extends TopLevel[UNSIGNED_BYTE with Double]
  
  /* 1 */ @js.native
  object UNSIGNED_SHORT extends TopLevel[UNSIGNED_SHORT with Double]
  
  /* 3 */ @js.native
  object UNSIGNED_SHORT_4_4_4_4 extends TopLevel[UNSIGNED_SHORT_4_4_4_4 with Double]
  
  /* 4 */ @js.native
  object UNSIGNED_SHORT_5_5_5_1 extends TopLevel[UNSIGNED_SHORT_5_5_5_1 with Double]
  
  /* 2 */ @js.native
  object UNSIGNED_SHORT_5_6_5 extends TopLevel[UNSIGNED_SHORT_5_6_5 with Double]
  
}

