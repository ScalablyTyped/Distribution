package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SenderBatchHeader
  extends StObject
     with PayoutSenderBatchHeader {
  
  var note: js.UndefOr[String] = js.undefined
}
object SenderBatchHeader {
  
  inline def apply(): SenderBatchHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SenderBatchHeader]
  }
  
  extension [Self <: SenderBatchHeader](x: Self) {
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
