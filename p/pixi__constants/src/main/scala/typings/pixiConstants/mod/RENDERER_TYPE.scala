package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RENDERER_TYPE extends StObject
@JSImport("@pixi/constants", "RENDERER_TYPE")
@js.native
object RENDERER_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RENDERER_TYPE & Double] = js.native
  
  /**
    * Canvas render type.
    * @default 2
    */
  @js.native
  sealed trait CANVAS
    extends StObject
       with RENDERER_TYPE
  /* 2 */ val CANVAS: typings.pixiConstants.mod.RENDERER_TYPE.CANVAS & Double = js.native
  
  /**
    * Unknown render type.
    * @default 0
    */
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with RENDERER_TYPE
  /* 0 */ val UNKNOWN: typings.pixiConstants.mod.RENDERER_TYPE.UNKNOWN & Double = js.native
  
  /**
    * WebGL render type.
    * @default 1
    */
  @js.native
  sealed trait WEBGL
    extends StObject
       with RENDERER_TYPE
  /* 1 */ val WEBGL: typings.pixiConstants.mod.RENDERER_TYPE.WEBGL & Double = js.native
}
