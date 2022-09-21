package typings.pixiSpineBase.mod

import typings.pixiMath.mod.Matrix
import typings.pixiSpineBase.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBone extends StObject {
  
  var data: Name
  
  var matrix: Matrix
}
object IBone {
  
  inline def apply(data: Name, matrix: Matrix): IBone = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBone]
  }
  
  extension [Self <: IBone](x: Self) {
    
    inline def setData(value: Name): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: Matrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
  }
}
