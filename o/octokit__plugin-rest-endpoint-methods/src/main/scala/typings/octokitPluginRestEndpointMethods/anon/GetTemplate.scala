package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplate extends StObject {
  
  var getAllTemplates: `710`
  
  var getTemplate: `711`
}
object GetTemplate {
  
  inline def apply(getAllTemplates: `710`, getTemplate: `711`): GetTemplate = {
    val __obj = js.Dynamic.literal(getAllTemplates = getAllTemplates.asInstanceOf[js.Any], getTemplate = getTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplate]
  }
  
  extension [Self <: GetTemplate](x: Self) {
    
    inline def setGetAllTemplates(value: `710`): Self = StObject.set(x, "getAllTemplates", value.asInstanceOf[js.Any])
    
    inline def setGetTemplate(value: `711`): Self = StObject.set(x, "getTemplate", value.asInstanceOf[js.Any])
  }
}
