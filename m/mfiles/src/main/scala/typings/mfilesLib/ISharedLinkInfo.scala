package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedLinkInfo extends js.Object {
  val AccessKey: java.lang.String
  val CreatedByUser: scala.Double
  val CreationTime: ITimestamp
  var Description: java.lang.String
  var ExpirationTime: ITimestamp
  var FileVer: IFileVer
  var ObjVer: IObjVer
  def Clone(): ISharedLinkInfo
  def Set(ObjVer: IObjVer, FileVer: IFileVer): scala.Unit
}

object ISharedLinkInfo {
  @scala.inline
  def apply(
    AccessKey: java.lang.String,
    Clone: () => ISharedLinkInfo,
    CreatedByUser: scala.Double,
    CreationTime: ITimestamp,
    Description: java.lang.String,
    ExpirationTime: ITimestamp,
    FileVer: IFileVer,
    ObjVer: IObjVer,
    Set: (IObjVer, IFileVer) => scala.Unit
  ): ISharedLinkInfo = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey, Clone = js.Any.fromFunction0(Clone), CreatedByUser = CreatedByUser, CreationTime = CreationTime, Description = Description, ExpirationTime = ExpirationTime, FileVer = FileVer, ObjVer = ObjVer, Set = js.Any.fromFunction2(Set))
  
    __obj.asInstanceOf[ISharedLinkInfo]
  }
}

