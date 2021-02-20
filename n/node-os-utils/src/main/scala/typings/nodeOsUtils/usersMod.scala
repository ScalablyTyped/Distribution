package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usersMod {
  
  @JSImport("node-os-utils/lib/users", JSImport.Default)
  @js.native
  class default () extends Users
  
  @js.native
  trait Users extends StObject {
    
    def openedCount(): js.Promise[Double | String] = js.native
  }
  object Users {
    
    @scala.inline
    def apply(openedCount: () => js.Promise[Double | String]): Users = {
      val __obj = js.Dynamic.literal(openedCount = js.Any.fromFunction0(openedCount))
      __obj.asInstanceOf[Users]
    }
    
    @scala.inline
    implicit class UsersMutableBuilder[Self <: Users] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenedCount(value: () => js.Promise[Double | String]): Self = StObject.set(x, "openedCount", js.Any.fromFunction0(value))
    }
  }
}
