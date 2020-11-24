package typings.mysql2.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions
  extends typings.mysql2.connectionMod.ConnectionOptions {
  
  var Promise: js.UndefOr[js.Any] = js.native
  
  var authPlugins: js.UndefOr[StringDictionary[typings.mysql2.mod.authPlugins]] = js.native
  
  var authSwitchHandler: js.UndefOr[js.Function2[/* data */ js.Any, /* callback */ js.Function0[Unit], _]] = js.native
  
  var charsetNumber: js.UndefOr[Double] = js.native
  
  var compress: js.UndefOr[Boolean] = js.native
  
  var connectAttributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var connectionLimit: js.UndefOr[Double] = js.native
  
  var decimalNumbers: js.UndefOr[Boolean] = js.native
  
  var isServer: js.UndefOr[Boolean] = js.native
  
  var maxPreparedStatements: js.UndefOr[Double] = js.native
  
  var namedPlaceholders: js.UndefOr[Boolean] = js.native
  
  var nestTables: js.UndefOr[Boolean | String] = js.native
  
  var passwordSha1: js.UndefOr[String] = js.native
  
  var pool: js.UndefOr[js.Any] = js.native
  
  var queueLimit: js.UndefOr[Double] = js.native
  
  var rowsAsArray: js.UndefOr[Boolean] = js.native
  
  var stream: js.UndefOr[js.Any] = js.native
  
  var uri: js.UndefOr[String] = js.native
  
  var waitForConnections: js.UndefOr[Boolean] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setPromise(value: js.Any): Self = this.set("Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    
    @scala.inline
    def setAuthPlugins(value: StringDictionary[authPlugins]): Self = this.set("authPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthPlugins: Self = this.set("authPlugins", js.undefined)
    
    @scala.inline
    def setAuthSwitchHandler(value: (/* data */ js.Any, /* callback */ js.Function0[Unit]) => _): Self = this.set("authSwitchHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAuthSwitchHandler: Self = this.set("authSwitchHandler", js.undefined)
    
    @scala.inline
    def setCharsetNumber(value: Double): Self = this.set("charsetNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharsetNumber: Self = this.set("charsetNumber", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setConnectAttributes(value: StringDictionary[js.Any]): Self = this.set("connectAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectAttributes: Self = this.set("connectAttributes", js.undefined)
    
    @scala.inline
    def setConnectionLimit(value: Double): Self = this.set("connectionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionLimit: Self = this.set("connectionLimit", js.undefined)
    
    @scala.inline
    def setDecimalNumbers(value: Boolean): Self = this.set("decimalNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalNumbers: Self = this.set("decimalNumbers", js.undefined)
    
    @scala.inline
    def setIsServer(value: Boolean): Self = this.set("isServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsServer: Self = this.set("isServer", js.undefined)
    
    @scala.inline
    def setMaxPreparedStatements(value: Double): Self = this.set("maxPreparedStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPreparedStatements: Self = this.set("maxPreparedStatements", js.undefined)
    
    @scala.inline
    def setNamedPlaceholders(value: Boolean): Self = this.set("namedPlaceholders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedPlaceholders: Self = this.set("namedPlaceholders", js.undefined)
    
    @scala.inline
    def setNestTables(value: Boolean | String): Self = this.set("nestTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestTables: Self = this.set("nestTables", js.undefined)
    
    @scala.inline
    def setPasswordSha1(value: String): Self = this.set("passwordSha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordSha1: Self = this.set("passwordSha1", js.undefined)
    
    @scala.inline
    def setPool(value: js.Any): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    
    @scala.inline
    def setQueueLimit(value: Double): Self = this.set("queueLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueLimit: Self = this.set("queueLimit", js.undefined)
    
    @scala.inline
    def setRowsAsArray(value: Boolean): Self = this.set("rowsAsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsAsArray: Self = this.set("rowsAsArray", js.undefined)
    
    @scala.inline
    def setStream(value: js.Any): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setWaitForConnections(value: Boolean): Self = this.set("waitForConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForConnections: Self = this.set("waitForConnections", js.undefined)
  }
}
