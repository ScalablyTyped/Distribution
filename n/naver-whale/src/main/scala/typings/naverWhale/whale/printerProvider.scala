package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait PrintJob extends StObject {
    
    /** The document content type. Supported formats are "application/pdf" and "image/pwg-raster". */
    var contentType: String = js.native
    
    /** Blob containing the document data to print. Format must match |contentType|. */
    var document: Blob = js.native
    
    /** ID of the printer which should handle the job. */
    var printerId: String = js.native
    
    /** Print ticket in  CJT format. */
    var ticket: js.Object = js.native
    
    /** The print job title. */
    var title: String = js.native
  }
  object PrintJob {
    
    @scala.inline
    def apply(contentType: String, document: Blob, printerId: String, ticket: js.Object, title: String): PrintJob = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], printerId = printerId.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintJob]
    }
    
    @scala.inline
    implicit class PrintJobMutableBuilder[Self <: PrintJob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocument(value: Blob): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrinterId(value: String): Self = StObject.set(x, "printerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicket(value: js.Object): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type PrintRequestedEvent = Event[
    js.Function2[
      /* printJob */ typings.chrome.chrome.printerProvider.PrintJob, 
      /* resultCallback */ js.Function1[/* result */ String, Unit], 
      Unit
    ]
  ]
  
  @js.native
  trait PrinterCapabilities extends StObject {
    
    /** Device capabilities in CDD format. */
    var capabilities: js.Any = js.native
  }
  object PrinterCapabilities {
    
    @scala.inline
    def apply(capabilities: js.Any): PrinterCapabilities = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrinterCapabilities]
    }
    
    @scala.inline
    implicit class PrinterCapabilitiesMutableBuilder[Self <: PrinterCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapabilities(value: js.Any): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrinterInfo extends StObject {
    
    /** Optional. Printer's human readable description. */
    var description: js.UndefOr[String] = js.native
    
    /** Unique printer ID. */
    var id: String = js.native
    
    /** Printer's human readable name. */
    var name: String = js.native
  }
  object PrinterInfo {
    
    @scala.inline
    def apply(id: String, name: String): PrinterInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrinterInfo]
    }
    
    @scala.inline
    implicit class PrinterInfoMutableBuilder[Self <: PrinterInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type PrinterInfoRequestedEvent = Event[
    js.Function2[
      /* device */ js.Any, 
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
