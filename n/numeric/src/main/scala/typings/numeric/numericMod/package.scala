package typings.numeric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numericMod {
  type CCSComparisonResult = js.Tuple3[Vector, Vector, VectorBoolean]
  type DeprecatedSparseMatrix = js.Array[js.Array[js.UndefOr[Double]]]
  type DeprecatedSparseVector = js.Array[js.UndefOr[Double]]
  type Matrix = js.Array[js.Array[Double]]
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
  type Scalar = Double
  type ShapeFunction = js.Function2[/* i */ Double, /* j */ Double, Boolean]
  type SparseMatrix = js.Tuple3[Vector, Vector, Vector]
  type TensorValue = Scalar | Vector | MultidimensionalMatrix
  type Vector = js.Array[Double]
  type VectorBoolean = js.Array[Boolean]
}
