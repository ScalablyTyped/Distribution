package typings.pkijs.ecpublickeyMod

import typings.std.ArrayBuffer
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECPublicKey extends js.Object {
  var namedCurve: String = js.native
  var x: ArrayBuffer = js.native
  var y: ArrayBuffer = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object ECPublicKey {
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    namedCurve: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    x: ArrayBuffer,
    y: ArrayBuffer
  ): ECPublicKey = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), namedCurve = namedCurve.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECPublicKey]
  }
  @scala.inline
  implicit class ECPublicKeyOps[Self <: ECPublicKey] (val x: Self) extends AnyVal {
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
    def setFromJSON(value: JsonWebKey => Unit): Self = this.set("fromJSON", js.Any.fromFunction1(value))
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setNamedCurve(value: String): Self = this.set("namedCurve", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setX(value: ArrayBuffer): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: ArrayBuffer): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

