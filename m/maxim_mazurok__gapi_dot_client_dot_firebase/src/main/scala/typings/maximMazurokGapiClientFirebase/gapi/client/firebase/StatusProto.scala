package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusProto extends StObject {
  
  /** The canonical error code (see codes.proto) that most closely corresponds to this status. May be missing. */
  var canonicalCode: js.UndefOr[Double] = js.native
  
  /** Numeric code drawn from the space specified below. Often, this is the canonical error space, and code is drawn from google3/util/task/codes.proto */
  var code: js.UndefOr[Double] = js.native
  
  /** Detail message */
  var message: js.UndefOr[String] = js.native
  
  /** message_set associates an arbitrary proto message with the status. */
  var messageSet: js.UndefOr[js.Any] = js.native
  
  /** The following are usually only present when code != 0 Space to which this status belongs */
  var space: js.UndefOr[String] = js.native
}
object StatusProto {
  
  @scala.inline
  def apply(): StatusProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusProto]
  }
  
  @scala.inline
  implicit class StatusProtoMutableBuilder[Self <: StatusProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonicalCode(value: Double): Self = StObject.set(x, "canonicalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalCodeUndefined: Self = StObject.set(x, "canonicalCode", js.undefined)
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageSet(value: js.Any): Self = StObject.set(x, "messageSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageSetUndefined: Self = StObject.set(x, "messageSet", js.undefined)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
  }
}
