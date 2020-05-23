package typings.phaser.anon

import org.scalablytyped.runtime.Instantiable1
import typings.phaser.spine.Texture
import typings.phaser.spine.TextureFilter
import typings.phaser.spine.TextureWrap
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTexture extends Instantiable1[/* image */ HTMLImageElement, Texture] {
  def filterFromString(text: String): TextureFilter = js.native
  def wrapFromString(text: String): TextureWrap = js.native
}

