package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoboStartingIntent extends StObject {
  
  /** An intent that starts the main launcher activity. */
  var launcherActivity: js.UndefOr[js.Any] = js.undefined
  
  /** An intent that starts an activity with specific details. */
  var startActivity: js.UndefOr[StartActivityIntent] = js.undefined
  
  /** Timeout in seconds for each intent. */
  var timeout: js.UndefOr[String] = js.undefined
}
object RoboStartingIntent {
  
  inline def apply(): RoboStartingIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoboStartingIntent]
  }
  
  extension [Self <: RoboStartingIntent](x: Self) {
    
    inline def setLauncherActivity(value: js.Any): Self = StObject.set(x, "launcherActivity", value.asInstanceOf[js.Any])
    
    inline def setLauncherActivityUndefined: Self = StObject.set(x, "launcherActivity", js.undefined)
    
    inline def setStartActivity(value: StartActivityIntent): Self = StObject.set(x, "startActivity", value.asInstanceOf[js.Any])
    
    inline def setStartActivityUndefined: Self = StObject.set(x, "startActivity", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
