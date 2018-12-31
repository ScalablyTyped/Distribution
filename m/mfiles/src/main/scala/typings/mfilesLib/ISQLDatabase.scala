package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISQLDatabase extends js.Object {
  var AdminUser: IImpersonation
  var BasicUser: IImpersonation
  var Engine: mfilesLib.MFilesNs.MFDBEngine
  var Name: java.lang.String
  var Server: java.lang.String
  def Clone(): ISQLDatabase
}

