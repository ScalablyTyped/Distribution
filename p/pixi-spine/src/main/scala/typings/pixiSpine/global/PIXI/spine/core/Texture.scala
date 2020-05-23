package typings.pixiSpine.global.PIXI.spine.core

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Texture")
@js.native
abstract class Texture protected ()
  extends typings.pixiSpine.PIXI.spine.core.Texture {
  def this(image: HTMLImageElement) = this()
  /* CompleteClass */
  override var _image: HTMLImageElement = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def getImage(): HTMLImageElement = js.native
  /* CompleteClass */
  override def setFilters(
    minFilter: typings.pixiSpine.PIXI.spine.core.TextureFilter,
    magFilter: typings.pixiSpine.PIXI.spine.core.TextureFilter
  ): Unit = js.native
  /* CompleteClass */
  override def setWraps(
    uWrap: typings.pixiSpine.PIXI.spine.core.TextureWrap,
    vWrap: typings.pixiSpine.PIXI.spine.core.TextureWrap
  ): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Texture")
@js.native
object Texture extends js.Object {
  def filterFromString(text: String): typings.pixiSpine.PIXI.spine.core.TextureFilter = js.native
  def wrapFromString(text: String): typings.pixiSpine.PIXI.spine.core.TextureWrap = js.native
}

