package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryParamDefinition extends PropertyDefinition {
  
  var key: String | Null = js.native
  
  var system: js.UndefOr[Boolean] = js.native
  
  var value: String | Null = js.native
}
object QueryParamDefinition {
  
  @scala.inline
  def apply(): QueryParamDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParamDefinition]
  }
  
  @scala.inline
  implicit class QueryParamDefinitionMutableBuilder[Self <: QueryParamDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setSystem(value: Boolean): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
