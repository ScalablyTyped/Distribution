package typings.phaser.Phaser.Types.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Group {
  import typings.phaser.Phaser.GameObjects.GameObject

  type GroupCallback = js.Function1[/* item */ GameObject, Unit]
  type GroupMultipleCreateCallback = js.Function1[/* items */ js.Array[GameObject], Unit]
}
