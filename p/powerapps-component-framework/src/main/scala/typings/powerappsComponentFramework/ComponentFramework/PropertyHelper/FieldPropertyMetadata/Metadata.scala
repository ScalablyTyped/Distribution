package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends js.Object {
  
  var Description: String = js.native
  
  var DisplayName: String = js.native
  
  var IsSecured: Boolean = js.native
  
  var LogicalName: String = js.native
  
  var RequiredLevel: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel = js.native
  
  var SourceType: Double = js.native
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
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSecured(value: Boolean): Self = this.set("IsSecured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalName(value: String): Self = this.set("LogicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredLevel(value: RequiredLevel): Self = this.set("RequiredLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: Double): Self = this.set("SourceType", value.asInstanceOf[js.Any])
  }
}
