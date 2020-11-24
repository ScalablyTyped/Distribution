package typings.md5.mod

import typings.md5.md5Strings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var asBytes: js.UndefOr[Boolean] = js.native
  
  var asString: js.UndefOr[Boolean] = js.native
  
  var encoding: js.UndefOr[binary | String] = js.native
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
    def setAsBytes(value: Boolean): Self = this.set("asBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsBytes: Self = this.set("asBytes", js.undefined)
    
    @scala.inline
    def setAsString(value: Boolean): Self = this.set("asString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsString: Self = this.set("asString", js.undefined)
    
    @scala.inline
    def setEncoding(value: binary | String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
  }
}
