package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportStats extends StObject {
  
  /** The number of documents already processed by the export. */
  var exportedArtifactCount: js.UndefOr[String] = js.undefined
  
  /** The size of export in bytes. */
  var sizeInBytes: js.UndefOr[String] = js.undefined
  
  /** The number of documents to be exported. */
  var totalArtifactCount: js.UndefOr[String] = js.undefined
}
object ExportStats {
  
  inline def apply(): ExportStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportStats]
  }
  
  extension [Self <: ExportStats](x: Self) {
    
    inline def setExportedArtifactCount(value: String): Self = StObject.set(x, "exportedArtifactCount", value.asInstanceOf[js.Any])
    
    inline def setExportedArtifactCountUndefined: Self = StObject.set(x, "exportedArtifactCount", js.undefined)
    
    inline def setSizeInBytes(value: String): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesUndefined: Self = StObject.set(x, "sizeInBytes", js.undefined)
    
    inline def setTotalArtifactCount(value: String): Self = StObject.set(x, "totalArtifactCount", value.asInstanceOf[js.Any])
    
    inline def setTotalArtifactCountUndefined: Self = StObject.set(x, "totalArtifactCount", js.undefined)
  }
}
