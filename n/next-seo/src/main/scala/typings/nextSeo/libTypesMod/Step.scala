package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  var image: js.UndefOr[String] = js.undefined
  
  var itemListElement: js.UndefOr[js.Array[StepDetails]] = js.undefined
  
  var name: String
  
  var `type`: String
  
  var url: js.UndefOr[String] = js.undefined
}
object Step {
  
  inline def apply(name: String, `type`: String): Step = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  extension [Self <: Step](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setItemListElement(value: js.Array[StepDetails]): Self = StObject.set(x, "itemListElement", value.asInstanceOf[js.Any])
    
    inline def setItemListElementUndefined: Self = StObject.set(x, "itemListElement", js.undefined)
    
    inline def setItemListElementVarargs(value: StepDetails*): Self = StObject.set(x, "itemListElement", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
