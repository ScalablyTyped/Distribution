package typings.openfin.anon

import typings.openfin.GoldenLayout.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: Config
  
  var dimensions: HeightLeft
  
  var indexInParent: Double
  
  var parentId: String
}
object Content {
  
  inline def apply(content: Config, dimensions: HeightLeft, indexInParent: Double, parentId: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], indexInParent = indexInParent.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: Config): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDimensions(value: HeightLeft): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setIndexInParent(value: Double): Self = StObject.set(x, "indexInParent", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
  }
}
