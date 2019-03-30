package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringMetadata extends Metadata {
  var Format: java.lang.String
  var ImeMode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.ImeMode
  var MaxLength: scala.Double
}

object StringMetadata {
  @scala.inline
  def apply(
    Description: java.lang.String,
    DisplayName: java.lang.String,
    Format: java.lang.String,
    ImeMode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.ImeMode,
    IsSecured: scala.Boolean,
    LogicalName: java.lang.String,
    MaxLength: scala.Double,
    RequiredLevel: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.RequiredLevel,
    SourceType: scala.Double
  ): StringMetadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, Format = Format, ImeMode = ImeMode, IsSecured = IsSecured, LogicalName = LogicalName, MaxLength = MaxLength, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[StringMetadata]
  }
}

