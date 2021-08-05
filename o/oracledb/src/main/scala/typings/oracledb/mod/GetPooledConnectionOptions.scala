package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used with pool.getConnection().
  */
trait GetPooledConnectionOptions extends StObject {
  
  /** Password of the specified user. */
  var password: js.UndefOr[String] = js.undefined
  
  /** Optionally set the connection tag. */
  var tag: js.UndefOr[String] = js.undefined
  
  /** Database user to retrieve the connection for. */
  var user: js.UndefOr[String] = js.undefined
}
object GetPooledConnectionOptions {
  
  inline def apply(): GetPooledConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPooledConnectionOptions]
  }
  
  extension [Self <: GetPooledConnectionOptions](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
