package typings
package pkijsLib.srcCertificatePoliciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificatePolicies extends js.Object {
  var certificatePolicies: js.Array[pkijsLib.srcPolicyInformationMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CertificatePolicies {
  @scala.inline
  def apply(
    certificatePolicies: js.Array[pkijsLib.srcPolicyInformationMod.default],
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): CertificatePolicies = {
    val __obj = js.Dynamic.literal(certificatePolicies = certificatePolicies, fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[CertificatePolicies]
  }
}

