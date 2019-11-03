package typings.onoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object onoffMod {
  import typings.onoff.onoffNumbers.`0`
  import typings.onoff.onoffNumbers.`1`
  import typings.std.Error

  type BinaryValue = High | Low
  type High = `1`
  type Low = `0`
  type ValueCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* value */ BinaryValue, Unit]
}
