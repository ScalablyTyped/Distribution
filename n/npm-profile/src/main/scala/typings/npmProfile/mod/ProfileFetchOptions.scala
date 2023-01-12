package typings.npmProfile.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileFetchOptions extends StObject {
  
  /** passed through to prompter */
  var creds: js.UndefOr[ProfileCredentials] = js.undefined
  
  /**
    * the hostname of the current machine, to show the user during the WebAuth flow.
    * @default os.hostname()
    */
  var hostname: js.UndefOr[String] = js.undefined
}
object ProfileFetchOptions {
  
  inline def apply(): ProfileFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileFetchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfileFetchOptions] (val x: Self) extends AnyVal {
    
    inline def setCreds(value: ProfileCredentials): Self = StObject.set(x, "creds", value.asInstanceOf[js.Any])
    
    inline def setCredsUndefined: Self = StObject.set(x, "creds", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
  }
}
