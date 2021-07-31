package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property extends StObject {
  
  /** Name of the property. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Value of numeric properties. */
  var uint64Value: js.UndefOr[String] = js.undefined
  
  /** Value of the property. */
  var value: js.UndefOr[String] = js.undefined
}
object Property {
  
  @scala.inline
  def apply(): Property = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit class PropertyMutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUint64Value(value: String): Self = StObject.set(x, "uint64Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUint64ValueUndefined: Self = StObject.set(x, "uint64Value", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
