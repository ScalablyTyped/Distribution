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
  
  @scala.inline
  def apply(): UrlDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlDefinition]
  }
  
  @scala.inline
  implicit class UrlDefinitionMutableBuilder[Self <: UrlDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setHost(value: js.Array[String] | String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHostVarargs(value: String*): Self = StObject.set(x, "host", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[String] | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setQueryVarargs(value: QueryParamDefinition*): Self = StObject.set(x, "query", js.Array(value :_*))
    
    @scala.inline
    def setVariable(value: js.Array[VariableDefinition]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    @scala.inline
    def setVariableVarargs(value: VariableDefinition*): Self = StObject.set(x, "variable", js.Array(value :_*))
  }
}
