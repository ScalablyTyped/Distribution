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

