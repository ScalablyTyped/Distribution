package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceTokenCredentialsOptions extends LoginWithUsernamePasswordOptions {
  
  /**
    * The user name for account in the form: 'user@example.com'. Default value is 'user@example.com'.
    */
  var username: js.UndefOr[String] = js.native
}
object DeviceTokenCredentialsOptions {
  
  @scala.inline
  def apply(): DeviceTokenCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTokenCredentialsOptions]
  }
  
  @scala.inline
  implicit class DeviceTokenCredentialsOptionsMutableBuilder[Self <: DeviceTokenCredentialsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
