package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsDashComponentDashFramework.ComponentFramework.Dictionary
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
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
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, Format = Format, ImeMode = ImeMode, IsSecured = IsSecured, LogicalName = LogicalName, MaxValue = MaxValue, MinValue = MinValue, RequiredLevel = RequiredLevel, SourceType = SourceType)
    if (LanguageByCode != null) __obj.updateDynamic("LanguageByCode")(LanguageByCode)
    if (TimeZoneByCode != null) __obj.updateDynamic("TimeZoneByCode")(TimeZoneByCode)
    __obj.asInstanceOf[WholeNumberMetadata]
  }
}

