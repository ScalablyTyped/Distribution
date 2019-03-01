package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJsonDefinitionGeneric[T] extends js.Object {
  var content: T
  var name: T
  var `type`: T
}

object GeoJsonDefinitionGeneric {
  @scala.inline
  def apply[T](content: T, name: T, `type`: T): GeoJsonDefinitionGeneric[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJsonDefinitionGeneric[T]]
  }
}

