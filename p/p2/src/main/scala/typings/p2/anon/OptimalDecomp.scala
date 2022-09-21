package typings.p2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimalDecomp extends StObject {
  
  var optimalDecomp: js.UndefOr[Boolean] = js.undefined
  
  var removeCollinearPoints: js.UndefOr[Boolean | Double] = js.undefined
  
  var skipSimpleCheck: js.UndefOr[Boolean] = js.undefined
}
object OptimalDecomp {
  
  inline def apply(): OptimalDecomp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimalDecomp]
  }
  
  extension [Self <: OptimalDecomp](x: Self) {
    
    inline def setOptimalDecomp(value: Boolean): Self = StObject.set(x, "optimalDecomp", value.asInstanceOf[js.Any])
    
    inline def setOptimalDecompUndefined: Self = StObject.set(x, "optimalDecomp", js.undefined)
    
    inline def setRemoveCollinearPoints(value: Boolean | Double): Self = StObject.set(x, "removeCollinearPoints", value.asInstanceOf[js.Any])
    
    inline def setRemoveCollinearPointsUndefined: Self = StObject.set(x, "removeCollinearPoints", js.undefined)
    
    inline def setSkipSimpleCheck(value: Boolean): Self = StObject.set(x, "skipSimpleCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipSimpleCheckUndefined: Self = StObject.set(x, "skipSimpleCheck", js.undefined)
  }
}
