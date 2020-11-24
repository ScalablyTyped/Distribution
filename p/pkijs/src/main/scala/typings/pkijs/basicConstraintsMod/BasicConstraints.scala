package typings.pkijs.basicConstraintsMod

import typings.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicConstraints extends js.Object {
  
  var cA: Boolean = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var pathLenConstraint: Double | Integer = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object BasicConstraints {
  
  @scala.inline
  def apply(
    cA: Boolean,
    fromSchema: js.Any => Unit,
    pathLenConstraint: Double | Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): BasicConstraints = {
    val __obj = js.Dynamic.literal(cA = cA.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), pathLenConstraint = pathLenConstraint.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[BasicConstraints]
  }
  
  @scala.inline
  implicit class BasicConstraintsOps[Self <: BasicConstraints] (val x: Self) extends AnyVal {
    
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
    def setCA(value: Boolean): Self = this.set("cA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPathLenConstraint(value: Double | Integer): Self = this.set("pathLenConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
