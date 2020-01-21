package typings.ngTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/data/results", JSImport.Namespace)
@js.native
object resultsMod extends js.Object {
  @js.native
  trait IDataRowGroup[T] extends js.Object {
    @JSName("$hideRows")
    var $hideRows: Boolean = js.native
    var data: js.Array[T] = js.native
    var value: String = js.native
  }
  
  type DataResult[T] = T | IDataRowGroup[T]
  type DataResults[T] = js.Array[T] with AnonVisibleColumnCount
  type GroupedDataResults[T] = js.Array[IDataRowGroup[T]] with AnonVisibleColumnCount
}

