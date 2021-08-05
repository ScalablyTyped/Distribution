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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnContentSizeChanged extends StObject {
  
  var onContentSizeChanged: js.UndefOr[SizeChangedCallback | Null] = js.undefined
  
  var onDestroyed: js.UndefOr[BasicEventCallback | Null] = js.undefined
  
  var onDirectionChanged: js.UndefOr[DirectionChangedCallback | Null] = js.undefined
  
  var onHostSizeChanged: js.UndefOr[SizeChangedCallback | Null] = js.undefined
  
  var onInitializationWithdrawn: js.UndefOr[BasicEventCallback | Null] = js.undefined
  
  var onInitialized: js.UndefOr[BasicEventCallback | Null] = js.undefined
  
  var onOverflowAmountChanged: js.UndefOr[OverflowAmountChangedCallback | Null] = js.undefined
  
  var onOverflowChanged: js.UndefOr[OverflowChangedCallback | Null] = js.undefined
  
  var onScroll: js.UndefOr[ScrollEventCallback | Null] = js.undefined
  
  var onScrollStart: js.UndefOr[ScrollEventCallback | Null] = js.undefined
  
  var onScrollStop: js.UndefOr[ScrollEventCallback | Null] = js.undefined
  
  var onUpdated: js.UndefOr[UpdatedCallback | Null] = js.undefined
}
object OnContentSizeChanged {
  
  inline def apply(): OnContentSizeChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnContentSizeChanged]
  }
  
  extension [Self <: OnContentSizeChanged](x: Self) {
    
    inline def setOnContentSizeChanged(value: SizeChangedCallback): Self = StObject.set(x, "onContentSizeChanged", value.asInstanceOf[js.Any])
    
    inline def setOnContentSizeChangedNull: Self = StObject.set(x, "onContentSizeChanged", null)
    
    inline def setOnContentSizeChangedUndefined: Self = StObject.set(x, "onContentSizeChanged", js.undefined)
    
    inline def setOnDestroyed(value: BasicEventCallback): Self = StObject.set(x, "onDestroyed", value.asInstanceOf[js.Any])
    
    inline def setOnDestroyedNull: Self = StObject.set(x, "onDestroyed", null)
    
    inline def setOnDestroyedUndefined: Self = StObject.set(x, "onDestroyed", js.undefined)
    
    inline def setOnDirectionChanged(value: DirectionChangedCallback): Self = StObject.set(x, "onDirectionChanged", value.asInstanceOf[js.Any])
    
    inline def setOnDirectionChangedNull: Self = StObject.set(x, "onDirectionChanged", null)
    
    inline def setOnDirectionChangedUndefined: Self = StObject.set(x, "onDirectionChanged", js.undefined)
    
    inline def setOnHostSizeChanged(value: SizeChangedCallback): Self = StObject.set(x, "onHostSizeChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHostSizeChangedNull: Self = StObject.set(x, "onHostSizeChanged", null)
    
    inline def setOnHostSizeChangedUndefined: Self = StObject.set(x, "onHostSizeChanged", js.undefined)
    
    inline def setOnInitializationWithdrawn(value: BasicEventCallback): Self = StObject.set(x, "onInitializationWithdrawn", value.asInstanceOf[js.Any])
    
    inline def setOnInitializationWithdrawnNull: Self = StObject.set(x, "onInitializationWithdrawn", null)
    
    inline def setOnInitializationWithdrawnUndefined: Self = StObject.set(x, "onInitializationWithdrawn", js.undefined)
    
    inline def setOnInitialized(value: BasicEventCallback): Self = StObject.set(x, "onInitialized", value.asInstanceOf[js.Any])
    
    inline def setOnInitializedNull: Self = StObject.set(x, "onInitialized", null)
    
    inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    inline def setOnOverflowAmountChanged(value: OverflowAmountChangedCallback): Self = StObject.set(x, "onOverflowAmountChanged", value.asInstanceOf[js.Any])
    
    inline def setOnOverflowAmountChangedNull: Self = StObject.set(x, "onOverflowAmountChanged", null)
    
    inline def setOnOverflowAmountChangedUndefined: Self = StObject.set(x, "onOverflowAmountChanged", js.undefined)
    
    inline def setOnOverflowChanged(value: OverflowChangedCallback): Self = StObject.set(x, "onOverflowChanged", value.asInstanceOf[js.Any])
    
    inline def setOnOverflowChangedNull: Self = StObject.set(x, "onOverflowChanged", null)
    
    inline def setOnOverflowChangedUndefined: Self = StObject.set(x, "onOverflowChanged", js.undefined)
    
    inline def setOnScroll(value: ScrollEventCallback): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    inline def setOnScrollNull: Self = StObject.set(x, "onScroll", null)
    
    inline def setOnScrollStart(value: ScrollEventCallback): Self = StObject.set(x, "onScrollStart", value.asInstanceOf[js.Any])
    
    inline def setOnScrollStartNull: Self = StObject.set(x, "onScrollStart", null)
    
    inline def setOnScrollStartUndefined: Self = StObject.set(x, "onScrollStart", js.undefined)
    
    inline def setOnScrollStop(value: ScrollEventCallback): Self = StObject.set(x, "onScrollStop", value.asInstanceOf[js.Any])
    
    inline def setOnScrollStopNull: Self = StObject.set(x, "onScrollStop", null)
    
    inline def setOnScrollStopUndefined: Self = StObject.set(x, "onScrollStop", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnUpdated(value: UpdatedCallback): Self = StObject.set(x, "onUpdated", value.asInstanceOf[js.Any])
    
    inline def setOnUpdatedNull: Self = StObject.set(x, "onUpdated", null)
    
    inline def setOnUpdatedUndefined: Self = StObject.set(x, "onUpdated", js.undefined)
  }
}
