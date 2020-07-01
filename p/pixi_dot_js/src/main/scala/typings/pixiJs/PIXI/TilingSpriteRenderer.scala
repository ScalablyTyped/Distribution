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
trait TilingSpriteRenderer extends ObjectRenderer {
  /**
    * The WebGL state in which this renderer will work.
    *
    * @member {PIXI.State} PIXI.TilingSpriteRenderer#state
    * @readonly
    */
  val state: State
  /**
    *
    * @param {PIXI.TilingSprite} ts - tilingSprite to be rendered
    */
  def render(ts: TilingSprite): Unit
}

object TilingSpriteRenderer {
  @scala.inline
  def apply(
    destroy: () => Unit,
    flush: () => Unit,
    render: TilingSprite => Unit,
    renderer: Renderer,
    start: () => Unit,
    state: State,
    stop: () => Unit
  ): TilingSpriteRenderer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), render = js.Any.fromFunction1(render), renderer = renderer.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), state = state.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[TilingSpriteRenderer]
  }
}

