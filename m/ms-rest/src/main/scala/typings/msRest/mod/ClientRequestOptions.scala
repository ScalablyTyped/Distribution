package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequestOptions extends RequestOptions {
  
  var jar: js.UndefOr[Boolean] = js.native
}
object ClientRequestOptions {
  
  @scala.inline
  def apply(): ClientRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientRequestOptions]
  }
  
  @scala.inline
  implicit class ClientRequestOptionsOps[Self <: ClientRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setJar(value: Boolean): Self = this.set("jar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJar: Self = this.set("jar", js.undefined)
  }
}
