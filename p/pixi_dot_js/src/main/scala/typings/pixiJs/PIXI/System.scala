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
@JSGlobal("PIXI.System")
@js.native
class System protected () extends js.Object {
  def this(renderer: Renderer) = this()
  /**
    * The renderer this manager works for.
    *
    * @member {PIXI.Renderer} PIXI.System#renderer
    */
  var renderer: Renderer = js.native
  /**
    * Generic destroy methods to be overridden by the subclass
    */
  def destroy(): Unit = js.native
}

