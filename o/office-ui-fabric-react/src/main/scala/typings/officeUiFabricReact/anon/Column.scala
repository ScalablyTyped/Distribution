package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: IColumn
  var index: Double
  def onMeasureDone(measuredWidth: Double): scala.Unit
}

object Column {
  @scala.inline
  def apply(column: IColumn, index: Double, onMeasureDone: Double => scala.Unit): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onMeasureDone = js.Any.fromFunction1(onMeasureDone))
    __obj.asInstanceOf[Column]
  }
}

