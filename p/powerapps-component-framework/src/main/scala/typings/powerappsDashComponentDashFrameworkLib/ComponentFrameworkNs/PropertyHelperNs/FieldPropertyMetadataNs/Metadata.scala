package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var Description: java.lang.String
  var DisplayName: java.lang.String
  var IsSecured: scala.Boolean
  var LogicalName: java.lang.String
  var RequiredLevel: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.RequiredLevel
  var SourceType: scala.Double
}

object Metadata {
  @scala.inline
  def apply(
    Description: java.lang.String,
    DisplayName: java.lang.String,
    IsSecured: scala.Boolean,
    LogicalName: java.lang.String,
    RequiredLevel: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.RequiredLevel,
    SourceType: scala.Double
  ): Metadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, IsSecured = IsSecured, LogicalName = LogicalName, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[Metadata]
  }
}

