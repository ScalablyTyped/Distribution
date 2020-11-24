package typings.podcast.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Imageurl extends js.Object {
  
  var image_url: js.UndefOr[String] = js.native
}
object Imageurl {
  
  @scala.inline
  def apply(): Imageurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Imageurl]
  }
  
  @scala.inline
  implicit class ImageurlOps[Self <: Imageurl] (val x: Self) extends AnyVal {
    
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
    def setImage_url(value: String): Self = this.set("image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_url: Self = this.set("image_url", js.undefined)
  }
}
