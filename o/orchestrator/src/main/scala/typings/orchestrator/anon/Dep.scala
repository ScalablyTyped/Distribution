package typings.orchestrator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dep extends js.Object {
  
  var dep: js.Array[String] = js.native
}
object Dep {
  
  @scala.inline
  def apply(dep: js.Array[String]): Dep = {
    val __obj = js.Dynamic.literal(dep = dep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dep]
  }
  
  @scala.inline
  implicit class DepOps[Self <: Dep] (val x: Self) extends AnyVal {
    
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
    def setDepVarargs(value: String*): Self = this.set("dep", js.Array(value :_*))
    
    @scala.inline
    def setDep(value: js.Array[String]): Self = this.set("dep", value.asInstanceOf[js.Any])
  }
}
