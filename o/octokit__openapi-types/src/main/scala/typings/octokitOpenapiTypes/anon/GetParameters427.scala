package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters427 extends StObject {
  
  /** Get all repository topics */
  var get: Parameters427
  
  /** Replace all repository topics */
  var put: RequestBodyContentApplicationjsonNames
}
object GetParameters427 {
  
  inline def apply(get: Parameters427, put: RequestBodyContentApplicationjsonNames): GetParameters427 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters427]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters427] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters427): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonNames): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
