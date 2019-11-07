package typings.nodeDashPersist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashPersistMod {
  type FilterFunction[T] = js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
  type Milliseconds = Double
}
