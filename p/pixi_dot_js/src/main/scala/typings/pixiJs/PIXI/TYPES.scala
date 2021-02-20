package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TYPES extends StObject
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
object TYPES extends StObject {
  
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
}
