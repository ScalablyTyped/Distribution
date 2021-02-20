package typings.mfiles

import typings.mfiles.MFiles.MFObjectWindowResultCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectWindowResult extends StObject {
  
  val AccessControlList: IAccessControlList = js.native
  
  val ObjVer: IObjVer = js.native
  
  val Properties: IPropertyValues = js.native
  
  val Result: MFObjectWindowResultCode = js.native
  
  val SelectedFileClass: IFileClass = js.native
  
  val UseAsDefaults: Boolean = js.native
  
  val Visible: Boolean = js.native
}
object IObjectWindowResult {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IObjectWindowResultMutableBuilder[Self <: IObjectWindowResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertyValues): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: MFObjectWindowResultCode): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedFileClass(value: IFileClass): Self = StObject.set(x, "SelectedFileClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAsDefaults(value: Boolean): Self = StObject.set(x, "UseAsDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
