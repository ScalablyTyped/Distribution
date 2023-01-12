package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusProto extends StObject {
  
  /** The canonical error code (see codes.proto) that most closely corresponds to this status. May be missing. */
  var canonicalCode: js.UndefOr[Double] = js.undefined
  
  /** Numeric code drawn from the space specified below. Often, this is the canonical error space, and code is drawn from google3/util/task/codes.proto */
  var code: js.UndefOr[Double] = js.undefined
  
  /** Detail message */
  var message: js.UndefOr[String] = js.undefined
  
  /** message_set associates an arbitrary proto message with the status. */
  var messageSet: js.UndefOr[Any] = js.undefined
  
  /** The following are usually only present when code != 0 Space to which this status belongs */
  var space: js.UndefOr[String] = js.undefined
}
object StatusProto {
  
  inline def apply(): StatusProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusProto] (val x: Self) extends AnyVal {
    
    inline def setCanonicalCode(value: Double): Self = StObject.set(x, "canonicalCode", value.asInstanceOf[js.Any])
    
    inline def setCanonicalCodeUndefined: Self = StObject.set(x, "canonicalCode", js.undefined)
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageSet(value: Any): Self = StObject.set(x, "messageSet", value.asInstanceOf[js.Any])
    
    inline def setMessageSetUndefined: Self = StObject.set(x, "messageSet", js.undefined)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
  }
}
