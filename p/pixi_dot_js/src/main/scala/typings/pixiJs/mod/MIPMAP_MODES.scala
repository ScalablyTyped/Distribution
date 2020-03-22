package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mipmap filtering modes that are supported by pixi.
  *
  * The {@link PIXI.settings.MIPMAP_TEXTURES} affects default texture filtering.
  * Mipmaps are generated for a baseTexture if its `mipmap` field is `ON`,
  * or its `POW2` and texture dimensions are powers of 2.
  * Due to platform restriction, `ON` option will work like `POW2` for webgl-1.
  *
  * This property only affects WebGL.
  *
  * @name MIPMAP_MODES
  * @memberof PIXI
  * @static
  * @enum {number}
  * @property {number} OFF - No mipmaps
  * @property {number} POW2 - Generate mipmaps if texture dimensions are pow2
  * @property {number} ON - Always generate mipmaps
  */
@JSImport("pixi.js", "MIPMAP_MODES")
@js.native
object MIPMAP_MODES extends js.Object {
  /* 0 */ val OFF: typings.pixiJs.PIXI.MIPMAP_MODES.OFF with Double = js.native
  /* 2 */ val ON: typings.pixiJs.PIXI.MIPMAP_MODES.ON with Double = js.native
  /* 1 */ val POW2: typings.pixiJs.PIXI.MIPMAP_MODES.POW2 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.MIPMAP_MODES with Double] = js.native
}

