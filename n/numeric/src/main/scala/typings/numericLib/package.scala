package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numericLib {
  type CCSComparisonResult = js.Tuple3[Vector, Vector, VectorBoolean]
  type DeprecatedSparseMatrix = js.Array[js.Array[js.UndefOr[scala.Double]]]
  type DeprecatedSparseVector = js.Array[js.UndefOr[scala.Double]]
  type Matrix = js.Array[js.Array[scala.Double]]
  type MultidimensionalArray[T] = js.Array[js.Array[T]] | js.Array[js.Array[js.Array[T]]] | js.Array[js.Array[js.Array[js.Array[T]]]] | js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]] | js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]]] | js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]]]] | js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]]]]] | (js.Array[
    js.Array[
      js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]]]]]
    ]
  ]) | (js.Array[
    js.Array[
      js.Array[
        js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]]]]]
      ]
    ]
  ]) | (js.Array[
    js.Array[
      js.Array[
        js.Array[
          js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]]]]]
        ]
      ]
    ]
  ]) | (js.Array[
    js.Array[
      js.Array[
        js.Array[
          js.Array[
            js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]]]]]
          ]
        ]
      ]
    ]
  ]) | (js.Array[
    js.Array[
      js.Array[
        js.Array[
          js.Array[
            js.Array[
              js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]]]]]
            ]
          ]
        ]
      ]
    ]
  ]) | (js.Array[
    js.Array[
      js.Array[
        js.Array[
          js.Array[
            js.Array[
              js.Array[
                js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]]]]]
              ]
            ]
          ]
        ]
      ]
    ]
  ]) | (js.Array[
    js.Array[
      js.Array[
        js.Array[
          js.Array[
            js.Array[
              js.Array[
                js.Array[
                  js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[T]]]]]]]]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ])
  type MultidimensionalMatrix = MultidimensionalArray[scala.Double]
  type NonNullPrimitive = js.UndefOr[scala.Double | java.lang.String | scala.Boolean]
  type NonScalar = Vector | MultidimensionalMatrix
  type Scalar = scala.Double
  type ShapeFunction = js.Function2[/* i */ scala.Double, /* j */ scala.Double, scala.Boolean]
  type SparseMatrix = js.Tuple3[Vector, Vector, Vector]
  type TensorValue = Scalar | Vector | MultidimensionalMatrix
  type Vector = js.Array[scala.Double]
  type VectorBoolean = js.Array[scala.Boolean]
}
