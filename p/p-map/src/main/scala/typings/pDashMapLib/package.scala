package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashMapLib {
  type Input[T] = js.Promise[T] | js.Thenable[T] | T
  type Mapper[T, R] = js.Function2[/* el */ T, /* index */ scala.Double, js.Promise[R] | R]
}
