package typings.pkijs.signedAndUnsignedAttributesMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedAndUnsignedAttributes extends js.Object {
  var attributes: js.Array[typings.pkijs.attributeMod.default] = js.native
  var encodedValue: ArrayBuffer = js.native
  var `type`: String = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object SignedAndUnsignedAttributes {
  @scala.inline
  def apply(
    attributes: js.Array[typings.pkijs.attributeMod.default],
    encodedValue: ArrayBuffer,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    `type`: String
  ): SignedAndUnsignedAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], encodedValue = encodedValue.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedAndUnsignedAttributes]
  }
  @scala.inline
  implicit class SignedAndUnsignedAttributesOps[Self <: SignedAndUnsignedAttributes] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: typings.pkijs.attributeMod.default*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[typings.pkijs.attributeMod.default]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncodedValue(value: ArrayBuffer): Self = this.set("encodedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

