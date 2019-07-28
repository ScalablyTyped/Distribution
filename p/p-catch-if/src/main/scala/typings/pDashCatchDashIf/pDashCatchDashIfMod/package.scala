package typings.pDashCatchDashIf

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashCatchDashIfMod {
  type Predicate = ErrorConstructor | js.Array[ErrorConstructor] | Boolean | (js.Function1[/* error */ Error, Boolean | js.Thenable[Boolean]])
}
