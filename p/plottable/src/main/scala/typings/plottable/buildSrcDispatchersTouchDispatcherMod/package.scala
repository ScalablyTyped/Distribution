package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcDispatchersTouchDispatcherMod {
  import org.scalablytyped.runtime.NumberDictionary
  import typings.plottable.buildSrcCoreInterfacesMod.Point
  import typings.std.TouchEvent

  type TouchCallback = js.Function3[
    /* ids */ js.Array[Double], 
    /* idToPoint */ NumberDictionary[Point], 
    /* event */ TouchEvent, 
    Unit
  ]
}
