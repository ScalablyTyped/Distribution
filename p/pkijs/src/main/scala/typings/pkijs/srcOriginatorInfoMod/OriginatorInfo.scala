package typings.pkijs.srcOriginatorInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginatorInfo extends js.Object {
  var certs: typings.pkijs.srcCertificateSetMod.default
  var crls: typings.pkijs.srcRevocationInfoChoicesMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OriginatorInfo {
  @scala.inline
  def apply(
    certs: typings.pkijs.srcCertificateSetMod.default,
    crls: typings.pkijs.srcRevocationInfoChoicesMod.default,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OriginatorInfo = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], crls = crls.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[OriginatorInfo]
  }
}

