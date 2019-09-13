package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class to create a webGL Texture
  */
@JSImport("pixi.js", "TextureManager")
@js.native
class TextureManager protected ()
  extends typings.pixiDotJs.PIXINs.TextureManager {
  def this(renderer: typings.pixiDotJs.PIXINs.WebGLRenderer) = this()
}

