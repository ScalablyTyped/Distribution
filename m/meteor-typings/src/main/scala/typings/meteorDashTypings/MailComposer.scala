package typings.meteorDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailComposer extends js.Object {
  def addHeader(name: String, value: String): Unit
  def pipe(stream: js.Any): Unit
  def setMessageOption(from: String, to: String, body: String, html: String): Unit
  def streamMessage(): Unit
}

@JSGlobal("MailComposer")
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

object MailComposer {
  @scala.inline
  def apply(
    addHeader: (String, String) => Unit,
    pipe: js.Any => Unit,
    setMessageOption: (String, String, String, String) => Unit,
    streamMessage: () => Unit
  ): MailComposer = {
    val __obj = js.Dynamic.literal(addHeader = js.Any.fromFunction2(addHeader), pipe = js.Any.fromFunction1(pipe), setMessageOption = js.Any.fromFunction4(setMessageOption), streamMessage = js.Any.fromFunction0(streamMessage))
  
    __obj.asInstanceOf[MailComposer]
  }
}

