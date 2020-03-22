package typings.openfin.webcontentsMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateErrorEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var certificate: js.Any
  var error: String
  var url: String
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
}

