package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionProperty
  extends StObject
     with DirectoryObject {
  
  // Display name of the application object on which this extension property is defined. Read-only.
  var appDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the data type of the value the extension property can hold. Following values are supported. Not nullable.
    * Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format. Will be stored in UTC.Integer -
    * 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximum
    */
  var dataType: js.UndefOr[String] = js.undefined
  
  // Indicates if this extension property was sycned from onpremises directory using Azure AD Connect. Read-only.
  var isSyncedFromOnPremises: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Name of the extension property. Not nullable.
  var name: js.UndefOr[String] = js.undefined
  
  // Following values are supported. Not nullable. UserGroupOrganizationDeviceApplication
  var targetObjects: js.UndefOr[js.Array[String]] = js.undefined
}
object ExtensionProperty {
  
  inline def apply(): ExtensionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionProperty]
  }
  
  extension [Self <: ExtensionProperty](x: Self) {
    
    inline def setAppDisplayName(value: NullableOption[String]): Self = StObject.set(x, "appDisplayName", value.asInstanceOf[js.Any])
    
    inline def setAppDisplayNameNull: Self = StObject.set(x, "appDisplayName", null)
    
    inline def setAppDisplayNameUndefined: Self = StObject.set(x, "appDisplayName", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setIsSyncedFromOnPremises(value: NullableOption[Boolean]): Self = StObject.set(x, "isSyncedFromOnPremises", value.asInstanceOf[js.Any])
    
    inline def setIsSyncedFromOnPremisesNull: Self = StObject.set(x, "isSyncedFromOnPremises", null)
    
    inline def setIsSyncedFromOnPremisesUndefined: Self = StObject.set(x, "isSyncedFromOnPremises", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetObjects(value: js.Array[String]): Self = StObject.set(x, "targetObjects", value.asInstanceOf[js.Any])
    
    inline def setTargetObjectsUndefined: Self = StObject.set(x, "targetObjects", js.undefined)
    
    inline def setTargetObjectsVarargs(value: String*): Self = StObject.set(x, "targetObjects", js.Array(value :_*))
  }
}
