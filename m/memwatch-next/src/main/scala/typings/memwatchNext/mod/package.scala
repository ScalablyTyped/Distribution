package typings.memwatchNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventCallback = js.Function1[
    /* data */ typings.memwatchNext.mod.LeakInformation | typings.memwatchNext.mod.StatsInformation | js.Object, 
    scala.Unit
  ]
}
