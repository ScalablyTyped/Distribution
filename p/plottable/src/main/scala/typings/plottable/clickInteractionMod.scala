package typings.plottable

import typings.plottable.interactionMod.Interaction
import typings.plottable.interfacesMod.Point
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clickInteractionMod {
  
  @JSImport("plottable/build/src/interactions/clickInteraction", "Click")
  @js.native
  open class Click () extends Interaction {
    
    /* private */ var _clickedDown: Any = js.native
    
    /* private */ var _clickedPoint: Any = js.native
    
    /* private */ var _dblClickCallback: Any = js.native
    
    /* private */ var _doubleClicking: Any = js.native
    
    /* private */ var _handleClickDown: Any = js.native
    
    /* private */ var _handleClickUp: Any = js.native
    
    /* private */ var _handleDblClick: Any = js.native
    
    /* private */ var _mouseDispatcher: Any = js.native
    
    /**
      * Note: we bind to mousedown, mouseup, touchstart and touchend because browsers
      * have a 300ms delay between touchstart and click to allow for scrolling cancelling etc.
      */
    /* private */ var _mouseDownCallback: Any = js.native
    
    /* private */ var _mouseUpCallback: Any = js.native
    
    /* private */ var _onClickCallbacks: Any = js.native
    
    /* private */ var _onDoubleClickCallbacks: Any = js.native
    
    /* private */ var _touchCancelCallback: Any = js.native
    
    /* private */ var _touchDispatcher: Any = js.native
    
    /* private */ var _touchEndCallback: Any = js.native
    
    /* private */ var _touchStartCallback: Any = js.native
    
    /**
      * Removes a callback that would be called when the Component is clicked.
      *
      * @param {ClickCallback} callback
      * @return {Interactions.Click} The calling Click Interaction.
      */
    def offClick(callback: ClickCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when the Component is double-clicked.
      *
      * @param {ClickCallback} callback
      * @return {Interactions.Click} The calling Click Interaction.
      */
    def offDoubleClick(callback: ClickCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when the Component is clicked.
      *
      * @param {ClickCallback} callback
      * @return {Interactions.Click} The calling Click Interaction.
      */
    def onClick(callback: ClickCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when the Component is double-clicked.
      *
      * @param {ClickCallback} callback
      * @return {Interactions.Click} The calling Click Interaction.
      */
    def onDoubleClick(callback: ClickCallback): this.type = js.native
  }
  /* static members */
  object Click {
    
    @JSImport("plottable/build/src/interactions/clickInteraction", "Click")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/interactions/clickInteraction", "Click._pointsEqual")
    @js.native
    def _pointsEqual: Any = js.native
    inline def _pointsEqual_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointsEqual")(x.asInstanceOf[js.Any])
  }
  
  type ClickCallback = js.Function2[/* point */ Point, /* event */ MouseEvent | TouchEvent, Unit]
}
