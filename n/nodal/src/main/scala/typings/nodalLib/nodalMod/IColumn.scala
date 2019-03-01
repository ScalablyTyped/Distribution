package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn extends js.Object {
  var name: java.lang.String
  var properties: IColumnProperties
  var `type`: DataType
}

object IColumn {
  @scala.inline
  def apply(name: java.lang.String, properties: IColumnProperties, `type`: DataType): IColumn = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IColumn]
  }
}

