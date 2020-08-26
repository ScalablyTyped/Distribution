package typings.pkijs.pbkdf2paramsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PBKDF2Params extends js.Object {
  var iterationCount: Double = js.native
  var keyLength: Double = js.native
  var prf: typings.pkijs.algorithmIdentifierMod.default = js.native
  var salt: js.Any = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PBKDF2Params {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    iterationCount: Double,
    keyLength: Double,
    prf: typings.pkijs.algorithmIdentifierMod.default,
    salt: js.Any,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PBKDF2Params = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), iterationCount = iterationCount.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], prf = prf.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PBKDF2Params]
  }
  @scala.inline
  implicit class PBKDF2ParamsOps[Self <: PBKDF2Params] (val x: Self) extends AnyVal {
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
    def setIterationCount(value: Double): Self = this.set("iterationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyLength(value: Double): Self = this.set("keyLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrf(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("prf", value.asInstanceOf[js.Any])
    @scala.inline
    def setSalt(value: js.Any): Self = this.set("salt", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
  
}

