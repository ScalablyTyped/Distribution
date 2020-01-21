package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object perfHooksMod {
  type PerformanceObserverCallback = js.Function2[
    /* list */ typings.node.perfHooksMod.PerformanceObserverEntryList, 
    /* observer */ typings.node.perfHooksMod.PerformanceObserver, 
    scala.Unit
  ]
}
