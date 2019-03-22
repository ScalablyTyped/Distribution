package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeMetadata extends Metadata {
  var Behavior: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FormattingApiNs.DateTimeFieldBehavior
  var Format: java.lang.String
  var ImeMode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.ImeMode
}

object DateTimeMetadata {
  @scala.inline
  def apply(
    Behavior: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FormattingApiNs.DateTimeFieldBehavior,
    Description: java.lang.String,
    DisplayName: java.lang.String,
    Format: java.lang.String,
    ImeMode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.ImeMode,
    IsSecured: scala.Boolean,
    LogicalName: java.lang.String,
    RequiredLevel: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.RequiredLevel,
    SourceType: scala.Double
  ): DateTimeMetadata = {
    val __obj = js.Dynamic.literal(Behavior = Behavior, Description = Description, DisplayName = DisplayName, Format = Format, ImeMode = ImeMode, IsSecured = IsSecured, LogicalName = LogicalName, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[DateTimeMetadata]
  }
}

