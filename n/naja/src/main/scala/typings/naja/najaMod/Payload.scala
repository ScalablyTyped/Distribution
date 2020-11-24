package typings.naja.najaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payload
  extends /* key */ StringDictionary[js.Any] {
  
  var postGet: js.UndefOr[Boolean] = js.native
  
  var redirect: js.UndefOr[String] = js.native
  
  var snippets: js.UndefOr[StringDictionary[String]] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Payload {
  
  @scala.inline
  def apply(): Payload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit class PayloadOps[Self <: Payload] (val x: Self) extends AnyVal {
    
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
    def setPostGet(value: Boolean): Self = this.set("postGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostGet: Self = this.set("postGet", js.undefined)
    
    @scala.inline
    def setRedirect(value: String): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setSnippets(value: StringDictionary[String]): Self = this.set("snippets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippets: Self = this.set("snippets", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
