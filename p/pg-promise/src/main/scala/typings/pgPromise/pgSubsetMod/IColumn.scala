package typings.pgPromise.pgSubsetMod

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
    val __obj = js.Dynamic.literal(columnID = columnID.asInstanceOf[js.Any], dataTypeID = dataTypeID.asInstanceOf[js.Any], dataTypeModifier = dataTypeModifier.asInstanceOf[js.Any], dataTypeSize = dataTypeSize.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], tableID = tableID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
}

