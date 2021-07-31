package typings.mfiles

import typings.mfiles.MFiles.MFNamedACLType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INamedACL extends StObject {
  
  var AccessControlList: IAccessControlList
  
  def Clone(): INamedACL
  
  val GUID: String
  
  var ID: Double
  
  var Name: String
  
  val NamedACLType: MFNamedACLType
}
object INamedACL {
  
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: () => INamedACL,
    GUID: String,
    ID: Double,
    Name: String,
    NamedACLType: MFNamedACLType
  ): INamedACL = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), GUID = GUID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamedACLType = NamedACLType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamedACL]
  }
  
  @scala.inline
  implicit class INamedACLMutableBuilder[Self <: INamedACL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => INamedACL): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedACLType(value: MFNamedACLType): Self = StObject.set(x, "NamedACLType", value.asInstanceOf[js.Any])
  }
}
