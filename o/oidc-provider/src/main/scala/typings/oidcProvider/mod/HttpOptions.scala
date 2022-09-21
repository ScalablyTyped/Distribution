package typings.oidcProvider.mod

import typings.node.httpMod.Agent
import typings.oidcProvider.anon.Typeoflookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpOptions extends StObject {
  
  var agent: js.UndefOr[Agent | typings.node.httpsMod.Agent] = js.undefined
  
  var lookup: js.UndefOr[Typeoflookup] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object HttpOptions {
  
  inline def apply(): HttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpOptions]
  }
  
  extension [Self <: HttpOptions](x: Self) {
    
    inline def setAgent(value: Agent | typings.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setLookup(value: Typeoflookup): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
    
    inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
