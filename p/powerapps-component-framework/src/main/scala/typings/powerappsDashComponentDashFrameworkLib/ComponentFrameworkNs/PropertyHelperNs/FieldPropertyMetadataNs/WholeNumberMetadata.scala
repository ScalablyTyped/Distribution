package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WholeNumberMetadata extends NumberMetadata {
  var Format: java.lang.String
  var LanguageByCode: js.UndefOr[powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.Dictionary] = js.undefined
  var TimeZoneByCode: js.UndefOr[powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.Dictionary] = js.undefined
}

object WholeNumberMetadata {
  @scala.inline
  def apply(
    Description: java.lang.String,
    DisplayName: java.lang.String,
    Format: java.lang.String,
    ImeMode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.ImeMode,
    IsSecured: scala.Boolean,
    LogicalName: java.lang.String,
    MaxValue: scala.Double,
    MinValue: scala.Double,
    RequiredLevel: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.RequiredLevel,
    SourceType: scala.Double,
    LanguageByCode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.Dictionary = null,
    TimeZoneByCode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.Dictionary = null
  ): WholeNumberMetadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, Format = Format, ImeMode = ImeMode, IsSecured = IsSecured, LogicalName = LogicalName, MaxValue = MaxValue, MinValue = MinValue, RequiredLevel = RequiredLevel, SourceType = SourceType)
    if (LanguageByCode != null) __obj.updateDynamic("LanguageByCode")(LanguageByCode)
    if (TimeZoneByCode != null) __obj.updateDynamic("TimeZoneByCode")(TimeZoneByCode)
    __obj.asInstanceOf[WholeNumberMetadata]
  }
}

