package typings.navigation.anon

import typings.navigation.mod.Crumb
import typings.navigation.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Crumbs extends js.Object {
  
  var crumbs: js.Array[Crumb] = js.native
  
  var data: js.Any = js.native
  
  var state: State = js.native
}
object Crumbs {
  
  @scala.inline
  def apply(crumbs: js.Array[Crumb], data: js.Any, state: State): Crumbs = {
    val __obj = js.Dynamic.literal(crumbs = crumbs.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crumbs]
  }
  
  @scala.inline
  implicit class CrumbsOps[Self <: Crumbs] (val x: Self) extends AnyVal {
    
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
    def setCrumbsVarargs(value: Crumb*): Self = this.set("crumbs", js.Array(value :_*))
    
    @scala.inline
    def setCrumbs(value: js.Array[Crumb]): Self = this.set("crumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
