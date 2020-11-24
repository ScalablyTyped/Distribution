package typings.p2.anon

import typings.p2.mod.ContactEquation
import typings.p2.mod.FrictionEquation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactEquations extends js.Object {
  
  var contactEquations: js.Array[ContactEquation] = js.native
  
  var frictionEquations: js.Array[FrictionEquation] = js.native
  
  var `type`: String = js.native
}
object ContactEquations {
  
  @scala.inline
  def apply(
    contactEquations: js.Array[ContactEquation],
    frictionEquations: js.Array[FrictionEquation],
    `type`: String
  ): ContactEquations = {
    val __obj = js.Dynamic.literal(contactEquations = contactEquations.asInstanceOf[js.Any], frictionEquations = frictionEquations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactEquations]
  }
  
  @scala.inline
  implicit class ContactEquationsOps[Self <: ContactEquations] (val x: Self) extends AnyVal {
    
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
    def setContactEquationsVarargs(value: ContactEquation*): Self = this.set("contactEquations", js.Array(value :_*))
    
    @scala.inline
    def setContactEquations(value: js.Array[ContactEquation]): Self = this.set("contactEquations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionEquationsVarargs(value: FrictionEquation*): Self = this.set("frictionEquations", js.Array(value :_*))
    
    @scala.inline
    def setFrictionEquations(value: js.Array[FrictionEquation]): Self = this.set("frictionEquations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
