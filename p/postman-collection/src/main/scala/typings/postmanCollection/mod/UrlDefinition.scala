package typings.postmanCollection.mod

import typings.postmanCollection.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlDefinition
  extends StObject
     with PropertyBaseDefinition {
  
  var auth: js.UndefOr[Password] = js.undefined
  
  var hash: js.UndefOr[String] = js.undefined
  
  var host: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var path: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var port: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.undefined
  
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
}
object UrlDefinition {
  
  inline def apply(): UrlDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlDefinition]
  }
  
  extension [Self <: UrlDefinition](x: Self) {
    
    inline def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setHost(value: js.Array[String] | String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHostVarargs(value: String*): Self = StObject.set(x, "host", js.Array(value :_*))
    
    inline def setPath(value: js.Array[String] | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setQuery(value: js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setQueryVarargs(value: QueryParamDefinition*): Self = StObject.set(x, "query", js.Array(value :_*))
    
    inline def setVariable(value: js.Array[VariableDefinition]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def setVariableVarargs(value: VariableDefinition*): Self = StObject.set(x, "variable", js.Array(value :_*))
  }
}
