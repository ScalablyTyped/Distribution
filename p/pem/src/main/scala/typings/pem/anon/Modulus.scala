package typings.pem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modulus extends js.Object {
  
  var modulus: js.Any = js.native
}
object Modulus {
  
  @scala.inline
  def apply(modulus: js.Any): Modulus = {
    val __obj = js.Dynamic.literal(modulus = modulus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modulus]
  }
  
  @scala.inline
  implicit class ModulusOps[Self <: Modulus] (val x: Self) extends AnyVal {
    
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
    def setModulus(value: js.Any): Self = this.set("modulus", value.asInstanceOf[js.Any])
  }
}
