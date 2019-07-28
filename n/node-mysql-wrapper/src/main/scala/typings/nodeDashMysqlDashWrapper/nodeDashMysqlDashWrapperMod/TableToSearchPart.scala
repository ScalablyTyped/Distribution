package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableToSearchPart extends js.Object {
  var propertyName: String
  var tableName: String
}

object TableToSearchPart {
  @scala.inline
  def apply(propertyName: String, tableName: String): TableToSearchPart = {
    val __obj = js.Dynamic.literal(propertyName = propertyName, tableName = tableName)
  
    __obj.asInstanceOf[TableToSearchPart]
  }
}

