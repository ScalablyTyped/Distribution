package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DivIdx extends StObject {
  
  var divIdx: Double
  
  var offset: Double
}
object DivIdx {
  
  inline def apply(divIdx: Double, offset: Double): DivIdx = {
    val __obj = js.Dynamic.literal(divIdx = divIdx.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivIdx]
  }
  
  extension [Self <: DivIdx](x: Self) {
    
    inline def setDivIdx(value: Double): Self = StObject.set(x, "divIdx", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
