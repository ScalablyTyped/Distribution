package typings.pixiDotJs.PIXI.extras

import typings.pixiDotJs.PIXI.ObjectRenderer
import typings.pixiDotJs.PIXI.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.extras.TilingSpriteRenderer")
@js.native
class TilingSpriteRenderer protected () extends ObjectRenderer {
  def this(renderer: WebGLRenderer) = this()
  def render(ts: TilingSprite): Unit = js.native
}

