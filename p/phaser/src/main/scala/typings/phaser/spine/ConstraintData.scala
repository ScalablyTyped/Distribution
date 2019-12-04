package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.ConstraintData")
@js.native
abstract class ConstraintData protected () extends js.Object {
  def this(name: String, order: Double, skinRequired: Boolean) = this()
  var name: String = js.native
  var order: Double = js.native
  var skinRequired: Boolean = js.native
}

