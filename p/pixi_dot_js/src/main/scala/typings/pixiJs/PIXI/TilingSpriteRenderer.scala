package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
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
  implicit class TilingSpriteRendererMutableBuilder[Self <: TilingSpriteRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: TilingSprite => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
