package typings.openfin.webcontentsMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateErrorEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var certificate: js.Any = js.native
  var error: String = js.native
  var url: String = js.native
}

object CertificateErrorEvent {
  @scala.inline
  def apply[Topic, Type](
    certificate: js.Any,
    error: String,
    name: String,
    topic: Topic,
    `type`: Type,
    url: String,
    uuid: String
  ): CertificateErrorEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateErrorEvent[Topic, Type]]
  }
  @scala.inline
  implicit class CertificateErrorEventOps[Self <: CertificateErrorEvent[_, _], Topic, Type] (val x: Self with (CertificateErrorEvent[Topic, Type])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificate(value: js.Any): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

