package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matrix extends StObject {
  
  var keys: js.Array[String]
  
  var matrix: js.Array[js.Array[Double]]
}
object Matrix {
  
  inline def apply(keys: js.Array[String], matrix: js.Array[js.Array[Double]]): Matrix = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix]
  }
  
  extension [Self <: Matrix](x: Self) {
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setMatrix(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixVarargs(value: js.Array[Double]*): Self = StObject.set(x, "matrix", js.Array(value*))
  }
}
