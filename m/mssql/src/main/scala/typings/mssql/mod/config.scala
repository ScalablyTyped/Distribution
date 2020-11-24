package typings.mssql.mod

import typings.tedious.mod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait config extends js.Object {
  
  /**
    * Invoked before opening the connection. The parameter conn is the configured
    * tedious Connection. It can be used for attaching event handlers.
    */
  var beforeConnect: js.UndefOr[js.Function1[/* conn */ Connection, Unit]] = js.native
  
  var connectionTimeout: js.UndefOr[Double] = js.native
  
  var database: String = js.native
  
  var domain: js.UndefOr[String] = js.native
  
  var driver: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[IOptions] = js.native
  
  var parseJSON: js.UndefOr[Boolean] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var pool: js.UndefOr[IPool] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var requestTimeout: js.UndefOr[Double] = js.native
  
  var server: String = js.native
  
  var stream: js.UndefOr[Boolean] = js.native
  
  var user: js.UndefOr[String] = js.native
}
object config {
  
  @scala.inline
  def apply(database: String, server: String): config = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
  
  @scala.inline
  implicit class configOps[Self <: config] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeConnect(value: /* conn */ Connection => Unit): Self = this.set("beforeConnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeConnect: Self = this.set("beforeConnect", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDriver(value: String): Self = this.set("driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriver: Self = this.set("driver", js.undefined)
    
    @scala.inline
    def setOptions(value: IOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setParseJSON(value: Boolean): Self = this.set("parseJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseJSON: Self = this.set("parseJSON", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPool(value: IPool): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
    
    @scala.inline
    def setStream(value: Boolean): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
