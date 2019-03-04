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
    Clone: js.Function0[ISharedLinkInfo],
    CreatedByUser: scala.Double,
    CreationTime: ITimestamp,
    Description: java.lang.String,
    ExpirationTime: ITimestamp,
    FileVer: IFileVer,
    ObjVer: IObjVer,
    Set: js.Function2[IObjVer, IFileVer, scala.Unit]
  ): ISharedLinkInfo = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey, Clone = Clone, CreatedByUser = CreatedByUser, CreationTime = CreationTime, Description = Description, ExpirationTime = ExpirationTime, FileVer = FileVer, ObjVer = ObjVer, Set = Set)
  
    __obj.asInstanceOf[ISharedLinkInfo]
  }
}

