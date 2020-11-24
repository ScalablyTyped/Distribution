package typings.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constraint extends js.Object {
  
  def getDefinition(): js.Any = js.native
}
object Constraint {
  
  @scala.inline
  def apply(getDefinition: () => js.Any): Constraint = {
    val __obj = js.Dynamic.literal(getDefinition = js.Any.fromFunction0(getDefinition))
    __obj.asInstanceOf[Constraint]
  }
  
  @scala.inline
  implicit class ConstraintOps[Self <: Constraint] (val x: Self) extends AnyVal {
    
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
    def setGetDefinition(value: () => js.Any): Self = this.set("getDefinition", js.Any.fromFunction0(value))
  }
}
