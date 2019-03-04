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

object OriginatorInfo {
  @scala.inline
  def apply(
    certs: pkijsLib.srcCertificateSetMod.default,
    crls: pkijsLib.srcRevocationInfoChoicesMod.default,
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): OriginatorInfo = {
    val __obj = js.Dynamic.literal(certs = certs, crls = crls, fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[OriginatorInfo]
  }
}

