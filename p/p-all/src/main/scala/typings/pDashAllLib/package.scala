package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashAllLib {
  type PromiseFactory[T] = js.Function0[js.Promise[T] | js.Thenable[T]]
}
