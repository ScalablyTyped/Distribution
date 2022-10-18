package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPayload extends StObject {
  
  /**
    * Contains the data passed to the function that triggered the event
    */
  var customPayload: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Array of indices whose selection has been changed (either selected or deselected)
    */
  var indices: js.UndefOr[js.Array[int]] = js.undefined
  
  /**
    * Indicates whether the selection limit has been reached
    */
  var limitReached: js.UndefOr[Boolean] = js.undefined
}
object CustomPayload {
  
  inline def apply(): CustomPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPayload]
  }
  
  extension [Self <: CustomPayload](x: Self) {
    
    inline def setCustomPayload(value: js.Object): Self = StObject.set(x, "customPayload", value.asInstanceOf[js.Any])
    
    inline def setCustomPayloadUndefined: Self = StObject.set(x, "customPayload", js.undefined)
    
    inline def setIndices(value: js.Array[int]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: int*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setLimitReached(value: Boolean): Self = StObject.set(x, "limitReached", value.asInstanceOf[js.Any])
    
    inline def setLimitReachedUndefined: Self = StObject.set(x, "limitReached", js.undefined)
  }
}
