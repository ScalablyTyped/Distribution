package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters34 extends StObject {
  
  /** We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago. */
  var get: Parameters34
}
object GetParameters34 {
  
  inline def apply(get: Parameters34): GetParameters34 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters34]
  }
  
  extension [Self <: GetParameters34](x: Self) {
    
    inline def setGet(value: Parameters34): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
