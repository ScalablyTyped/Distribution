package typings.mongodb.anon

import typings.mongodb.mod.AutoEncryptionLoggerLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  /** An optional hook to catch logging messages from the underlying encryption engine */
  var logger: js.UndefOr[js.Function2[/* level */ AutoEncryptionLoggerLevel, /* message */ String, Unit]] = js.undefined
}
object Logger {
  
  inline def apply(): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    inline def setLogger(value: (/* level */ AutoEncryptionLoggerLevel, /* message */ String) => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction2(value))
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
