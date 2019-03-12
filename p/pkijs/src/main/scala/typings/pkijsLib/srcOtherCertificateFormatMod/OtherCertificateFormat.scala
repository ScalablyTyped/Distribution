package typings
package pkijsLib.srcOtherCertificateFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherCertificateFormat extends js.Object {
  var otherCert: js.Any
  var otherCertFormat: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherCertificateFormat {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    otherCert: js.Any,
    otherCertFormat: java.lang.String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherCertificateFormat = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), otherCert = otherCert, otherCertFormat = otherCertFormat, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[OtherCertificateFormat]
  }
}

