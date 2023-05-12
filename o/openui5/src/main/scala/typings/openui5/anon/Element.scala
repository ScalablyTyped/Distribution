package typings.openui5.anon

import typings.openui5.sapUiBaseManagedObjectMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  /**
    * Component or control (instance or ID) on which the `variantModel` is set
    */
  var element: default | String
  
  /**
    * Reference to the variant that needs to be activated
    */
  var variantReference: String
}
object Element {
  
  inline def apply(element: default | String, variantReference: String): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], variantReference = variantReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    inline def setElement(value: default | String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setVariantReference(value: String): Self = StObject.set(x, "variantReference", value.asInstanceOf[js.Any])
  }
}
