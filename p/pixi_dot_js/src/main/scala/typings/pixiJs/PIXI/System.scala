package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System is a base class used for extending systems used by the {@link PIXI.Renderer}
  *
  * @see PIXI.Renderer#addSystem
  * @class
  * @memberof PIXI
  */
trait System extends js.Object {
  /**
    * The renderer this manager works for.
    *
    * @member {PIXI.Renderer} PIXI.System#renderer
    */
  var renderer: Renderer
  /**
    * Generic destroy methods to be overridden by the subclass
    */
  def destroy(): Unit
}

object System {
  @scala.inline
  def apply(destroy: () => Unit, renderer: Renderer): System = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[System]
  }
}

