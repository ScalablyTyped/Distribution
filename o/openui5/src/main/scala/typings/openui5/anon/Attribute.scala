package typings.openui5.anon

import typings.openui5.sapUiUx3ExactAttributeMod.ExactAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  /**
    * The ExactAttribute
    */
  var attribute: js.UndefOr[ExactAttribute] = js.undefined
}
object Attribute {
  
  inline def apply(): Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setAttribute(value: ExactAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
  }
}
