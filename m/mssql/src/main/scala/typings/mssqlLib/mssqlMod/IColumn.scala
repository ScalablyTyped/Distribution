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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nullable")(nullable)
    __obj.updateDynamic("primary")(primary)
    __obj.asInstanceOf[IColumn]
  }
}

