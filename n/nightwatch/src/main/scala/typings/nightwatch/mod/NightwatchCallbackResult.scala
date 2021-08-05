package typings.nightwatch.mod

import typings.nightwatch.anon.Class
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nightwatch.mod.NightwatchTypedCallbackResult[T]
  - typings.nightwatch.mod.NightwatchCallbackResultError
*/
trait NightwatchCallbackResult[T] extends StObject
object NightwatchCallbackResult {
  
  inline def NightwatchCallbackResultError(state: Error | String, value: Class): typings.nightwatch.mod.NightwatchCallbackResultError = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = 1, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nightwatch.mod.NightwatchCallbackResultError]
  }
  
  inline def NightwatchTypedCallbackResult[T](state: Error | String, value: T): typings.nightwatch.mod.NightwatchTypedCallbackResult[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = 0, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nightwatch.mod.NightwatchTypedCallbackResult[T]]
  }
}
