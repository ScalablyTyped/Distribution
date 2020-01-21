package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsComponentFramework.ComponentFramework.Dictionary
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WholeNumberMetadata extends NumberMetadata {
  var Format: String
  var LanguageByCode: js.UndefOr[Dictionary] = js.undefined
  var TimeZoneByCode: js.UndefOr[Dictionary] = js.undefined
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
    SourceType: Double,
    LanguageByCode: Dictionary = null,
    TimeZoneByCode: Dictionary = null
  ): WholeNumberMetadata = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    if (LanguageByCode != null) __obj.updateDynamic("LanguageByCode")(LanguageByCode.asInstanceOf[js.Any])
    if (TimeZoneByCode != null) __obj.updateDynamic("TimeZoneByCode")(TimeZoneByCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WholeNumberMetadata]
  }
}

