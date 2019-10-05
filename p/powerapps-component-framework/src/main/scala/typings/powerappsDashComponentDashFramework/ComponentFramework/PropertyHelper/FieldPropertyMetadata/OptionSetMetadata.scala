package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.OptionMetadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionSetMetadata extends Metadata {
  var DefaultValue: Double
  var Options: js.Array[OptionMetadata]
}

object OptionSetMetadata {
  @scala.inline
  def apply(
    DefaultValue: Double,
    Description: String,
    DisplayName: String,
    IsSecured: Boolean,
    LogicalName: String,
    Options: js.Array[OptionMetadata],
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): OptionSetMetadata = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue, Description = Description, DisplayName = DisplayName, IsSecured = IsSecured, LogicalName = LogicalName, Options = Options, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[OptionSetMetadata]
  }
}

