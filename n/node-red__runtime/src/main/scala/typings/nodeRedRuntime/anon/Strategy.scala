package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.UsernamePermissions
import typings.nodeRedRuntime.nodeRedRuntimeStrings.strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Strategy extends StObject {
  
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
  implicit class StrategyMutableBuilder[Self <: Strategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrategy(value: Icon): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: strategy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: js.Array[UsernamePermissions]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: UsernamePermissions*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
