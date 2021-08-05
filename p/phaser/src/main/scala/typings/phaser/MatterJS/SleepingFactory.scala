package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SleepingFactory extends StObject {
  
  def set(body: BodyType, isSleeping: Boolean): Unit
}
object SleepingFactory {
  
  inline def apply(set: (BodyType, Boolean) => Unit): SleepingFactory = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[SleepingFactory]
  }
  
  extension [Self <: SleepingFactory](x: Self) {
    
    inline def setSet(value: (BodyType, Boolean) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
