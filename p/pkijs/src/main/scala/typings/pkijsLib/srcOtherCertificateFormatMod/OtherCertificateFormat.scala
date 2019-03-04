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
    fromSchema: js.Function1[js.Any, scala.Unit],
    otherCert: js.Any,
    otherCertFormat: java.lang.String,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): OtherCertificateFormat = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, otherCert = otherCert, otherCertFormat = otherCertFormat, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[OtherCertificateFormat]
  }
}

