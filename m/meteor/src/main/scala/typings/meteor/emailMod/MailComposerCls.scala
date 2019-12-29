package typings.meteor.emailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/email", "MailComposer")
@js.native
class MailComposerCls protected () extends MailComposer {
  def this(options: MailComposerOptions) = this()
  /* CompleteClass */
  override def addHeader(name: String, value: String): Unit = js.native
  /* CompleteClass */
  override def pipe(stream: js.Any): Unit = js.native
  /* CompleteClass */
  override def setMessageOption(from: String, to: String, body: String, html: String): Unit = js.native
  /* CompleteClass */
  override def streamMessage(): Unit = js.native
}

