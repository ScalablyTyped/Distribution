package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupMetadata extends Metadata {
  var Targets: js.Array[java.lang.String]
}

object LookupMetadata {
  @scala.inline
  def apply(
    Description: java.lang.String,
    DisplayName: java.lang.String,
    IsSecured: scala.Boolean,
    LogicalName: java.lang.String,
    RequiredLevel: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.RequiredLevel,
    SourceType: scala.Double,
    Targets: js.Array[java.lang.String]
  ): LookupMetadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, IsSecured = IsSecured, LogicalName = LogicalName, RequiredLevel = RequiredLevel, SourceType = SourceType, Targets = Targets)
  
    __obj.asInstanceOf[LookupMetadata]
  }
}

