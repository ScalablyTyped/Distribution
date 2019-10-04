package typings.pgDashPromise.typescriptPgDashSubsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn extends js.Object {
  var columnID: Double
  var dataTypeID: Double
  var dataTypeModifier: Double
  var dataTypeSize: Double
  var format: String
  var name: String
  var oid: Double
  // NOTE: properties below are not available within Native Bindings:
  var tableID: Double
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
    val __obj = js.Dynamic.literal(columnID = columnID, dataTypeID = dataTypeID, dataTypeModifier = dataTypeModifier, dataTypeSize = dataTypeSize, format = format, name = name, oid = oid, tableID = tableID)
  
    __obj.asInstanceOf[IColumn]
  }
}

