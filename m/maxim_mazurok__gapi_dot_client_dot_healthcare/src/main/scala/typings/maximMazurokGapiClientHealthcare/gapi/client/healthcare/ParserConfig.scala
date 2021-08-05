package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserConfig extends StObject {
  
  /** Determines whether messages with no header are allowed. */
  var allowNullHeader: js.UndefOr[Boolean] = js.undefined
  
  /** Byte(s) to use as the segment terminator. If this is unset, '\r' is used as segment terminator. */
  var segmentTerminator: js.UndefOr[String] = js.undefined
}
object ParserConfig {
  
  inline def apply(): ParserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserConfig]
  }
  
  extension [Self <: ParserConfig](x: Self) {
    
    inline def setAllowNullHeader(value: Boolean): Self = StObject.set(x, "allowNullHeader", value.asInstanceOf[js.Any])
    
    inline def setAllowNullHeaderUndefined: Self = StObject.set(x, "allowNullHeader", js.undefined)
    
    inline def setSegmentTerminator(value: String): Self = StObject.set(x, "segmentTerminator", value.asInstanceOf[js.Any])
    
    inline def setSegmentTerminatorUndefined: Self = StObject.set(x, "segmentTerminator", js.undefined)
  }
}
