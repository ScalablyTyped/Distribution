package typings.pinoMultiStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiStreamOptions extends js.Object {
  
  var dedupe: js.UndefOr[Boolean] = js.native
}
object MultiStreamOptions {
  
  @scala.inline
  def apply(): MultiStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiStreamOptions]
  }
  
  @scala.inline
  implicit class MultiStreamOptionsOps[Self <: MultiStreamOptions] (val x: Self) extends AnyVal {
    
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
    def setDedupe(value: Boolean): Self = this.set("dedupe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDedupe: Self = this.set("dedupe", js.undefined)
  }
}
