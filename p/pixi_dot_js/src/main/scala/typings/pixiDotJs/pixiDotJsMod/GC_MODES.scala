package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  */
@JSImport("pixi.js", "GC_MODES")
@js.native
object GC_MODES extends js.Object {
  /** Garbage collection will happen periodically automatically */
  var AUTO: Double = js.native
  /** Garbage collection will need to be called manually */
  var MANUAL: Double = js.native
}

