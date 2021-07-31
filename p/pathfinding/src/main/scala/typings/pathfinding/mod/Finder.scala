package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finder extends StObject {
  
  def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]]
}
object Finder {
  
  @scala.inline
  def apply(findPath: (Double, Double, Double, Double, Grid) => js.Array[js.Array[Double]]): Finder = {
    val __obj = js.Dynamic.literal(findPath = js.Any.fromFunction5(findPath))
    __obj.asInstanceOf[Finder]
  }
  
  @scala.inline
  implicit class FinderMutableBuilder[Self <: Finder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindPath(value: (Double, Double, Double, Double, Grid) => js.Array[js.Array[Double]]): Self = StObject.set(x, "findPath", js.Any.fromFunction5(value))
  }
}
