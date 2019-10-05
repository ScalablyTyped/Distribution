package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.IkConstraintData")
@js.native
class IkConstraintData protected () extends ConstraintData {
  def this(name: String) = this()
  var bendDirection: Double = js.native
  var bones: js.Array[BoneData] = js.native
  var compress: Boolean = js.native
  var mix: Double = js.native
  var softness: Double = js.native
  var stretch: Boolean = js.native
  var target: BoneData = js.native
  var uniform: Boolean = js.native
}

