package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content288 extends StObject {
  
  var content: `288`
  
  var headers: Location
}
object Content288 {
  
  inline def apply(content: `288`, headers: Location): Content288 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content288]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content288] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `288`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
