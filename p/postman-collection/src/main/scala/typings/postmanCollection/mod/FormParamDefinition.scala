package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormParamDefinition
  extends StObject
     with PropertyDefinition {
  
  var key: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object FormParamDefinition {
  
  @scala.inline
  def apply(): FormParamDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormParamDefinition]
  }
  
  @scala.inline
  implicit class FormParamDefinitionMutableBuilder[Self <: FormParamDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
