package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.PathAttachment")
@js.native
class PathAttachment protected () extends VertexAttachment {
  def this(name: String) = this()
  var closed: Boolean = js.native
  var color: Color = js.native
  var constantSpeed: Boolean = js.native
  var lengths: js.Array[Double] = js.native
}

