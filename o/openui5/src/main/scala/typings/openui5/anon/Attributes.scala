package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  /**
    * map of attributes that should be used for the script tag
    */
  var attributes: js.UndefOr[js.Object] = js.undefined
  
  /**
    * id that should be used for the link tag
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * the URL of the stylesheet to load
    */
  var url: String
}
object Attributes {
  
  inline def apply(url: String): Attributes = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  extension [Self <: Attributes](x: Self) {
    
    inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
