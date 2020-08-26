package typings.pkijs.certificateSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateSet extends js.Object {
  var certificates: js.Array[typings.pkijs.certificateMod.default] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
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
  @scala.inline
  implicit class CertificateSetOps[Self <: CertificateSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificatesVarargs(value: typings.pkijs.certificateMod.default*): Self = this.set("certificates", js.Array(value :_*))
    @scala.inline
    def setCertificates(value: js.Array[typings.pkijs.certificateMod.default]): Self = this.set("certificates", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
  
}

