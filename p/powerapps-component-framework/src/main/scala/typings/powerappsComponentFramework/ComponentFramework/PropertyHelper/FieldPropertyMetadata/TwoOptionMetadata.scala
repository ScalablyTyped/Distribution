package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.OptionMetadata
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
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
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwoOptionMetadata]
  }
}

