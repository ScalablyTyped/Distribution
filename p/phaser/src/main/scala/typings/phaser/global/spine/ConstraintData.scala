package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.ConstraintData")
@js.native
abstract class ConstraintData protected ()
  extends typings.phaser.spine.ConstraintData {
  def this(name: String, order: Double, skinRequired: Boolean) = this()
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var order: Double = js.native
  /* CompleteClass */
  override var skinRequired: Boolean = js.native
}

