package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupMetadata extends Metadata {
  var Targets: js.Array[String]
}

object LookupMetadata {
  @scala.inline
  def apply(
    Description: String,
    DisplayName: String,
    IsSecured: Boolean,
    LogicalName: String,
    RequiredLevel: RequiredLevel,
    SourceType: Double,
    Targets: js.Array[String]
  ): LookupMetadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, IsSecured = IsSecured, LogicalName = LogicalName, RequiredLevel = RequiredLevel, SourceType = SourceType, Targets = Targets)
  
    __obj.asInstanceOf[LookupMetadata]
  }
}

