package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedLinkInfo extends StObject {
  
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
  implicit class ISharedLinkInfoMutableBuilder[Self <: ISharedLinkInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKey(value: String): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => ISharedLinkInfo): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreatedByUser(value: Double): Self = StObject.set(x, "CreatedByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: ITimestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: ITimestamp): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileVer(value: IFileVer): Self = StObject.set(x, "FileVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (IObjVer, IFileVer) => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction2(value))
  }
}
