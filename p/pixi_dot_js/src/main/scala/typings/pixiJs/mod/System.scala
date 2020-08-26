package typings.pixiJs.mod

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
@JSImport("pixi.js", "System")
@js.native
class System protected ()
  extends typings.pixiJs.PIXI.System {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
}

