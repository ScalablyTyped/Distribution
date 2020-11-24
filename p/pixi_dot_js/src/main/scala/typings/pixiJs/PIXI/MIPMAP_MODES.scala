package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MIPMAP_MODES extends js.Object
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
@JSGlobal("PIXI.MIPMAP_MODES")
@js.native
object MIPMAP_MODES extends js.Object {
  
  @js.native
  sealed trait OFF extends MIPMAP_MODES
  
  @js.native
  sealed trait ON extends MIPMAP_MODES
  
  @js.native
  sealed trait POW2 extends MIPMAP_MODES
}
