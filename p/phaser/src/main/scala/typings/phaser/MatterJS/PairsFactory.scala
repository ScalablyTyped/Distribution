package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PairsFactory extends js.Object {
  
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
  implicit class PairsFactoryOps[Self <: PairsFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: js.Any => js.Any): Self = this.set("clear", js.Any.fromFunction1(value))
  }
}
