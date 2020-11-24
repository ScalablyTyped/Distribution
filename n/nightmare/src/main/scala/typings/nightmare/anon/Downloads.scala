package typings.nightmare.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Downloads extends js.Object {
  
  var downloads: js.UndefOr[String] = js.native
}
object Downloads {
  
  @scala.inline
  def apply(): Downloads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Downloads]
  }
  
  @scala.inline
  implicit class DownloadsOps[Self <: Downloads] (val x: Self) extends AnyVal {
    
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
    def setDownloads(value: String): Self = this.set("downloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloads: Self = this.set("downloads", js.undefined)
  }
}
