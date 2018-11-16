package typings
package mobxLib.libInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "ComputedValue")
@js.native
class ComputedValue[T] protected ()
  extends mobxLib.libCoreComputedvalueMod.ComputedValue[T] {
  /**
       * Create a new computed value based on a function expression.
       *
       * The `name` property is for debug purposes only.
       *
       * The `equals` property specifies the comparer function to use to determine if a newly produced
       * value differs from the previous value. Two comparers are provided in the library; `defaultComparer`
       * compares based on identity comparison (===), and `structualComparer` deeply compares the structure.
       * Structural comparison can be convenient if you always produce a new aggregated object and
       * don't want to notify observers if it is structurally the same.
       * This is useful for working with vectors, mouse coordinates etc.
       */
  def this(options: mobxLib.libCoreComputedvalueMod.IComputedValueOptions[T]) = this()
}

