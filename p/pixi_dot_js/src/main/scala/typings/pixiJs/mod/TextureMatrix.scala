package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class controls uv mapping from Texture normal space to BaseTexture normal space.
  *
  * Takes `trim` and `rotate` into account. May contain clamp settings for Meshes and TilingSprite.
  *
  * Can be used in Texture `uvMatrix` field, or separately, you can use different clamp settings on the same texture.
  * If you want to add support for texture region of certain feature or filter, that's what you're looking for.
  *
  * Takes track of Texture changes through `_lastTextureID` private field.
  * Use `update()` method call to track it from outside.
  *
  * @see PIXI.Texture
  * @see PIXI.Mesh
  * @see PIXI.TilingSprite
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "TextureMatrix")
@js.native
class TextureMatrix protected ()
  extends typings.pixiJs.PIXI.TextureMatrix {
  def this(texture: typings.pixiJs.PIXI.Texture) = this()
  def this(texture: typings.pixiJs.PIXI.Texture, clampMargin: Double) = this()
}
