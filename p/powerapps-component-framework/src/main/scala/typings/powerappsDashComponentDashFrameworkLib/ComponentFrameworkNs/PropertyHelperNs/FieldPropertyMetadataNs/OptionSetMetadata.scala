package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionSetMetadata extends Metadata {
  var DefaultValue: scala.Double
  var Options: js.Array[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.OptionMetadata
  ]
}

object OptionSetMetadata {
  @scala.inline
  def apply(
    DefaultValue: scala.Double,
    Description: java.lang.String,
    DisplayName: java.lang.String,
    IsSecured: scala.Boolean,
    LogicalName: java.lang.String,
    Options: js.Array[
      powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.OptionMetadata
    ],
    RequiredLevel: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.RequiredLevel,
    SourceType: scala.Double
  ): OptionSetMetadata = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue, Description = Description, DisplayName = DisplayName, IsSecured = IsSecured, LogicalName = LogicalName, Options = Options, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[OptionSetMetadata]
  }
}

