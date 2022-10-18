package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recommended extends StObject {
  
  var config: Extends
  
  var recommended: Boolean
  
  var title: String
}
object Recommended {
  
  inline def apply(config: Extends, recommended: Boolean, title: String): Recommended = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], recommended = recommended.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recommended]
  }
  
  extension [Self <: Recommended](x: Self) {
    
    inline def setConfig(value: Extends): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setRecommended(value: Boolean): Self = StObject.set(x, "recommended", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
