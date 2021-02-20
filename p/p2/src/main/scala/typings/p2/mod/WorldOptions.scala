package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorldOptions extends StObject {
  
  var broadphase: js.UndefOr[Broadphase] = js.native
  
  var gravity: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var islandSplit: js.UndefOr[Boolean] = js.native
  
  var solver: js.UndefOr[Solver] = js.native
}
object WorldOptions {
  
  @scala.inline
  def apply(): WorldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldOptions]
  }
  
  @scala.inline
  implicit class WorldOptionsMutableBuilder[Self <: WorldOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadphase(value: Broadphase): Self = StObject.set(x, "broadphase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadphaseUndefined: Self = StObject.set(x, "broadphase", js.undefined)
    
    @scala.inline
    def setGravity(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    @scala.inline
    def setIslandSplit(value: Boolean): Self = StObject.set(x, "islandSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIslandSplitUndefined: Self = StObject.set(x, "islandSplit", js.undefined)
    
    @scala.inline
    def setSolver(value: Solver): Self = StObject.set(x, "solver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolverUndefined: Self = StObject.set(x, "solver", js.undefined)
  }
}
