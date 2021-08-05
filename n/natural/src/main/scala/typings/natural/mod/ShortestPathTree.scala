package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortestPathTree extends StObject {
  
  def getDistTo(vertex: Double): Double
  
  def hasDistTo(vertex: Double): Boolean
  
  def pathTo(vertex: Double): js.Array[Double]
}
object ShortestPathTree {
  
  inline def apply(getDistTo: Double => Double, hasDistTo: Double => Boolean, pathTo: Double => js.Array[Double]): ShortestPathTree = {
    val __obj = js.Dynamic.literal(getDistTo = js.Any.fromFunction1(getDistTo), hasDistTo = js.Any.fromFunction1(hasDistTo), pathTo = js.Any.fromFunction1(pathTo))
    __obj.asInstanceOf[ShortestPathTree]
  }
  
  extension [Self <: ShortestPathTree](x: Self) {
    
    inline def setGetDistTo(value: Double => Double): Self = StObject.set(x, "getDistTo", js.Any.fromFunction1(value))
    
    inline def setHasDistTo(value: Double => Boolean): Self = StObject.set(x, "hasDistTo", js.Any.fromFunction1(value))
    
    inline def setPathTo(value: Double => js.Array[Double]): Self = StObject.set(x, "pathTo", js.Any.fromFunction1(value))
  }
}
