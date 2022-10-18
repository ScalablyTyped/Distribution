package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.AutoHide
import typings.overlayscrollbars.anon.DynHeight
import typings.overlayscrollbars.anon.Initialize
import typings.overlayscrollbars.anon.OnContentSizeChanged
import typings.overlayscrollbars.anon.`1`
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
  
  var overflowBehavior: js.UndefOr[`1`] = js.undefined
  
  var paddingAbsolute: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[ResizeBehavior] = js.undefined
  
  var scrollbars: js.UndefOr[AutoHide] = js.undefined
  
  var sizeAutoCapable: js.UndefOr[Boolean] = js.undefined
  
  var textarea: js.UndefOr[DynHeight] = js.undefined
  
  var updateOnLoad: js.UndefOr[String | js.Array[String] | Null] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateInterval(value: Double): Self = StObject.set(x, "autoUpdateInterval", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateIntervalUndefined: Self = StObject.set(x, "autoUpdateInterval", js.undefined)
    
    inline def setAutoUpdateNull: Self = StObject.set(x, "autoUpdate", null)
    
    inline def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
    
    inline def setCallbacks(value: OnContentSizeChanged): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClipAlways(value: Boolean): Self = StObject.set(x, "clipAlways", value.asInstanceOf[js.Any])
    
    inline def setClipAlwaysUndefined: Self = StObject.set(x, "clipAlways", js.undefined)
    
    inline def setNativeScrollbarsOverlaid(value: Initialize): Self = StObject.set(x, "nativeScrollbarsOverlaid", value.asInstanceOf[js.Any])
    
    inline def setNativeScrollbarsOverlaidUndefined: Self = StObject.set(x, "nativeScrollbarsOverlaid", js.undefined)
    
    inline def setNormalizeRTL(value: Boolean): Self = StObject.set(x, "normalizeRTL", value.asInstanceOf[js.Any])
    
    inline def setNormalizeRTLUndefined: Self = StObject.set(x, "normalizeRTL", js.undefined)
    
    inline def setOverflowBehavior(value: `1`): Self = StObject.set(x, "overflowBehavior", value.asInstanceOf[js.Any])
    
    inline def setOverflowBehaviorUndefined: Self = StObject.set(x, "overflowBehavior", js.undefined)
    
    inline def setPaddingAbsolute(value: Boolean): Self = StObject.set(x, "paddingAbsolute", value.asInstanceOf[js.Any])
    
    inline def setPaddingAbsoluteUndefined: Self = StObject.set(x, "paddingAbsolute", js.undefined)
    
    inline def setResize(value: ResizeBehavior): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setScrollbars(value: AutoHide): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
    
    inline def setScrollbarsUndefined: Self = StObject.set(x, "scrollbars", js.undefined)
    
    inline def setSizeAutoCapable(value: Boolean): Self = StObject.set(x, "sizeAutoCapable", value.asInstanceOf[js.Any])
    
    inline def setSizeAutoCapableUndefined: Self = StObject.set(x, "sizeAutoCapable", js.undefined)
    
    inline def setTextarea(value: DynHeight): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
    
    inline def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
    
    inline def setUpdateOnLoad(value: String | js.Array[String]): Self = StObject.set(x, "updateOnLoad", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnLoadNull: Self = StObject.set(x, "updateOnLoad", null)
    
    inline def setUpdateOnLoadUndefined: Self = StObject.set(x, "updateOnLoad", js.undefined)
    
    inline def setUpdateOnLoadVarargs(value: String*): Self = StObject.set(x, "updateOnLoad", js.Array(value*))
  }
}
