package typings.pLoading

import typings.pLoading.pLoadingStrings.destroy
import typings.pLoading.pLoadingStrings.hide
import typings.pLoading.pLoadingStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PLoadingOptions extends StObject {
  
  var action: js.UndefOr[show | hide | destroy] = js.undefined
  
  var containerAttrs: js.UndefOr[js.Object] = js.undefined
  
  var containerClass: js.UndefOr[String] = js.undefined
  
  var containerHTML: js.UndefOr[String] = js.undefined
  
  var destroyAfterHide: js.UndefOr[Boolean] = js.undefined
  
  var hideAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.undefined
  
  var idPrefix: js.UndefOr[String] = js.undefined
  
  var maskColor: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated
    */
  var onDestroyContainer: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.undefined
  
  /**
    * @deprecated
    */
  var onHideContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, Unit]] = js.undefined
  
  /**
    * @deprecated
    */
  var onShowContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, Unit]] = js.undefined
  
  var pluginNameSpace: js.UndefOr[String] = js.undefined
  
  var showAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.undefined
  
  var spinnerAttrs: js.UndefOr[js.Object] = js.undefined
  
  var spinnerClass: js.UndefOr[String] = js.undefined
  
  var spinnerHTML: js.UndefOr[String] = js.undefined
  
  var useAddOns: js.UndefOr[js.Array[String]] = js.undefined
}
object PLoadingOptions {
  
  @scala.inline
  def apply(): PLoadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PLoadingOptions]
  }
  
  @scala.inline
  implicit class PLoadingOptionsMutableBuilder[Self <: PLoadingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: show | hide | destroy): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setContainerAttrs(value: js.Object): Self = StObject.set(x, "containerAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerAttrsUndefined: Self = StObject.set(x, "containerAttrs", js.undefined)
    
    @scala.inline
    def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
    
    @scala.inline
    def setContainerHTML(value: String): Self = StObject.set(x, "containerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerHTMLUndefined: Self = StObject.set(x, "containerHTML", js.undefined)
    
    @scala.inline
    def setDestroyAfterHide(value: Boolean): Self = StObject.set(x, "destroyAfterHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyAfterHideUndefined: Self = StObject.set(x, "destroyAfterHide", js.undefined)
    
    @scala.inline
    def setHideAnimation(value: /* $container */ JQuery => Unit): Self = StObject.set(x, "hideAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideAnimationUndefined: Self = StObject.set(x, "hideAnimation", js.undefined)
    
    @scala.inline
    def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
    
    @scala.inline
    def setMaskColor(value: String): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
    
    @scala.inline
    def setOnDestroyContainer(value: /* $container */ JQuery => Unit): Self = StObject.set(x, "onDestroyContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDestroyContainerUndefined: Self = StObject.set(x, "onDestroyContainer", js.undefined)
    
    @scala.inline
    def setOnHideContainer(value: (/* $pluginElement */ JQuery, /* $container */ JQuery) => Unit): Self = StObject.set(x, "onHideContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnHideContainerUndefined: Self = StObject.set(x, "onHideContainer", js.undefined)
    
    @scala.inline
    def setOnShowContainer(value: (/* $pluginElement */ JQuery, /* $container */ JQuery) => Unit): Self = StObject.set(x, "onShowContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnShowContainerUndefined: Self = StObject.set(x, "onShowContainer", js.undefined)
    
    @scala.inline
    def setPluginNameSpace(value: String): Self = StObject.set(x, "pluginNameSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginNameSpaceUndefined: Self = StObject.set(x, "pluginNameSpace", js.undefined)
    
    @scala.inline
    def setShowAnimation(value: /* $container */ JQuery => Unit): Self = StObject.set(x, "showAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowAnimationUndefined: Self = StObject.set(x, "showAnimation", js.undefined)
    
    @scala.inline
    def setSpinnerAttrs(value: js.Object): Self = StObject.set(x, "spinnerAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerAttrsUndefined: Self = StObject.set(x, "spinnerAttrs", js.undefined)
    
    @scala.inline
    def setSpinnerClass(value: String): Self = StObject.set(x, "spinnerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerClassUndefined: Self = StObject.set(x, "spinnerClass", js.undefined)
    
    @scala.inline
    def setSpinnerHTML(value: String): Self = StObject.set(x, "spinnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerHTMLUndefined: Self = StObject.set(x, "spinnerHTML", js.undefined)
    
    @scala.inline
    def setUseAddOns(value: js.Array[String]): Self = StObject.set(x, "useAddOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAddOnsUndefined: Self = StObject.set(x, "useAddOns", js.undefined)
    
    @scala.inline
    def setUseAddOnsVarargs(value: String*): Self = StObject.set(x, "useAddOns", js.Array(value :_*))
  }
}
