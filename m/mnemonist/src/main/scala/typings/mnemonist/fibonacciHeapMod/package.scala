package typings.mnemonist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fibonacciHeapMod {
  type FibonacciHeapComparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
}
