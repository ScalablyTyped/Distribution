package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.ImeMode
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingNumberMetadata extends NumberMetadata {
  var Precision: Double
}

object FloatingNumberMetadata {
  @scala.inline
  def apply(
    Description: String,
    DisplayName: String,
    ImeMode: ImeMode,
    IsSecured: Boolean,
    LogicalName: String,
    MaxValue: Double,
    MinValue: Double,
    Precision: Double,
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): FloatingNumberMetadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, ImeMode = ImeMode, IsSecured = IsSecured, LogicalName = LogicalName, MaxValue = MaxValue, MinValue = MinValue, Precision = Precision, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[FloatingNumberMetadata]
  }
}

