package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTemplateBasedRequestPrepareOptions
  extends StObject
     with RequestPrepareOptions {
  
  var pathTemplate: String
}
object PathTemplateBasedRequestPrepareOptions {
  
  inline def apply(deserializationMapper: Mapper, method: String, pathTemplate: String, serializationMapper: Mapper): PathTemplateBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pathTemplate = pathTemplate.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTemplateBasedRequestPrepareOptions]
  }
  
  extension [Self <: PathTemplateBasedRequestPrepareOptions](x: Self) {
    
    inline def setPathTemplate(value: String): Self = StObject.set(x, "pathTemplate", value.asInstanceOf[js.Any])
  }
}
