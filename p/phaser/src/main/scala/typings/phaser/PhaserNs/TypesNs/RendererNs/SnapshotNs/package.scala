package typings.phaser.PhaserNs.TypesNs.RendererNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SnapshotNs {
  import typings.phaser.PhaserNs.DisplayNs.Color
  import typings.std.HTMLImageElement

  type SnapshotCallback = js.Function1[/* snapshot */ Color | HTMLImageElement, Unit]
}
