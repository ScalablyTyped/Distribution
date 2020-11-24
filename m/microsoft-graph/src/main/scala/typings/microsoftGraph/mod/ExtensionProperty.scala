package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionProperty extends DirectoryObject {
  
  // Display name of the application object on which this extension property is defined. Read-only.
  var appDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies the data type of the value the extension property can hold. Following values are supported. Not nullable.
    * Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format. Will be stored in UTC.Integer -
    * 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximum
    */
  var dataType: js.UndefOr[String] = js.native
  
  // Indicates if this extension property was sycned from onpremises directory using Azure AD Connect. Read-only.
  var isSyncedFromOnPremises: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Name of the extension property. Not nullable.
  var name: js.UndefOr[String] = js.native
  
  // Following values are supported. Not nullable. UserGroupOrganizationDeviceApplication
  var targetObjects: js.UndefOr[js.Array[String]] = js.native
}
object ExtensionProperty {
  
  @scala.inline
  def apply(): ExtensionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionProperty]
  }
  
  @scala.inline
  implicit class ExtensionPropertyOps[Self <: ExtensionProperty] (val x: Self) extends AnyVal {
    
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
    def setAppDisplayName(value: NullableOption[String]): Self = this.set("appDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppDisplayName: Self = this.set("appDisplayName", js.undefined)
    
    @scala.inline
    def setAppDisplayNameNull: Self = this.set("appDisplayName", null)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setIsSyncedFromOnPremises(value: NullableOption[Boolean]): Self = this.set("isSyncedFromOnPremises", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSyncedFromOnPremises: Self = this.set("isSyncedFromOnPremises", js.undefined)
    
    @scala.inline
    def setIsSyncedFromOnPremisesNull: Self = this.set("isSyncedFromOnPremises", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTargetObjectsVarargs(value: String*): Self = this.set("targetObjects", js.Array(value :_*))
    
    @scala.inline
    def setTargetObjects(value: js.Array[String]): Self = this.set("targetObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetObjects: Self = this.set("targetObjects", js.undefined)
  }
}
