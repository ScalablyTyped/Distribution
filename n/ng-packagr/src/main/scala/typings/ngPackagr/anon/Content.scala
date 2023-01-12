package typings.ngPackagr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: String
  
  var version: String
}
object Content {
  
  inline def apply(content: String, version: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
