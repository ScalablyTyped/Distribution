package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwoOptionMetadata extends Metadata {
  var DefaultValue: scala.Boolean
  var Options: js.Tuple2[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.OptionMetadata, 
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.OptionMetadata
  ]
}

object TwoOptionMetadata {
  @scala.inline
  def apply(
    DefaultValue: scala.Boolean,
    Description: java.lang.String,
    DisplayName: java.lang.String,
    IsSecured: scala.Boolean,
    LogicalName: java.lang.String,
    Options: js.Tuple2[
      powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.OptionMetadata, 
      powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.OptionMetadata
    ],
    RequiredLevel: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.RequiredLevel,
    SourceType: scala.Double
  ): TwoOptionMetadata = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue, Description = Description, DisplayName = DisplayName, IsSecured = IsSecured, LogicalName = LogicalName, Options = Options, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[TwoOptionMetadata]
  }
}

