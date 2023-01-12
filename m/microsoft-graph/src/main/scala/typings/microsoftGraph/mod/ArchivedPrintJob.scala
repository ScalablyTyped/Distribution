package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchivedPrintJob extends StObject {
  
  // True if the job was acquired by a printer; false otherwise. Read-only.
  var acquiredByPrinter: js.UndefOr[Boolean] = js.undefined
  
  // The dateTimeOffset when the job was acquired by the printer, if any. Read-only.
  var acquiredDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The dateTimeOffset when the job was completed, canceled or aborted. Read-only.
  var completionDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The number of copies that were printed. Read-only.
  var copiesPrinted: js.UndefOr[Double] = js.undefined
  
  // The user who created the print job. Read-only.
  var createdBy: js.UndefOr[NullableOption[UserIdentity]] = js.undefined
  
  // The dateTimeOffset when the job was created. Read-only.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The archived print job's GUID. Read-only.
  var id: js.UndefOr[String] = js.undefined
  
  // The printer ID that the job was queued for. Read-only.
  var printerId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The print job's final processing state. Read-only.
  var processingState: js.UndefOr[PrintJobProcessingState] = js.undefined
}
object ArchivedPrintJob {
  
  inline def apply(): ArchivedPrintJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchivedPrintJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArchivedPrintJob] (val x: Self) extends AnyVal {
    
    inline def setAcquiredByPrinter(value: Boolean): Self = StObject.set(x, "acquiredByPrinter", value.asInstanceOf[js.Any])
    
    inline def setAcquiredByPrinterUndefined: Self = StObject.set(x, "acquiredByPrinter", js.undefined)
    
    inline def setAcquiredDateTime(value: NullableOption[String]): Self = StObject.set(x, "acquiredDateTime", value.asInstanceOf[js.Any])
    
    inline def setAcquiredDateTimeNull: Self = StObject.set(x, "acquiredDateTime", null)
    
    inline def setAcquiredDateTimeUndefined: Self = StObject.set(x, "acquiredDateTime", js.undefined)
    
    inline def setCompletionDateTime(value: NullableOption[String]): Self = StObject.set(x, "completionDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionDateTimeNull: Self = StObject.set(x, "completionDateTime", null)
    
    inline def setCompletionDateTimeUndefined: Self = StObject.set(x, "completionDateTime", js.undefined)
    
    inline def setCopiesPrinted(value: Double): Self = StObject.set(x, "copiesPrinted", value.asInstanceOf[js.Any])
    
    inline def setCopiesPrintedUndefined: Self = StObject.set(x, "copiesPrinted", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[UserIdentity]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPrinterId(value: NullableOption[String]): Self = StObject.set(x, "printerId", value.asInstanceOf[js.Any])
    
    inline def setPrinterIdNull: Self = StObject.set(x, "printerId", null)
    
    inline def setPrinterIdUndefined: Self = StObject.set(x, "printerId", js.undefined)
    
    inline def setProcessingState(value: PrintJobProcessingState): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
    
    inline def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
  }
}
