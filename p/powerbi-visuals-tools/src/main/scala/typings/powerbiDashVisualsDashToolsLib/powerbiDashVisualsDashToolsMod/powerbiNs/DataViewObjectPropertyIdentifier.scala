package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewObjectPropertyIdentifier extends js.Object {
  var objectName: java.lang.String
  var propertyName: java.lang.String
}

object DataViewObjectPropertyIdentifier {
  @scala.inline
  def apply(objectName: java.lang.String, propertyName: java.lang.String): DataViewObjectPropertyIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objectName")(objectName)
    __obj.updateDynamic("propertyName")(propertyName)
    __obj.asInstanceOf[DataViewObjectPropertyIdentifier]
  }
}

