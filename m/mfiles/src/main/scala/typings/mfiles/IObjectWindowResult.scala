package typings.mfiles

import typings.mfiles.MFiles.MFObjectWindowResultCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectWindowResult extends StObject {
  
  val AccessControlList: IAccessControlList
  
  val ObjVer: IObjVer
  
  val Properties: IPropertyValues
  
  val Result: MFObjectWindowResultCode
  
  val SelectedFileClass: IFileClass
  
  val UseAsDefaults: Boolean
  
  val Visible: Boolean
}
object IObjectWindowResult {
  
  inline def apply(
    AccessControlList: IAccessControlList,
    ObjVer: IObjVer,
    Properties: IPropertyValues,
    Result: MFObjectWindowResultCode,
    SelectedFileClass: IFileClass,
    UseAsDefaults: Boolean,
    Visible: Boolean
  ): IObjectWindowResult = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], SelectedFileClass = SelectedFileClass.asInstanceOf[js.Any], UseAsDefaults = UseAsDefaults.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWindowResult]
  }
  
  extension [Self <: IObjectWindowResult](x: Self) {
    
    inline def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertyValues): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setResult(value: MFObjectWindowResultCode): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setSelectedFileClass(value: IFileClass): Self = StObject.set(x, "SelectedFileClass", value.asInstanceOf[js.Any])
    
    inline def setUseAsDefaults(value: Boolean): Self = StObject.set(x, "UseAsDefaults", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
