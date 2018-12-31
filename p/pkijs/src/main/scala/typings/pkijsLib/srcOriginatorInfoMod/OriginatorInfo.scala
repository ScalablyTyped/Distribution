package typings
package pkijsLib.srcOriginatorInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginatorInfo extends js.Object {
  var certs: pkijsLib.srcCertificateSetMod.default
  var crls: pkijsLib.srcRevocationInfoChoicesMod.default
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

