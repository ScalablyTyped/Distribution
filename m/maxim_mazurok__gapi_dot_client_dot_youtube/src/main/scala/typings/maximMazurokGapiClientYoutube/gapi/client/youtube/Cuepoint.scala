package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cuepoint extends StObject {
  
  var cueType: js.UndefOr[String] = js.undefined
  
  /** The duration of this cuepoint. */
  var durationSecs: js.UndefOr[Double] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  /** The identifier for cuepoint resource. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The time when the cuepoint should be inserted by offset to the broadcast actual start time. */
  var insertionOffsetTimeMs: js.UndefOr[String] = js.undefined
  
  /** The wall clock time at which the cuepoint should be inserted. Only one of insertion_offset_time_ms and walltime_ms may be set at a time. */
  var walltimeMs: js.UndefOr[String] = js.undefined
}
object Cuepoint {
  
  inline def apply(): Cuepoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cuepoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cuepoint] (val x: Self) extends AnyVal {
    
    inline def setCueType(value: String): Self = StObject.set(x, "cueType", value.asInstanceOf[js.Any])
    
    inline def setCueTypeUndefined: Self = StObject.set(x, "cueType", js.undefined)
    
    inline def setDurationSecs(value: Double): Self = StObject.set(x, "durationSecs", value.asInstanceOf[js.Any])
    
    inline def setDurationSecsUndefined: Self = StObject.set(x, "durationSecs", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInsertionOffsetTimeMs(value: String): Self = StObject.set(x, "insertionOffsetTimeMs", value.asInstanceOf[js.Any])
    
    inline def setInsertionOffsetTimeMsUndefined: Self = StObject.set(x, "insertionOffsetTimeMs", js.undefined)
    
    inline def setWalltimeMs(value: String): Self = StObject.set(x, "walltimeMs", value.asInstanceOf[js.Any])
    
    inline def setWalltimeMsUndefined: Self = StObject.set(x, "walltimeMs", js.undefined)
  }
}
