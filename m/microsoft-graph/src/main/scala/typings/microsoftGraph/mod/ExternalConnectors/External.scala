package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait External extends StObject {
  
  var connections: js.UndefOr[NullableOption[js.Array[ExternalConnection]]] = js.undefined
}
object External {
  
  inline def apply(): External = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[External]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: External] (val x: Self) extends AnyVal {
    
    inline def setConnections(value: NullableOption[js.Array[ExternalConnection]]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsNull: Self = StObject.set(x, "connections", null)
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: ExternalConnection*): Self = StObject.set(x, "connections", js.Array(value*))
  }
}
