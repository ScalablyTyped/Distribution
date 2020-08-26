package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsComponentFramework.ComponentFramework.Dictionary
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WholeNumberMetadata extends NumberMetadata {
  var Format: String = js.native
  var LanguageByCode: js.UndefOr[Dictionary] = js.native
  var TimeZoneByCode: js.UndefOr[Dictionary] = js.native
}

object WholeNumberMetadata {
  @scala.inline
  def apply(
    Description: String,
    DisplayName: String,
    Format: String,
    ImeMode: ImeMode,
    IsSecured: Boolean,
    LogicalName: String,
    MaxValue: Double,
    MinValue: Double,
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): WholeNumberMetadata = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WholeNumberMetadata]
  }
  @scala.inline
  implicit class WholeNumberMetadataOps[Self <: WholeNumberMetadata] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageByCode(value: Dictionary): Self = this.set("LanguageByCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageByCode: Self = this.set("LanguageByCode", js.undefined)
    @scala.inline
    def setTimeZoneByCode(value: Dictionary): Self = this.set("TimeZoneByCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZoneByCode: Self = this.set("TimeZoneByCode", js.undefined)
  }
  
}

