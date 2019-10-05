package typings.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Actions {
  import typings.phaser.Phaser.GameObjects.GameObject

  type CallCallback = js.Function1[/* item */ GameObject, Unit]
}
