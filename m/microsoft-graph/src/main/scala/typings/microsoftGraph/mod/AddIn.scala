package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddIn extends StObject {
  
  var id: js.UndefOr[NullableOption[String]] = js.native
  
  var properties: js.UndefOr[js.Array[KeyValue]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object AddIn {
  
  @scala.inline
  def apply(): AddIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddIn]
  }
  
  @scala.inline
  implicit class AddInMutableBuilder[Self <: AddIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Array[KeyValue]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: KeyValue*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
