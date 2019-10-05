package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Spritesheet")
@js.native
class Spritesheet protected ()
  extends typings.pixiDotJs.PIXI.Spritesheet {
  def this(baseTexture: typings.pixiDotJs.PIXI.BaseTexture, data: js.Any) = this()
  def this(baseTexture: typings.pixiDotJs.PIXI.BaseTexture, data: js.Any, resolutionFilename: String) = this()
}

/* static members */
@JSImport("pixi.js", "Spritesheet")
@js.native
object Spritesheet extends js.Object {
  var BATCH_SIZE: Double = js.native
}

