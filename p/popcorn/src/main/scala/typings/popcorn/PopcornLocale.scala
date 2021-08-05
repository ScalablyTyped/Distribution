package typings.popcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopcornLocale extends StObject {
  
  def get(): String
  
  def set(langRegion: String): js.Any
}
object PopcornLocale {
  
  inline def apply(get: () => String, set: String => js.Any): PopcornLocale = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[PopcornLocale]
  }
  
  extension [Self <: PopcornLocale](x: Self) {
    
    inline def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setSet(value: String => js.Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
