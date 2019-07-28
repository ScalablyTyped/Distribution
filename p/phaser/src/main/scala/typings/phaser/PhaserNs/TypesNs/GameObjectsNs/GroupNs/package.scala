package typings.phaser.PhaserNs.TypesNs.GameObjectsNs

import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GroupNs {
  type GroupCallback = js.Function1[/* item */ GameObject, Unit]
  type GroupMultipleCreateCallback = js.Function1[/* items */ js.Array[GameObject], Unit]
}
