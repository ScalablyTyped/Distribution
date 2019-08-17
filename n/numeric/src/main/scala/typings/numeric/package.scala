package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numeric {
  type DeprecatedSparseMatrix = js.Array[js.Array[js.UndefOr[Double]]]
  type DeprecatedSparseVector = js.Array[js.UndefOr[Double]]
  type Matrix = js.Array[js.Array[Double]]
  type Scalar = Double
  type Vector = js.Array[Double]
  type VectorBoolean = js.Array[Boolean]
}
