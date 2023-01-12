package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: Double
  
  var detail: String
  
  var name: String
  
  var standardName: String
}
object Code {
  
  inline def apply(code: Double, detail: String, name: String, standardName: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], standardName = standardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStandardName(value: String): Self = StObject.set(x, "standardName", value.asInstanceOf[js.Any])
  }
}
