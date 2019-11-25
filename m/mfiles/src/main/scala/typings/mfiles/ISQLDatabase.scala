package typings.mfiles

import typings.mfiles.MFiles.MFDBEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISQLDatabase extends js.Object {
  var AdminUser: IImpersonation
  var BasicUser: IImpersonation
  var Engine: MFDBEngine
  var Name: String
  var Server: String
  def Clone(): ISQLDatabase
}

object ISQLDatabase {
  @scala.inline
  def apply(
    AdminUser: IImpersonation,
    BasicUser: IImpersonation,
    Clone: () => ISQLDatabase,
    Engine: MFDBEngine,
    Name: String,
    Server: String
  ): ISQLDatabase = {
    val __obj = js.Dynamic.literal(AdminUser = AdminUser.asInstanceOf[js.Any], BasicUser = BasicUser.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Engine = Engine.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISQLDatabase]
  }
}

