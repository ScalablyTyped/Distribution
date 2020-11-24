package typings.pLoading

import typings.pLoading.pLoadingStrings.destroy
import typings.pLoading.pLoadingStrings.hide
import typings.pLoading.pLoadingStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PLoadingOptions extends js.Object {
  
  var action: js.UndefOr[show | hide | destroy] = js.native
  
  var containerAttrs: js.UndefOr[js.Object] = js.native
  
  var containerClass: js.UndefOr[String] = js.native
  
  var containerHTML: js.UndefOr[String] = js.native
  
  var destroyAfterHide: js.UndefOr[Boolean] = js.native
  
  var hideAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.native
  
  var idPrefix: js.UndefOr[String] = js.native
  
  var maskColor: js.UndefOr[String] = js.native
  
  /**
    * @deprecated
    */
  var onDestroyContainer: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.native
  
  /**
    * @deprecated
    */
  var onHideContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, Unit]] = js.native
  
  /**
    * @deprecated
    */
  var onShowContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, Unit]] = js.native
  
  var pluginNameSpace: js.UndefOr[String] = js.native
  
  var showAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.native
  
  var spinnerAttrs: js.UndefOr[js.Object] = js.native
  
  var spinnerClass: js.UndefOr[String] = js.native
  
  var spinnerHTML: js.UndefOr[String] = js.native
  
  var useAddOns: js.UndefOr[js.Array[String]] = js.native
}
object PLoadingOptions {
  
  @scala.inline
  def apply(): PLoadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PLoadingOptions]
  }
  
  @scala.inline
  implicit class PLoadingOptionsOps[Self <: PLoadingOptions] (val x: Self) extends AnyVal {
    
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
    def setAction(value: show | hide | destroy): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setContainerAttrs(value: js.Object): Self = this.set("containerAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerAttrs: Self = this.set("containerAttrs", js.undefined)
    
    @scala.inline
    def setContainerClass(value: String): Self = this.set("containerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClass: Self = this.set("containerClass", js.undefined)
    
    @scala.inline
    def setContainerHTML(value: String): Self = this.set("containerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerHTML: Self = this.set("containerHTML", js.undefined)
    
    @scala.inline
    def setDestroyAfterHide(value: Boolean): Self = this.set("destroyAfterHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyAfterHide: Self = this.set("destroyAfterHide", js.undefined)
    
    @scala.inline
    def setHideAnimation(value: /* $container */ JQuery => Unit): Self = this.set("hideAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHideAnimation: Self = this.set("hideAnimation", js.undefined)
    
    @scala.inline
    def setIdPrefix(value: String): Self = this.set("idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdPrefix: Self = this.set("idPrefix", js.undefined)
    
    @scala.inline
    def setMaskColor(value: String): Self = this.set("maskColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskColor: Self = this.set("maskColor", js.undefined)
    
    @scala.inline
    def setOnDestroyContainer(value: /* $container */ JQuery => Unit): Self = this.set("onDestroyContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDestroyContainer: Self = this.set("onDestroyContainer", js.undefined)
    
    @scala.inline
    def setOnHideContainer(value: (/* $pluginElement */ JQuery, /* $container */ JQuery) => Unit): Self = this.set("onHideContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHideContainer: Self = this.set("onHideContainer", js.undefined)
    
    @scala.inline
    def setOnShowContainer(value: (/* $pluginElement */ JQuery, /* $container */ JQuery) => Unit): Self = this.set("onShowContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnShowContainer: Self = this.set("onShowContainer", js.undefined)
    
    @scala.inline
    def setPluginNameSpace(value: String): Self = this.set("pluginNameSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginNameSpace: Self = this.set("pluginNameSpace", js.undefined)
    
    @scala.inline
    def setShowAnimation(value: /* $container */ JQuery => Unit): Self = this.set("showAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShowAnimation: Self = this.set("showAnimation", js.undefined)
    
    @scala.inline
    def setSpinnerAttrs(value: js.Object): Self = this.set("spinnerAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinnerAttrs: Self = this.set("spinnerAttrs", js.undefined)
    
    @scala.inline
    def setSpinnerClass(value: String): Self = this.set("spinnerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinnerClass: Self = this.set("spinnerClass", js.undefined)
    
    @scala.inline
    def setSpinnerHTML(value: String): Self = this.set("spinnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinnerHTML: Self = this.set("spinnerHTML", js.undefined)
    
    @scala.inline
    def setUseAddOnsVarargs(value: String*): Self = this.set("useAddOns", js.Array(value :_*))
    
    @scala.inline
    def setUseAddOns(value: js.Array[String]): Self = this.set("useAddOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAddOns: Self = this.set("useAddOns", js.undefined)
  }
}
