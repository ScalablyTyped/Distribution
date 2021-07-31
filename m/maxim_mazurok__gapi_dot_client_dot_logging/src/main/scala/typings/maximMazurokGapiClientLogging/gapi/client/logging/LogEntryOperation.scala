package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogEntryOperation extends StObject {
  
  /** Optional. Set this to True if this is the first log entry in the operation. */
  var first: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. An arbitrary operation identifier. Log entries with the same identifier are assumed to be part of the same operation. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Optional. Set this to True if this is the last log entry in the operation. */
  var last: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. An arbitrary producer identifier. The combination of id and producer must be globally unique. Examples for producer: "MyDivision.MyBigCompany.com",
    * "github.com/MyProject/MyApplication".
    */
  var producer: js.UndefOr[String] = js.undefined
}
object LogEntryOperation {
  
  @scala.inline
  def apply(): LogEntryOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntryOperation]
  }
  
  @scala.inline
  implicit class LogEntryOperationMutableBuilder[Self <: LogEntryOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setProducer(value: String): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
  }
}
