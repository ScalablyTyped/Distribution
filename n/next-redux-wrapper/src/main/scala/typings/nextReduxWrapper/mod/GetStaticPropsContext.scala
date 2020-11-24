package typings.nextReduxWrapper.mod

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStaticPropsContext extends _Context {
  
  var params: js.UndefOr[ParsedUrlQuery] = js.native
  
  var preview: js.UndefOr[Boolean] = js.native
  
  var previewData: js.UndefOr[js.Any] = js.native
}
object GetStaticPropsContext {
  
  @scala.inline
  def apply(): GetStaticPropsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStaticPropsContext]
  }
  
  @scala.inline
  implicit class GetStaticPropsContextOps[Self <: GetStaticPropsContext] (val x: Self) extends AnyVal {
    
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
    def setParams(value: ParsedUrlQuery): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setPreviewData(value: js.Any): Self = this.set("previewData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewData: Self = this.set("previewData", js.undefined)
  }
}
