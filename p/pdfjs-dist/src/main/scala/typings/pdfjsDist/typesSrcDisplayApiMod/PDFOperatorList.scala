package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFOperatorList extends StObject {
  
  /**
    * - Array containing the arguments of the
    * functions.
    */
  var argsArray: js.Array[Any]
  
  /**
    * - Array containing the operator functions.
    */
  var fnArray: js.Array[Double]
}
object PDFOperatorList {
  
  inline def apply(argsArray: js.Array[Any], fnArray: js.Array[Double]): PDFOperatorList = {
    val __obj = js.Dynamic.literal(argsArray = argsArray.asInstanceOf[js.Any], fnArray = fnArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFOperatorList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFOperatorList] (val x: Self) extends AnyVal {
    
    inline def setArgsArray(value: js.Array[Any]): Self = StObject.set(x, "argsArray", value.asInstanceOf[js.Any])
    
    inline def setArgsArrayVarargs(value: Any*): Self = StObject.set(x, "argsArray", js.Array(value*))
    
    inline def setFnArray(value: js.Array[Double]): Self = StObject.set(x, "fnArray", value.asInstanceOf[js.Any])
    
    inline def setFnArrayVarargs(value: Double*): Self = StObject.set(x, "fnArray", js.Array(value*))
  }
}
