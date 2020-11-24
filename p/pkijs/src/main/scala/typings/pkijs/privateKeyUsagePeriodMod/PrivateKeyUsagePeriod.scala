package typings.pkijs.privateKeyUsagePeriodMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateKeyUsagePeriod extends js.Object {
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var notAfter: js.UndefOr[Date] = js.native
  
  var notBefore: js.UndefOr[Date] = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object PrivateKeyUsagePeriod {
  
  @scala.inline
  def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): PrivateKeyUsagePeriod = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PrivateKeyUsagePeriod]
  }
  
  @scala.inline
  implicit class PrivateKeyUsagePeriodOps[Self <: PrivateKeyUsagePeriod] (val x: Self) extends AnyVal {
    
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
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotAfter(value: Date): Self = this.set("notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAfter: Self = this.set("notAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: Date): Self = this.set("notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBefore: Self = this.set("notBefore", js.undefined)
  }
}
