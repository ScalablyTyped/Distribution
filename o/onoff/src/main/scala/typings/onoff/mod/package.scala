package typings.onoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BinaryValue = typings.onoff.mod.High | typings.onoff.mod.Low
  type High = typings.onoff.onoffNumbers.`1`
  type Low = typings.onoff.onoffNumbers.`0`
  type ValueCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* value */ typings.onoff.mod.BinaryValue, 
    scala.Unit
  ]
}
