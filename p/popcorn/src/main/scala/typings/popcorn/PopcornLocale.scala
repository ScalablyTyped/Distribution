package typings.popcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopcornLocale extends StObject {
  
  def get(): String = js.native
  
  def set(langRegion: String): js.Any = js.native
}
object PopcornLocale {
  
  @scala.inline
  def apply(get: () => String, set: String => js.Any): PopcornLocale = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[PopcornLocale]
  }
  
  @scala.inline
  implicit class PopcornLocaleMutableBuilder[Self <: PopcornLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: String => js.Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
