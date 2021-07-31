package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.AutoHide
import typings.overlayscrollbars.anon.DynHeight
import typings.overlayscrollbars.anon.Initialize
import typings.overlayscrollbars.anon.OnContentSizeChanged
import typings.overlayscrollbars.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var autoUpdate: js.UndefOr[Boolean | Null] = js.undefined
  
  var autoUpdateInterval: js.UndefOr[Double] = js.undefined
  
  var callbacks: js.UndefOr[OnContentSizeChanged] = js.undefined
  
  var className: js.UndefOr[String | Null] = js.undefined
  
  var clipAlways: js.UndefOr[Boolean] = js.undefined
  
  var nativeScrollbarsOverlaid: js.UndefOr[Initialize] = js.undefined
  
  var normalizeRTL: js.UndefOr[Boolean] = js.undefined
  
  var overflowBehavior: js.UndefOr[`0`] = js.undefined
  
  var paddingAbsolute: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[ResizeBehavior] = js.undefined
  
  var scrollbars: js.UndefOr[AutoHide] = js.undefined
  
  var sizeAutoCapable: js.UndefOr[Boolean] = js.undefined
  
  var textarea: js.UndefOr[DynHeight] = js.undefined
  
  var updateOnLoad: js.UndefOr[String | js.Array[String] | Null] = js.undefined
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateInterval(value: Double): Self = StObject.set(x, "autoUpdateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateIntervalUndefined: Self = StObject.set(x, "autoUpdateInterval", js.undefined)
    
    @scala.inline
    def setAutoUpdateNull: Self = StObject.set(x, "autoUpdate", null)
    
    @scala.inline
    def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
    
    @scala.inline
    def setCallbacks(value: OnContentSizeChanged): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameNull: Self = StObject.set(x, "className", null)
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClipAlways(value: Boolean): Self = StObject.set(x, "clipAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipAlwaysUndefined: Self = StObject.set(x, "clipAlways", js.undefined)
    
    @scala.inline
    def setNativeScrollbarsOverlaid(value: Initialize): Self = StObject.set(x, "nativeScrollbarsOverlaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeScrollbarsOverlaidUndefined: Self = StObject.set(x, "nativeScrollbarsOverlaid", js.undefined)
    
    @scala.inline
    def setNormalizeRTL(value: Boolean): Self = StObject.set(x, "normalizeRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeRTLUndefined: Self = StObject.set(x, "normalizeRTL", js.undefined)
    
    @scala.inline
    def setOverflowBehavior(value: `0`): Self = StObject.set(x, "overflowBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowBehaviorUndefined: Self = StObject.set(x, "overflowBehavior", js.undefined)
    
    @scala.inline
    def setPaddingAbsolute(value: Boolean): Self = StObject.set(x, "paddingAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingAbsoluteUndefined: Self = StObject.set(x, "paddingAbsolute", js.undefined)
    
    @scala.inline
    def setResize(value: ResizeBehavior): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setScrollbars(value: AutoHide): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarsUndefined: Self = StObject.set(x, "scrollbars", js.undefined)
    
    @scala.inline
    def setSizeAutoCapable(value: Boolean): Self = StObject.set(x, "sizeAutoCapable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeAutoCapableUndefined: Self = StObject.set(x, "sizeAutoCapable", js.undefined)
    
    @scala.inline
    def setTextarea(value: DynHeight): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
    
    @scala.inline
    def setUpdateOnLoad(value: String | js.Array[String]): Self = StObject.set(x, "updateOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOnLoadNull: Self = StObject.set(x, "updateOnLoad", null)
    
    @scala.inline
    def setUpdateOnLoadUndefined: Self = StObject.set(x, "updateOnLoad", js.undefined)
    
    @scala.inline
    def setUpdateOnLoadVarargs(value: String*): Self = StObject.set(x, "updateOnLoad", js.Array(value :_*))
  }
}
