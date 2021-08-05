package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  trait GetLogRequestType extends StObject {
    
    var endFile: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var sizeLimit: js.UndefOr[Double] = js.undefined
  }
  object GetLogRequestType {
    
    inline def apply(name: String): GetLogRequestType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLogRequestType]
    }
    
    extension [Self <: GetLogRequestType](x: Self) {
      
      inline def setEndFile(value: String): Self = StObject.set(x, "endFile", value.asInstanceOf[js.Any])
      
      inline def setEndFileUndefined: Self = StObject.set(x, "endFile", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSizeLimit(value: Double): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
      
      inline def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
    }
  }
  
  trait LogInfo extends StObject {
    
    var date: String
    
    var name: String
    
    var size: Double
  }
  object LogInfo {
    
    inline def apply(date: String, name: String, size: Double): LogInfo = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogInfo]
    }
    
    extension [Self <: LogInfo](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.openfinStrings.verbose
    - typings.openfin.openfinStrings.info
    - typings.openfin.openfinStrings.warning
    - typings.openfin.openfinStrings.error
    - typings.openfin.openfinStrings.fatal
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def error: typings.openfin.openfinStrings.error = "error".asInstanceOf[typings.openfin.openfinStrings.error]
    
    inline def fatal: typings.openfin.openfinStrings.fatal = "fatal".asInstanceOf[typings.openfin.openfinStrings.fatal]
    
    inline def info: typings.openfin.openfinStrings.info = "info".asInstanceOf[typings.openfin.openfinStrings.info]
    
    inline def verbose: typings.openfin.openfinStrings.verbose = "verbose".asInstanceOf[typings.openfin.openfinStrings.verbose]
    
    inline def warning: typings.openfin.openfinStrings.warning = "warning".asInstanceOf[typings.openfin.openfinStrings.warning]
  }
}
