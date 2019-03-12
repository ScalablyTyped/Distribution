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

object ISQLDatabase {
  @scala.inline
  def apply(
    AdminUser: IImpersonation,
    BasicUser: IImpersonation,
    Clone: () => ISQLDatabase,
    Engine: mfilesLib.MFilesNs.MFDBEngine,
    Name: java.lang.String,
    Server: java.lang.String
  ): ISQLDatabase = {
    val __obj = js.Dynamic.literal(AdminUser = AdminUser, BasicUser = BasicUser, Clone = js.Any.fromFunction0(Clone), Engine = Engine, Name = Name, Server = Server)
  
    __obj.asInstanceOf[ISQLDatabase]
  }
}

