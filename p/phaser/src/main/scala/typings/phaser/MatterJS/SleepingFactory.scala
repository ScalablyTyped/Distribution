package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SleepingFactory extends StObject {
  
  /**
    * Given a set of colliding pairs, wakes the sleeping bodies involved.
    * @method afterCollisions
    * @param {pair[]} pairs
    */
  def afterCollisions(pairs: js.Array[IPair]): Unit
  
  /**
    * Set a body as sleeping or awake.
    * @method set
    * @param {body} body
    * @param {boolean} isSleeping
    */
  def set(body: BodyType, isSleeping: Boolean): Unit
  
  /**
    * Puts bodies to sleep or wakes them up depending on their motion.
    * @method update
    * @param {body[]} bodies
    * @param {number} delta
    */
  def update(bodies: js.Array[BodyType], delta: Double): Unit
}
object SleepingFactory {
  
  inline def apply(
    afterCollisions: js.Array[IPair] => Unit,
    set: (BodyType, Boolean) => Unit,
    update: (js.Array[BodyType], Double) => Unit
  ): SleepingFactory = {
    val __obj = js.Dynamic.literal(afterCollisions = js.Any.fromFunction1(afterCollisions), set = js.Any.fromFunction2(set), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[SleepingFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SleepingFactory] (val x: Self) extends AnyVal {
    
    inline def setAfterCollisions(value: js.Array[IPair] => Unit): Self = StObject.set(x, "afterCollisions", js.Any.fromFunction1(value))
    
    inline def setSet(value: (BodyType, Boolean) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setUpdate(value: (js.Array[BodyType], Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
