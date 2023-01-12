package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeathZoneSource extends StObject {
  
  def contains(x: Double, y: Double): Unit
  @JSName("contains")
  var contains_Original: DeathZoneSourceCallback
}
object DeathZoneSource {
  
  inline def apply(contains: (/* x */ Double, /* y */ Double) => Unit): DeathZoneSource = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains))
    __obj.asInstanceOf[DeathZoneSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeathZoneSource] (val x: Self) extends AnyVal {
    
    inline def setContains(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
  }
}
