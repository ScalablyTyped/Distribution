package typings.pgwmodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PgwModalOption extends js.Object {
  
  var ajaxOptions: js.UndefOr[js.Any] = js.native
  
  var angular: js.UndefOr[Boolean] = js.native
  
  var backdropClassName: js.UndefOr[String] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var closeContent: js.UndefOr[String] = js.native
  
  var closeOnBackgroundClick: js.UndefOr[Boolean] = js.native
  
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var errorContent: js.UndefOr[String] = js.native
  
  var loadingContent: js.UndefOr[String] = js.native
  
  var mainClassName: js.UndefOr[String] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var modalData: js.UndefOr[js.Any] = js.native
  
  var pushContent: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleBar: js.UndefOr[Boolean] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object PgwModalOption {
  
  @scala.inline
  def apply(): PgwModalOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PgwModalOption]
  }
  
  @scala.inline
  implicit class PgwModalOptionOps[Self <: PgwModalOption] (val x: Self) extends AnyVal {
    
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
    def setAjaxOptions(value: js.Any): Self = this.set("ajaxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxOptions: Self = this.set("ajaxOptions", js.undefined)
    
    @scala.inline
    def setAngular(value: Boolean): Self = this.set("angular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngular: Self = this.set("angular", js.undefined)
    
    @scala.inline
    def setBackdropClassName(value: String): Self = this.set("backdropClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropClassName: Self = this.set("backdropClassName", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setCloseContent(value: String): Self = this.set("closeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseContent: Self = this.set("closeContent", js.undefined)
    
    @scala.inline
    def setCloseOnBackgroundClick(value: Boolean): Self = this.set("closeOnBackgroundClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnBackgroundClick: Self = this.set("closeOnBackgroundClick", js.undefined)
    
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = this.set("closeOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnEscape: Self = this.set("closeOnEscape", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setErrorContent(value: String): Self = this.set("errorContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorContent: Self = this.set("errorContent", js.undefined)
    
    @scala.inline
    def setLoadingContent(value: String): Self = this.set("loadingContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingContent: Self = this.set("loadingContent", js.undefined)
    
    @scala.inline
    def setMainClassName(value: String): Self = this.set("mainClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainClassName: Self = this.set("mainClassName", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setModalData(value: js.Any): Self = this.set("modalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalData: Self = this.set("modalData", js.undefined)
    
    @scala.inline
    def setPushContent(value: String): Self = this.set("pushContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushContent: Self = this.set("pushContent", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleBar(value: Boolean): Self = this.set("titleBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleBar: Self = this.set("titleBar", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
