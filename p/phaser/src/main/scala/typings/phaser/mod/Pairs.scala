package typings.phaser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Pairs` module contains methods for creating and manipulating collision pair sets.
  *
  * @class Pairs
  */
@JSImport("matter", "Pairs")
@js.native
class Pairs ()
  extends typings.phaser.MatterJS.Pairs

/* static members */
@JSImport("matter", "Pairs")
@js.native
object Pairs extends js.Object {
  /**
    * Clears the given pairs structure.
    * @method clear
    * @param {pairs} pairs
    * @return {pairs} pairs
    */
  def clear(pairs: js.Any): js.Any = js.native
}

