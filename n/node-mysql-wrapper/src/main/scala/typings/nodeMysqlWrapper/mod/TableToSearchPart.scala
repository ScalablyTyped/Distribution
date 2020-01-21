package typings.nodeMysqlWrapper.mod

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
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableToSearchPart]
  }
}

