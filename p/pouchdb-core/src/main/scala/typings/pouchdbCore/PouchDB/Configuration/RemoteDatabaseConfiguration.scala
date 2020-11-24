package typings.pouchdbCore.PouchDB.Configuration

import typings.pouchdbCore.Fetch
import typings.pouchdbCore.anon.Password
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteDatabaseConfiguration
  extends CommonDatabaseConfiguration
     with DatabaseConfiguration {
  
  var auth: js.UndefOr[Password] = js.native
  
  var fetch: js.UndefOr[Fetch] = js.native
  
  /**
    * Disables automatic creation of databases.
    */
  var skip_setup: js.UndefOr[Boolean] = js.native
}
object RemoteDatabaseConfiguration {
  
  @scala.inline
  def apply(): RemoteDatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteDatabaseConfiguration]
  }
  
  @scala.inline
  implicit class RemoteDatabaseConfigurationOps[Self <: RemoteDatabaseConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: Password): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setFetch(value: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[Response]): Self = this.set("fetch", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    
    @scala.inline
    def setSkip_setup(value: Boolean): Self = this.set("skip_setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip_setup: Self = this.set("skip_setup", js.undefined)
  }
}
