package typings.parquetjs.rowBufferInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.parquetjs.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowBufferInterface extends js.Object {
  var columnData: StringDictionary[Count] = js.native
  var rowCount: Double = js.native
}

object RowBufferInterface {
  @scala.inline
  def apply(columnData: StringDictionary[Count], rowCount: Double): RowBufferInterface = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowBufferInterface]
  }
  @scala.inline
  implicit class RowBufferInterfaceOps[Self <: RowBufferInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnData(value: StringDictionary[Count]): Self = this.set("columnData", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
  }
  
}

