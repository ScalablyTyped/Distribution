package typings.mssql.mssqlMod

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
    val __obj = js.Dynamic.literal(name = name, nullable = nullable, primary = primary)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IColumn]
  }
}

