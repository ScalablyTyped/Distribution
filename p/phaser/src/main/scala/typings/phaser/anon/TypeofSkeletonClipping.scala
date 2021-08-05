package typings.phaser.anon

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSkeletonClipping extends StObject {
  
  /* static member */
  def makeClockwise(polygon: ArrayLike[Double]): Unit
}
object TypeofSkeletonClipping {
  
  inline def apply(makeClockwise: ArrayLike[Double] => Unit): TypeofSkeletonClipping = {
    val __obj = js.Dynamic.literal(makeClockwise = js.Any.fromFunction1(makeClockwise))
    __obj.asInstanceOf[TypeofSkeletonClipping]
  }
  
  extension [Self <: TypeofSkeletonClipping](x: Self) {
    
    inline def setMakeClockwise(value: ArrayLike[Double] => Unit): Self = StObject.set(x, "makeClockwise", js.Any.fromFunction1(value))
  }
}
