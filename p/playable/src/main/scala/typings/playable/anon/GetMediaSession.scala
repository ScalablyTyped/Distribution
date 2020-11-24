package typings.playable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMediaSession extends js.Object {
  
  def getMediaSession(): GetEstimatedTime = js.native
}
object GetMediaSession {
  
  @scala.inline
  def apply(getMediaSession: () => GetEstimatedTime): GetMediaSession = {
    val __obj = js.Dynamic.literal(getMediaSession = js.Any.fromFunction0(getMediaSession))
    __obj.asInstanceOf[GetMediaSession]
  }
  
  @scala.inline
  implicit class GetMediaSessionOps[Self <: GetMediaSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetMediaSession(value: () => GetEstimatedTime): Self = this.set("getMediaSession", js.Any.fromFunction0(value))
  }
}
