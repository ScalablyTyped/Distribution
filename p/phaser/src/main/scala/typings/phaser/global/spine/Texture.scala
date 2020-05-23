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
  /* CompleteClass */
  override var _image: HTMLImageElement = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def getImage(): HTMLImageElement = js.native
  /* CompleteClass */
  override def setFilters(minFilter: typings.phaser.spine.TextureFilter, magFilter: typings.phaser.spine.TextureFilter): Unit = js.native
  /* CompleteClass */
  override def setWraps(uWrap: typings.phaser.spine.TextureWrap, vWrap: typings.phaser.spine.TextureWrap): Unit = js.native
}

/* static members */
@JSGlobal("spine.Texture")
@js.native
object Texture extends js.Object {
  def filterFromString(text: String): typings.phaser.spine.TextureFilter = js.native
  def wrapFromString(text: String): typings.phaser.spine.TextureWrap = js.native
}

