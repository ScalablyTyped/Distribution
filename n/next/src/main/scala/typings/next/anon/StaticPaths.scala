package typings.next.anon

import typings.next.nextBooleans.`false`
import typings.next.nextStrings.blocking
import typings.next.nextStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticPaths extends StObject {
  
  var fallbackMode: js.UndefOr[`false` | static | blocking] = js.undefined
  
  var staticPaths: js.UndefOr[js.Array[String]] = js.undefined
}
object StaticPaths {
  
  inline def apply(): StaticPaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticPaths]
  }
  
  extension [Self <: StaticPaths](x: Self) {
    
    inline def setFallbackMode(value: `false` | static | blocking): Self = StObject.set(x, "fallbackMode", value.asInstanceOf[js.Any])
    
    inline def setFallbackModeUndefined: Self = StObject.set(x, "fallbackMode", js.undefined)
    
    inline def setStaticPaths(value: js.Array[String]): Self = StObject.set(x, "staticPaths", value.asInstanceOf[js.Any])
    
    inline def setStaticPathsUndefined: Self = StObject.set(x, "staticPaths", js.undefined)
    
    inline def setStaticPathsVarargs(value: String*): Self = StObject.set(x, "staticPaths", js.Array(value*))
  }
}
