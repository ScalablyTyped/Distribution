package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  /** Estimated fractional progress for `analyzing` step. */
  var analyzed: js.UndefOr[Double] = js.undefined
  
  /** Estimated fractional progress for `encoding` step. */
  var encoded: js.UndefOr[Double] = js.undefined
  
  /** Estimated fractional progress for `notifying` step. */
  var notified: js.UndefOr[Double] = js.undefined
  
  /** Estimated fractional progress for `uploading` step. */
  var uploaded: js.UndefOr[Double] = js.undefined
}
object Progress {
  
  inline def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setAnalyzed(value: Double): Self = StObject.set(x, "analyzed", value.asInstanceOf[js.Any])
    
    inline def setAnalyzedUndefined: Self = StObject.set(x, "analyzed", js.undefined)
    
    inline def setEncoded(value: Double): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    inline def setEncodedUndefined: Self = StObject.set(x, "encoded", js.undefined)
    
    inline def setNotified(value: Double): Self = StObject.set(x, "notified", value.asInstanceOf[js.Any])
    
    inline def setNotifiedUndefined: Self = StObject.set(x, "notified", js.undefined)
    
    inline def setUploaded(value: Double): Self = StObject.set(x, "uploaded", value.asInstanceOf[js.Any])
    
    inline def setUploadedUndefined: Self = StObject.set(x, "uploaded", js.undefined)
  }
}
