package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn extends ISqlType {
  var name: java.lang.String
  var nullable: scala.Boolean
  var primary: scala.Boolean
}

object IColumn {
  @scala.inline
  def apply(name: java.lang.String, nullable: scala.Boolean, primary: scala.Boolean, `type`: ISqlTypeFactory): IColumn = {
    val __obj = js.Dynamic.literal(name = name, nullable = nullable, primary = primary)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IColumn]
  }
}

