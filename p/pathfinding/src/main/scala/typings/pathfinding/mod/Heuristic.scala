package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Heuristic extends StObject {
  
  var heuristic: js.UndefOr[js.Function2[/* dx */ Double, /* dy */ Double, Double]] = js.native
}
object Heuristic {
  
  @scala.inline
  def apply(): Heuristic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Heuristic]
  }
  
  @JSImport("pathfinding", "Heuristic.chebyshev")
  @js.native
  def chebyshev(dx: Double, dy: Double): Double = js.native
  
  @JSImport("pathfinding", "Heuristic.euclidean")
  @js.native
  def euclidean(dx: Double, dy: Double): Double = js.native
  
  @JSImport("pathfinding", "Heuristic.manhattan")
  @js.native
  def manhattan(dx: Double, dy: Double): Double = js.native
  
  @JSImport("pathfinding", "Heuristic.octile")
  @js.native
  def octile(dx: Double, dy: Double): Double = js.native
  
  @scala.inline
  implicit class HeuristicMutableBuilder[Self <: Heuristic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeuristic(value: (/* dx */ Double, /* dy */ Double) => Double): Self = StObject.set(x, "heuristic", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeuristicUndefined: Self = StObject.set(x, "heuristic", js.undefined)
  }
}
