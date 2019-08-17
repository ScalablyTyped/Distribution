package typings.phaser.PhaserNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object InputNs {
  import typings.phaser.PhaserNs.GameObjectsNs.GameObject

  type HitAreaCallback = js.Function4[/* hitArea */ js.Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject, Unit]
}
