package typings
package nodeDashMysqlDashWrapperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableToSearchPart extends js.Object {
  var propertyName: java.lang.String
  var tableName: java.lang.String
}

object TableToSearchPart {
  @scala.inline
  def apply(propertyName: java.lang.String, tableName: java.lang.String): TableToSearchPart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("propertyName")(propertyName)
    __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[TableToSearchPart]
  }
}

