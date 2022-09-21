package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedAttributes extends StObject {
  
  /** Attributes to exclude. */
  var excludedAttributes: js.UndefOr[String] = js.undefined
}
object ExcludedAttributes {
  
  inline def apply(): ExcludedAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludedAttributes]
  }
  
  extension [Self <: ExcludedAttributes](x: Self) {
    
    inline def setExcludedAttributes(value: String): Self = StObject.set(x, "excludedAttributes", value.asInstanceOf[js.Any])
    
    inline def setExcludedAttributesUndefined: Self = StObject.set(x, "excludedAttributes", js.undefined)
  }
}
