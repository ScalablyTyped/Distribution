package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyBaseDefinition extends StObject {
  
  var description: js.UndefOr[String | DescriptionDefinition] = js.undefined
}
object PropertyBaseDefinition {
  
  inline def apply(): PropertyBaseDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyBaseDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyBaseDefinition] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String | DescriptionDefinition): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
