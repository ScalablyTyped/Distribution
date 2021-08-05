package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceTokenCredentialsOptions
  extends StObject
     with LoginWithUsernamePasswordOptions {
  
  /**
    * The user name for account in the form: 'user@example.com'. Default value is 'user@example.com'.
    */
  var username: js.UndefOr[String] = js.undefined
}
object DeviceTokenCredentialsOptions {
  
  inline def apply(): DeviceTokenCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTokenCredentialsOptions]
  }
  
  extension [Self <: DeviceTokenCredentialsOptions](x: Self) {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
