package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.BasicEventCallback
import typings.overlayscrollbars.mod.DirectionChangedCallback
import typings.overlayscrollbars.mod.OverflowAmountChangedCallback
import typings.overlayscrollbars.mod.OverflowChangedCallback
import typings.overlayscrollbars.mod.ScrollEventCallback
import typings.overlayscrollbars.mod.SizeChangedCallback
import typings.overlayscrollbars.mod.UpdatedCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnContentSizeChanged extends js.Object {
  
  var onContentSizeChanged: js.UndefOr[SizeChangedCallback | Null] = js.native
  
  var onDestroyed: js.UndefOr[BasicEventCallback | Null] = js.native
  
  var onDirectionChanged: js.UndefOr[DirectionChangedCallback | Null] = js.native
  
  var onHostSizeChanged: js.UndefOr[SizeChangedCallback | Null] = js.native
  
  var onInitializationWithdrawn: js.UndefOr[BasicEventCallback | Null] = js.native
  
  var onInitialized: js.UndefOr[BasicEventCallback | Null] = js.native
  
  var onOverflowAmountChanged: js.UndefOr[OverflowAmountChangedCallback | Null] = js.native
  
  var onOverflowChanged: js.UndefOr[OverflowChangedCallback | Null] = js.native
  
  var onScroll: js.UndefOr[ScrollEventCallback | Null] = js.native
  
  var onScrollStart: js.UndefOr[ScrollEventCallback | Null] = js.native
  
  var onScrollStop: js.UndefOr[ScrollEventCallback | Null] = js.native
  
  var onUpdated: js.UndefOr[UpdatedCallback | Null] = js.native
}
object OnContentSizeChanged {
  
  @scala.inline
  def apply(): OnContentSizeChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnContentSizeChanged]
  }
  
  @scala.inline
  implicit class OnContentSizeChangedOps[Self <: OnContentSizeChanged] (val x: Self) extends AnyVal {
    
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
    def setOnContentSizeChanged(value: SizeChangedCallback): Self = this.set("onContentSizeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContentSizeChanged: Self = this.set("onContentSizeChanged", js.undefined)
    
    @scala.inline
    def setOnContentSizeChangedNull: Self = this.set("onContentSizeChanged", null)
    
    @scala.inline
    def setOnDestroyed(value: BasicEventCallback): Self = this.set("onDestroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDestroyed: Self = this.set("onDestroyed", js.undefined)
    
    @scala.inline
    def setOnDestroyedNull: Self = this.set("onDestroyed", null)
    
    @scala.inline
    def setOnDirectionChanged(value: DirectionChangedCallback): Self = this.set("onDirectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDirectionChanged: Self = this.set("onDirectionChanged", js.undefined)
    
    @scala.inline
    def setOnDirectionChangedNull: Self = this.set("onDirectionChanged", null)
    
    @scala.inline
    def setOnHostSizeChanged(value: SizeChangedCallback): Self = this.set("onHostSizeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHostSizeChanged: Self = this.set("onHostSizeChanged", js.undefined)
    
    @scala.inline
    def setOnHostSizeChangedNull: Self = this.set("onHostSizeChanged", null)
    
    @scala.inline
    def setOnInitializationWithdrawn(value: BasicEventCallback): Self = this.set("onInitializationWithdrawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInitializationWithdrawn: Self = this.set("onInitializationWithdrawn", js.undefined)
    
    @scala.inline
    def setOnInitializationWithdrawnNull: Self = this.set("onInitializationWithdrawn", null)
    
    @scala.inline
    def setOnInitialized(value: BasicEventCallback): Self = this.set("onInitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInitialized: Self = this.set("onInitialized", js.undefined)
    
    @scala.inline
    def setOnInitializedNull: Self = this.set("onInitialized", null)
    
    @scala.inline
    def setOnOverflowAmountChanged(value: OverflowAmountChangedCallback): Self = this.set("onOverflowAmountChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOverflowAmountChanged: Self = this.set("onOverflowAmountChanged", js.undefined)
    
    @scala.inline
    def setOnOverflowAmountChangedNull: Self = this.set("onOverflowAmountChanged", null)
    
    @scala.inline
    def setOnOverflowChanged(value: OverflowChangedCallback): Self = this.set("onOverflowChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOverflowChanged: Self = this.set("onOverflowChanged", js.undefined)
    
    @scala.inline
    def setOnOverflowChangedNull: Self = this.set("onOverflowChanged", null)
    
    @scala.inline
    def setOnScroll(value: ScrollEventCallback): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollNull: Self = this.set("onScroll", null)
    
    @scala.inline
    def setOnScrollStart(value: ScrollEventCallback): Self = this.set("onScrollStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScrollStart: Self = this.set("onScrollStart", js.undefined)
    
    @scala.inline
    def setOnScrollStartNull: Self = this.set("onScrollStart", null)
    
    @scala.inline
    def setOnScrollStop(value: ScrollEventCallback): Self = this.set("onScrollStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScrollStop: Self = this.set("onScrollStop", js.undefined)
    
    @scala.inline
    def setOnScrollStopNull: Self = this.set("onScrollStop", null)
    
    @scala.inline
    def setOnUpdated(value: UpdatedCallback): Self = this.set("onUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdated: Self = this.set("onUpdated", js.undefined)
    
    @scala.inline
    def setOnUpdatedNull: Self = this.set("onUpdated", null)
  }
}
