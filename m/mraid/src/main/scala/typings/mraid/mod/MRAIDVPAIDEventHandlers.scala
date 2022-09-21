package typings.mraid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRAIDVPAIDEventHandlers extends StObject {
  
  def AdClickThru(url: String, id: String, playerHandles: Boolean): Unit
  
  def AdError(message: String): Unit
  
  def AdImpression(): Unit
  
  def AdPaused(): Unit
  
  def AdPlaying(): Unit
  
  def AdVideoComplete(): Unit
  
  def AdVideoFirstQuartile(): Unit
  
  def AdVideoMidpoint(): Unit
  
  def AdVideoStart(): Unit
  
  def AdVideoThirdQuartile(): Unit
}
object MRAIDVPAIDEventHandlers {
  
  inline def apply(
    AdClickThru: (String, String, Boolean) => Unit,
    AdError: String => Unit,
    AdImpression: () => Unit,
    AdPaused: () => Unit,
    AdPlaying: () => Unit,
    AdVideoComplete: () => Unit,
    AdVideoFirstQuartile: () => Unit,
    AdVideoMidpoint: () => Unit,
    AdVideoStart: () => Unit,
    AdVideoThirdQuartile: () => Unit
  ): MRAIDVPAIDEventHandlers = {
    val __obj = js.Dynamic.literal(AdClickThru = js.Any.fromFunction3(AdClickThru), AdError = js.Any.fromFunction1(AdError), AdImpression = js.Any.fromFunction0(AdImpression), AdPaused = js.Any.fromFunction0(AdPaused), AdPlaying = js.Any.fromFunction0(AdPlaying), AdVideoComplete = js.Any.fromFunction0(AdVideoComplete), AdVideoFirstQuartile = js.Any.fromFunction0(AdVideoFirstQuartile), AdVideoMidpoint = js.Any.fromFunction0(AdVideoMidpoint), AdVideoStart = js.Any.fromFunction0(AdVideoStart), AdVideoThirdQuartile = js.Any.fromFunction0(AdVideoThirdQuartile))
    __obj.asInstanceOf[MRAIDVPAIDEventHandlers]
  }
  
  extension [Self <: MRAIDVPAIDEventHandlers](x: Self) {
    
    inline def setAdClickThru(value: (String, String, Boolean) => Unit): Self = StObject.set(x, "AdClickThru", js.Any.fromFunction3(value))
    
    inline def setAdError(value: String => Unit): Self = StObject.set(x, "AdError", js.Any.fromFunction1(value))
    
    inline def setAdImpression(value: () => Unit): Self = StObject.set(x, "AdImpression", js.Any.fromFunction0(value))
    
    inline def setAdPaused(value: () => Unit): Self = StObject.set(x, "AdPaused", js.Any.fromFunction0(value))
    
    inline def setAdPlaying(value: () => Unit): Self = StObject.set(x, "AdPlaying", js.Any.fromFunction0(value))
    
    inline def setAdVideoComplete(value: () => Unit): Self = StObject.set(x, "AdVideoComplete", js.Any.fromFunction0(value))
    
    inline def setAdVideoFirstQuartile(value: () => Unit): Self = StObject.set(x, "AdVideoFirstQuartile", js.Any.fromFunction0(value))
    
    inline def setAdVideoMidpoint(value: () => Unit): Self = StObject.set(x, "AdVideoMidpoint", js.Any.fromFunction0(value))
    
    inline def setAdVideoStart(value: () => Unit): Self = StObject.set(x, "AdVideoStart", js.Any.fromFunction0(value))
    
    inline def setAdVideoThirdQuartile(value: () => Unit): Self = StObject.set(x, "AdVideoThirdQuartile", js.Any.fromFunction0(value))
  }
}
