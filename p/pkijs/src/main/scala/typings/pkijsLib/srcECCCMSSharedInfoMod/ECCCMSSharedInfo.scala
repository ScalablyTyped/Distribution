package typings
package pkijsLib.srcECCCMSSharedInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ECCCMSSharedInfo extends js.Object {
  var entityUInfo: js.UndefOr[asn1jsLib.asn1jsMod.OctetString] = js.undefined
  var keyInfo: stdLib.AlgorithmIdentifier
  var suppPubInfo: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

