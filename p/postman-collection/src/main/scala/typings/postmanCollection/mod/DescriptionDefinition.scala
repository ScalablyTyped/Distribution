package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescriptionDefinition extends StObject {
  
  var content: String = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object DescriptionDefinition {
  
  @scala.inline
  def apply(content: String): DescriptionDefinition = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionDefinition]
  }
  
  @scala.inline
  implicit class DescriptionDefinitionMutableBuilder[Self <: DescriptionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
