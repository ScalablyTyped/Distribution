package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcDispatchersMouseDispatcherMod {
  import typings.plottable.buildSrcCoreInterfacesMod.Point
  import typings.std.MouseEvent

  type MouseCallback = js.Function2[/* p */ Point, /* event */ MouseEvent, Unit]
}
