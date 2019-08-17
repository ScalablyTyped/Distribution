package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: IColumn
  var index: Double
  def onMeasureDone(measuredWidth: Double): Unit
}

object Anon_Column {
  @scala.inline
  def apply(column: IColumn, index: Double, onMeasureDone: Double => Unit): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column, index = index, onMeasureDone = js.Any.fromFunction1(onMeasureDone))
  
    __obj.asInstanceOf[Anon_Column]
  }
}

