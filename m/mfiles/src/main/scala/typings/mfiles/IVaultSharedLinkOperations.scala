package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultSharedLinkOperations extends StObject {
  
  def CreateSharedLink(SharedLinkCreationInfo: ISharedLinkInfo): ISharedLinkInfo
  
  def DeleteSharedLink(AccessKey: String): Unit
  
  def GetSharedLink(AccessKey: String): ISharedLinkInfo
  
  def GetSharedLinks(CreatedByUser: Double): ISharedLinkInfos
  
  def GetSharedLinksByObject(ObjID: IObjID): ISharedLinkInfos
}
object IVaultSharedLinkOperations {
  
  inline def apply(
    CreateSharedLink: ISharedLinkInfo => ISharedLinkInfo,
    DeleteSharedLink: String => Unit,
    GetSharedLink: String => ISharedLinkInfo,
    GetSharedLinks: Double => ISharedLinkInfos,
    GetSharedLinksByObject: IObjID => ISharedLinkInfos
  ): IVaultSharedLinkOperations = {
    val __obj = js.Dynamic.literal(CreateSharedLink = js.Any.fromFunction1(CreateSharedLink), DeleteSharedLink = js.Any.fromFunction1(DeleteSharedLink), GetSharedLink = js.Any.fromFunction1(GetSharedLink), GetSharedLinks = js.Any.fromFunction1(GetSharedLinks), GetSharedLinksByObject = js.Any.fromFunction1(GetSharedLinksByObject))
    __obj.asInstanceOf[IVaultSharedLinkOperations]
  }
  
  extension [Self <: IVaultSharedLinkOperations](x: Self) {
    
    inline def setCreateSharedLink(value: ISharedLinkInfo => ISharedLinkInfo): Self = StObject.set(x, "CreateSharedLink", js.Any.fromFunction1(value))
    
    inline def setDeleteSharedLink(value: String => Unit): Self = StObject.set(x, "DeleteSharedLink", js.Any.fromFunction1(value))
    
    inline def setGetSharedLink(value: String => ISharedLinkInfo): Self = StObject.set(x, "GetSharedLink", js.Any.fromFunction1(value))
    
    inline def setGetSharedLinks(value: Double => ISharedLinkInfos): Self = StObject.set(x, "GetSharedLinks", js.Any.fromFunction1(value))
    
    inline def setGetSharedLinksByObject(value: IObjID => ISharedLinkInfos): Self = StObject.set(x, "GetSharedLinksByObject", js.Any.fromFunction1(value))
  }
}
