package typings.openfin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installedAppsMod {
  
  trait InstallationInfo extends StObject {
    
    var cachedManifest: Any
  }
  object InstallationInfo {
    
    inline def apply(cachedManifest: Any): InstallationInfo = {
      val __obj = js.Dynamic.literal(cachedManifest = cachedManifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallationInfo]
    }
    
    extension [Self <: InstallationInfo](x: Self) {
      
      inline def setCachedManifest(value: Any): Self = StObject.set(x, "cachedManifest", value.asInstanceOf[js.Any])
    }
  }
  
  type InstalledApps = StringDictionary[InstallationInfo]
}
