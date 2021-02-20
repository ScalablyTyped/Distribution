package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.BasicEventCallback
import typings.overlayscrollbars.mod.DirectionChangedCallback
import typings.overlayscrollbars.mod.OverflowAmountChangedCallback
import typings.overlayscrollbars.mod.OverflowChangedCallback
import typings.overlayscrollbars.mod.ScrollEventCallback
import typings.overlayscrollbars.mod.SizeChangedCallback
import typings.overlayscrollbars.mod.UpdatedCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnContentSizeChanged extends StObject {
  
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
  implicit class OnContentSizeChangedMutableBuilder[Self <: OnContentSizeChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnContentSizeChanged(value: SizeChangedCallback): Self = StObject.set(x, "onContentSizeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContentSizeChangedNull: Self = StObject.set(x, "onContentSizeChanged", null)
    
    @scala.inline
    def setOnContentSizeChangedUndefined: Self = StObject.set(x, "onContentSizeChanged", js.undefined)
    
    @scala.inline
    def setOnDestroyed(value: BasicEventCallback): Self = StObject.set(x, "onDestroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDestroyedNull: Self = StObject.set(x, "onDestroyed", null)
    
    @scala.inline
    def setOnDestroyedUndefined: Self = StObject.set(x, "onDestroyed", js.undefined)
    
    @scala.inline
    def setOnDirectionChanged(value: DirectionChangedCallback): Self = StObject.set(x, "onDirectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDirectionChangedNull: Self = StObject.set(x, "onDirectionChanged", null)
    
    @scala.inline
    def setOnDirectionChangedUndefined: Self = StObject.set(x, "onDirectionChanged", js.undefined)
    
    @scala.inline
    def setOnHostSizeChanged(value: SizeChangedCallback): Self = StObject.set(x, "onHostSizeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHostSizeChangedNull: Self = StObject.set(x, "onHostSizeChanged", null)
    
    @scala.inline
    def setOnHostSizeChangedUndefined: Self = StObject.set(x, "onHostSizeChanged", js.undefined)
    
    @scala.inline
    def setOnInitializationWithdrawn(value: BasicEventCallback): Self = StObject.set(x, "onInitializationWithdrawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInitializationWithdrawnNull: Self = StObject.set(x, "onInitializationWithdrawn", null)
    
    @scala.inline
    def setOnInitializationWithdrawnUndefined: Self = StObject.set(x, "onInitializationWithdrawn", js.undefined)
    
    @scala.inline
    def setOnInitialized(value: BasicEventCallback): Self = StObject.set(x, "onInitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInitializedNull: Self = StObject.set(x, "onInitialized", null)
    
    @scala.inline
    def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    @scala.inline
    def setOnOverflowAmountChanged(value: OverflowAmountChangedCallback): Self = StObject.set(x, "onOverflowAmountChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOverflowAmountChangedNull: Self = StObject.set(x, "onOverflowAmountChanged", null)
    
    @scala.inline
    def setOnOverflowAmountChangedUndefined: Self = StObject.set(x, "onOverflowAmountChanged", js.undefined)
    
    @scala.inline
    def setOnOverflowChanged(value: OverflowChangedCallback): Self = StObject.set(x, "onOverflowChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOverflowChangedNull: Self = StObject.set(x, "onOverflowChanged", null)
    
    @scala.inline
    def setOnOverflowChangedUndefined: Self = StObject.set(x, "onOverflowChanged", js.undefined)
    
    @scala.inline
    def setOnScroll(value: ScrollEventCallback): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScrollNull: Self = StObject.set(x, "onScroll", null)
    
    @scala.inline
    def setOnScrollStart(value: ScrollEventCallback): Self = StObject.set(x, "onScrollStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScrollStartNull: Self = StObject.set(x, "onScrollStart", null)
    
    @scala.inline
    def setOnScrollStartUndefined: Self = StObject.set(x, "onScrollStart", js.undefined)
    
    @scala.inline
    def setOnScrollStop(value: ScrollEventCallback): Self = StObject.set(x, "onScrollStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScrollStopNull: Self = StObject.set(x, "onScrollStop", null)
    
    @scala.inline
    def setOnScrollStopUndefined: Self = StObject.set(x, "onScrollStop", js.undefined)
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnUpdated(value: UpdatedCallback): Self = StObject.set(x, "onUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdatedNull: Self = StObject.set(x, "onUpdated", null)
    
    @scala.inline
    def setOnUpdatedUndefined: Self = StObject.set(x, "onUpdated", js.undefined)
  }
}
