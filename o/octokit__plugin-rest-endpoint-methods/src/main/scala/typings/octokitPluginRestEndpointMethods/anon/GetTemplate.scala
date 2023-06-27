package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplate extends StObject {
  
  var getAllTemplates: `1177`
  
  var getTemplate: `1178`
}
object GetTemplate {
  
  inline def apply(getAllTemplates: `1177`, getTemplate: `1178`): GetTemplate = {
    val __obj = js.Dynamic.literal(getAllTemplates = getAllTemplates.asInstanceOf[js.Any], getTemplate = getTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplate] (val x: Self) extends AnyVal {
    
    inline def setGetAllTemplates(value: `1177`): Self = StObject.set(x, "getAllTemplates", value.asInstanceOf[js.Any])
    
    inline def setGetTemplate(value: `1178`): Self = StObject.set(x, "getTemplate", value.asInstanceOf[js.Any])
  }
}
