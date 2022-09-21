package typings.plottable

import typings.plottable.interactionMod.Interaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyInteractionMod {
  
  @JSImport("plottable/build/src/interactions/keyInteraction", "Key")
  @js.native
  open class Key () extends Interaction {
    
    /* private */ var _downedKeys: Any = js.native
    
    /* private */ var _handleKeyDownEvent: Any = js.native
    
    /* private */ var _handleKeyUpEvent: Any = js.native
    
    /* private */ var _keyDispatcher: Any = js.native
    
    /* private */ var _keyDownCallback: Any = js.native
    
    /* private */ var _keyPressCallbacks: Any = js.native
    
    /* private */ var _keyReleaseCallbacks: Any = js.native
    
    /* private */ var _keyUpCallback: Any = js.native
    
    /* private */ var _mouseMoveCallback: Any = js.native
    
    /**
      * A Key Interaction listens to key events that occur while the Component is
      * moused over.
      */
    /* private */ var _positionDispatcher: Any = js.native
    
    /**
      * Removes a callback that would be called when the key with the given keyCode is
      * pressed and the user is moused over the Component.
      *
      * @param {number} keyCode
      * @param {KeyCallback} callback
      * @returns {Interactions.Key} The calling Key Interaction.
      */
    def offKeyPress(keyCode: Double, callback: KeyCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when the key with the given keyCode is
      * released if the key was pressed with the mouse inside of the Component.
      *
      * @param {number} keyCode
      * @param {KeyCallback} callback
      * @returns {Interactions.Key} The calling Key Interaction.
      */
    def offKeyRelease(keyCode: Double, callback: KeyCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when the key with the given keyCode is
      * pressed and the user is moused over the Component.
      *
      * @param {number} keyCode
      * @param {KeyCallback} callback
      * @returns {Interactions.Key} The calling Key Interaction.
      */
    def onKeyPress(keyCode: Double, callback: KeyCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when the key with the given keyCode is
      * released if the key was pressed with the mouse inside of the Component.
      *
      * @param {number} keyCode
      * @param {KeyCallback} callback
      * @returns {Interactions.Key} The calling Key Interaction.
      */
    def onKeyRelease(keyCode: Double, callback: KeyCallback): this.type = js.native
  }
  
  type KeyCallback = js.Function1[/* keyCode */ Double, Unit]
}
