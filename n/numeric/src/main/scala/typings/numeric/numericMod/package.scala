package typings.numeric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numericMod {
  import typings.numeric.Scalar
  import typings.numeric.Vector
  import typings.numeric.VectorBoolean

  type CCSComparisonResult = js.Tuple3[Vector, Vector, VectorBoolean]
  type MultidimensionalArray[T] = js.Array[
    js.Array[
      (js.Array[
        (js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    js.Array[
                      (js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]) | T
                    ]
                  ]) | T
                ]) | T
              ]) | T
            ]) | T
          ]) | T
        ]) | T
      ]) | T
    ]
  ]
  type MultidimensionalMatrix = MultidimensionalArray[Double]
  type NonNullPrimitive = js.UndefOr[Double | String | Boolean]
  type NonScalar = Vector | MultidimensionalMatrix
  type ShapeFunction = js.Function2[/* i */ Double, /* j */ Double, Boolean]
  type SparseMatrix = js.Tuple3[Vector, Vector, Vector]
  type TensorValue = Scalar | Vector | MultidimensionalMatrix
}
