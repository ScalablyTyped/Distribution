package typings
package pkijsLib.srcDigestInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DigestInfo extends js.Object {
  var digest: asn1jsLib.asn1jsMod.OctetString
  var digestAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

