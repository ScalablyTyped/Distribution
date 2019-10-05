package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsDashComponentDashFramework.ComponentFramework.FormattingApi.Types.DateTimeFieldBehavior
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeMetadata extends Metadata {
  var Behavior: DateTimeFieldBehavior
  var Format: String
  var ImeMode: typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.ImeMode
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
    val __obj = js.Dynamic.literal(Behavior = Behavior, Description = Description, DisplayName = DisplayName, Format = Format, ImeMode = ImeMode, IsSecured = IsSecured, LogicalName = LogicalName, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[DateTimeMetadata]
  }
}

