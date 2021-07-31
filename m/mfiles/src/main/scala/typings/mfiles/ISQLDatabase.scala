package typings.mfiles

import typings.mfiles.MFiles.MFDBEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISQLDatabase extends StObject {
  
  var AdminUser: IImpersonation
  
  var BasicUser: IImpersonation
  
  def Clone(): ISQLDatabase
  
  var Engine: MFDBEngine
  
  var Name: String
  
  var Server: String
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
  implicit class ISQLDatabaseMutableBuilder[Self <: ISQLDatabase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminUser(value: IImpersonation): Self = StObject.set(x, "AdminUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicUser(value: IImpersonation): Self = StObject.set(x, "BasicUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => ISQLDatabase): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEngine(value: MFDBEngine): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
  }
}
