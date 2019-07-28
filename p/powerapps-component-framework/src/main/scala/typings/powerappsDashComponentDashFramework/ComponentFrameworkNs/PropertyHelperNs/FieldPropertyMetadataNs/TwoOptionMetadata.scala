package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.OptionMetadata
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwoOptionMetadata extends Metadata {
  var DefaultValue: Boolean
  var Options: js.Tuple2[OptionMetadata, OptionMetadata]
}

object TwoOptionMetadata {
  @scala.inline
  def apply(
    DefaultValue: Boolean,
    Description: String,
    DisplayName: String,
    IsSecured: Boolean,
    LogicalName: String,
    Options: js.Tuple2[OptionMetadata, OptionMetadata],
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): TwoOptionMetadata = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue, Description = Description, DisplayName = DisplayName, IsSecured = IsSecured, LogicalName = LogicalName, Options = Options, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[TwoOptionMetadata]
  }
}

