package typings.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Input {
  import typings.phaser.Phaser.GameObjects.GameObject

  type HitAreaCallback = js.Function4[/* hitArea */ js.Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject, Unit]
}
