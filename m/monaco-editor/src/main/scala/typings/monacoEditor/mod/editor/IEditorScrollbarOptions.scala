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
    */
  var alwaysConsumeMouseWheel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of arrows (if displayed).
    * Defaults to 11.
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
    */
  var horizontalSliderSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Cast horizontal and vertical shadows when the content is scrolled.
    * Defaults to true.
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
    */
  var verticalSliderSize: js.UndefOr[Double] = js.undefined
}
object IEditorScrollbarOptions {
  
  @scala.inline
  def apply(): IEditorScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorScrollbarOptions]
  }
  
  @scala.inline
  implicit class IEditorScrollbarOptionsMutableBuilder[Self <: IEditorScrollbarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysConsumeMouseWheel(value: Boolean): Self = StObject.set(x, "alwaysConsumeMouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysConsumeMouseWheelUndefined: Self = StObject.set(x, "alwaysConsumeMouseWheel", js.undefined)
    
    @scala.inline
    def setArrowSize(value: Double): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowSizeUndefined: Self = StObject.set(x, "arrowSize", js.undefined)
    
    @scala.inline
    def setHandleMouseWheel(value: Boolean): Self = StObject.set(x, "handleMouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleMouseWheelUndefined: Self = StObject.set(x, "handleMouseWheel", js.undefined)
    
    @scala.inline
    def setHorizontal(value: auto | visible | hidden): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalHasArrows(value: Boolean): Self = StObject.set(x, "horizontalHasArrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalHasArrowsUndefined: Self = StObject.set(x, "horizontalHasArrows", js.undefined)
    
    @scala.inline
    def setHorizontalScrollbarSize(value: Double): Self = StObject.set(x, "horizontalScrollbarSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalScrollbarSizeUndefined: Self = StObject.set(x, "horizontalScrollbarSize", js.undefined)
    
    @scala.inline
    def setHorizontalSliderSize(value: Double): Self = StObject.set(x, "horizontalSliderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalSliderSizeUndefined: Self = StObject.set(x, "horizontalSliderSize", js.undefined)
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setUseShadows(value: Boolean): Self = StObject.set(x, "useShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseShadowsUndefined: Self = StObject.set(x, "useShadows", js.undefined)
    
    @scala.inline
    def setVertical(value: auto | visible | hidden): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalHasArrows(value: Boolean): Self = StObject.set(x, "verticalHasArrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalHasArrowsUndefined: Self = StObject.set(x, "verticalHasArrows", js.undefined)
    
    @scala.inline
    def setVerticalScrollbarSize(value: Double): Self = StObject.set(x, "verticalScrollbarSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalScrollbarSizeUndefined: Self = StObject.set(x, "verticalScrollbarSize", js.undefined)
    
    @scala.inline
    def setVerticalSliderSize(value: Double): Self = StObject.set(x, "verticalSliderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalSliderSizeUndefined: Self = StObject.set(x, "verticalSliderSize", js.undefined)
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
