package typings.pkijs.recipientKeyIdentifierMod

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientKeyIdentifier extends js.Object {
  var date: js.UndefOr[GeneralizedTime] = js.undefined
  var other: js.UndefOr[typings.pkijs.otherKeyAttributeMod.default] = js.undefined
  var subjectKeyIdentifier: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RecipientKeyIdentifier {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    subjectKeyIdentifier: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    date: GeneralizedTime = null,
    other: typings.pkijs.otherKeyAttributeMod.default = null
  ): RecipientKeyIdentifier = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), subjectKeyIdentifier = subjectKeyIdentifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientKeyIdentifier]
  }
}

