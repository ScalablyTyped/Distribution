package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ENV extends StObject
@JSImport("@pixi/constants", "ENV")
@js.native
object ENV extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ENV & Double] = js.native
  
  /**
    * Version 1 of WebGL
    * @default 1
    */
  @js.native
  sealed trait WEBGL
    extends StObject
       with ENV
  /* 1 */ val WEBGL: typings.pixiConstants.mod.ENV.WEBGL & Double = js.native
  
  /**
    * Version 2 of WebGL
    * @default 2
    */
  @js.native
  sealed trait WEBGL2
    extends StObject
       with ENV
  /* 2 */ val WEBGL2: typings.pixiConstants.mod.ENV.WEBGL2 & Double = js.native
  
  /**
    * Used for older v1 WebGL devices. PixiJS will aim to ensure compatibility
    * with older / less advanced devices. If you experience unexplained flickering prefer this environment.
    * @default 0
    */
  @js.native
  sealed trait WEBGL_LEGACY
    extends StObject
       with ENV
  /* 0 */ val WEBGL_LEGACY: typings.pixiConstants.mod.ENV.WEBGL_LEGACY & Double = js.native
}
