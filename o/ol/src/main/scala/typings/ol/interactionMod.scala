package typings.ol

import typings.ol.doubleClickZoomMod.Options
import typings.ol.doubleClickZoomMod.default
import typings.ol.interactionInteractionMod.InteractionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionMod {
  
  @JSImport("ol/interaction", "DoubleClickZoom")
  @js.native
  class DoubleClickZoom () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/interaction", "DragAndDrop")
  @js.native
  class DragAndDrop ()
    extends typings.ol.dragAndDropMod.default {
    def this(opt_options: typings.ol.dragAndDropMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragBox")
  @js.native
  class DragBox ()
    extends typings.ol.dragBoxMod.default {
    def this(opt_options: typings.ol.dragBoxMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragPan")
  @js.native
  class DragPan ()
    extends typings.ol.dragPanMod.default {
    def this(opt_options: typings.ol.dragPanMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragRotate")
  @js.native
  class DragRotate ()
    extends typings.ol.dragRotateMod.default {
    def this(opt_options: typings.ol.dragRotateMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragRotateAndZoom")
  @js.native
  class DragRotateAndZoom ()
    extends typings.ol.dragRotateAndZoomMod.default {
    def this(opt_options: typings.ol.dragRotateAndZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragZoom")
  @js.native
  class DragZoom ()
    extends typings.ol.dragZoomMod.default {
    def this(opt_options: typings.ol.dragZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Draw")
  @js.native
  class Draw protected ()
    extends typings.ol.drawMod.default {
    def this(options: typings.ol.drawMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Extent")
  @js.native
  class Extent ()
    extends typings.ol.interactionExtentMod.default {
    def this(opt_options: typings.ol.interactionExtentMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Interaction")
  @js.native
  class Interaction ()
    extends typings.ol.interactionInteractionMod.default {
    def this(opt_options: InteractionOptions) = this()
  }
  
  @JSImport("ol/interaction", "KeyboardPan")
  @js.native
  class KeyboardPan ()
    extends typings.ol.keyboardPanMod.default {
    def this(opt_options: typings.ol.keyboardPanMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "KeyboardZoom")
  @js.native
  class KeyboardZoom ()
    extends typings.ol.keyboardZoomMod.default {
    def this(opt_options: typings.ol.keyboardZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Modify")
  @js.native
  class Modify protected ()
    extends typings.ol.modifyMod.default {
    def this(options: typings.ol.modifyMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "MouseWheelZoom")
  @js.native
  class MouseWheelZoom ()
    extends typings.ol.mouseWheelZoomMod.default {
    def this(opt_options: typings.ol.mouseWheelZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "PinchRotate")
  @js.native
  class PinchRotate ()
    extends typings.ol.pinchRotateMod.default {
    def this(opt_options: typings.ol.pinchRotateMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "PinchZoom")
  @js.native
  class PinchZoom ()
    extends typings.ol.pinchZoomMod.default {
    def this(opt_options: typings.ol.pinchZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Pointer")
  @js.native
  class Pointer ()
    extends typings.ol.pointerMod.default {
    def this(opt_options: typings.ol.pointerMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Select")
  @js.native
  class Select ()
    extends typings.ol.selectMod.default {
    def this(opt_options: typings.ol.selectMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Snap")
  @js.native
  class Snap ()
    extends typings.ol.snapMod.default {
    def this(opt_options: typings.ol.snapMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Translate")
  @js.native
  class Translate ()
    extends typings.ol.translateMod.default {
    def this(opt_options: typings.ol.translateMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "defaults")
  @js.native
  def defaults(): typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = js.native
  @JSImport("ol/interaction", "defaults")
  @js.native
  def defaults(opt_options: DefaultsOptions): typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = js.native
  
  @js.native
  trait DefaultsOptions extends StObject {
    
    var altShiftDragRotate: js.UndefOr[Boolean] = js.native
    
    var doubleClickZoom: js.UndefOr[Boolean] = js.native
    
    var dragPan: js.UndefOr[Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var mouseWheelZoom: js.UndefOr[Boolean] = js.native
    
    var onFocusOnly: js.UndefOr[Boolean] = js.native
    
    var pinchRotate: js.UndefOr[Boolean] = js.native
    
    var pinchZoom: js.UndefOr[Boolean] = js.native
    
    var shiftDragZoom: js.UndefOr[Boolean] = js.native
    
    var zoomDelta: js.UndefOr[Double] = js.native
    
    var zoomDuration: js.UndefOr[Double] = js.native
  }
  object DefaultsOptions {
    
    @scala.inline
    def apply(): DefaultsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsOptions]
    }
    
    @scala.inline
    implicit class DefaultsOptionsMutableBuilder[Self <: DefaultsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltShiftDragRotate(value: Boolean): Self = StObject.set(x, "altShiftDragRotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltShiftDragRotateUndefined: Self = StObject.set(x, "altShiftDragRotate", js.undefined)
      
      @scala.inline
      def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
      
      @scala.inline
      def setDragPan(value: Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMouseWheelZoom(value: Boolean): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseWheelZoomUndefined: Self = StObject.set(x, "mouseWheelZoom", js.undefined)
      
      @scala.inline
      def setOnFocusOnly(value: Boolean): Self = StObject.set(x, "onFocusOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusOnlyUndefined: Self = StObject.set(x, "onFocusOnly", js.undefined)
      
      @scala.inline
      def setPinchRotate(value: Boolean): Self = StObject.set(x, "pinchRotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinchRotateUndefined: Self = StObject.set(x, "pinchRotate", js.undefined)
      
      @scala.inline
      def setPinchZoom(value: Boolean): Self = StObject.set(x, "pinchZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinchZoomUndefined: Self = StObject.set(x, "pinchZoom", js.undefined)
      
      @scala.inline
      def setShiftDragZoom(value: Boolean): Self = StObject.set(x, "shiftDragZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftDragZoomUndefined: Self = StObject.set(x, "shiftDragZoom", js.undefined)
      
      @scala.inline
      def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomDeltaUndefined: Self = StObject.set(x, "zoomDelta", js.undefined)
      
      @scala.inline
      def setZoomDuration(value: Double): Self = StObject.set(x, "zoomDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomDurationUndefined: Self = StObject.set(x, "zoomDuration", js.undefined)
    }
  }
}
