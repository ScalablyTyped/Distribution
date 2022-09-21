package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTriangulator extends StObject {
  
  /* static member */
  var isConcave: Any
  
  /* static member */
  var positiveArea: Any
  
  /* static member */
  var winding: Any
}
object TypeofTriangulator {
  
  inline def apply(isConcave: Any, positiveArea: Any, winding: Any): TypeofTriangulator = {
    val __obj = js.Dynamic.literal(isConcave = isConcave.asInstanceOf[js.Any], positiveArea = positiveArea.asInstanceOf[js.Any], winding = winding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTriangulator]
  }
  
  extension [Self <: TypeofTriangulator](x: Self) {
    
    inline def setIsConcave(value: Any): Self = StObject.set(x, "isConcave", value.asInstanceOf[js.Any])
    
    inline def setPositiveArea(value: Any): Self = StObject.set(x, "positiveArea", value.asInstanceOf[js.Any])
    
    inline def setWinding(value: Any): Self = StObject.set(x, "winding", value.asInstanceOf[js.Any])
  }
}
