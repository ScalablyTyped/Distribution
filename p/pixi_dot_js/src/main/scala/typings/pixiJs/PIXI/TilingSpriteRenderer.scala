package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebGL renderer plugin for tiling sprites
  *
  * @class
  * @memberof PIXI
  * @extends PIXI.ObjectRenderer
  */
@JSGlobal("PIXI.TilingSpriteRenderer")
@js.native
class TilingSpriteRenderer protected () extends ObjectRenderer {
  def this(renderer: Renderer) = this()
  /**
    * The WebGL state in which this renderer will work.
    *
    * @member {PIXI.State} PIXI.TilingSpriteRenderer#state
    * @readonly
    */
  val state: State = js.native
  /**
    *
    * @param {PIXI.TilingSprite} ts tilingSprite to be rendered
    */
  def render(ts: TilingSprite): Unit = js.native
}

