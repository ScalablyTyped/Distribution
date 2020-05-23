package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PairsFactory extends js.Object {
  /**
    * Clears the given pairs structure.
    * @method clear
    * @param {pairs} pairs
    * @return {pairs} pairs
    */
  def clear(pairs: js.Any): js.Any
}

object PairsFactory {
  @scala.inline
  def apply(clear: js.Any => js.Any): PairsFactory = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear))
    __obj.asInstanceOf[PairsFactory]
  }
}

