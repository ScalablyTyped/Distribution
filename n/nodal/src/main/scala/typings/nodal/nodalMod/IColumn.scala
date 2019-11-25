package typings.nodal.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn extends js.Object {
  var name: String
  var properties: IColumnProperties
  var `type`: DataType
}

object IColumn {
  @scala.inline
  def apply(name: String, properties: IColumnProperties, `type`: DataType): IColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
}

