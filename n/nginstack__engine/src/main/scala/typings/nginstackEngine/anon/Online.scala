package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Online extends StObject {
  
  var dryRun: Boolean
  
  var online: Boolean
}
object Online {
  
  inline def apply(dryRun: Boolean, online: Boolean): Online = {
    val __obj = js.Dynamic.literal(dryRun = dryRun.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[Online]
  }
  
  extension [Self <: Online](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
  }
}
