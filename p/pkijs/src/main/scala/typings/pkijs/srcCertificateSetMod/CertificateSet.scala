package typings.pkijs.srcCertificateSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateSet extends js.Object {
  var certificates: js.Array[typings.pkijs.srcCertificateMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CertificateSet {
  @scala.inline
  def apply(
    certificates: js.Array[typings.pkijs.srcCertificateMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): CertificateSet = {
    val __obj = js.Dynamic.literal(certificates = certificates, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[CertificateSet]
  }
}

