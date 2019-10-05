package typings.phaser.phaserMod.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "GameObjects.Components")
@js.native
object Components extends js.Object {
  /**
    * A Matrix used for display transformations for rendering.
    * 
    * It is represented like so:
    * 
    * ```
    * | a | c | tx |
    * | b | d | ty |
    * | 0 | 0 | 1  |
    * ```
    */
  @js.native
  class TransformMatrix protected ()
    extends typings.phaser.Phaser.GameObjects.Components.TransformMatrix {
    /**
      * 
      * @param a The Scale X value. Default 1.
      * @param b The Skew Y value. Default 0.
      * @param c The Skew X value. Default 0.
      * @param d The Scale Y value. Default 1.
      * @param tx The Translate X value. Default 0.
      * @param ty The Translate Y value. Default 0.
      */
    def this(
      a: js.UndefOr[Double],
      b: js.UndefOr[Double],
      c: js.UndefOr[Double],
      d: js.UndefOr[Double],
      tx: js.UndefOr[Double],
      ty: js.UndefOr[Double]
    ) = this()
  }
  
}

