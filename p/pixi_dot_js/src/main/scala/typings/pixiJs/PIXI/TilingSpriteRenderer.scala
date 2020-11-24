package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WebGL renderer plugin for tiling sprites
  *
  * @class
  * @memberof PIXI
  * @extends PIXI.ObjectRenderer
  */
@js.native
trait TilingSpriteRenderer extends ObjectRenderer {
  
  /**
    *
    * @param {PIXI.TilingSprite} ts - tilingSprite to be rendered
    */
  def render(ts: TilingSprite): Unit = js.native
  
  /**
    * The WebGL state in which this renderer will work.
    *
    * @member {PIXI.State} PIXI.TilingSpriteRenderer#state
    * @readonly
    */
  val state: State = js.native
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
  
  @scala.inline
  implicit class TilingSpriteRendererOps[Self <: TilingSpriteRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRender(value: TilingSprite => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
