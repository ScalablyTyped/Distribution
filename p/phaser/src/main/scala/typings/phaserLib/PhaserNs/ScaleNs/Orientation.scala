package typings
package phaserLib.PhaserNs.ScaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

/**
  * Phaser Scale Manager constants for orientation.
  */
@JSGlobal("Phaser.Scale.Orientation")
@js.native
object Orientation extends js.Object {
  /**
    * A landscape orientation.
    */
  @js.native
  sealed trait LANDSCAPE
    extends phaserLib.PhaserNs.ScaleNs.Orientation
  
  /**
    * A portrait orientation.
    */
  @js.native
  sealed trait PORTRAIT
    extends phaserLib.PhaserNs.ScaleNs.Orientation
  
  val LANDSCAPE: LANDSCAPE with java.lang.String = js.native
  val PORTRAIT: PORTRAIT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[phaserLib.PhaserNs.ScaleNs.Orientation with java.lang.String] = js.native
}

