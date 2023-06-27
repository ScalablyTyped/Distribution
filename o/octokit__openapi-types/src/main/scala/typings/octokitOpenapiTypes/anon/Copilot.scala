package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Copilot extends StObject {
  
  var codespaces: js.UndefOr[js.Array[String]] = js.undefined
  
  var copilot: js.UndefOr[js.Array[String]] = js.undefined
  
  var packages: js.UndefOr[js.Array[String]] = js.undefined
  
  var website: js.UndefOr[js.Array[String]] = js.undefined
}
object Copilot {
  
  inline def apply(): Copilot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Copilot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Copilot] (val x: Self) extends AnyVal {
    
    inline def setCodespaces(value: js.Array[String]): Self = StObject.set(x, "codespaces", value.asInstanceOf[js.Any])
    
    inline def setCodespacesUndefined: Self = StObject.set(x, "codespaces", js.undefined)
    
    inline def setCodespacesVarargs(value: String*): Self = StObject.set(x, "codespaces", js.Array(value*))
    
    inline def setCopilot(value: js.Array[String]): Self = StObject.set(x, "copilot", value.asInstanceOf[js.Any])
    
    inline def setCopilotUndefined: Self = StObject.set(x, "copilot", js.undefined)
    
    inline def setCopilotVarargs(value: String*): Self = StObject.set(x, "copilot", js.Array(value*))
    
    inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setWebsite(value: js.Array[String]): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    
    inline def setWebsiteVarargs(value: String*): Self = StObject.set(x, "website", js.Array(value*))
  }
}
