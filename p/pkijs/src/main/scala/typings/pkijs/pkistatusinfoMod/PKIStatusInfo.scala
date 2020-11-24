package typings.pkijs.pkistatusinfoMod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Utf8String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PKIStatusInfo extends js.Object {
  
  var failInfo: js.UndefOr[BitString] = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var status: Double = js.native
  
  var statusStrings: js.UndefOr[Utf8String] = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object PKIStatusInfo {
  
  @scala.inline
  def apply(fromSchema: js.Any => Unit, status: Double, toJSON: () => js.Any, toSchema: () => js.Any): PKIStatusInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), status = status.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PKIStatusInfo]
  }
  
  @scala.inline
  implicit class PKIStatusInfoOps[Self <: PKIStatusInfo] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailInfo(value: BitString): Self = this.set("failInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailInfo: Self = this.set("failInfo", js.undefined)
    
    @scala.inline
    def setStatusStrings(value: Utf8String): Self = this.set("statusStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusStrings: Self = this.set("statusStrings", js.undefined)
  }
}
