package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var config: Extends
  
  var recommended: Unit
  
  var title: String
}
object Title {
  
  inline def apply(config: Extends, recommended: Unit, title: String): Title = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], recommended = recommended.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setConfig(value: Extends): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setRecommended(value: Unit): Self = StObject.set(x, "recommended", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
