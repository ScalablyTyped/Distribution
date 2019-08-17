package typings.phaser.PhaserNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CoreNs {
  import typings.phaser.PhaserNs.Game

  type BootCallback = js.Function1[/* game */ Game, Unit]
  /**
    * This callback type is completely empty, a no-operation.
    */
  type NOOP = js.Function0[Unit]
  type TimeStepCallback = js.Function3[/* time */ Double, /* average */ Double, /* interpolation */ Double, Unit]
}
