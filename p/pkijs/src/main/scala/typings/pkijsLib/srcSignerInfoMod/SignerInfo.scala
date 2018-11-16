package typings
package pkijsLib.srcSignerInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SignerInfo extends js.Object {
  var digestAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var sid: js.Any
  var signature: asn1jsLib.asn1jsMod.OctetString
  var signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var signedAttrs: js.UndefOr[pkijsLib.srcSignedAndUnsignedAttributesMod.default] = js.undefined
  var unsignedAttrs: js.UndefOr[pkijsLib.srcSignedAndUnsignedAttributesMod.default] = js.undefined
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

