package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberUrl extends StObject {
  
  var base: RefRepoSha
  
  var head: RefRepoSha
  
  var id: Double
  
  var number: Double
  
  /** Format: uri */
  var url: String
}
object NumberUrl {
  
  inline def apply(base: RefRepoSha, head: RefRepoSha, id: Double, number: Double, url: String): NumberUrl = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberUrl] (val x: Self) extends AnyVal {
    
    inline def setBase(value: RefRepoSha): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setHead(value: RefRepoSha): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
