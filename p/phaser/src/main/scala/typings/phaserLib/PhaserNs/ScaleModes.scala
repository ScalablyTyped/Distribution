package typings
package phaserLib.PhaserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleModes extends js.Object

/**
  * Phaser Scale Modes.
  */
@JSGlobal("Phaser.ScaleModes")
@js.native
object ScaleModes extends js.Object {
  /**
    * Default Scale Mode (Linear).
    */
  @js.native
  sealed trait DEFAULT
    extends phaserLib.PhaserNs.ScaleModes
  
  /**
    * Linear Scale Mode.
    */
  @js.native
  sealed trait LINEAR
    extends phaserLib.PhaserNs.ScaleModes
  
  /**
    * Nearest Scale Mode.
    */
  @js.native
  sealed trait NEAREST
    extends phaserLib.PhaserNs.ScaleModes
  
  val DEFAULT: DEFAULT with java.lang.String = js.native
  val LINEAR: LINEAR with java.lang.String = js.native
  val NEAREST: NEAREST with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[phaserLib.PhaserNs.ScaleModes with java.lang.String] = js.native
}

