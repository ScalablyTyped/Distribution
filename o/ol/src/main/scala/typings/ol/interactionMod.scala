package typings.ol

import typings.ol.interactionDoubleClickZoomMod.Options
import typings.ol.interactionDoubleClickZoomMod.default
import typings.ol.interactionInteractionMod.InteractionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionMod {
  
  @JSImport("ol/interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/interaction", "DoubleClickZoom")
  @js.native
  open class DoubleClickZoom () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/interaction", "DragAndDrop")
  @js.native
  open class DragAndDrop ()
    extends typings.ol.interactionDragAndDropMod.default {
    def this(opt_options: typings.ol.interactionDragAndDropMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragBox")
  @js.native
  open class DragBox ()
    extends typings.ol.interactionDragBoxMod.default {
    def this(opt_options: typings.ol.interactionDragBoxMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragPan")
  @js.native
  open class DragPan ()
    extends typings.ol.interactionDragPanMod.default {
    def this(opt_options: typings.ol.interactionDragPanMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragRotate")
  @js.native
  open class DragRotate ()
    extends typings.ol.interactionDragRotateMod.default {
    def this(opt_options: typings.ol.interactionDragRotateMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragRotateAndZoom")
  @js.native
  open class DragRotateAndZoom ()
    extends typings.ol.interactionDragRotateAndZoomMod.default {
    def this(opt_options: typings.ol.interactionDragRotateAndZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragZoom")
  @js.native
  open class DragZoom ()
    extends typings.ol.interactionDragZoomMod.default {
    def this(opt_options: typings.ol.interactionDragZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Draw")
  @js.native
  open class Draw protected ()
    extends typings.ol.interactionDrawMod.default {
    def this(options: typings.ol.interactionDrawMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Extent")
  @js.native
  open class Extent ()
    extends typings.ol.interactionExtentMod.default {
    def this(opt_options: typings.ol.interactionExtentMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Interaction")
  @js.native
  open class Interaction ()
    extends typings.ol.interactionInteractionMod.default {
    def this(opt_options: InteractionOptions) = this()
  }
  
  @JSImport("ol/interaction", "KeyboardPan")
  @js.native
  open class KeyboardPan ()
    extends typings.ol.interactionKeyboardPanMod.default {
    def this(opt_options: typings.ol.interactionKeyboardPanMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "KeyboardZoom")
  @js.native
  open class KeyboardZoom ()
    extends typings.ol.interactionKeyboardZoomMod.default {
    def this(opt_options: typings.ol.interactionKeyboardZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Modify")
  @js.native
  open class Modify protected ()
    extends typings.ol.interactionModifyMod.default {
    def this(options: typings.ol.interactionModifyMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "MouseWheelZoom")
  @js.native
  open class MouseWheelZoom ()
    extends typings.ol.interactionMouseWheelZoomMod.default {
    def this(opt_options: typings.ol.interactionMouseWheelZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "PinchRotate")
  @js.native
  open class PinchRotate ()
    extends typings.ol.interactionPinchRotateMod.default {
    def this(opt_options: typings.ol.interactionPinchRotateMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "PinchZoom")
  @js.native
  open class PinchZoom ()
    extends typings.ol.interactionPinchZoomMod.default {
    def this(opt_options: typings.ol.interactionPinchZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Pointer")
  @js.native
  open class Pointer ()
    extends typings.ol.interactionPointerMod.default {
    def this(opt_options: typings.ol.interactionPointerMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Select")
  @js.native
  open class Select ()
    extends typings.ol.interactionSelectMod.default {
    def this(opt_options: typings.ol.interactionSelectMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Snap")
  @js.native
  open class Snap ()
    extends typings.ol.interactionSnapMod.default {
    def this(opt_options: typings.ol.interactionSnapMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Translate")
  @js.native
  open class Translate ()
    extends typings.ol.interactionTranslateMod.default {
    def this(opt_options: typings.ol.interactionTranslateMod.Options) = this()
  }
  
  inline def defaults(): typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default]]
  inline def defaults(opt_options: DefaultsOptions): typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opt_options.asInstanceOf[js.Any]).asInstanceOf[typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default]]
  
  trait DefaultsOptions extends StObject {
    
    var altShiftDragRotate: js.UndefOr[Boolean] = js.undefined
    
    var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
    
    var dragPan: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var mouseWheelZoom: js.UndefOr[Boolean] = js.undefined
    
    var onFocusOnly: js.UndefOr[Boolean] = js.undefined
    
    var pinchRotate: js.UndefOr[Boolean] = js.undefined
    
    var pinchZoom: js.UndefOr[Boolean] = js.undefined
    
    var shiftDragZoom: js.UndefOr[Boolean] = js.undefined
    
    var zoomDelta: js.UndefOr[Double] = js.undefined
    
    var zoomDuration: js.UndefOr[Double] = js.undefined
  }
  object DefaultsOptions {
    
    inline def apply(): DefaultsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsOptions]
    }
    
    extension [Self <: DefaultsOptions](x: Self) {
      
      inline def setAltShiftDragRotate(value: Boolean): Self = StObject.set(x, "altShiftDragRotate", value.asInstanceOf[js.Any])
      
      inline def setAltShiftDragRotateUndefined: Self = StObject.set(x, "altShiftDragRotate", js.undefined)
      
      inline def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
      
      inline def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
      
      inline def setDragPan(value: Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
      
      inline def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setMouseWheelZoom(value: Boolean): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
      
      inline def setMouseWheelZoomUndefined: Self = StObject.set(x, "mouseWheelZoom", js.undefined)
      
      inline def setOnFocusOnly(value: Boolean): Self = StObject.set(x, "onFocusOnly", value.asInstanceOf[js.Any])
      
      inline def setOnFocusOnlyUndefined: Self = StObject.set(x, "onFocusOnly", js.undefined)
      
      inline def setPinchRotate(value: Boolean): Self = StObject.set(x, "pinchRotate", value.asInstanceOf[js.Any])
      
      inline def setPinchRotateUndefined: Self = StObject.set(x, "pinchRotate", js.undefined)
      
      inline def setPinchZoom(value: Boolean): Self = StObject.set(x, "pinchZoom", value.asInstanceOf[js.Any])
      
      inline def setPinchZoomUndefined: Self = StObject.set(x, "pinchZoom", js.undefined)
      
      inline def setShiftDragZoom(value: Boolean): Self = StObject.set(x, "shiftDragZoom", value.asInstanceOf[js.Any])
      
      inline def setShiftDragZoomUndefined: Self = StObject.set(x, "shiftDragZoom", js.undefined)
      
      inline def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
      
      inline def setZoomDeltaUndefined: Self = StObject.set(x, "zoomDelta", js.undefined)
      
      inline def setZoomDuration(value: Double): Self = StObject.set(x, "zoomDuration", value.asInstanceOf[js.Any])
      
      inline def setZoomDurationUndefined: Self = StObject.set(x, "zoomDuration", js.undefined)
    }
  }
}
