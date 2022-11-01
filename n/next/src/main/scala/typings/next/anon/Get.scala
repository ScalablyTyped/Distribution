package typings.next.anon

import typings.next.nextStrings.cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get extends StObject {
  
  @JSName("get")
  def get_cookie(key: cookie): js.UndefOr[String | Null]
}
object Get {
  
  inline def apply(get: cookie => js.UndefOr[String | Null]): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Get]
  }
  
  extension [Self <: Get](x: Self) {
    
    inline def setGet(value: cookie => js.UndefOr[String | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
