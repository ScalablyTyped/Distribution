package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberMetadata extends Metadata {
  var ImeMode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.ImeMode
  var MaxValue: scala.Double
  var MinValue: scala.Double
}

object NumberMetadata {
  @scala.inline
  def apply(
    Description: java.lang.String,
    DisplayName: java.lang.String,
    ImeMode: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.ImeMode,
    IsSecured: scala.Boolean,
    LogicalName: java.lang.String,
    MaxValue: scala.Double,
    MinValue: scala.Double,
    RequiredLevel: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.RequiredLevel,
    SourceType: scala.Double
  ): NumberMetadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, ImeMode = ImeMode, IsSecured = IsSecured, LogicalName = LogicalName, MaxValue = MaxValue, MinValue = MinValue, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[NumberMetadata]
  }
}

