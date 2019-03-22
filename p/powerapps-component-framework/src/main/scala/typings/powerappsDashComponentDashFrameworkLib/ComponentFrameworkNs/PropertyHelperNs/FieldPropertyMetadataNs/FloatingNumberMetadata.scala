package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingNumberMetadata extends NumberMetadata {
  var Precision: scala.Double
}

object FloatingNumberMetadata {
  @scala.inline
  def apply(
    Description: java.lang.String,
    DisplayName: java.lang.String,
    ImeMode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.ImeMode,
    IsSecured: scala.Boolean,
    LogicalName: java.lang.String,
    MaxValue: scala.Double,
    MinValue: scala.Double,
    Precision: scala.Double,
    RequiredLevel: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.RequiredLevel,
    SourceType: scala.Double
  ): FloatingNumberMetadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, ImeMode = ImeMode, IsSecured = IsSecured, LogicalName = LogicalName, MaxValue = MaxValue, MinValue = MinValue, Precision = Precision, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[FloatingNumberMetadata]
  }
}

