package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchExternal extends StObject {
  
  var launchExternal: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object LaunchExternal {
  
  inline def apply(): LaunchExternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchExternal]
  }
  
  extension [Self <: LaunchExternal](x: Self) {
    
    inline def setLaunchExternal(value: Boolean): Self = StObject.set(x, "launchExternal", value.asInstanceOf[js.Any])
    
    inline def setLaunchExternalUndefined: Self = StObject.set(x, "launchExternal", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
