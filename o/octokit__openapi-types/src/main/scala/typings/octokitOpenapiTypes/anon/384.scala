package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `384` extends StObject {
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
}
object `384` {
  
  inline def apply(): `384` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`384`]
  }
  
  extension [Self <: `384`](x: Self) {
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
  }
}
