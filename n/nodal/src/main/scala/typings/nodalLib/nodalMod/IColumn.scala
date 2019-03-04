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
    val __obj = js.Dynamic.literal(name = name, properties = properties)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IColumn]
  }
}

