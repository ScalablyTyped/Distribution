package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecimalNumberMetadata extends NumberMetadata {
  var Precision: Double
}

object DecimalNumberMetadata {
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
  ): DecimalNumberMetadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, ImeMode = ImeMode, IsSecured = IsSecured, LogicalName = LogicalName, MaxValue = MaxValue, MinValue = MinValue, Precision = Precision, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[DecimalNumberMetadata]
  }
}

