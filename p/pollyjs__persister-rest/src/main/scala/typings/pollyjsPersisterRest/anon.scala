package typings.pollyjsPersisterRest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApiNamespace extends StObject {
    
    var apiNamespace: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
  }
  object ApiNamespace {
    
    inline def apply(): ApiNamespace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiNamespace]
    }
    
    extension [Self <: ApiNamespace](x: Self) {
      
      inline def setApiNamespace(value: String): Self = StObject.set(x, "apiNamespace", value.asInstanceOf[js.Any])
      
      inline def setApiNamespaceUndefined: Self = StObject.set(x, "apiNamespace", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    }
  }
}
