package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectVersionPermissions extends StObject {
  
  val AccessControlList: IAccessControlList
  
  val CustomACL: Boolean
  
  val NamedACL: INamedACL
  
  val ObjVer: IObjVer
}
object IObjectVersionPermissions {
  
  @scala.inline
  def apply(AccessControlList: IAccessControlList, CustomACL: Boolean, NamedACL: INamedACL, ObjVer: IObjVer): IObjectVersionPermissions = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], CustomACL = CustomACL.asInstanceOf[js.Any], NamedACL = NamedACL.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectVersionPermissions]
  }
  
  @scala.inline
  implicit class IObjectVersionPermissionsMutableBuilder[Self <: IObjectVersionPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomACL(value: Boolean): Self = StObject.set(x, "CustomACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedACL(value: INamedACL): Self = StObject.set(x, "NamedACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
  }
}
