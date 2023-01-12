package typings.nodeForge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofsha512 extends StObject {
  
  val Algorithm: Any
  
  val AlgorithmSelection: Any
}
object Typeofsha512 {
  
  inline def apply(Algorithm: Any, AlgorithmSelection: Any): Typeofsha512 = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], AlgorithmSelection = AlgorithmSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsha512]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofsha512] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: Any): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmSelection(value: Any): Self = StObject.set(x, "AlgorithmSelection", value.asInstanceOf[js.Any])
  }
}
