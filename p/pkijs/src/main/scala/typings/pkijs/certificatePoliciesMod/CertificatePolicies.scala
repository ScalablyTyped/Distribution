package typings.pkijs.certificatePoliciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificatePolicies extends js.Object {
  var certificatePolicies: js.Array[typings.pkijs.policyInformationMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CertificatePolicies {
  @scala.inline
  def apply(
    certificatePolicies: js.Array[typings.pkijs.policyInformationMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): CertificatePolicies = {
    val __obj = js.Dynamic.literal(certificatePolicies = certificatePolicies.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[CertificatePolicies]
  }
}

