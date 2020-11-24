package typings.pendoIoBrowser.pendo

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  id :string | undefined} & pendo-io-browser.pendo.Metadata */
@js.native
trait IdentityMetadata extends /* key */ StringDictionary[String | Double | Boolean] {
  
  var id: js.UndefOr[String] = js.native
}
object IdentityMetadata {
  
  @scala.inline
  def apply(): IdentityMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityMetadata]
  }
  
  @scala.inline
  implicit class IdentityMetadataOps[Self <: IdentityMetadata] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
