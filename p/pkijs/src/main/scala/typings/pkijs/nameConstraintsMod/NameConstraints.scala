package typings.pkijs.nameConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameConstraints extends js.Object {
  
  var excludedSubtrees: js.UndefOr[js.Array[typings.pkijs.generalSubtreeMod.default]] = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var permittedSubtrees: js.UndefOr[js.Array[typings.pkijs.generalSubtreeMod.default]] = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object NameConstraints {
  
  @scala.inline
  def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): NameConstraints = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[NameConstraints]
  }
  
  @scala.inline
  implicit class NameConstraintsOps[Self <: NameConstraints] (val x: Self) extends AnyVal {
    
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
    def setExcludedSubtreesVarargs(value: typings.pkijs.generalSubtreeMod.default*): Self = this.set("excludedSubtrees", js.Array(value :_*))
    
    @scala.inline
    def setExcludedSubtrees(value: js.Array[typings.pkijs.generalSubtreeMod.default]): Self = this.set("excludedSubtrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedSubtrees: Self = this.set("excludedSubtrees", js.undefined)
    
    @scala.inline
    def setPermittedSubtreesVarargs(value: typings.pkijs.generalSubtreeMod.default*): Self = this.set("permittedSubtrees", js.Array(value :_*))
    
    @scala.inline
    def setPermittedSubtrees(value: js.Array[typings.pkijs.generalSubtreeMod.default]): Self = this.set("permittedSubtrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermittedSubtrees: Self = this.set("permittedSubtrees", js.undefined)
  }
}
