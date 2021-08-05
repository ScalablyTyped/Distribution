package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fragment extends StObject {
  
  var fragment: js.UndefOr[String] = js.undefined
  
  var geometryClass: js.UndefOr[js.Any] = js.undefined
  
  var vertex: js.UndefOr[String] = js.undefined
  
  var vertexSize: js.UndefOr[Double] = js.undefined
}
object Fragment {
  
  inline def apply(): Fragment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fragment]
  }
  
  extension [Self <: Fragment](x: Self) {
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setGeometryClass(value: js.Any): Self = StObject.set(x, "geometryClass", value.asInstanceOf[js.Any])
    
    inline def setGeometryClassUndefined: Self = StObject.set(x, "geometryClass", js.undefined)
    
    inline def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    inline def setVertexSize(value: Double): Self = StObject.set(x, "vertexSize", value.asInstanceOf[js.Any])
    
    inline def setVertexSizeUndefined: Self = StObject.set(x, "vertexSize", js.undefined)
    
    inline def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
  }
}
