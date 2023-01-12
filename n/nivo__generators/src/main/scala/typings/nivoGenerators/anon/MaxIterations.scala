package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxIterations extends StObject {
  
  var maxIterations: js.UndefOr[Double] = js.undefined
  
  var nodeCount: js.UndefOr[Double] = js.undefined
}
object MaxIterations {
  
  inline def apply(): MaxIterations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxIterations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxIterations] (val x: Self) extends AnyVal {
    
    inline def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    inline def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
    
    inline def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeCountUndefined: Self = StObject.set(x, "nodeCount", js.undefined)
  }
}
