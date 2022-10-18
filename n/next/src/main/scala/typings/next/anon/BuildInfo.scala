package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildInfo extends StObject {
  
  var buildInfo: Any
  
  var resource: String
}
object BuildInfo {
  
  inline def apply(buildInfo: Any, resource: String): BuildInfo = {
    val __obj = js.Dynamic.literal(buildInfo = buildInfo.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildInfo]
  }
  
  extension [Self <: BuildInfo](x: Self) {
    
    inline def setBuildInfo(value: Any): Self = StObject.set(x, "buildInfo", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
