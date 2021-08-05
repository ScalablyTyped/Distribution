package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMediaSession extends StObject {
  
  def getMediaSession(): GetEstimatedTime
}
object GetMediaSession {
  
  inline def apply(getMediaSession: () => GetEstimatedTime): GetMediaSession = {
    val __obj = js.Dynamic.literal(getMediaSession = js.Any.fromFunction0(getMediaSession))
    __obj.asInstanceOf[GetMediaSession]
  }
  
  extension [Self <: GetMediaSession](x: Self) {
    
    inline def setGetMediaSession(value: () => GetEstimatedTime): Self = StObject.set(x, "getMediaSession", js.Any.fromFunction0(value))
  }
}
