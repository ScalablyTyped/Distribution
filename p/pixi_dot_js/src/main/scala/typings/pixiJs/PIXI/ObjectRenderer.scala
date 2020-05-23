package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base for a common object renderer that can be used as a
  * system renderer plugin.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI
  */
trait ObjectRenderer extends System {
  /**
    * Stub method that should be used to empty the current
    * batch by rendering objects now.
    */
  def flush(): Unit
  /**
    * Keeps the object to render. It doesn't have to be
    * rendered immediately.
    *
    * @param {PIXI.DisplayObject} object - The object to render.
    */
  def render(`object`: DisplayObject): Unit
  /**
    * Stub method that initializes any state required before
    * rendering starts. It is different from the `prerender`
    * signal, which occurs every frame, in that it is called
    * whenever an object requests _this_ renderer specifically.
    */
  def start(): Unit
  /**
    * Stops the renderer. It should free up any state and
    * become dormant.
    */
  def stop(): Unit
}

object ObjectRenderer {
  @scala.inline
  def apply(
    destroy: () => Unit,
    flush: () => Unit,
    render: DisplayObject => Unit,
    renderer: Renderer,
    start: () => Unit,
    stop: () => Unit
  ): ObjectRenderer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), render = js.Any.fromFunction1(render), renderer = renderer.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[ObjectRenderer]
  }
}

