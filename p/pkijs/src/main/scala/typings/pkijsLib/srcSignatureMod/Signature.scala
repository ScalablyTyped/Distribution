package typings
package pkijsLib.srcSignatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var certs: js.UndefOr[js.Array[pkijsLib.srcCertificateMod.default]] = js.undefined
  var signature: asn1jsLib.asn1jsMod.BitString
  var signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

