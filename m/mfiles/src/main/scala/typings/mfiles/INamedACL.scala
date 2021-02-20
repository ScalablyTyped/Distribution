package typings.mfiles

import typings.mfiles.MFiles.MFNamedACLType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INamedACL extends StObject {
  
  var AccessControlList: IAccessControlList = js.native
  
  def Clone(): INamedACL = js.native
  
  val GUID: String = js.native
  
  var ID: Double = js.native
  
  var Name: String = js.native
  
  val NamedACLType: MFNamedACLType = js.native
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
