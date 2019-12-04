package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Attachment")
@js.native
abstract class Attachment protected () extends js.Object {
  def this(name: String) = this()
  var name: String = js.native
  def copy(): Attachment = js.native
}

