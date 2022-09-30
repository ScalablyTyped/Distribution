package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamDescriptionOptions extends StObject {
  
  var compressors: js.UndefOr[js.Array[CompressorName]] = js.undefined
  
  var loadBalanced: Boolean
  
  var logicalSessionTimeoutMinutes: js.UndefOr[scala.Double] = js.undefined
}
object StreamDescriptionOptions {
  
  inline def apply(loadBalanced: Boolean): StreamDescriptionOptions = {
    val __obj = js.Dynamic.literal(loadBalanced = loadBalanced.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamDescriptionOptions]
  }
  
  extension [Self <: StreamDescriptionOptions](x: Self) {
    
    inline def setCompressors(value: js.Array[CompressorName]): Self = StObject.set(x, "compressors", value.asInstanceOf[js.Any])
    
    inline def setCompressorsUndefined: Self = StObject.set(x, "compressors", js.undefined)
    
    inline def setCompressorsVarargs(value: CompressorName*): Self = StObject.set(x, "compressors", js.Array(value*))
    
    inline def setLoadBalanced(value: Boolean): Self = StObject.set(x, "loadBalanced", value.asInstanceOf[js.Any])
    
    inline def setLogicalSessionTimeoutMinutes(value: scala.Double): Self = StObject.set(x, "logicalSessionTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setLogicalSessionTimeoutMinutesUndefined: Self = StObject.set(x, "logicalSessionTimeoutMinutes", js.undefined)
  }
}
