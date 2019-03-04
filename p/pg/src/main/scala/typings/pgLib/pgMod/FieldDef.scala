package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDef extends js.Object {
  var columnID: scala.Double
  var dataTypeID: scala.Double
  var dataTypeModifier: scala.Double
  var dataTypeSize: scala.Double
  var format: java.lang.String
  var name: java.lang.String
  var tableID: scala.Double
}

object FieldDef {
  @scala.inline
  def apply(
    columnID: scala.Double,
    dataTypeID: scala.Double,
    dataTypeModifier: scala.Double,
    dataTypeSize: scala.Double,
    format: java.lang.String,
    name: java.lang.String,
    tableID: scala.Double
  ): FieldDef = {
    val __obj = js.Dynamic.literal(columnID = columnID, dataTypeID = dataTypeID, dataTypeModifier = dataTypeModifier, dataTypeSize = dataTypeSize, format = format, name = name, tableID = tableID)
  
    __obj.asInstanceOf[FieldDef]
  }
}

