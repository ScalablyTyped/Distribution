package typings.nodeFetch.mod

import typings.nodeFetch.nodeFetchStrings.native
import typings.nodeFetch.nodeFetchStrings.transparent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobOptions extends js.Object {
  
  var endings: js.UndefOr[transparent | native] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object BlobOptions {
  
  @scala.inline
  def apply(): BlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobOptions]
  }
  
  @scala.inline
  implicit class BlobOptionsOps[Self <: BlobOptions] (val x: Self) extends AnyVal {
    
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
    def setEndings(value: transparent | native): Self = this.set("endings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndings: Self = this.set("endings", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
