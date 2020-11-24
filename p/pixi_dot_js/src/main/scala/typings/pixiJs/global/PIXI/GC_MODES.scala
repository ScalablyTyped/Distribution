package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The gc modes that are supported by pixi.
  *
  * The {@link PIXI.settings.GC_MODE} Garbage Collection mode for PixiJS textures is AUTO
  * If set to GC_MODE, the renderer will occasionally check textures usage. If they are not
  * used for a specified period of time they will be removed from the GPU. They will of course
  * be uploaded again when they are required. This is a silent behind the scenes process that
  * should ensure that the GPU does not  get filled up.
  *
  * Handy for mobile devices!
  * This property only affects WebGL.
  *
  * @name GC_MODES
  * @enum {number}
  * @static
  * @memberof PIXI
  * @property {number} AUTO - Garbage collection will happen periodically automatically
  * @property {number} MANUAL - Garbage collection will need to be called manually
  */
@JSGlobal("PIXI.GC_MODES")
@js.native
object GC_MODES extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.GC_MODES with Double] = js.native
  
  /* 0 */ val AUTO: typings.pixiJs.PIXI.GC_MODES.AUTO with Double = js.native
  
  /* 1 */ val MANUAL: typings.pixiJs.PIXI.GC_MODES.MANUAL with Double = js.native
}
