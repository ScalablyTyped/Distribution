package typings.mv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var clobber: js.UndefOr[Boolean] = js.native
  
  var mkdirp: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setClobber(value: Boolean): Self = this.set("clobber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClobber: Self = this.set("clobber", js.undefined)
    
    @scala.inline
    def setMkdirp(value: Boolean): Self = this.set("mkdirp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMkdirp: Self = this.set("mkdirp", js.undefined)
  }
}
