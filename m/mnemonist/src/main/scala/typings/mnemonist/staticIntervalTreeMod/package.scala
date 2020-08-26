package typings.mnemonist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object staticIntervalTreeMod {
  type StaticIntervalTreeGetter[T] = js.Function1[/* item */ T, scala.Double]
  type StaticIntervalTreeGettersTuple[T] = js.Tuple2[
    typings.mnemonist.staticIntervalTreeMod.StaticIntervalTreeGetter[T], 
    typings.mnemonist.staticIntervalTreeMod.StaticIntervalTreeGetter[T]
  ]
}
