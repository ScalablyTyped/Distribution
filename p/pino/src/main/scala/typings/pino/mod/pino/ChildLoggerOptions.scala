package typings.pino.mod.pino

import org.scalablytyped.runtime.StringDictionary
import typings.pino.anon.Log
import typings.pino.mod.redactOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildLoggerOptions extends StObject {
  
  var customLevels: js.UndefOr[StringDictionary[Double]] = js.undefined
  
  var formatters: js.UndefOr[Log] = js.undefined
  
  var level: js.UndefOr[Level | String] = js.undefined
  
  var redact: js.UndefOr[js.Array[String] | redactOptions] = js.undefined
  
  var serializers: js.UndefOr[StringDictionary[SerializerFn]] = js.undefined
}
object ChildLoggerOptions {
  
  inline def apply(): ChildLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildLoggerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildLoggerOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomLevels(value: StringDictionary[Double]): Self = StObject.set(x, "customLevels", value.asInstanceOf[js.Any])
    
    inline def setCustomLevelsUndefined: Self = StObject.set(x, "customLevels", js.undefined)
    
    inline def setFormatters(value: Log): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
    
    inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
    
    inline def setLevel(value: Level | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setRedact(value: js.Array[String] | redactOptions): Self = StObject.set(x, "redact", value.asInstanceOf[js.Any])
    
    inline def setRedactUndefined: Self = StObject.set(x, "redact", js.undefined)
    
    inline def setRedactVarargs(value: String*): Self = StObject.set(x, "redact", js.Array(value*))
    
    inline def setSerializers(value: StringDictionary[SerializerFn]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
    
    inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
  }
}
