package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer extends StObject {
  
  var `import`: String
  
  var layer: js.UndefOr[String] = js.undefined
}
object Layer {
  
  inline def apply(`import`: String): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  extension [Self <: Layer](x: Self) {
    
    inline def setImport(value: String): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
  }
}
