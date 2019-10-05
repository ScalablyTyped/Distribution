package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var Description: String
  var DisplayName: String
  var IsSecured: Boolean
  var LogicalName: String
  var RequiredLevel: typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
  var SourceType: Double
}

object Metadata {
  @scala.inline
  def apply(
    Description: String,
    DisplayName: String,
    IsSecured: Boolean,
    LogicalName: String,
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): Metadata = {
    val __obj = js.Dynamic.literal(Description = Description, DisplayName = DisplayName, IsSecured = IsSecured, LogicalName = LogicalName, RequiredLevel = RequiredLevel, SourceType = SourceType)
  
    __obj.asInstanceOf[Metadata]
  }
}

