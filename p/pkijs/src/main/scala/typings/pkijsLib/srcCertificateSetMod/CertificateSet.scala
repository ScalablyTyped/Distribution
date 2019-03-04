package typings
package pkijsLib.srcCertificateSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateSet extends js.Object {
  var certificates: js.Array[pkijsLib.srcCertificateMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CertificateSet {
  @scala.inline
  def apply(
    certificates: js.Array[pkijsLib.srcCertificateMod.default],
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): CertificateSet = {
    val __obj = js.Dynamic.literal(certificates = certificates, fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[CertificateSet]
  }
}

