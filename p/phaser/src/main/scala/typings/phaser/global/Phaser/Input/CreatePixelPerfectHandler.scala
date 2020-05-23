package typings.phaser.global.Phaser.Input

import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Input.CreatePixelPerfectHandler")
@js.native
object CreatePixelPerfectHandler extends js.Object {
  /**
    * Creates a new Pixel Perfect Handler function.
    * 
    * Access via `InputPlugin.makePixelPerfect` rather than calling it directly.
    * @param textureManager A reference to the Texture Manager.
    * @param alphaTolerance The alpha level that the pixel should be above to be included as a successful interaction.
    */
  def apply(textureManager: TextureManager, alphaTolerance: integer): js.Function = js.native
}

