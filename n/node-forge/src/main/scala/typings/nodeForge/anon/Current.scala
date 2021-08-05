package typings.nodeForge.anon

import typings.nodeForge.mod.tls.ConnectionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current extends StObject {
  
  var current: ConnectionState
  
  var pending: ConnectionState | Null
}
object Current {
  
  inline def apply(current: ConnectionState): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], pending = null)
    __obj.asInstanceOf[Current]
  }
  
  extension [Self <: Current](x: Self) {
    
    inline def setCurrent(value: ConnectionState): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setPending(value: ConnectionState): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingNull: Self = StObject.set(x, "pending", null)
  }
}
