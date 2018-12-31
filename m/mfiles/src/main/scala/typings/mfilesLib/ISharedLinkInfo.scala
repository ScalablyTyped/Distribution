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

