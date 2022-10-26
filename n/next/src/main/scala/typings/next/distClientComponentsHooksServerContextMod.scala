package typings.next

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsHooksServerContextMod {
  
  @JSImport("next/dist/client/components/hooks-server-context", "DYNAMIC_ERROR_CODE")
  @js.native
  val DYNAMIC_ERROR_CODE: /* "DYNAMIC_SERVER_USAGE" */ String = js.native
  
  @JSImport("next/dist/client/components/hooks-server-context", "DynamicServerError")
  @js.native
  open class DynamicServerError protected ()
    extends StObject
       with Error {
    def this(`type`: String) = this()
    
    var digest: /* "DYNAMIC_SERVER_USAGE" */ String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
