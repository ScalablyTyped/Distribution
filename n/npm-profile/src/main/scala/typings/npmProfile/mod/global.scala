package typings.npmProfile.mod

import typings.npmProfile.npmProfileStrings.`log `
import typings.npmProfile.npmProfileStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object NodeJS {
    
    trait Process extends StObject {
      
      @JSName("emit")
      def emit_log(event: log, logLevel: LogLevel, any: String*): Boolean
      
      @JSName("on")
      def on_log(event: `log `, listener: js.Function1[/* logLevel */ LogLevel, Unit]): this.type
    }
    object Process {
      
      inline def apply(
        emit: (log, LogLevel, /* repeated */ String) => Boolean,
        on: (`log `, js.Function1[/* logLevel */ LogLevel, Unit]) => Process
      ): Process = {
        val __obj = js.Dynamic.literal(emit = js.Any.fromFunction3(emit), on = js.Any.fromFunction2(on))
        __obj.asInstanceOf[Process]
      }
      
      extension [Self <: Process](x: Self) {
        
        inline def setEmit(value: (log, LogLevel, /* repeated */ String) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction3(value))
        
        inline def setOn(value: (`log `, js.Function1[/* logLevel */ LogLevel, Unit]) => Process): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      }
    }
  }
}
