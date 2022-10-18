package typings.node.anon

import typings.node.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  encoding :null | undefined,   flag :string | undefined} & node.node:events.Abortable */
trait encodingnullundefinedflagEncoding extends StObject {
  
  var encoding: js.UndefOr[Null] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
  
  /**
    * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object encodingnullundefinedflagEncoding {
  
  inline def apply(): encodingnullundefinedflagEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[encodingnullundefinedflagEncoding]
  }
  
  extension [Self <: encodingnullundefinedflagEncoding](x: Self) {
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
