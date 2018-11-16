package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashMapLib {
  type Input[T] = stdLib.Promise[T] | stdLib.PromiseLike[T] | T
  type Mapper[T, R] = js.Function2[/* el */ T, /* index */ scala.Double, stdLib.Promise[R] | R]
}
