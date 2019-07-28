package typings.plottable

import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcInteractionsDragInteractionMod {
  type DragCallback = js.Function2[/* start */ Point, /* end */ Point, Unit]
  type MouseFilter = js.Function1[/* e */ MouseEvent, Boolean]
}
