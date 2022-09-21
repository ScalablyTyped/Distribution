package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterBase
  extends StObject
     with Entity {
  
  // The capabilities of the printer/printerShare.
  var capabilities: js.UndefOr[NullableOption[PrinterCapabilities]] = js.undefined
  
  // The default print settings of printer/printerShare.
  var defaults: js.UndefOr[NullableOption[PrinterDefaults]] = js.undefined
  
  // The name of the printer/printerShare.
  var displayName: js.UndefOr[String] = js.undefined
  
  // Whether the printer/printerShare is currently accepting new print jobs.
  var isAcceptingJobs: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The list of jobs that are queued for printing by the printer/printerShare.
  var jobs: js.UndefOr[NullableOption[js.Array[PrintJob]]] = js.undefined
  
  // The physical and/or organizational location of the printer/printerShare.
  var location: js.UndefOr[NullableOption[PrinterLocation]] = js.undefined
  
  // The manufacturer of the printer/printerShare.
  var manufacturer: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The model name of the printer/printerShare.
  var model: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The processing status of the printer/printerShare, including any errors.
  var status: js.UndefOr[PrinterStatus] = js.undefined
}
object PrinterBase {
  
  inline def apply(): PrinterBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterBase]
  }
  
  extension [Self <: PrinterBase](x: Self) {
    
    inline def setCapabilities(value: NullableOption[PrinterCapabilities]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesNull: Self = StObject.set(x, "capabilities", null)
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setDefaults(value: NullableOption[PrinterDefaults]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsNull: Self = StObject.set(x, "defaults", null)
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsAcceptingJobs(value: NullableOption[Boolean]): Self = StObject.set(x, "isAcceptingJobs", value.asInstanceOf[js.Any])
    
    inline def setIsAcceptingJobsNull: Self = StObject.set(x, "isAcceptingJobs", null)
    
    inline def setIsAcceptingJobsUndefined: Self = StObject.set(x, "isAcceptingJobs", js.undefined)
    
    inline def setJobs(value: NullableOption[js.Array[PrintJob]]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsNull: Self = StObject.set(x, "jobs", null)
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: PrintJob*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setLocation(value: NullableOption[PrinterLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setManufacturer(value: NullableOption[String]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModel(value: NullableOption[String]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setStatus(value: PrinterStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
