package typings.pgPromise.pgSubsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumn extends js.Object {
  var columnID: Double = js.native
  var dataTypeID: Double = js.native
  var dataTypeModifier: Double = js.native
  var dataTypeSize: Double = js.native
  var format: String = js.native
  var name: String = js.native
  var oid: Double = js.native
  // NOTE: properties below are not available within Native Bindings:
  var tableID: Double = js.native
}

object IColumn {
  @scala.inline
  def apply(
    columnID: Double,
    dataTypeID: Double,
    dataTypeModifier: Double,
    dataTypeSize: Double,
    format: String,
    name: String,
    oid: Double,
    tableID: Double
  ): IColumn = {
    val __obj = js.Dynamic.literal(columnID = columnID.asInstanceOf[js.Any], dataTypeID = dataTypeID.asInstanceOf[js.Any], dataTypeModifier = dataTypeModifier.asInstanceOf[js.Any], dataTypeSize = dataTypeSize.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], tableID = tableID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  @scala.inline
  implicit class IColumnOps[Self <: IColumn] (val x: Self) extends AnyVal {
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
    def setColumnID(value: Double): Self = this.set("columnID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataTypeID(value: Double): Self = this.set("dataTypeID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataTypeModifier(value: Double): Self = this.set("dataTypeModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataTypeSize(value: Double): Self = this.set("dataTypeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOid(value: Double): Self = this.set("oid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableID(value: Double): Self = this.set("tableID", value.asInstanceOf[js.Any])
  }
  
}

