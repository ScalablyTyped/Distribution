package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashAllLib {
  type PromiseFactory[T] = js.Function0[stdLib.Promise[T] | stdLib.PromiseLike[T]]
}
