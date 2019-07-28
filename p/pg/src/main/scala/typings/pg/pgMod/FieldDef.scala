package typings.pg.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDef extends js.Object {
  var columnID: Double
  var dataTypeID: Double
  var dataTypeModifier: Double
  var dataTypeSize: Double
  var format: String
  var name: String
  var tableID: Double
}

object FieldDef {
  @scala.inline
  def apply(
    columnID: Double,
    dataTypeID: Double,
    dataTypeModifier: Double,
    dataTypeSize: Double,
    format: String,
    name: String,
    tableID: Double
  ): FieldDef = {
    val __obj = js.Dynamic.literal(columnID = columnID, dataTypeID = dataTypeID, dataTypeModifier = dataTypeModifier, dataTypeSize = dataTypeSize, format = format, name = name, tableID = tableID)
  
    __obj.asInstanceOf[FieldDef]
  }
}

