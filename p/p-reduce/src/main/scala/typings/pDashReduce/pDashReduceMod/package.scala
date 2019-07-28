package typings.pDashReduce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashReduceMod {
  type ReducerFunction[ValueType, ReducedValueType] = js.Function3[
    /* previousValue */ ReducedValueType, 
    /* currentValue */ ValueType, 
    /* index */ Double, 
    js.Thenable[ReducedValueType] | ReducedValueType
  ]
}
