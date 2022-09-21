package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: String | Double | js.Date
  
  var groups: String
}
object Content {
  
  inline def apply(content: String | Double | js.Date, groups: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: String | Double | js.Date): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: String): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
  }
}
