package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CdnSettings extends StObject {
  
  /** The format of the video stream that you are sending to Youtube. */
  var format: js.UndefOr[String] = js.undefined
  
  /** The frame rate of the inbound video data. */
  var frameRate: js.UndefOr[String] = js.undefined
  
  /** The ingestionInfo object contains information that YouTube provides that you need to transmit your RTMP or HTTP stream to YouTube. */
  var ingestionInfo: js.UndefOr[IngestionInfo] = js.undefined
  
  /** The method or protocol used to transmit the video stream. */
  var ingestionType: js.UndefOr[String] = js.undefined
  
  /** The resolution of the inbound video data. */
  var resolution: js.UndefOr[String] = js.undefined
}
object CdnSettings {
  
  inline def apply(): CdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CdnSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CdnSettings] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFrameRate(value: String): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setIngestionInfo(value: IngestionInfo): Self = StObject.set(x, "ingestionInfo", value.asInstanceOf[js.Any])
    
    inline def setIngestionInfoUndefined: Self = StObject.set(x, "ingestionInfo", js.undefined)
    
    inline def setIngestionType(value: String): Self = StObject.set(x, "ingestionType", value.asInstanceOf[js.Any])
    
    inline def setIngestionTypeUndefined: Self = StObject.set(x, "ingestionType", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}
