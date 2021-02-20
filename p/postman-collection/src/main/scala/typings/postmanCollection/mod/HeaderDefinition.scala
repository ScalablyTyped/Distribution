package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderDefinition extends PropertyDefinition {
  
  var key: js.UndefOr[String] = js.native
  
  var system: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object HeaderDefinition {
  
  @scala.inline
  def apply(): HeaderDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderDefinition]
  }
  
  @scala.inline
  implicit class HeaderDefinitionMutableBuilder[Self <: HeaderDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setSystem(value: Boolean): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
