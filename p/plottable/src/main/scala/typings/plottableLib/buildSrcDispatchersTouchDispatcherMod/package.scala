package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcDispatchersTouchDispatcherMod {
  type TouchCallback = js.Function3[
    /* ids */ js.Array[scala.Double], 
    /* idToPoint */ ScalablyTyped.runtime.NumberDictionary[plottableLib.buildSrcCoreInterfacesMod.Point], 
    /* event */ stdLib.TouchEvent, 
    scala.Unit
  ]
}
