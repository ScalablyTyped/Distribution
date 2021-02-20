package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ExtensionPropertyMutableBuilder[Self <: ExtensionProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppDisplayName(value: NullableOption[String]): Self = StObject.set(x, "appDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppDisplayNameNull: Self = StObject.set(x, "appDisplayName", null)
    
    @scala.inline
    def setAppDisplayNameUndefined: Self = StObject.set(x, "appDisplayName", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setIsSyncedFromOnPremises(value: NullableOption[Boolean]): Self = StObject.set(x, "isSyncedFromOnPremises", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSyncedFromOnPremisesNull: Self = StObject.set(x, "isSyncedFromOnPremises", null)
    
    @scala.inline
    def setIsSyncedFromOnPremisesUndefined: Self = StObject.set(x, "isSyncedFromOnPremises", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTargetObjects(value: js.Array[String]): Self = StObject.set(x, "targetObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetObjectsUndefined: Self = StObject.set(x, "targetObjects", js.undefined)
    
    @scala.inline
    def setTargetObjectsVarargs(value: String*): Self = StObject.set(x, "targetObjects", js.Array(value :_*))
  }
}
