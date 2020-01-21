package typings.nodePersist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FilterFunction[T] = js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]
  type Milliseconds = scala.Double
}
