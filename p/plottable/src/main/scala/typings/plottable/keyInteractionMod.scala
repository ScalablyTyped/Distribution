package typings.plottable

import typings.plottable.interactionMod.Interaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/interactions/keyInteraction", JSImport.Namespace)
@js.native
object keyInteractionMod extends js.Object {
  @js.native
  class Key () extends Interaction {
    var _downedKeys: js.Any = js.native
    var _keyDispatcher: js.Any = js.native
    var _keyDownCallback: js.Any = js.native
    var _keyPressCallbacks: js.Any = js.native
    var _keyReleaseCallbacks: js.Any = js.native
    var _keyUpCallback: js.Any = js.native
    var _mouseMoveCallback: js.Any = js.native
    /**
      * A Key Interaction listens to key events that occur while the Component is
      * moused over.
      */
    var _positionDispatcher: js.Any = js.native
    /* private */ def _handleKeyDownEvent(keyCode: js.Any, event: js.Any): js.Any = js.native
    /* private */ def _handleKeyUpEvent(keyCode: js.Any): js.Any = js.native
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

