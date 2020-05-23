package typings.phaser.phaserMod.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Input.Touch")
@js.native
object Touch extends js.Object {
  /**
    * The Touch Manager is a helper class that belongs to the Input Manager.
    * 
    * Its role is to listen for native DOM Touch Events and then pass them onto the Input Manager for further processing.
    * 
    * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
    */
  @js.native
  class TouchManager protected ()
    extends typings.phaser.Phaser.Input.Touch.TouchManager {
    /**
      * 
      * @param inputManager A reference to the Input Manager.
      */
    def this(inputManager: typings.phaser.Phaser.Input.InputManager) = this()
    /**
      * If true the DOM events will have event.preventDefault applied to them, if false they will propagate fully.
      */
    /* CompleteClass */
    override var capture: Boolean = js.native
    /**
      * A boolean that controls if the Touch Manager is enabled or not.
      * Can be toggled on the fly.
      */
    /* CompleteClass */
    override var enabled: Boolean = js.native
    /**
      * A reference to the Input Manager.
      */
    /* CompleteClass */
    override var manager: typings.phaser.Phaser.Input.InputManager = js.native
    /**
      * The Touch Cancel event handler function.
      * Initially empty and bound in the `startListeners` method.
      */
    /* CompleteClass */
    override var onTouchCancel: js.Function = js.native
    /**
      * The Touch Cancel event handler function specifically for events on the Window.
      * Initially empty and bound in the `startListeners` method.
      */
    /* CompleteClass */
    override var onTouchCancelWindow: js.Function = js.native
    /**
      * The Touch End event handler function.
      * Initially empty and bound in the `startListeners` method.
      */
    /* CompleteClass */
    override var onTouchEnd: js.Function = js.native
    /**
      * The Touch End event handler function specifically for events on the Window.
      * Initially empty and bound in the `startListeners` method.
      */
    /* CompleteClass */
    override var onTouchEndWindow: js.Function = js.native
    /**
      * The Touch Move event handler function.
      * Initially empty and bound in the `startListeners` method.
      */
    /* CompleteClass */
    override var onTouchMove: js.Function = js.native
    /**
      * The Touch Out event handler function.
      * Initially empty and bound in the `startListeners` method.
      */
    /* CompleteClass */
    override var onTouchOut: js.Function = js.native
    /**
      * The Touch Over event handler function.
      * Initially empty and bound in the `startListeners` method.
      */
    /* CompleteClass */
    override var onTouchOver: js.Function = js.native
    /**
      * The Touch Start event handler function.
      * Initially empty and bound in the `startListeners` method.
      */
    /* CompleteClass */
    override var onTouchStart: js.Function = js.native
    /**
      * The Touch Start event handler function specifically for events on the Window.
      * Initially empty and bound in the `startListeners` method.
      */
    /* CompleteClass */
    override var onTouchStartWindow: js.Function = js.native
    /**
      * The Touch Event target, as defined in the Game Config.
      * Typically the canvas to which the game is rendering, but can be any interactive DOM element.
      */
    /* CompleteClass */
    override var target: js.Any = js.native
    /**
      * Destroys this Touch Manager instance.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /**
      * Attempts to disable the context menu from appearing if you touch-hold on the browser.
      * 
      * Works by listening for the `contextmenu` event and prevent defaulting it.
      * 
      * Use this if you need to disable the OS context menu on mobile.
      */
    /* CompleteClass */
    override def disableContextMenu(): this.type = js.native
    /**
      * Starts the Touch Event listeners running as long as an input target is set.
      * 
      * This method is called automatically if Touch Input is enabled in the game config,
      * which it is by default. However, you can call it manually should you need to
      * delay input capturing until later in the game.
      */
    /* CompleteClass */
    override def startListeners(): Unit = js.native
    /**
      * Stops the Touch Event listeners.
      * This is called automatically and does not need to be manually invoked.
      */
    /* CompleteClass */
    override def stopListeners(): Unit = js.native
  }
  
}

