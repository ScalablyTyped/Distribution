package typings.pixiCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBatchFactoryOptions extends StObject {
  
  var fragment: js.UndefOr[String] = js.undefined
  
  var geometryClass: js.UndefOr[Instantiable1[/* _static */ js.UndefOr[Boolean], BatchGeometry]] = js.undefined
  
  var vertex: js.UndefOr[String] = js.undefined
  
  var vertexSize: js.UndefOr[Double] = js.undefined
}
object IBatchFactoryOptions {
  
  inline def apply(): IBatchFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchFactoryOptions]
  }
  
  extension [Self <: IBatchFactoryOptions](x: Self) {
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setGeometryClass(value: Instantiable1[/* _static */ js.UndefOr[Boolean], BatchGeometry]): Self = StObject.set(x, "geometryClass", value.asInstanceOf[js.Any])
    
    inline def setGeometryClassUndefined: Self = StObject.set(x, "geometryClass", js.undefined)
    
    inline def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    inline def setVertexSize(value: Double): Self = StObject.set(x, "vertexSize", value.asInstanceOf[js.Any])
    
    inline def setVertexSizeUndefined: Self = StObject.set(x, "vertexSize", js.undefined)
    
    inline def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
  }
}
