package typings.pino.mod.pino

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiStreamOptions extends StObject {
  
  var dedupe: js.UndefOr[Boolean] = js.undefined
  
  var levels: js.UndefOr[Record[String, Double]] = js.undefined
}
object MultiStreamOptions {
  
  inline def apply(): MultiStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiStreamOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiStreamOptions] (val x: Self) extends AnyVal {
    
    inline def setDedupe(value: Boolean): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
    
    inline def setDedupeUndefined: Self = StObject.set(x, "dedupe", js.undefined)
    
    inline def setLevels(value: Record[String, Double]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
  }
}
