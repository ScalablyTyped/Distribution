package typings.pixiJs.PIXI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GC_MODES extends js.Object

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
  @js.native
  sealed trait AUTO extends GC_MODES
  
  @js.native
  sealed trait MANUAL extends GC_MODES
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GC_MODES with Double] = js.native
  /* 0 */ @js.native
  object AUTO extends TopLevel[AUTO with Double]
  
  /* 1 */ @js.native
  object MANUAL extends TopLevel[MANUAL with Double]
  
}

