package typings.plottable

import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcInteractionsClickInteractionMod {
  type ClickCallback = js.Function2[/* point */ Point, /* event */ MouseEvent | TouchEvent, Unit]
}
