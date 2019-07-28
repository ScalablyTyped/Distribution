package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.ImeMode
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberMetadata extends Metadata {
  var ImeMode: typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.ImeMode
  var MaxValue: Double
  var MinValue: Double
}

object NumberMetadata {
  @scala.inline
  def apply(
    Description: String,
    DisplayName: String,
    ImeMode: ImeMode,
    IsSecured: Boolean,
    LogicalName: String,
    MaxValue: Double,
    MinValue: Double,
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): NumberMetadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, ImeMode = ImeMode, IsSecured = IsSecured, LogicalName = LogicalName, MaxValue = MaxValue, MinValue = MinValue, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[NumberMetadata]
  }
}

