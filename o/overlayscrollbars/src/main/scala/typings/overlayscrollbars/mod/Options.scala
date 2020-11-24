package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.AutoHide
import typings.overlayscrollbars.anon.DynHeight
import typings.overlayscrollbars.anon.Initialize
import typings.overlayscrollbars.anon.OnContentSizeChanged
import typings.overlayscrollbars.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var autoUpdate: js.UndefOr[Boolean | Null] = js.native
  
  var autoUpdateInterval: js.UndefOr[Double] = js.native
  
  var callbacks: js.UndefOr[OnContentSizeChanged] = js.native
  
  var className: js.UndefOr[String | Null] = js.native
  
  var clipAlways: js.UndefOr[Boolean] = js.native
  
  var nativeScrollbarsOverlaid: js.UndefOr[Initialize] = js.native
  
  var normalizeRTL: js.UndefOr[Boolean] = js.native
  
  var overflowBehavior: js.UndefOr[`0`] = js.native
  
  var paddingAbsolute: js.UndefOr[Boolean] = js.native
  
  var resize: js.UndefOr[ResizeBehavior] = js.native
  
  var scrollbars: js.UndefOr[AutoHide] = js.native
  
  var sizeAutoCapable: js.UndefOr[Boolean] = js.native
  
  var textarea: js.UndefOr[DynHeight] = js.native
  
  var updateOnLoad: js.UndefOr[String | js.Array[String] | Null] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAutoUpdate(value: Boolean): Self = this.set("autoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdate: Self = this.set("autoUpdate", js.undefined)
    
    @scala.inline
    def setAutoUpdateNull: Self = this.set("autoUpdate", null)
    
    @scala.inline
    def setAutoUpdateInterval(value: Double): Self = this.set("autoUpdateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdateInterval: Self = this.set("autoUpdateInterval", js.undefined)
    
    @scala.inline
    def setCallbacks(value: OnContentSizeChanged): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClassNameNull: Self = this.set("className", null)
    
    @scala.inline
    def setClipAlways(value: Boolean): Self = this.set("clipAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipAlways: Self = this.set("clipAlways", js.undefined)
    
    @scala.inline
    def setNativeScrollbarsOverlaid(value: Initialize): Self = this.set("nativeScrollbarsOverlaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeScrollbarsOverlaid: Self = this.set("nativeScrollbarsOverlaid", js.undefined)
    
    @scala.inline
    def setNormalizeRTL(value: Boolean): Self = this.set("normalizeRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeRTL: Self = this.set("normalizeRTL", js.undefined)
    
    @scala.inline
    def setOverflowBehavior(value: `0`): Self = this.set("overflowBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowBehavior: Self = this.set("overflowBehavior", js.undefined)
    
    @scala.inline
    def setPaddingAbsolute(value: Boolean): Self = this.set("paddingAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingAbsolute: Self = this.set("paddingAbsolute", js.undefined)
    
    @scala.inline
    def setResize(value: ResizeBehavior): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setScrollbars(value: AutoHide): Self = this.set("scrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbars: Self = this.set("scrollbars", js.undefined)
    
    @scala.inline
    def setSizeAutoCapable(value: Boolean): Self = this.set("sizeAutoCapable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeAutoCapable: Self = this.set("sizeAutoCapable", js.undefined)
    
    @scala.inline
    def setTextarea(value: DynHeight): Self = this.set("textarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextarea: Self = this.set("textarea", js.undefined)
    
    @scala.inline
    def setUpdateOnLoadVarargs(value: String*): Self = this.set("updateOnLoad", js.Array(value :_*))
    
    @scala.inline
    def setUpdateOnLoad(value: String | js.Array[String]): Self = this.set("updateOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOnLoad: Self = this.set("updateOnLoad", js.undefined)
    
    @scala.inline
    def setUpdateOnLoadNull: Self = this.set("updateOnLoad", null)
  }
}
