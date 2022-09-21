package typings.nats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  lastMsgID :string,   streamName :string,   lastSequence :number,   lastSubjectSequence :number}> */
trait PartiallastMsgIDstringstr extends StObject {
  
  var lastMsgID: js.UndefOr[String] = js.undefined
  
  var lastSequence: js.UndefOr[Double] = js.undefined
  
  var lastSubjectSequence: js.UndefOr[Double] = js.undefined
  
  var streamName: js.UndefOr[String] = js.undefined
}
object PartiallastMsgIDstringstr {
  
  inline def apply(): PartiallastMsgIDstringstr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallastMsgIDstringstr]
  }
  
  extension [Self <: PartiallastMsgIDstringstr](x: Self) {
    
    inline def setLastMsgID(value: String): Self = StObject.set(x, "lastMsgID", value.asInstanceOf[js.Any])
    
    inline def setLastMsgIDUndefined: Self = StObject.set(x, "lastMsgID", js.undefined)
    
    inline def setLastSequence(value: Double): Self = StObject.set(x, "lastSequence", value.asInstanceOf[js.Any])
    
    inline def setLastSequenceUndefined: Self = StObject.set(x, "lastSequence", js.undefined)
    
    inline def setLastSubjectSequence(value: Double): Self = StObject.set(x, "lastSubjectSequence", value.asInstanceOf[js.Any])
    
    inline def setLastSubjectSequenceUndefined: Self = StObject.set(x, "lastSubjectSequence", js.undefined)
    
    inline def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
  }
}
