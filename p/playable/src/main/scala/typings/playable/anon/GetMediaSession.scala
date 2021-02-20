package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMediaSession extends StObject {
  
  def getMediaSession(): GetEstimatedTime = js.native
}
object GetMediaSession {
  
  @scala.inline
  def apply(getMediaSession: () => GetEstimatedTime): GetMediaSession = {
    val __obj = js.Dynamic.literal(getMediaSession = js.Any.fromFunction0(getMediaSession))
    __obj.asInstanceOf[GetMediaSession]
  }
  
  @scala.inline
  implicit class GetMediaSessionMutableBuilder[Self <: GetMediaSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMediaSession(value: () => GetEstimatedTime): Self = StObject.set(x, "getMediaSession", js.Any.fromFunction0(value))
  }
}
