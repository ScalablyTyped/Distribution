package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base for a common object renderer that can be used as a system renderer plugin.
  */
@JSImport("pixi.js", "ObjectRenderer")
@js.native
abstract class ObjectRenderer protected ()
  extends typings.pixiDotJs.PIXINs.ObjectRenderer {
  def this(renderer: typings.pixiDotJs.PIXINs.WebGLRenderer) = this()
}

