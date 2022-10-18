package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemListElement extends StObject {
  
  var `@type`: String
  
  var image: js.UndefOr[TypeUrl] = js.undefined
  
  var itemListElement: js.UndefOr[js.Array[TextType]] = js.undefined
  
  var name: String
  
  var `type`: String
  
  var url: js.UndefOr[String] = js.undefined
}
object ItemListElement {
  
  inline def apply(`@type`: String, name: String, `type`: String): ItemListElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemListElement]
  }
  
  extension [Self <: ItemListElement](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setImage(value: TypeUrl): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setItemListElement(value: js.Array[TextType]): Self = StObject.set(x, "itemListElement", value.asInstanceOf[js.Any])
    
    inline def setItemListElementUndefined: Self = StObject.set(x, "itemListElement", js.undefined)
    
    inline def setItemListElementVarargs(value: TextType*): Self = StObject.set(x, "itemListElement", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
