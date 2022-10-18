package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemListElements extends StObject {
  
  var item: String
  
  var name: String
  
  var position: Double
}
object ItemListElements {
  
  inline def apply(item: String, name: String, position: Double): ItemListElements = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemListElements]
  }
  
  extension [Self <: ItemListElements](x: Self) {
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
