package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsComponentFramework.ComponentFramework.FormattingApi.Types.DateTimeFieldBehavior
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeMetadata extends Metadata {
  var Behavior: DateTimeFieldBehavior
  var Format: String
  var ImeMode: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
}

object DateTimeMetadata {
  @scala.inline
  def apply(
    Behavior: DateTimeFieldBehavior,
    Description: String,
    DisplayName: String,
    Format: String,
    ImeMode: ImeMode,
    IsSecured: Boolean,
    LogicalName: String,
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): DateTimeMetadata = {
    val __obj = js.Dynamic.literal(Behavior = Behavior.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeMetadata]
  }
}

