package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedLinkInfo extends js.Object {
  val AccessKey: String
  val CreatedByUser: Double
  val CreationTime: ITimestamp
  var Description: String
  var ExpirationTime: ITimestamp
  var FileVer: IFileVer
  var ObjVer: IObjVer
  def Clone(): ISharedLinkInfo
  def Set(ObjVer: IObjVer, FileVer: IFileVer): Unit
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
    val __obj = js.Dynamic.literal(AccessKey = AccessKey, Clone = js.Any.fromFunction0(Clone), CreatedByUser = CreatedByUser, CreationTime = CreationTime, Description = Description, ExpirationTime = ExpirationTime, FileVer = FileVer, ObjVer = ObjVer, Set = js.Any.fromFunction2(Set))
  
    __obj.asInstanceOf[ISharedLinkInfo]
  }
}

