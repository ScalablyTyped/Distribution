package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomClass extends StObject {
  
  /** If this custom class is a resource, the custom_class_id is the resource id of the CustomClass. Case sensitive. */
  var customClassId: js.UndefOr[String] = js.undefined
  
  /** A collection of class items. */
  var items: js.UndefOr[js.Array[ClassItem]] = js.undefined
  
  /** The resource name of the custom class. */
  var name: js.UndefOr[String] = js.undefined
}
object CustomClass {
  
  inline def apply(): CustomClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomClass] (val x: Self) extends AnyVal {
    
    inline def setCustomClassId(value: String): Self = StObject.set(x, "customClassId", value.asInstanceOf[js.Any])
    
    inline def setCustomClassIdUndefined: Self = StObject.set(x, "customClassId", js.undefined)
    
    inline def setItems(value: js.Array[ClassItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ClassItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
