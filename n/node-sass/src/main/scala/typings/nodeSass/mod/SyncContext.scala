package typings.nodeSass.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncContext
  extends StObject
     with Context {
  
  @JSName("callback")
  var callback_SyncContext: Unit
}
object SyncContext {
  
  inline def apply(callback: Unit, options: Options): SyncContext = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncContext]
  }
  
  extension [Self <: SyncContext](x: Self) {
    
    inline def setCallback(value: Unit): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
  }
}
