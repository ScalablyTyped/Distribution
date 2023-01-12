package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contextsurl extends StObject {
  
  var checks: js.Array[AppidContext]
  
  var contexts: js.Array[String]
  
  var contexts_url: js.UndefOr[String] = js.undefined
  
  var enforcement_level: js.UndefOr[String] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Contextsurl {
  
  inline def apply(checks: js.Array[AppidContext], contexts: js.Array[String]): Contextsurl = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contextsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contextsurl] (val x: Self) extends AnyVal {
    
    inline def setChecks(value: js.Array[AppidContext]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setChecksVarargs(value: AppidContext*): Self = StObject.set(x, "checks", js.Array(value*))
    
    inline def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setContexts_url(value: String): Self = StObject.set(x, "contexts_url", value.asInstanceOf[js.Any])
    
    inline def setContexts_urlUndefined: Self = StObject.set(x, "contexts_url", js.undefined)
    
    inline def setEnforcement_level(value: String): Self = StObject.set(x, "enforcement_level", value.asInstanceOf[js.Any])
    
    inline def setEnforcement_levelUndefined: Self = StObject.set(x, "enforcement_level", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
