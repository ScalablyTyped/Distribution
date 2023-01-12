package typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductDetail extends StObject {
  
  /** The name of the attribute. */
  var attributeName: js.UndefOr[String] = js.undefined
  
  /** The value of the attribute. */
  var attributeValue: js.UndefOr[String] = js.undefined
  
  /** A short section name that can be reused between multiple product details. */
  var sectionName: js.UndefOr[String] = js.undefined
}
object ProductDetail {
  
  inline def apply(): ProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductDetail] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    inline def setAttributeValue(value: String): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
    
    inline def setSectionName(value: String): Self = StObject.set(x, "sectionName", value.asInstanceOf[js.Any])
    
    inline def setSectionNameUndefined: Self = StObject.set(x, "sectionName", js.undefined)
  }
}
