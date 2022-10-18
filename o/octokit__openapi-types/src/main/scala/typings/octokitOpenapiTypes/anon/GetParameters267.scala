package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters267 extends StObject {
  
  /** We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago. */
  var get: Parameters267
}
object GetParameters267 {
  
  inline def apply(get: Parameters267): GetParameters267 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters267]
  }
  
  extension [Self <: GetParameters267](x: Self) {
    
    inline def setGet(value: Parameters267): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
