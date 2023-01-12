package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplate extends StObject {
  
  var getAllTemplates: `1087`
  
  var getTemplate: `1088`
}
object GetTemplate {
  
  inline def apply(getAllTemplates: `1087`, getTemplate: `1088`): GetTemplate = {
    val __obj = js.Dynamic.literal(getAllTemplates = getAllTemplates.asInstanceOf[js.Any], getTemplate = getTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplate] (val x: Self) extends AnyVal {
    
    inline def setGetAllTemplates(value: `1087`): Self = StObject.set(x, "getAllTemplates", value.asInstanceOf[js.Any])
    
    inline def setGetTemplate(value: `1088`): Self = StObject.set(x, "getTemplate", value.asInstanceOf[js.Any])
  }
}
