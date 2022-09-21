package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintJobStatus extends StObject {
  
  // A human-readable description of the print job's current processing state. Read-only.
  var description: js.UndefOr[String] = js.undefined
  
  // Additional details for print job state. Valid values are described in the following table. Read-only.
  var details: js.UndefOr[js.Array[PrintJobStateDetail]] = js.undefined
  
  // True if the job was acknowledged by a printer; false otherwise. Read-only.
  var isAcquiredByPrinter: js.UndefOr[Boolean] = js.undefined
  
  // The print job's current processing state. Valid values are described in the following table. Read-only.
  var state: js.UndefOr[PrintJobProcessingState] = js.undefined
}
object PrintJobStatus {
  
  inline def apply(): PrintJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintJobStatus]
  }
  
  extension [Self <: PrintJobStatus](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetails(value: js.Array[PrintJobStateDetail]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: PrintJobStateDetail*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setIsAcquiredByPrinter(value: Boolean): Self = StObject.set(x, "isAcquiredByPrinter", value.asInstanceOf[js.Any])
    
    inline def setIsAcquiredByPrinterUndefined: Self = StObject.set(x, "isAcquiredByPrinter", js.undefined)
    
    inline def setState(value: PrintJobProcessingState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
