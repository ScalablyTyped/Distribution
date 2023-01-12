package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content360 extends StObject {
  
  var content: `360`
}
object Content360 {
  
  inline def apply(content: `360`): Content360 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content360]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content360] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `360`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
