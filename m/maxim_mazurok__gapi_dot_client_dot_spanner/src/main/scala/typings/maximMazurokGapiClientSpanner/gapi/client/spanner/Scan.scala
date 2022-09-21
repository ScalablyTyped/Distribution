package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scan extends StObject {
  
  /** Additional information provided by the implementer. */
  var details: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.Scan & TopLevel[Any]
  ] = js.undefined
  
  /** The upper bound for when the scan is defined. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The unique name of the scan, specific to the Database service implementing this interface. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Cloud Key Visualizer scan data. Note, this field is not available to the ListScans method. */
  var scanData: js.UndefOr[ScanData] = js.undefined
  
  /** A range of time (inclusive) for when the scan is defined. The lower bound for when the scan is defined. */
  var startTime: js.UndefOr[String] = js.undefined
}
object Scan {
  
  inline def apply(): Scan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scan]
  }
  
  extension [Self <: Scan](x: Self) {
    
    inline def setDetails(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.Scan & TopLevel[Any]
    ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScanData(value: ScanData): Self = StObject.set(x, "scanData", value.asInstanceOf[js.Any])
    
    inline def setScanDataUndefined: Self = StObject.set(x, "scanData", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
