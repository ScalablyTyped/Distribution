package typings
package meteorLib.emailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailComposer extends js.Object {
  def addHeader(name: java.lang.String, value: java.lang.String): scala.Unit
  def pipe(stream: js.Any): scala.Unit
  def setMessageOption(from: java.lang.String, to: java.lang.String, body: java.lang.String, html: java.lang.String): scala.Unit
  def streamMessage(): scala.Unit
}

object MailComposer {
  @scala.inline
  def apply(
    addHeader: (java.lang.String, java.lang.String) => scala.Unit,
    pipe: js.Any => scala.Unit,
    setMessageOption: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    streamMessage: () => scala.Unit
  ): MailComposer = {
    val __obj = js.Dynamic.literal(addHeader = js.Any.fromFunction2(addHeader), pipe = js.Any.fromFunction1(pipe), setMessageOption = js.Any.fromFunction4(setMessageOption), streamMessage = js.Any.fromFunction0(streamMessage))
  
    __obj.asInstanceOf[MailComposer]
  }
}

