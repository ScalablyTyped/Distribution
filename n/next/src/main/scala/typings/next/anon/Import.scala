package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Import extends StObject {
  
  var `import`: String
  
  var layer: String
}
object Import {
  
  inline def apply(`import`: String, layer: String): Import = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
  
  extension [Self <: Import](x: Self) {
    
    inline def setImport(value: String): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
  }
}
