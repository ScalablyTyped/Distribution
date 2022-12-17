package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadId extends StObject {
  
  var base: RefRepo
  
  var head: RefRepo
  
  var id: Double
  
  var number: Double
  
  var url: String
}
object HeadId {
  
  inline def apply(base: RefRepo, head: RefRepo, id: Double, number: Double, url: String): HeadId = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadId]
  }
  
  extension [Self <: HeadId](x: Self) {
    
    inline def setBase(value: RefRepo): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setHead(value: RefRepo): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
