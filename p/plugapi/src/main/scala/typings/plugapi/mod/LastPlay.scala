package typings.plugapi.mod

import typings.plugapi.mod.User.DJ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastPlay extends js.Object {
  
  var dj: DJ = js.native
  
  var media: Media = js.native
  
  var score: Score = js.native
}
object LastPlay {
  
  @scala.inline
  def apply(dj: DJ, media: Media, score: Score): LastPlay = {
    val __obj = js.Dynamic.literal(dj = dj.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastPlay]
  }
  
  @scala.inline
  implicit class LastPlayOps[Self <: LastPlay] (val x: Self) extends AnyVal {
    
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
    def setDj(value: DJ): Self = this.set("dj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: Media): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Score): Self = this.set("score", value.asInstanceOf[js.Any])
  }
}
