package typings
package pkijsLib.srcRevokedCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RevokedCertificate extends js.Object {
  var crlEntryExtensions: pkijsLib.srcExtensionsMod.default
  var revocationDate: pkijsLib.srcTimeMod.default
  var userCertificate: asn1jsLib.asn1jsMod.Integer
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

