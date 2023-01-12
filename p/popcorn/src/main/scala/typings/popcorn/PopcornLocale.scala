package typings.popcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopcornLocale extends StObject {
  
  def get(): String
  
  def set(langRegion: String): Any
}
object PopcornLocale {
  
  inline def apply(get: () => String, set: String => Any): PopcornLocale = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[PopcornLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopcornLocale] (val x: Self) extends AnyVal {
    
    inline def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setSet(value: String => Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
