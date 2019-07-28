package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.ImeMode
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringMetadata extends Metadata {
  var Format: String
  var ImeMode: typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.ImeMode
  var MaxLength: Double
}

object StringMetadata {
  @scala.inline
  def apply(
    Description: String,
    DisplayName: String,
    Format: String,
    ImeMode: ImeMode,
    IsSecured: Boolean,
    LogicalName: String,
    MaxLength: Double,
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): StringMetadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, Format = Format, ImeMode = ImeMode, IsSecured = IsSecured, LogicalName = LogicalName, MaxLength = MaxLength, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[StringMetadata]
  }
}

