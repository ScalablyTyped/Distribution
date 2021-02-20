package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PairsFactory extends StObject {
  
  /**
    * Clears the given pairs structure.
    * @method clear
    * @param {pairs} pairs
    * @return {pairs} pairs
    */
  def clear(pairs: js.Any): js.Any = js.native
}
object PairsFactory {
  
  @scala.inline
  def apply(clear: js.Any => js.Any): PairsFactory = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear))
    __obj.asInstanceOf[PairsFactory]
  }
  
  @scala.inline
  implicit class PairsFactoryMutableBuilder[Self <: PairsFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: js.Any => js.Any): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
  }
}
