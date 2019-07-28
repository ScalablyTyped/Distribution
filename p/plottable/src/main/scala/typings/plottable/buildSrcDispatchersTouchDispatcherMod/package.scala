package typings.plottable

import org.scalablytyped.runtime.NumberDictionary
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcDispatchersTouchDispatcherMod {
  type TouchCallback = js.Function3[
    /* ids */ js.Array[Double], 
    /* idToPoint */ NumberDictionary[Point], 
    /* event */ TouchEvent, 
    Unit
  ]
}
