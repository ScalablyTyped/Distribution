package typings.meteor.emailMod

import typings.meteor.anon.Attachments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/email", "Email")
@js.native
object Email extends js.Object {
  def send(options: Attachments): Unit = js.native
}

