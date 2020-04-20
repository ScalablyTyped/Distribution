package typings.nodeEasyCert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAttributeName extends CertificateAttribute {
  var name: String
  var value: String
}

object CertificateAttributeName {
  @scala.inline
  def apply(name: String, value: String): CertificateAttributeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAttributeName]
  }
}

