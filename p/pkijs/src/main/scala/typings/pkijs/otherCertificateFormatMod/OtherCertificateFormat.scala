package typings.pkijs.otherCertificateFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherCertificateFormat extends js.Object {
  var otherCert: js.Any
  var otherCertFormat: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherCertificateFormat {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    otherCert: js.Any,
    otherCertFormat: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherCertificateFormat = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), otherCert = otherCert.asInstanceOf[js.Any], otherCertFormat = otherCertFormat.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OtherCertificateFormat]
  }
}

