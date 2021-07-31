package typings.openfin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installedAppsMod {
  
  trait InstallationInfo extends StObject {
    
    var cachedManifest: js.Any
  }
  object InstallationInfo {
    
    @scala.inline
    def apply(cachedManifest: js.Any): InstallationInfo = {
      val __obj = js.Dynamic.literal(cachedManifest = cachedManifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallationInfo]
    }
    
    @scala.inline
    implicit class InstallationInfoMutableBuilder[Self <: InstallationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCachedManifest(value: js.Any): Self = StObject.set(x, "cachedManifest", value.asInstanceOf[js.Any])
    }
  }
  
  type InstalledApps = StringDictionary[InstallationInfo]
}
