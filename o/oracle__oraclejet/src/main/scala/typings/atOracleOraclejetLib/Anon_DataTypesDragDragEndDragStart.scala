package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDragDragEndDragStart[K, D] extends js.Object {
  var dataTypes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* param0 */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* param0 */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragStart: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DragRowContext[K, D], 
      scala.Unit
    ]
  ] = js.undefined
}

