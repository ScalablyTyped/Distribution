package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heuristic extends StObject {
  
  var heuristic: js.UndefOr[js.Function2[/* dx */ Double, /* dy */ Double, Double]] = js.undefined
}
object Heuristic {
  
  @scala.inline
  def apply(): Heuristic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Heuristic]
  }
  
  @JSImport("pathfinding", "Heuristic")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def chebyshev(dx: Double, dy: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("chebyshev")(dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def euclidean(dx: Double, dy: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("euclidean")(dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def manhattan(dx: Double, dy: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("manhattan")(dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def octile(dx: Double, dy: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("octile")(dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  implicit class HeuristicMutableBuilder[Self <: Heuristic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeuristic(value: (/* dx */ Double, /* dy */ Double) => Double): Self = StObject.set(x, "heuristic", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeuristicUndefined: Self = StObject.set(x, "heuristic", js.undefined)
  }
}
