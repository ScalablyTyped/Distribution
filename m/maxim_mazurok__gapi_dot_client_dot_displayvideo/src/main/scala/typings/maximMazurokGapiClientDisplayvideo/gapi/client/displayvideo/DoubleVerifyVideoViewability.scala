package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleVerifyVideoViewability extends StObject {
  
  /** Target inventory to maximize impressions with 400x300 or greater player size. */
  var playerImpressionRate: js.UndefOr[String] = js.undefined
  
  /** Target web inventory to maximize IAB viewable rate. */
  var videoIab: js.UndefOr[String] = js.undefined
  
  /** Target web inventory to maximize fully viewable rate. */
  var videoViewableRate: js.UndefOr[String] = js.undefined
}
object DoubleVerifyVideoViewability {
  
  inline def apply(): DoubleVerifyVideoViewability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerifyVideoViewability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleVerifyVideoViewability] (val x: Self) extends AnyVal {
    
    inline def setPlayerImpressionRate(value: String): Self = StObject.set(x, "playerImpressionRate", value.asInstanceOf[js.Any])
    
    inline def setPlayerImpressionRateUndefined: Self = StObject.set(x, "playerImpressionRate", js.undefined)
    
    inline def setVideoIab(value: String): Self = StObject.set(x, "videoIab", value.asInstanceOf[js.Any])
    
    inline def setVideoIabUndefined: Self = StObject.set(x, "videoIab", js.undefined)
    
    inline def setVideoViewableRate(value: String): Self = StObject.set(x, "videoViewableRate", value.asInstanceOf[js.Any])
    
    inline def setVideoViewableRateUndefined: Self = StObject.set(x, "videoViewableRate", js.undefined)
  }
}
