package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "TextureMatrix")
@js.native
open class TextureMatrix protected ()
  extends typings.pixiCore.libTexturesTextureMatrixMod.TextureMatrix {
  /**
    * @param texture - observed texture
    * @param clampMargin - Changes frame clamping, 0.5 by default. Use -0.5 for extra border.
    */
  def this(texture: typings.pixiCore.libTexturesTextureMod.Texture[typings.pixiCore.libTexturesResourcesResourceMod.Resource]) = this()
  def this(
    texture: typings.pixiCore.libTexturesTextureMod.Texture[typings.pixiCore.libTexturesResourcesResourceMod.Resource],
    clampMargin: Double
  ) = this()
}
