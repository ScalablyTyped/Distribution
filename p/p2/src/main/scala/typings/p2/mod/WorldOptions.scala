package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorldOptions extends StObject {
  
  var broadphase: js.UndefOr[Broadphase] = js.undefined
  
  var gravity: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var islandSplit: js.UndefOr[Boolean] = js.undefined
  
  var solver: js.UndefOr[Solver] = js.undefined
}
object WorldOptions {
  
  inline def apply(): WorldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldOptions]
  }
  
  extension [Self <: WorldOptions](x: Self) {
    
    inline def setBroadphase(value: Broadphase): Self = StObject.set(x, "broadphase", value.asInstanceOf[js.Any])
    
    inline def setBroadphaseUndefined: Self = StObject.set(x, "broadphase", js.undefined)
    
    inline def setGravity(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setIslandSplit(value: Boolean): Self = StObject.set(x, "islandSplit", value.asInstanceOf[js.Any])
    
    inline def setIslandSplitUndefined: Self = StObject.set(x, "islandSplit", js.undefined)
    
    inline def setSolver(value: Solver): Self = StObject.set(x, "solver", value.asInstanceOf[js.Any])
    
    inline def setSolverUndefined: Self = StObject.set(x, "solver", js.undefined)
  }
}
