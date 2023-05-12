package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeZoneSource extends StObject {
  
  /**
    * A function placing points on the sources edge or edges.
    */
  def getPoints(quantity: Double): js.Array[Vector2Like]
  def getPoints(quantity: Double, stepRate: Double): js.Array[Vector2Like]
  /**
    * A function placing points on the sources edge or edges.
    */
  @JSName("getPoints")
  var getPoints_Original: EdgeZoneSourceCallback
}
object EdgeZoneSource {
  
  inline def apply(getPoints: (/* quantity */ Double, /* stepRate */ js.UndefOr[Double]) => js.Array[Vector2Like]): EdgeZoneSource = {
    val __obj = js.Dynamic.literal(getPoints = js.Any.fromFunction2(getPoints))
    __obj.asInstanceOf[EdgeZoneSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdgeZoneSource] (val x: Self) extends AnyVal {
    
    inline def setGetPoints(value: (/* quantity */ Double, /* stepRate */ js.UndefOr[Double]) => js.Array[Vector2Like]): Self = StObject.set(x, "getPoints", js.Any.fromFunction2(value))
  }
}
