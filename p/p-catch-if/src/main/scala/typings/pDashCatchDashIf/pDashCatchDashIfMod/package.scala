package typings.pDashCatchDashIf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashCatchDashIfMod {
  import typings.std.Error

  type Predicate = ErrorConstructor | js.Array[ErrorConstructor] | Boolean | (js.Function1[/* error */ Error, Boolean | js.Thenable[Boolean]])
}
