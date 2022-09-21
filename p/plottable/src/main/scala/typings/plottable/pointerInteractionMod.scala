package typings.plottable

import typings.plottable.interactionMod.Interaction
import typings.plottable.interfacesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerInteractionMod {
  
  @JSImport("plottable/build/src/interactions/pointerInteraction", "Pointer")
  @js.native
  open class Pointer () extends Interaction {
    
    /* private */ var _handleMouseEvent: Any = js.native
    
    /* private */ var _handlePointerEvent: Any = js.native
    
    /* private */ var _handleTouchEvent: Any = js.native
    
    /* private */ var _mouseDispatcher: Any = js.native
    
    /* private */ var _mouseMoveCallback: Any = js.native
    
    /* private */ var _overComponent: Any = js.native
    
    /* private */ var _pointerEnterCallbacks: Any = js.native
    
    /* private */ var _pointerExitCallbacks: Any = js.native
    
    /* private */ var _pointerMoveCallbacks: Any = js.native
    
    /* private */ var _touchDispatcher: Any = js.native
    
    /* private */ var _touchStartCallback: Any = js.native
    
    /**
      * Removes a callback that would be called when the pointer enters the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def offPointerEnter(callback: PointerCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when the pointer exits the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def offPointerExit(callback: PointerCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when the pointer moves within the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def offPointerMove(callback: PointerCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when the pointer enters the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def onPointerEnter(callback: PointerCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when the pointer exits the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def onPointerExit(callback: PointerCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when the pointer moves within the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def onPointerMove(callback: PointerCallback): this.type = js.native
  }
  
  type PointerCallback = js.Function1[/* point */ Point, Unit]
}
