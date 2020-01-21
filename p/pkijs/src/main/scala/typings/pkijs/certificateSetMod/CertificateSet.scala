package typings.pkijs.certificateSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateSet extends js.Object {
  var certificates: js.Array[typings.pkijs.certificateMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CertificateSet {
  @scala.inline
  def apply(
    certificates: js.Array[typings.pkijs.certificateMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): CertificateSet = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[CertificateSet]
  }
}

