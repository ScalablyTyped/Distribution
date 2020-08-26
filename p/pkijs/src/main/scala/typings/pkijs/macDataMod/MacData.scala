package typings.pkijs.macDataMod

import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacData extends js.Object {
  var iterations: js.UndefOr[Double] = js.native
  var mac: typings.pkijs.digestInfoMod.default = js.native
  var macSalt: OctetString = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object MacData {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    mac: typings.pkijs.digestInfoMod.default,
    macSalt: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): MacData = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), mac = mac.asInstanceOf[js.Any], macSalt = macSalt.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[MacData]
  }
  @scala.inline
  implicit class MacDataOps[Self <: MacData] (val x: Self) extends AnyVal {
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
    def setMac(value: typings.pkijs.digestInfoMod.default): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def setMacSalt(value: OctetString): Self = this.set("macSalt", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
  }
  
}

