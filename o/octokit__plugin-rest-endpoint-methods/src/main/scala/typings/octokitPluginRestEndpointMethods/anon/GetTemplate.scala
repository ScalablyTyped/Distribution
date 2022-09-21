package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplate extends StObject {
  
  var getAllTemplates: `1059`
  
  var getTemplate: `1060`
}
object GetTemplate {
  
  inline def apply(getAllTemplates: `1059`, getTemplate: `1060`): GetTemplate = {
    val __obj = js.Dynamic.literal(getAllTemplates = getAllTemplates.asInstanceOf[js.Any], getTemplate = getTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplate]
  }
  
  extension [Self <: GetTemplate](x: Self) {
    
    inline def setGetAllTemplates(value: `1059`): Self = StObject.set(x, "getAllTemplates", value.asInstanceOf[js.Any])
    
    inline def setGetTemplate(value: `1060`): Self = StObject.set(x, "getTemplate", value.asInstanceOf[js.Any])
  }
}
