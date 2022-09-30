package typings.meteor.anon

import typings.meteor.meteorStrings.all
import typings.meteor.meteorStrings.off
import typings.meteor.meteorStrings.slow_only
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofProfilingLevel extends StObject {
  
  val all: typings.meteor.meteorStrings.all
  
  val off: typings.meteor.meteorStrings.off
  
  val slowOnly: slow_only
}
object TypeofProfilingLevel {
  
  inline def apply(): TypeofProfilingLevel = {
    val __obj = js.Dynamic.literal(all = "all", off = "off", slowOnly = "slow_only")
    __obj.asInstanceOf[TypeofProfilingLevel]
  }
  
  extension [Self <: TypeofProfilingLevel](x: Self) {
    
    inline def setAll(value: all): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setOff(value: off): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
    
    inline def setSlowOnly(value: slow_only): Self = StObject.set(x, "slowOnly", value.asInstanceOf[js.Any])
  }
}
