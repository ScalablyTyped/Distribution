package typings.meteor.emailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/email", "MailComposer")
@js.native
class MailComposerCls protected ()
  extends typings.meteor.emailMod.MailComposer {
  def this(options: typings.meteor.emailMod.MailComposerOptions) = this()
  /* CompleteClass */
  override def addHeader(name: String, value: String): Unit = js.native
  /* CompleteClass */
  override def pipe(stream: js.Any): Unit = js.native
  /* CompleteClass */
  override def setMessageOption(from: String, to: String, body: String, html: String): Unit = js.native
  /* CompleteClass */
  override def streamMessage(): Unit = js.native
}

