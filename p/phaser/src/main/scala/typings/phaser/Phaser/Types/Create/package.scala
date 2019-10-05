package typings.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Create {
  import typings.std.CanvasRenderingContext2D
  import typings.std.HTMLCanvasElement

  type GenerateTextureCallback = js.Function2[/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D, Unit]
}
