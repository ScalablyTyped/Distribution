package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigRecommended extends StObject {
  
  var config: Null
  
  var recommended: Unit
  
  var title: String
}
object ConfigRecommended {
  
  inline def apply(config: Null, recommended: Unit, title: String): ConfigRecommended = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], recommended = recommended.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigRecommended]
  }
  
  extension [Self <: ConfigRecommended](x: Self) {
    
    inline def setConfig(value: Null): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setRecommended(value: Unit): Self = StObject.set(x, "recommended", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
