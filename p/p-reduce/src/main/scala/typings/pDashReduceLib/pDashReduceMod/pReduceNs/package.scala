package typings
package pDashReduceLib.pDashReduceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pReduceNs {
  type ReducerFunction[ValueType, ReducedValueType] = js.Function3[
    /* previousValue */ ReducedValueType, 
    /* currentValue */ ValueType, 
    /* index */ scala.Double, 
    js.Thenable[ReducedValueType] | ReducedValueType
  ]
}
