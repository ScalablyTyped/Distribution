package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpData extends js.Object {
  
  /** Required. The URL that points to the file that stores the object list entries. This file must allow public access. Currently, only URLs with HTTP and HTTPS schemes are supported. */
  var listUrl: js.UndefOr[String] = js.native
}
object HttpData {
  
  @scala.inline
  def apply(): HttpData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpData]
  }
  
  @scala.inline
  implicit class HttpDataOps[Self <: HttpData] (val x: Self) extends AnyVal {
    
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
    def setListUrl(value: String): Self = this.set("listUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListUrl: Self = this.set("listUrl", js.undefined)
  }
}
