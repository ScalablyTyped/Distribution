package typings.mfiles

import typings.mfiles.MFiles.MFDBEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISQLDatabase extends js.Object {
  
  var AdminUser: IImpersonation = js.native
  
  var BasicUser: IImpersonation = js.native
  
  def Clone(): ISQLDatabase = js.native
  
  var Engine: MFDBEngine = js.native
  
  var Name: String = js.native
  
  var Server: String = js.native
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
  
  @scala.inline
  implicit class ISQLDatabaseOps[Self <: ISQLDatabase] (val x: Self) extends AnyVal {
    
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
    def setAdminUser(value: IImpersonation): Self = this.set("AdminUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicUser(value: IImpersonation): Self = this.set("BasicUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => ISQLDatabase): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEngine(value: MFDBEngine): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = this.set("Server", value.asInstanceOf[js.Any])
  }
}
