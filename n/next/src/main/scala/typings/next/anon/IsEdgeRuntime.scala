package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEdgeRuntime extends StObject {
  
  var appDirEnabled: Boolean
  
  var dev: Boolean
  
  var isEdgeRuntime: Boolean
}
object IsEdgeRuntime {
  
  inline def apply(appDirEnabled: Boolean, dev: Boolean, isEdgeRuntime: Boolean): IsEdgeRuntime = {
    val __obj = js.Dynamic.literal(appDirEnabled = appDirEnabled.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], isEdgeRuntime = isEdgeRuntime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEdgeRuntime]
  }
  
  extension [Self <: IsEdgeRuntime](x: Self) {
    
    inline def setAppDirEnabled(value: Boolean): Self = StObject.set(x, "appDirEnabled", value.asInstanceOf[js.Any])
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setIsEdgeRuntime(value: Boolean): Self = StObject.set(x, "isEdgeRuntime", value.asInstanceOf[js.Any])
  }
}
