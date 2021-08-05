package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var npmDependencies: js.UndefOr[js.Object] = js.undefined
  
  var sources: js.UndefOr[js.Array[String]] = js.undefined
  
  var use: js.UndefOr[String | js.Array[String]] = js.undefined
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNpmDependencies(value: js.Object): Self = StObject.set(x, "npmDependencies", value.asInstanceOf[js.Any])
    
    inline def setNpmDependenciesUndefined: Self = StObject.set(x, "npmDependencies", js.undefined)
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    inline def setUse(value: String | js.Array[String]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setUseVarargs(value: String*): Self = StObject.set(x, "use", js.Array(value :_*))
  }
}
