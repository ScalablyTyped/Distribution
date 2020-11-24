package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.UsernamePermissions
import typings.nodeRedRuntime.nodeRedRuntimeStrings.strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Strategy extends js.Object {
  
  var strategy: Icon = js.native
  
  var `type`: strategy = js.native
  
  var users: js.Array[UsernamePermissions] = js.native
}
object Strategy {
  
  @scala.inline
  def apply(strategy: Icon, `type`: strategy, users: js.Array[UsernamePermissions]): Strategy = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strategy]
  }
  
  @scala.inline
  implicit class StrategyOps[Self <: Strategy] (val x: Self) extends AnyVal {
    
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
    def setStrategy(value: Icon): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: strategy): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: UsernamePermissions*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[UsernamePermissions]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
