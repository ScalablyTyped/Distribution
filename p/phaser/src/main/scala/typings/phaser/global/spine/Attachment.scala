package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Attachment")
@js.native
abstract class Attachment protected ()
  extends typings.phaser.spine.Attachment {
  def this(name: String) = this()
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def copy(): typings.phaser.spine.Attachment = js.native
}

