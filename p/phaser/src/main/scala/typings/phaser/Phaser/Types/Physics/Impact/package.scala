package typings.phaser.Phaser.Types.Physics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Impact {
  import typings.phaser.Phaser.Physics.Impact.Body

  type BodyUpdateCallback = js.Function1[/* body */ Body, Unit]
}
