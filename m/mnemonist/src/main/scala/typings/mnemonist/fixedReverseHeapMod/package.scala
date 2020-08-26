package typings.mnemonist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fixedReverseHeapMod {
  type HeapComparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
}
