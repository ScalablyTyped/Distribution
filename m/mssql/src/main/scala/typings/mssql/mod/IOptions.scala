package typings.mssql.mod

import typings.tedious.mod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends ConnectionOptions {
  
  var beforeConnect: js.UndefOr[Unit] = js.native
  
  var connectionString: js.UndefOr[String] = js.native
  
  var trustedConnection: js.UndefOr[Boolean] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeConnect(value: Unit): Self = StObject.set(x, "beforeConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeConnectUndefined: Self = StObject.set(x, "beforeConnect", js.undefined)
    
    @scala.inline
    def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStringUndefined: Self = StObject.set(x, "connectionString", js.undefined)
    
    @scala.inline
    def setTrustedConnection(value: Boolean): Self = StObject.set(x, "trustedConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustedConnectionUndefined: Self = StObject.set(x, "trustedConnection", js.undefined)
  }
}
