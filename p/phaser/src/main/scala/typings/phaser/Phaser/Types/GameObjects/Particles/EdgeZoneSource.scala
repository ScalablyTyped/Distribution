package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeZoneSource extends StObject {
  
  /**
    * A function placing points on the sources edge or edges.
    */
  def getPoints(quantity: Double): Unit
  def getPoints(quantity: Double, stepRate: Double): Unit
  /**
    * A function placing points on the sources edge or edges.
    */
  @JSName("getPoints")
  var getPoints_Original: EdgeZoneSourceCallback
}
object EdgeZoneSource {
  
  inline def apply(getPoints: (/* quantity */ Double, /* stepRate */ js.UndefOr[Double]) => Unit): EdgeZoneSource = {
    val __obj = js.Dynamic.literal(getPoints = js.Any.fromFunction2(getPoints))
    __obj.asInstanceOf[EdgeZoneSource]
  }
  
  extension [Self <: EdgeZoneSource](x: Self) {
    
    inline def setGetPoints(value: (/* quantity */ Double, /* stepRate */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "getPoints", js.Any.fromFunction2(value))
  }
}
