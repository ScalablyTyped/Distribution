package typings.microsoftLiveConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Employer extends js.Object {
  
  var employer: Name = js.native
}
object Employer {
  
  @scala.inline
  def apply(employer: Name): Employer = {
    val __obj = js.Dynamic.literal(employer = employer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Employer]
  }
  
  @scala.inline
  implicit class EmployerOps[Self <: Employer] (val x: Self) extends AnyVal {
    
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
    def setEmployer(value: Name): Self = this.set("employer", value.asInstanceOf[js.Any])
  }
}
