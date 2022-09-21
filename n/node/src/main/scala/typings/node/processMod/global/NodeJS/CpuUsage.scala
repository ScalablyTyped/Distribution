package typings.node.processMod.global.NodeJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuUsage extends StObject {
  
  var system: Double
  
  var user: Double
}
object CpuUsage {
  
  inline def apply(system: Double, user: Double): CpuUsage = {
    val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuUsage]
  }
  
  extension [Self <: CpuUsage](x: Self) {
    
    inline def setSystem(value: Double): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
