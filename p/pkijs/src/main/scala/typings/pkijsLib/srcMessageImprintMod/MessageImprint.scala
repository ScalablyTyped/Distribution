package typings
package pkijsLib.srcMessageImprintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MessageImprint extends js.Object {
  var hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var hashedMessage: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

