package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tiling sprite is a fast way of rendering a tiling image
  *
  * @class
  * @extends PIXI.Sprite
  * @memberof PIXI
  */
@js.native
trait TilingSprite extends Sprite {
  
  /**
    * Changes frame clamping in corresponding textureTransform, shortcut
    * Change to -0.5 to add a pixel to the edge, recommended for transparent trimmed textures in atlas
    *
    * @default 0.5
    * @member {number}
    */
  var clampMargin: Double = js.native
  
  /**
    * The offset of the image that is being tiled
    *
    * @member {PIXI.ObservablePoint}
    */
  var tilePosition: ObservablePoint = js.native
  
  /**
    * The scaling of the image that is being tiled
    *
    * @member {PIXI.ObservablePoint}
    */
  var tileScale: ObservablePoint = js.native
  
  /**
    * Tile transform
    *
    * @member {PIXI.Transform} PIXI.TilingSprite#tileTransform
    */
  var tileTransform: Transform = js.native
  
  /**
    * matrix that is applied to UV to get the coords in Texture normalized space to coords in BaseTexture space
    *
    * @member {PIXI.TextureMatrix} PIXI.TilingSprite#uvMatrix
    */
  var uvMatrix: TextureMatrix = js.native
  
  /**
    * Whether or not anchor affects uvs
    *
    * @member {boolean} PIXI.TilingSprite#uvRespectAnchor
    * @default false
    */
  var uvRespectAnchor: Boolean = js.native
}
