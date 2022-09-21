package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Printer Provider
////////////////////
/**
  * The chrome.printerProvider API exposes events used by print manager to query printers controlled by extensions, to query their capabilities and to submit print jobs to these printers.
  * Permissions:  "printerProvider"
  * @since Chrome 44.
  */
object printerProvider {
  
  type CapabilityRequestedEvent = Event[
    js.Function2[
      /* printerId */ String, 
      /* resultCallback */ js.Function1[/* capabilities */ typings.chrome.chrome.printerProvider.PrinterCapabilities, Unit], 
      Unit
    ]
  ]
  
  trait PrintJob extends StObject {
    
    /** The document content type. Supported formats are "application/pdf" and "image/pwg-raster". */
    var contentType: String
    
    /** Blob containing the document data to print. Format must match |contentType|. */
    var document: Blob
    
    /** ID of the printer which should handle the job. */
    var printerId: String
    
    /** Print ticket in  CJT format. */
    var ticket: js.Object
    
    /** The print job title. */
    var title: String
  }
  object PrintJob {
    
    inline def apply(contentType: String, document: Blob, printerId: String, ticket: js.Object, title: String): PrintJob = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], printerId = printerId.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintJob]
    }
    
    extension [Self <: PrintJob](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: Blob): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setPrinterId(value: String): Self = StObject.set(x, "printerId", value.asInstanceOf[js.Any])
      
      inline def setTicket(value: js.Object): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type PrintRequestedEvent = Event[
    js.Function2[
      /* printJob */ typings.chrome.chrome.printerProvider.PrintJob, 
      /* resultCallback */ js.Function1[/* result */ String, Unit], 
      Unit
    ]
  ]
  
  trait PrinterCapabilities extends StObject {
    
    /** Device capabilities in CDD format. */
    var capabilities: Any
  }
  object PrinterCapabilities {
    
    inline def apply(capabilities: Any): PrinterCapabilities = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrinterCapabilities]
    }
    
    extension [Self <: PrinterCapabilities](x: Self) {
      
      inline def setCapabilities(value: Any): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrinterInfo extends StObject {
    
    /** Optional. Printer's human readable description. */
    var description: js.UndefOr[String] = js.undefined
    
    /** Unique printer ID. */
    var id: String
    
    /** Printer's human readable name. */
    var name: String
  }
  object PrinterInfo {
    
    inline def apply(id: String, name: String): PrinterInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrinterInfo]
    }
    
    extension [Self <: PrinterInfo](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type PrinterInfoRequestedEvent = Event[
    js.Function2[
      /* device */ Any, 
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.UndefOr[typings.chrome.chrome.printerProvider.PrinterInfo], 
        Unit
      ], 
      Unit
    ]
  ]
  
  type PrinterRequestedEvent = Event[
    js.Function1[
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.Array[typings.chrome.chrome.printerProvider.PrinterInfo], 
        Unit
      ], 
      Unit
    ]
  ]
}
