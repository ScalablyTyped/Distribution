package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandomZoneSource extends StObject {
  
  /**
    * A function modifying its point argument.
    */
  def getRandomPoint(point: Vector2Like): Unit
  /**
    * A function modifying its point argument.
    */
  @JSName("getRandomPoint")
  var getRandomPoint_Original: RandomZoneSourceCallback
}
object RandomZoneSource {
  
  inline def apply(getRandomPoint: /* point */ Vector2Like => Unit): RandomZoneSource = {
    val __obj = js.Dynamic.literal(getRandomPoint = js.Any.fromFunction1(getRandomPoint))
    __obj.asInstanceOf[RandomZoneSource]
  }
  
  extension [Self <: RandomZoneSource](x: Self) {
    
    inline def setGetRandomPoint(value: /* point */ Vector2Like => Unit): Self = StObject.set(x, "getRandomPoint", js.Any.fromFunction1(value))
  }
}
