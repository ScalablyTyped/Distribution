package typings.phaser.global.spine

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Texture")
@js.native
abstract class Texture protected ()
  extends typings.phaser.spine.Texture {
  def this(image: HTMLImageElement) = this()
}

/* static members */
@JSGlobal("spine.Texture")
@js.native
object Texture extends js.Object {
  def filterFromString(text: String): typings.phaser.spine.TextureFilter = js.native
  def wrapFromString(text: String): typings.phaser.spine.TextureWrap = js.native
}

