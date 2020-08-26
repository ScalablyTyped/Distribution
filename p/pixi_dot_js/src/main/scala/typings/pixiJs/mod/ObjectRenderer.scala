package typings.pixiJs.mod

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
@JSImport("pixi.js", "ObjectRenderer")
@js.native
class ObjectRenderer protected ()
  extends typings.pixiJs.PIXI.ObjectRenderer {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
}

