package typings.pem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pkcs12 extends js.Object {
  
  var pkcs12: js.Any = js.native
}
object Pkcs12 {
  
  @scala.inline
  def apply(pkcs12: js.Any): Pkcs12 = {
    val __obj = js.Dynamic.literal(pkcs12 = pkcs12.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pkcs12]
  }
  
  @scala.inline
  implicit class Pkcs12Ops[Self <: Pkcs12] (val x: Self) extends AnyVal {
    
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
    def setPkcs12(value: js.Any): Self = this.set("pkcs12", value.asInstanceOf[js.Any])
  }
}
