package typings.mssql.mod

import typings.tedious.mod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOptions
  extends StObject
     with ConnectionOptions {
  
  var beforeConnect: js.UndefOr[Unit] = js.undefined
  
  var connectionString: js.UndefOr[String] = js.undefined
  
  var trustedConnection: js.UndefOr[Boolean] = js.undefined
}
object IOptions {
  
  inline def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  extension [Self <: IOptions](x: Self) {
    
    inline def setBeforeConnect(value: Unit): Self = StObject.set(x, "beforeConnect", value.asInstanceOf[js.Any])
    
    inline def setBeforeConnectUndefined: Self = StObject.set(x, "beforeConnect", js.undefined)
    
    inline def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
    
    inline def setConnectionStringUndefined: Self = StObject.set(x, "connectionString", js.undefined)
    
    inline def setTrustedConnection(value: Boolean): Self = StObject.set(x, "trustedConnection", value.asInstanceOf[js.Any])
    
    inline def setTrustedConnectionUndefined: Self = StObject.set(x, "trustedConnection", js.undefined)
  }
}
