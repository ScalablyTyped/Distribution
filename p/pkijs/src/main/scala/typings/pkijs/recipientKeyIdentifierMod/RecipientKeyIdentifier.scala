package typings.pkijs.recipientKeyIdentifierMod

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientKeyIdentifier extends js.Object {
  var date: js.UndefOr[GeneralizedTime] = js.native
  var other: js.UndefOr[typings.pkijs.otherKeyAttributeMod.default] = js.native
  var subjectKeyIdentifier: OctetString = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object RecipientKeyIdentifier {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    subjectKeyIdentifier: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RecipientKeyIdentifier = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), subjectKeyIdentifier = subjectKeyIdentifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[RecipientKeyIdentifier]
  }
  @scala.inline
  implicit class RecipientKeyIdentifierOps[Self <: RecipientKeyIdentifier] (val x: Self) extends AnyVal {
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
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setSubjectKeyIdentifier(value: OctetString): Self = this.set("subjectKeyIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setDate(value: GeneralizedTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setOther(value: typings.pkijs.otherKeyAttributeMod.default): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
  }
  
}

