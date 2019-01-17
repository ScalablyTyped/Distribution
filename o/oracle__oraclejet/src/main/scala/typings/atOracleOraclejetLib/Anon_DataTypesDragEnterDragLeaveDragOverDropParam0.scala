package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDragEnterDragLeaveDragOverDropParam0 extends js.Object {
  var dataTypes: java.lang.String | js.Array[java.lang.String]
  var dragEnter: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext, 
      scala.Unit
    ]
  ] = js.undefined
  var dragLeave: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext, 
      scala.Unit
    ]
  ] = js.undefined
  var dragOver: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext, 
      scala.Unit
    ]
  ] = js.undefined
  def drop(param0: stdLib.DragEvent, param1: atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext): scala.Unit
}

