package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsComponentFramework.ComponentFramework.FormattingApi.Types.DateTimeFieldBehavior
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeMetadata extends Metadata {
  var Behavior: DateTimeFieldBehavior = js.native
  var Format: String = js.native
  var ImeMode: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode = js.native
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
  @scala.inline
  implicit class DateTimeMetadataOps[Self <: DateTimeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBehavior(value: DateTimeFieldBehavior): Self = this.set("Behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setImeMode(value: ImeMode): Self = this.set("ImeMode", value.asInstanceOf[js.Any])
  }
  
}

