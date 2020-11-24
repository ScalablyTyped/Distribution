package typings.mobx.extrasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDependencyTree extends js.Object {
  
  var dependencies: js.UndefOr[js.Array[IDependencyTree]] = js.native
  
  var name: String = js.native
}
object IDependencyTree {
  
  @scala.inline
  def apply(name: String): IDependencyTree = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDependencyTree]
  }
  
  @scala.inline
  implicit class IDependencyTreeOps[Self <: IDependencyTree] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesVarargs(value: IDependencyTree*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[IDependencyTree]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
  }
}
