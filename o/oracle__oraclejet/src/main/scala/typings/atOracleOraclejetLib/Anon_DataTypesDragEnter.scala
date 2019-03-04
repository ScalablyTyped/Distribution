package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDragEnter extends js.Object {
  var dataTypes: java.lang.String | js.Array[java.lang.String]
  def dragEnter(param0: stdLib.Event, param1: js.Object): scala.Unit
  def dragLeave(param0: stdLib.Event, param1: js.Object): scala.Unit
  def dragOver(param0: stdLib.Event, param1: js.Object): scala.Unit
  def drop(param0: stdLib.Event, param1: js.Object): scala.Unit
}

object Anon_DataTypesDragEnter {
  @scala.inline
  def apply(
    dataTypes: java.lang.String | js.Array[java.lang.String],
    dragEnter: js.Function2[stdLib.Event, js.Object, scala.Unit],
    dragLeave: js.Function2[stdLib.Event, js.Object, scala.Unit],
    dragOver: js.Function2[stdLib.Event, js.Object, scala.Unit],
    drop: js.Function2[stdLib.Event, js.Object, scala.Unit]
  ): Anon_DataTypesDragEnter = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = dragEnter, dragLeave = dragLeave, dragOver = dragOver, drop = drop)
  
    __obj.asInstanceOf[Anon_DataTypesDragEnter]
  }
}

