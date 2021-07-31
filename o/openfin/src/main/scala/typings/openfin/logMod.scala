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
    
    @scala.inline
    def apply(name: String): GetLogRequestType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLogRequestType]
    }
    
    @scala.inline
    implicit class GetLogRequestTypeMutableBuilder[Self <: GetLogRequestType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndFile(value: String): Self = StObject.set(x, "endFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFileUndefined: Self = StObject.set(x, "endFile", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeLimit(value: Double): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
    }
  }
  
  trait LogInfo extends StObject {
    
    var date: String
    
    var name: String
    
    var size: Double
  }
  object LogInfo {
    
    @scala.inline
    def apply(date: String, name: String, size: Double): LogInfo = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogInfo]
    }
    
    @scala.inline
    implicit class LogInfoMutableBuilder[Self <: LogInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def error: typings.openfin.openfinStrings.error = "error".asInstanceOf[typings.openfin.openfinStrings.error]
    
    @scala.inline
    def fatal: typings.openfin.openfinStrings.fatal = "fatal".asInstanceOf[typings.openfin.openfinStrings.fatal]
    
    @scala.inline
    def info: typings.openfin.openfinStrings.info = "info".asInstanceOf[typings.openfin.openfinStrings.info]
    
    @scala.inline
    def verbose: typings.openfin.openfinStrings.verbose = "verbose".asInstanceOf[typings.openfin.openfinStrings.verbose]
    
    @scala.inline
    def warning: typings.openfin.openfinStrings.warning = "warning".asInstanceOf[typings.openfin.openfinStrings.warning]
  }
}
