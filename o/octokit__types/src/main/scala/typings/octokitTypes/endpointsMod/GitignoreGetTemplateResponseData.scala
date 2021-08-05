package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitignoreGetTemplateResponseData extends StObject {
  
  var name: String
  
  var source: String
}
object GitignoreGetTemplateResponseData {
  
  inline def apply(name: String, source: String): GitignoreGetTemplateResponseData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitignoreGetTemplateResponseData]
  }
  
  extension [Self <: GitignoreGetTemplateResponseData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
