package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewObjectWithId extends js.Object {
  var id: java.lang.String
  var `object`: DataViewObject
}

object DataViewObjectWithId {
  @scala.inline
  def apply(id: java.lang.String, `object`: DataViewObject): DataViewObjectWithId = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[DataViewObjectWithId]
  }
}

