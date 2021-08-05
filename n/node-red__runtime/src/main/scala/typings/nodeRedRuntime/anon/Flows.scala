package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flows extends StObject {
  
  var flows: Credentials
}
object Flows {
  
  inline def apply(flows: Credentials): Flows = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flows]
  }
  
  extension [Self <: Flows](x: Self) {
    
    inline def setFlows(value: Credentials): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
  }
}
