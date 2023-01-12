package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionDefinition extends StObject {
  
  var content: String
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DescriptionDefinition {
  
  inline def apply(content: String): DescriptionDefinition = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionDefinition] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
