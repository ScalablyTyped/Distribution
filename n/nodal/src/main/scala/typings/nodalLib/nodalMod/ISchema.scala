package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISchema extends js.Object {
  var columns: js.Array[IColumn]
  var table: java.lang.String
}

object ISchema {
  @scala.inline
  def apply(columns: js.Array[IColumn], table: java.lang.String): ISchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[ISchema]
  }
}

