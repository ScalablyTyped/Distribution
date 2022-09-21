package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchNumIndices extends StObject {
  
  var batchNumIndices: Double
  
  var batchNumVerts: Double
  
  var material: Any
}
object BatchNumIndices {
  
  inline def apply(batchNumIndices: Double, batchNumVerts: Double, material: Any): BatchNumIndices = {
    val __obj = js.Dynamic.literal(batchNumIndices = batchNumIndices.asInstanceOf[js.Any], batchNumVerts = batchNumVerts.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchNumIndices]
  }
  
  extension [Self <: BatchNumIndices](x: Self) {
    
    inline def setBatchNumIndices(value: Double): Self = StObject.set(x, "batchNumIndices", value.asInstanceOf[js.Any])
    
    inline def setBatchNumVerts(value: Double): Self = StObject.set(x, "batchNumVerts", value.asInstanceOf[js.Any])
    
    inline def setMaterial(value: Any): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
  }
}
