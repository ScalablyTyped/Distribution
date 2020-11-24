package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultSharedLinkOperations extends js.Object {
  
  def CreateSharedLink(SharedLinkCreationInfo: ISharedLinkInfo): ISharedLinkInfo = js.native
  
  def DeleteSharedLink(AccessKey: String): Unit = js.native
  
  def GetSharedLink(AccessKey: String): ISharedLinkInfo = js.native
  
  def GetSharedLinks(CreatedByUser: Double): ISharedLinkInfos = js.native
  
  def GetSharedLinksByObject(ObjID: IObjID): ISharedLinkInfos = js.native
}
object IVaultSharedLinkOperations {
  
  @scala.inline
  def apply(
    CreateSharedLink: ISharedLinkInfo => ISharedLinkInfo,
    DeleteSharedLink: String => Unit,
    GetSharedLink: String => ISharedLinkInfo,
    GetSharedLinks: Double => ISharedLinkInfos,
    GetSharedLinksByObject: IObjID => ISharedLinkInfos
  ): IVaultSharedLinkOperations = {
    val __obj = js.Dynamic.literal(CreateSharedLink = js.Any.fromFunction1(CreateSharedLink), DeleteSharedLink = js.Any.fromFunction1(DeleteSharedLink), GetSharedLink = js.Any.fromFunction1(GetSharedLink), GetSharedLinks = js.Any.fromFunction1(GetSharedLinks), GetSharedLinksByObject = js.Any.fromFunction1(GetSharedLinksByObject))
    __obj.asInstanceOf[IVaultSharedLinkOperations]
  }
  
  @scala.inline
  implicit class IVaultSharedLinkOperationsOps[Self <: IVaultSharedLinkOperations] (val x: Self) extends AnyVal {
    
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
    def setCreateSharedLink(value: ISharedLinkInfo => ISharedLinkInfo): Self = this.set("CreateSharedLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteSharedLink(value: String => Unit): Self = this.set("DeleteSharedLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSharedLink(value: String => ISharedLinkInfo): Self = this.set("GetSharedLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSharedLinks(value: Double => ISharedLinkInfos): Self = this.set("GetSharedLinks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSharedLinksByObject(value: IObjID => ISharedLinkInfos): Self = this.set("GetSharedLinksByObject", js.Any.fromFunction1(value))
  }
}
