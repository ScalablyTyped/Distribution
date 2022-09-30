package typings.meteor.anon

import typings.meteor.meteorStrings.debug
import typings.meteor.meteorStrings.error
import typings.meteor.meteorStrings.info
import typings.meteor.meteorStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLoggerLevel extends StObject {
  
  val DEBUG: typings.meteor.meteorStrings.debug
  
  val ERROR: typings.meteor.meteorStrings.error
  
  val INFO: typings.meteor.meteorStrings.info
  
  val WARN: typings.meteor.meteorStrings.warn
  
  val debug: typings.meteor.meteorStrings.debug
  
  val error: typings.meteor.meteorStrings.error
  
  val info: typings.meteor.meteorStrings.info
  
  val warn: typings.meteor.meteorStrings.warn
}
object TypeofLoggerLevel {
  
  inline def apply(): TypeofLoggerLevel = {
    val __obj = js.Dynamic.literal(DEBUG = "debug", ERROR = "error", INFO = "info", WARN = "warn", debug = "debug", error = "error", info = "info", warn = "warn")
    __obj.asInstanceOf[TypeofLoggerLevel]
  }
  
  extension [Self <: TypeofLoggerLevel](x: Self) {
    
    inline def setDEBUG(value: debug): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setINFO(value: info): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    inline def setWARN(value: warn): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
  }
}
