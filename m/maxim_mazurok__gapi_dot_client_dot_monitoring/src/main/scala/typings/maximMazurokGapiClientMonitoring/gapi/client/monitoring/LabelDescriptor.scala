package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelDescriptor extends StObject {
  
  /** A human-readable description for the label. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The key for this label. The key must meet the following criteria: Does not exceed 100 characters. Matches the following regular expression: [a-zA-Z][a-zA-Z0-9_]* The first character
    * must be an upper- or lower-case letter. The remaining characters must be letters, digits, or underscores.
    */
  var key: js.UndefOr[String] = js.native
  
  /** The type of data that can be assigned to the label. */
  var valueType: js.UndefOr[String] = js.native
}
object LabelDescriptor {
  
  @scala.inline
  def apply(): LabelDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelDescriptor]
  }
  
  @scala.inline
  implicit class LabelDescriptorMutableBuilder[Self <: LabelDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
