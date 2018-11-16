package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashAnyLib {
  type Value[T] = T | stdLib.PromiseLike[T]
}
