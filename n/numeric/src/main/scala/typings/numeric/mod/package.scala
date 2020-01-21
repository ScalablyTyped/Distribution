package typings.numeric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CCSComparisonResult = js.Tuple3[
    typings.numeric.mod.Vector, 
    typings.numeric.mod.Vector, 
    typings.numeric.mod.VectorBoolean
  ]
  type DeprecatedSparseMatrix = js.Array[js.Array[js.UndefOr[scala.Double]]]
  type DeprecatedSparseVector = js.Array[js.UndefOr[scala.Double]]
  type Matrix = js.Array[js.Array[scala.Double]]
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
  type MultidimensionalMatrix = typings.numeric.mod.MultidimensionalArray[scala.Double]
  type NonNullPrimitive = js.UndefOr[scala.Double | java.lang.String | scala.Boolean]
  type NonScalar = typings.numeric.mod.Vector | typings.numeric.mod.MultidimensionalMatrix
  type Scalar = scala.Double
  type ShapeFunction = js.Function2[/* i */ scala.Double, /* j */ scala.Double, scala.Boolean]
  type SparseMatrix = js.Tuple3[typings.numeric.mod.Vector, typings.numeric.mod.Vector, typings.numeric.mod.Vector]
  type TensorValue = typings.numeric.mod.Scalar | typings.numeric.mod.Vector | typings.numeric.mod.MultidimensionalMatrix
  type Vector = js.Array[scala.Double]
  type VectorBoolean = js.Array[scala.Boolean]
}
