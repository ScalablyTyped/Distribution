package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loader extends StObject {
  
  var loader: String
  
  var options: js.UndefOr[Any] = js.undefined
}
object Loader {
  
  inline def apply(loader: String): Loader = {
    val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader]
  }
  
  extension [Self <: Loader](x: Self) {
    
    inline def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
