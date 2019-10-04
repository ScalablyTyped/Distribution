package typings.pgDashPromise.pgDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITable extends js.Object {
  var schema: js.UndefOr[String] = js.undefined
  var table: String
}

object ITable {
  @scala.inline
  def apply(table: String, schema: String = null): ITable = {
    val __obj = js.Dynamic.literal(table = table)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[ITable]
  }
}

