package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn extends ISqlType {
  var name: String
  var nullable: Boolean
  var primary: Boolean
}

object IColumn {
  @scala.inline
  def apply(name: String, nullable: Boolean, primary: Boolean, `type`: ISqlTypeFactory): IColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
}

