package typings.plottable

import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcDispatchersMouseDispatcherMod {
  type MouseCallback = js.Function2[/* p */ Point, /* event */ MouseEvent, Unit]
}
