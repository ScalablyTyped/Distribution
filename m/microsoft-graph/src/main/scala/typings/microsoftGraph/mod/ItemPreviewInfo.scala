package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemPreviewInfo extends js.Object {
  
  var getUrl: js.UndefOr[NullableOption[String]] = js.native
  
  var postParameters: js.UndefOr[NullableOption[String]] = js.native
  
  var postUrl: js.UndefOr[NullableOption[String]] = js.native
}
object ItemPreviewInfo {
  
  @scala.inline
  def apply(): ItemPreviewInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemPreviewInfo]
  }
  
  @scala.inline
  implicit class ItemPreviewInfoOps[Self <: ItemPreviewInfo] (val x: Self) extends AnyVal {
    
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
    def setGetUrl(value: NullableOption[String]): Self = this.set("getUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    
    @scala.inline
    def setGetUrlNull: Self = this.set("getUrl", null)
    
    @scala.inline
    def setPostParameters(value: NullableOption[String]): Self = this.set("postParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostParameters: Self = this.set("postParameters", js.undefined)
    
    @scala.inline
    def setPostParametersNull: Self = this.set("postParameters", null)
    
    @scala.inline
    def setPostUrl(value: NullableOption[String]): Self = this.set("postUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostUrl: Self = this.set("postUrl", js.undefined)
    
    @scala.inline
    def setPostUrlNull: Self = this.set("postUrl", null)
  }
}
