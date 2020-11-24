package typings.nodeIsbn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmallThumbnail extends js.Object {
  
  var smallThumbnail: String = js.native
  
  var thumbnail: String = js.native
}
object SmallThumbnail {
  
  @scala.inline
  def apply(smallThumbnail: String, thumbnail: String): SmallThumbnail = {
    val __obj = js.Dynamic.literal(smallThumbnail = smallThumbnail.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmallThumbnail]
  }
  
  @scala.inline
  implicit class SmallThumbnailOps[Self <: SmallThumbnail] (val x: Self) extends AnyVal {
    
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
    def setSmallThumbnail(value: String): Self = this.set("smallThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
}
