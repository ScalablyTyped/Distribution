package typings
package meteorDashTypingsLib.meteorEmailMod

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
    addHeader: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    pipe: js.Function1[js.Any, scala.Unit],
    setMessageOption: js.Function4[java.lang.String, java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    streamMessage: js.Function0[scala.Unit]
  ): MailComposer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHeader")(addHeader)
    __obj.updateDynamic("pipe")(pipe)
    __obj.updateDynamic("setMessageOption")(setMessageOption)
    __obj.updateDynamic("streamMessage")(streamMessage)
    __obj.asInstanceOf[MailComposer]
  }
}

