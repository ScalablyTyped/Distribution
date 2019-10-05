package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringMetadata extends Metadata {
  var Format: String
  var ImeMode: typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.ImeMode
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

