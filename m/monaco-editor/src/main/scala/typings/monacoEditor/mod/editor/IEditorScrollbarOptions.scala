package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.auto
import typings.monacoEditor.monacoEditorStrings.hidden
import typings.monacoEditor.monacoEditorStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorScrollbarOptions extends StObject {
  
  /**
    * Always consume mouse wheel events (always call preventDefault() and stopPropagation() on the browser events).
    * Defaults to true.
    * **NOTE**: This option cannot be updated using `updateOptions()`
    */
  var alwaysConsumeMouseWheel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of arrows (if displayed).
    * Defaults to 11.
    * **NOTE**: This option cannot be updated using `updateOptions()`
    */
  var arrowSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Listen to mouse wheel events and react to them by scrolling.
    * Defaults to true.
    */
  var handleMouseWheel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Render horizontal scrollbar.
    * Defaults to 'auto'.
    */
  var horizontal: js.UndefOr[auto | visible | hidden] = js.undefined
  
  /**
    * Render arrows at the left and right of the horizontal scrollbar.
    * Defaults to false.
    * **NOTE**: This option cannot be updated using `updateOptions()`
    */
  var horizontalHasArrows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Height in pixels for the horizontal scrollbar.
    * Defaults to 10 (px).
    */
  var horizontalScrollbarSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Height in pixels for the horizontal slider.
    * Defaults to `horizontalScrollbarSize`.
    * **NOTE**: This option cannot be updated using `updateOptions()`
    */
  var horizontalSliderSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Scroll gutter clicks move by page vs jump to position.
    * Defaults to false.
    */
  var scrollByPage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Cast horizontal and vertical shadows when the content is scrolled.
    * Defaults to true.
    * **NOTE**: This option cannot be updated using `updateOptions()`
    */
  var useShadows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Render vertical scrollbar.
    * Defaults to 'auto'.
    */
  var vertical: js.UndefOr[auto | visible | hidden] = js.undefined
  
  /**
    * Render arrows at the top and bottom of the vertical scrollbar.
    * Defaults to false.
    * **NOTE**: This option cannot be updated using `updateOptions()`
    */
  var verticalHasArrows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Width in pixels for the vertical scrollbar.
    * Defaults to 10 (px).
    */
  var verticalScrollbarSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Width in pixels for the vertical slider.
    * Defaults to `verticalScrollbarSize`.
    * **NOTE**: This option cannot be updated using `updateOptions()`
    */
  var verticalSliderSize: js.UndefOr[Double] = js.undefined
}
object IEditorScrollbarOptions {
  
  inline def apply(): IEditorScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorScrollbarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEditorScrollbarOptions] (val x: Self) extends AnyVal {
    
    inline def setAlwaysConsumeMouseWheel(value: Boolean): Self = StObject.set(x, "alwaysConsumeMouseWheel", value.asInstanceOf[js.Any])
    
    inline def setAlwaysConsumeMouseWheelUndefined: Self = StObject.set(x, "alwaysConsumeMouseWheel", js.undefined)
    
    inline def setArrowSize(value: Double): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
    
    inline def setArrowSizeUndefined: Self = StObject.set(x, "arrowSize", js.undefined)
    
    inline def setHandleMouseWheel(value: Boolean): Self = StObject.set(x, "handleMouseWheel", value.asInstanceOf[js.Any])
    
    inline def setHandleMouseWheelUndefined: Self = StObject.set(x, "handleMouseWheel", js.undefined)
    
    inline def setHorizontal(value: auto | visible | hidden): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalHasArrows(value: Boolean): Self = StObject.set(x, "horizontalHasArrows", value.asInstanceOf[js.Any])
    
    inline def setHorizontalHasArrowsUndefined: Self = StObject.set(x, "horizontalHasArrows", js.undefined)
    
    inline def setHorizontalScrollbarSize(value: Double): Self = StObject.set(x, "horizontalScrollbarSize", value.asInstanceOf[js.Any])
    
    inline def setHorizontalScrollbarSizeUndefined: Self = StObject.set(x, "horizontalScrollbarSize", js.undefined)
    
    inline def setHorizontalSliderSize(value: Double): Self = StObject.set(x, "horizontalSliderSize", value.asInstanceOf[js.Any])
    
    inline def setHorizontalSliderSizeUndefined: Self = StObject.set(x, "horizontalSliderSize", js.undefined)
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setScrollByPage(value: Boolean): Self = StObject.set(x, "scrollByPage", value.asInstanceOf[js.Any])
    
    inline def setScrollByPageUndefined: Self = StObject.set(x, "scrollByPage", js.undefined)
    
    inline def setUseShadows(value: Boolean): Self = StObject.set(x, "useShadows", value.asInstanceOf[js.Any])
    
    inline def setUseShadowsUndefined: Self = StObject.set(x, "useShadows", js.undefined)
    
    inline def setVertical(value: auto | visible | hidden): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalHasArrows(value: Boolean): Self = StObject.set(x, "verticalHasArrows", value.asInstanceOf[js.Any])
    
    inline def setVerticalHasArrowsUndefined: Self = StObject.set(x, "verticalHasArrows", js.undefined)
    
    inline def setVerticalScrollbarSize(value: Double): Self = StObject.set(x, "verticalScrollbarSize", value.asInstanceOf[js.Any])
    
    inline def setVerticalScrollbarSizeUndefined: Self = StObject.set(x, "verticalScrollbarSize", js.undefined)
    
    inline def setVerticalSliderSize(value: Double): Self = StObject.set(x, "verticalSliderSize", value.asInstanceOf[js.Any])
    
    inline def setVerticalSliderSizeUndefined: Self = StObject.set(x, "verticalSliderSize", js.undefined)
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
