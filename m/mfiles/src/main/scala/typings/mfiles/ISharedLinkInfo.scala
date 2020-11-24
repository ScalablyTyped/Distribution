package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedLinkInfo extends js.Object {
  
  val AccessKey: String = js.native
  
  def Clone(): ISharedLinkInfo = js.native
  
  val CreatedByUser: Double = js.native
  
  val CreationTime: ITimestamp = js.native
  
  var Description: String = js.native
  
  var ExpirationTime: ITimestamp = js.native
  
  var FileVer: IFileVer = js.native
  
  var ObjVer: IObjVer = js.native
  
  def Set(ObjVer: IObjVer, FileVer: IFileVer): Unit = js.native
}
object ISharedLinkInfo {
  
  @scala.inline
  def apply(
    AccessKey: String,
    Clone: () => ISharedLinkInfo,
    CreatedByUser: Double,
    CreationTime: ITimestamp,
    Description: String,
    ExpirationTime: ITimestamp,
    FileVer: IFileVer,
    ObjVer: IObjVer,
    Set: (IObjVer, IFileVer) => Unit
  ): ISharedLinkInfo = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CreatedByUser = CreatedByUser.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], ExpirationTime = ExpirationTime.asInstanceOf[js.Any], FileVer = FileVer.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], Set = js.Any.fromFunction2(Set))
    __obj.asInstanceOf[ISharedLinkInfo]
  }
  
  @scala.inline
  implicit class ISharedLinkInfoOps[Self <: ISharedLinkInfo] (val x: Self) extends AnyVal {
    
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
    def setAccessKey(value: String): Self = this.set("AccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => ISharedLinkInfo): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreatedByUser(value: Double): Self = this.set("CreatedByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: ITimestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: ITimestamp): Self = this.set("ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileVer(value: IFileVer): Self = this.set("FileVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = this.set("ObjVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (IObjVer, IFileVer) => Unit): Self = this.set("Set", js.Any.fromFunction2(value))
  }
}
