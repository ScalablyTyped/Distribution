package typings
package phaserLib.phaserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Input")
@js.native
object InputNs extends js.Object {
  /**
    * The Input Manager is responsible for handling the pointer related systems in a single Phaser Game instance.
    * 
    * Based on the Game Config it will create handlers for mouse and touch support.
    * 
    * Keyboard and Gamepad are plugins, handled directly by the InputPlugin class.
    * 
    * It then manages the event queue, pointer creation and general hit test related operations.
    * 
    * You rarely need to interact with the Input Manager directly, and as such, all of its properties and methods
    * should be considered private. Instead, you should use the Input Plugin, which is a Scene level system, responsible
    * for dealing with all input events for a Scene.
    */
  @js.native
  class InputManager protected ()
    extends phaserLib.PhaserNs.InputNs.InputManager {
    /**
      * 
      * @param game The Game instance that owns the Input Manager.
      * @param config The Input Configuration object, as set in the Game Config.
      */
    def this(game: phaserLib.PhaserNs.Game, config: js.Object) = this()
  }
  
  /**
    * The Input Plugin belongs to a Scene and handles all input related events and operations for it.
    * 
    * You can access it from within a Scene using `this.input`.
    * 
    * It emits events directly. For example, you can do:
    * 
    * ```javascript
    * this.input.on('pointerdown', callback, context);
    * ```
    * 
    * To listen for a pointer down event anywhere on the game canvas.
    * 
    * Game Objects can be enabled for input by calling their `setInteractive` method. After which they
    * will directly emit input events:
    * 
    * ```javascript
    * var sprite = this.add.sprite(x, y, texture);
    * sprite.setInteractive();
    * sprite.on('pointerdown', callback, context);
    * ```
    * 
    * Please see the Input examples and tutorials for more information.
    */
  @js.native
  class InputPlugin protected ()
    extends phaserLib.PhaserNs.InputNs.InputPlugin {
    /**
      * 
      * @param scene A reference to the Scene that this Input Plugin is responsible for.
      */
    def this(scene: phaserLib.PhaserNs.Scene) = this()
  }
  
  /**
    * A Pointer object encapsulates both mouse and touch input within Phaser.
    * 
    * By default, Phaser will create 2 pointers for your game to use. If you require more, i.e. for a multi-touch
    * game, then use the `InputPlugin.addPointer` method to do so, rather than instantiating this class directly,
    * otherwise it won't be managed by the input system.
    * 
    * You can reference the current active pointer via `InputPlugin.activePointer`. You can also use the properties
    * `InputPlugin.pointer1` through to `pointer10`, for each pointer you have enabled in your game.
    * 
    * The properties of this object are set by the Input Plugin during processing. This object is then sent in all
    * input related events that the Input Plugin emits, so you can reference properties from it directly in your
    * callbacks.
    */
  @js.native
  class Pointer protected ()
    extends phaserLib.PhaserNs.InputNs.Pointer {
    /**
      * 
      * @param manager A reference to the Input Manager.
      * @param id The internal ID of this Pointer.
      */
    def this(manager: phaserLib.PhaserNs.InputNs.InputManager, id: phaserLib.integer) = this()
  }
  
  /**
    * The mouse pointer is being held down.
    */
  var MOUSE_DOWN: phaserLib.integer = js.native
  /**
    * The mouse pointer is being moved.
    */
  var MOUSE_MOVE: phaserLib.integer = js.native
  /**
    * The mouse pointer is released.
    */
  var MOUSE_UP: phaserLib.integer = js.native
  /**
    * The pointer lock has changed.
    */
  var POINTER_LOCK_CHANGE: phaserLib.integer = js.native
  /**
    * A touch pointer has been been cancelled by the browser.
    */
  var TOUCH_CANCEL: phaserLib.integer = js.native
  /**
    * A touch pointer has been started.
    */
  var TOUCH_END: phaserLib.integer = js.native
  /**
    * A touch pointer has been started.
    */
  var TOUCH_MOVE: phaserLib.integer = js.native
  /**
    * A touch pointer has been started.
    */
  var TOUCH_START: phaserLib.integer = js.native
  /**
    * Creates a new Interactive Object.
    * 
    * This is called automatically by the Input Manager when you enable a Game Object for input.
    * 
    * The resulting Interactive Object is mapped to the Game Object's `input` property.
    * @param gameObject The Game Object to which this Interactive Object is bound.
    * @param hitArea The hit area for this Interactive Object. Typically a geometry shape, like a Rectangle or Circle.
    * @param hitAreaCallback The 'contains' check callback that the hit area shape will use for all hit tests.
    */
  def CreateInteractiveObject(
    gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    hitArea: js.Any,
    hitAreaCallback: phaserLib.PhaserNs.TypesNs.InputNs.HitAreaCallback
  ): phaserLib.PhaserNs.TypesNs.InputNs.InteractiveObject = js.native
  /**
    * Creates a new Pixel Perfect Handler function.
    * 
    * Access via `InputPlugin.makePixelPerfect` rather than calling it directly.
    * @param textureManager A reference to the Texture Manager.
    * @param alphaTolerance The alpha level that the pixel should be above to be included as a successful interaction.
    */
  def CreatePixelPerfectHandler(textureManager: phaserLib.PhaserNs.TexturesNs.TextureManager, alphaTolerance: phaserLib.integer): js.Function = js.native
  @JSName("Events")
  @js.native
  object EventsNs extends js.Object {
    /**
      * The Input Plugin Boot Event.
      * 
      * This internal event is dispatched by the Input Plugin when it boots, signalling to all of its systems to create themselves.
      */
    val BOOT: js.Any = js.native
    /**
      * The Input Plugin Destroy Event.
      * 
      * This internal event is dispatched by the Input Plugin when it is destroyed, signalling to all of its systems to destroy themselves.
      */
    val DESTROY: js.Any = js.native
    /**
      * The Pointer Drag Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer moves while dragging a Game Object.
      * 
      * Listen to this event from within a Scene using: `this.input.on('drag', listener)`.
      * 
      * A Pointer can only drag a single Game Object at once.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_DRAG]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_DRAG} event instead.
      */
    val DRAG: js.Any = js.native
    /**
      * The Pointer Drag End Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer stops dragging a Game Object.
      * 
      * Listen to this event from within a Scene using: `this.input.on('dragend', listener)`.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_DRAG_END]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_DRAG_END} event instead.
      */
    val DRAG_END: js.Any = js.native
    /**
      * The Pointer Drag Enter Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer drags a Game Object into a Drag Target.
      * 
      * Listen to this event from within a Scene using: `this.input.on('dragenter', listener)`.
      * 
      * A Pointer can only drag a single Game Object at once.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_DRAG_ENTER]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_DRAG_ENTER} event instead.
      */
    val DRAG_ENTER: js.Any = js.native
    /**
      * The Pointer Drag Leave Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer drags a Game Object out of a Drag Target.
      * 
      * Listen to this event from within a Scene using: `this.input.on('dragleave', listener)`.
      * 
      * A Pointer can only drag a single Game Object at once.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_DRAG_LEAVE]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_DRAG_LEAVE} event instead.
      */
    val DRAG_LEAVE: js.Any = js.native
    /**
      * The Pointer Drag Over Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer drags a Game Object over a Drag Target.
      * 
      * When the Game Object first enters the drag target it will emit a `dragenter` event. If it then moves while within
      * the drag target, it will emit this event instead.
      * 
      * Listen to this event from within a Scene using: `this.input.on('dragover', listener)`.
      * 
      * A Pointer can only drag a single Game Object at once.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_DRAG_OVER]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_DRAG_OVER} event instead.
      */
    val DRAG_OVER: js.Any = js.native
    /**
      * The Pointer Drag Start Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer starts to drag any Game Object.
      * 
      * Listen to this event from within a Scene using: `this.input.on('dragstart', listener)`.
      * 
      * A Pointer can only drag a single Game Object at once.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_DRAG_START]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_DRAG_START} event instead.
      */
    val DRAG_START: js.Any = js.native
    /**
      * The Pointer Drop Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer drops a Game Object on a Drag Target.
      * 
      * Listen to this event from within a Scene using: `this.input.on('drop', listener)`.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_DROP]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_DROP} event instead.
      */
    val DROP: js.Any = js.native
    /**
      * The Game Object Down Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer is pressed down on _any_ interactive Game Object.
      * 
      * Listen to this event from within a Scene using: `this.input.on('gameobjectdown', listener)`.
      * 
      * To receive this event, the Game Objects must have been set as interactive.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_POINTER_DOWN]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_DOWN} event instead.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_DOWN]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_DOWN}
      * 2. [GAMEOBJECT_DOWN]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_DOWN}
      * 3. [POINTER_DOWN]{@linkcode Phaser.Input.Events#event:POINTER_DOWN} or [POINTER_DOWN_OUTSIDE]{@linkcode Phaser.Input.Events#event:POINTER_DOWN_OUTSIDE}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val GAMEOBJECT_DOWN: js.Any = js.native
    /**
      * The Game Object Drag Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer moves while dragging it.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('drag', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive and enabled for drag.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      */
    val GAMEOBJECT_DRAG: js.Any = js.native
    /**
      * The Game Object Drag End Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer stops dragging it.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('dragend', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive and enabled for drag.
      * See [GameObject.setInteractive](Phaser.GameObjects.GameObject#setInteractive) for more details.
      */
    val GAMEOBJECT_DRAG_END: js.Any = js.native
    /**
      * The Game Object Drag Enter Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer drags it into a drag target.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('dragenter', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive and enabled for drag.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      */
    val GAMEOBJECT_DRAG_ENTER: js.Any = js.native
    /**
      * The Game Object Drag Leave Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer drags it out of a drag target.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('dragleave', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive and enabled for drag.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      */
    val GAMEOBJECT_DRAG_LEAVE: js.Any = js.native
    /**
      * The Game Object Drag Over Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer drags it over a drag target.
      * 
      * When the Game Object first enters the drag target it will emit a `dragenter` event. If it then moves while within
      * the drag target, it will emit this event instead.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('dragover', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive and enabled for drag.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      */
    val GAMEOBJECT_DRAG_OVER: js.Any = js.native
    /**
      * The Game Object Drag Start Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer starts to drag it.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('dragstart', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive and enabled for drag.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      * 
      * There are lots of useful drag related properties that are set within the Game Object when dragging occurs.
      * For example, `gameObject.input.dragStartX`, `dragStartY` and so on.
      */
    val GAMEOBJECT_DRAG_START: js.Any = js.native
    /**
      * The Game Object Drop Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer drops it on a Drag Target.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('drop', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive and enabled for drag.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      */
    val GAMEOBJECT_DROP: js.Any = js.native
    /**
      * The Game Object Move Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer is moved across _any_ interactive Game Object.
      * 
      * Listen to this event from within a Scene using: `this.input.on('gameobjectmove', listener)`.
      * 
      * To receive this event, the Game Objects must have been set as interactive.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_POINTER_MOVE]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_MOVE} event instead.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_MOVE]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_MOVE}
      * 2. [GAMEOBJECT_MOVE]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_MOVE}
      * 3. [POINTER_MOVE]{@linkcode Phaser.Input.Events#event:POINTER_MOVE}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val GAMEOBJECT_MOVE: js.Any = js.native
    /**
      * The Game Object Out Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer moves out of _any_ interactive Game Object.
      * 
      * Listen to this event from within a Scene using: `this.input.on('gameobjectout', listener)`.
      * 
      * To receive this event, the Game Objects must have been set as interactive.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_POINTER_OUT]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_OUT} event instead.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_OUT]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_OUT}
      * 2. [GAMEOBJECT_OUT]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_OUT}
      * 3. [POINTER_OUT]{@linkcode Phaser.Input.Events#event:POINTER_OUT}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val GAMEOBJECT_OUT: js.Any = js.native
    /**
      * The Game Object Over Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer moves over _any_ interactive Game Object.
      * 
      * Listen to this event from within a Scene using: `this.input.on('gameobjectover', listener)`.
      * 
      * To receive this event, the Game Objects must have been set as interactive.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_POINTER_OVER]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_OVER} event instead.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_OVER]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_OVER}
      * 2. [GAMEOBJECT_OVER]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_OVER}
      * 3. [POINTER_OVER]{@linkcode Phaser.Input.Events#event:POINTER_OVER}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val GAMEOBJECT_OVER: js.Any = js.native
    /**
      * The Game Object Pointer Down Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer is pressed down on it.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('pointerdown', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_DOWN]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_DOWN}
      * 2. [GAMEOBJECT_DOWN]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_DOWN}
      * 3. [POINTER_DOWN]{@linkcode Phaser.Input.Events#event:POINTER_DOWN} or [POINTER_DOWN_OUTSIDE]{@linkcode Phaser.Input.Events#event:POINTER_DOWN_OUTSIDE}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val GAMEOBJECT_POINTER_DOWN: js.Any = js.native
    /**
      * The Game Object Pointer Move Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer is moved while over it.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('pointermove', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_MOVE]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_MOVE}
      * 2. [GAMEOBJECT_MOVE]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_MOVE}
      * 3. [POINTER_MOVE]{@linkcode Phaser.Input.Events#event:POINTER_MOVE}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val GAMEOBJECT_POINTER_MOVE: js.Any = js.native
    /**
      * The Game Object Pointer Out Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer moves out of it.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('pointerout', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_OUT]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_OUT}
      * 2. [GAMEOBJECT_OUT]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_OUT}
      * 3. [POINTER_OUT]{@linkcode Phaser.Input.Events#event:POINTER_OUT}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val GAMEOBJECT_POINTER_OUT: js.Any = js.native
    /**
      * The Game Object Pointer Over Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer moves over it.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('pointerover', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_OVER]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_OVER}
      * 2. [GAMEOBJECT_OVER]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_OVER}
      * 3. [POINTER_OVER]{@linkcode Phaser.Input.Events#event:POINTER_OVER}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val GAMEOBJECT_POINTER_OVER: js.Any = js.native
    /**
      * The Game Object Pointer Up Event.
      * 
      * This event is dispatched by an interactive Game Object if a pointer is released while over it.
      * 
      * Listen to this event from a Game Object using: `gameObject.on('pointerup', listener)`.
      * Note that the scope of the listener is automatically set to be the Game Object instance itself.
      * 
      * To receive this event, the Game Object must have been set as interactive.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_UP]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_UP}
      * 2. [GAMEOBJECT_UP]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_UP}
      * 3. [POINTER_UP]{@linkcode Phaser.Input.Events#event:POINTER_UP} or [POINTER_UP_OUTSIDE]{@linkcode Phaser.Input.Events#event:POINTER_UP_OUTSIDE}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val GAMEOBJECT_POINTER_UP: js.Any = js.native
    /**
      * The Game Object Up Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer is released while over _any_ interactive Game Object.
      * 
      * Listen to this event from within a Scene using: `this.input.on('gameobjectup', listener)`.
      * 
      * To receive this event, the Game Objects must have been set as interactive.
      * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
      * 
      * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_POINTER_UP]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_UP} event instead.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_UP]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_UP}
      * 2. [GAMEOBJECT_UP]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_UP}
      * 3. [POINTER_UP]{@linkcode Phaser.Input.Events#event:POINTER_UP} or [POINTER_UP_OUTSIDE]{@linkcode Phaser.Input.Events#event:POINTER_UP_OUTSIDE}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val GAMEOBJECT_UP: js.Any = js.native
    /**
      * The Input Plugin Game Out Event.
      * 
      * This event is dispatched by the Input Plugin if the active pointer leaves the game canvas and is now
      * outside of it, elsewhere on the web page.
      * 
      * Listen to this event from within a Scene using: `this.input.on('gameout', listener)`.
      */
    val GAME_OUT: js.Any = js.native
    /**
      * The Input Plugin Game Over Event.
      * 
      * This event is dispatched by the Input Plugin if the active pointer enters the game canvas and is now
      * over of it, having previously been elsewhere on the web page.
      * 
      * Listen to this event from within a Scene using: `this.input.on('gameover', listener)`.
      */
    val GAME_OVER: js.Any = js.native
    /**
      * The Input Manager Boot Event.
      * 
      * This internal event is dispatched by the Input Manager when it boots.
      */
    val MANAGER_BOOT: js.Any = js.native
    /**
      * The Input Manager Process Event.
      * 
      * This internal event is dispatched by the Input Manager when not using the legacy queue system,
      * and it wants the Input Plugins to update themselves.
      */
    val MANAGER_PROCESS: js.Any = js.native
    /**
      * The Input Manager Update Event.
      * 
      * This internal event is dispatched by the Input Manager as part of its update step.
      */
    val MANAGER_UPDATE: js.Any = js.native
    /**
      * The Input Manager Pointer Lock Change Event.
      * 
      * This event is dispatched by the Input Manager when it is processing a native Pointer Lock Change DOM Event.
      */
    val POINTERLOCK_CHANGE: js.Any = js.native
    /**
      * The Pointer Down Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer is pressed down anywhere.
      * 
      * Listen to this event from within a Scene using: `this.input.on('pointerdown', listener)`.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_DOWN]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_DOWN}
      * 2. [GAMEOBJECT_DOWN]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_DOWN}
      * 3. [POINTER_DOWN]{@linkcode Phaser.Input.Events#event:POINTER_DOWN} or [POINTER_DOWN_OUTSIDE]{@linkcode Phaser.Input.Events#event:POINTER_DOWN_OUTSIDE}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val POINTER_DOWN: js.Any = js.native
    /**
      * The Pointer Down Outside Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer is pressed down anywhere outside of the game canvas.
      * 
      * Listen to this event from within a Scene using: `this.input.on('pointerdownoutside', listener)`.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_DOWN]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_DOWN}
      * 2. [GAMEOBJECT_DOWN]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_DOWN}
      * 3. [POINTER_DOWN]{@linkcode Phaser.Input.Events#event:POINTER_DOWN} or [POINTER_DOWN_OUTSIDE]{@linkcode Phaser.Input.Events#event:POINTER_DOWN_OUTSIDE}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val POINTER_DOWN_OUTSIDE: js.Any = js.native
    /**
      * The Pointer Move Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer is moved anywhere.
      * 
      * Listen to this event from within a Scene using: `this.input.on('pointermove', listener)`.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_MOVE]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_MOVE}
      * 2. [GAMEOBJECT_MOVE]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_MOVE}
      * 3. [POINTER_MOVE]{@linkcode Phaser.Input.Events#event:POINTER_MOVE}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val POINTER_MOVE: js.Any = js.native
    /**
      * The Pointer Out Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer moves out of any interactive Game Object.
      * 
      * Listen to this event from within a Scene using: `this.input.on('pointerup', listener)`.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_OUT]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_OUT}
      * 2. [GAMEOBJECT_OUT]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_OUT}
      * 3. [POINTER_OUT]{@linkcode Phaser.Input.Events#event:POINTER_OUT}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val POINTER_OUT: js.Any = js.native
    /**
      * The Pointer Over Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer moves over any interactive Game Object.
      * 
      * Listen to this event from within a Scene using: `this.input.on('pointerover', listener)`.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_OVER]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_OVER}
      * 2. [GAMEOBJECT_OVER]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_OVER}
      * 3. [POINTER_OVER]{@linkcode Phaser.Input.Events#event:POINTER_OVER}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val POINTER_OVER: js.Any = js.native
    /**
      * The Pointer Up Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer is released anywhere.
      * 
      * Listen to this event from within a Scene using: `this.input.on('pointerup', listener)`.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_UP]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_UP}
      * 2. [GAMEOBJECT_UP]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_UP}
      * 3. [POINTER_UP]{@linkcode Phaser.Input.Events#event:POINTER_UP} or [POINTER_UP_OUTSIDE]{@linkcode Phaser.Input.Events#event:POINTER_UP_OUTSIDE}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val POINTER_UP: js.Any = js.native
    /**
      * The Pointer Up Outside Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer is released anywhere outside of the game canvas.
      * 
      * Listen to this event from within a Scene using: `this.input.on('pointerupoutside', listener)`.
      * 
      * The event hierarchy is as follows:
      * 
      * 1. [GAMEOBJECT_POINTER_UP]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_UP}
      * 2. [GAMEOBJECT_UP]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_UP}
      * 3. [POINTER_UP]{@linkcode Phaser.Input.Events#event:POINTER_UP} or [POINTER_UP_OUTSIDE]{@linkcode Phaser.Input.Events#event:POINTER_UP_OUTSIDE}
      * 
      * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
      * the propagation of this event.
      */
    val POINTER_UP_OUTSIDE: js.Any = js.native
    /**
      * The Input Plugin Pre-Update Event.
      * 
      * This internal event is dispatched by the Input Plugin at the start of its `preUpdate` method.
      * This hook is designed specifically for input plugins, but can also be listened to from user-land code.
      */
    val PRE_UPDATE: js.Any = js.native
    /**
      * The Input Plugin Shutdown Event.
      * 
      * This internal event is dispatched by the Input Plugin when it shuts down, signalling to all of its systems to shut themselves down.
      */
    val SHUTDOWN: js.Any = js.native
    /**
      * The Input Plugin Start Event.
      * 
      * This internal event is dispatched by the Input Plugin when it has finished setting-up,
      * signalling to all of its internal systems to start.
      */
    val START: js.Any = js.native
    /**
      * The Input Plugin Update Event.
      * 
      * This internal event is dispatched by the Input Plugin at the start of its `update` method.
      * This hook is designed specifically for input plugins, but can also be listened to from user-land code.
      */
    val UPDATE: js.Any = js.native
  }
  
  @JSName("Gamepad")
  @js.native
  object GamepadNs extends js.Object {
    /**
      * Contains information about a specific Gamepad Axis.
      * Axis objects are created automatically by the Gamepad as they are needed.
      */
    @js.native
    class Axis protected ()
      extends phaserLib.PhaserNs.InputNs.GamepadNs.Axis {
      /**
        * 
        * @param pad A reference to the Gamepad that this Axis belongs to.
        * @param index The index of this Axis.
        */
      def this(pad: phaserLib.PhaserNs.InputNs.GamepadNs.Gamepad, index: phaserLib.integer) = this()
    }
    
    /**
      * Contains information about a specific button on a Gamepad.
      * Button objects are created automatically by the Gamepad as they are needed.
      */
    @js.native
    class Button protected ()
      extends phaserLib.PhaserNs.InputNs.GamepadNs.Button {
      /**
        * 
        * @param pad A reference to the Gamepad that this Button belongs to.
        * @param index The index of this Button.
        */
      def this(pad: phaserLib.PhaserNs.InputNs.GamepadNs.Gamepad, index: phaserLib.integer) = this()
    }
    
    /**
      * A single Gamepad.
      * 
      * These are created, updated and managed by the Gamepad Plugin.
      */
    @js.native
    class Gamepad protected ()
      extends phaserLib.PhaserNs.InputNs.GamepadNs.Gamepad {
      /**
        * 
        * @param manager A reference to the Gamepad Plugin.
        * @param pad The Gamepad object, as extracted from GamepadEvent.
        */
      def this(manager: phaserLib.PhaserNs.InputNs.GamepadNs.GamepadPlugin, pad: phaserLib.PhaserNs.TypesNs.InputNs.GamepadNs.Pad) = this()
    }
    
    /**
      * The Gamepad Plugin is an input plugin that belongs to the Scene-owned Input system.
      * 
      * Its role is to listen for native DOM Gamepad Events and then process them.
      * 
      * You do not need to create this class directly, the Input system will create an instance of it automatically.
      * 
      * You can access it from within a Scene using `this.input.gamepad`.
      * 
      * To listen for a gamepad being connected:
      * 
      * ```javascript
      * this.input.gamepad.once('connected', function (pad) {
      *     //   'pad' is a reference to the gamepad that was just connected
      * });
      * ```
      * 
      * Note that the browser may require you to press a button on a gamepad before it will allow you to access it,
      * this is for security reasons. However, it may also trust the page already, in which case you won't get the
      * 'connected' event and instead should check `GamepadPlugin.total` to see if it thinks there are any gamepads
      * already connected.
      * 
      * Once you have received the connected event, or polled the gamepads and found them enabled, you can access
      * them via the built-in properties `GamepadPlugin.pad1` to `pad4`, for up to 4 game pads. With a reference
      * to the gamepads you can poll its buttons and axis sticks. See the properties and methods available on
      * the `Gamepad` class for more details.
      * 
      * For more information about Gamepad support in browsers see the following resources:
      * 
      * https://developer.mozilla.org/en-US/docs/Web/API/Gamepad_API
      * https://developer.mozilla.org/en-US/docs/Web/API/Gamepad_API/Using_the_Gamepad_API
      * https://www.smashingmagazine.com/2015/11/gamepad-api-in-web-games/
      * http://html5gamepad.com/
      */
    @js.native
    class GamepadPlugin protected ()
      extends phaserLib.PhaserNs.InputNs.GamepadNs.GamepadPlugin {
      /**
        * 
        * @param sceneInputPlugin A reference to the Scene Input Plugin that the KeyboardPlugin belongs to.
        */
      def this(sceneInputPlugin: phaserLib.PhaserNs.InputNs.InputPlugin) = this()
    }
    
    @JSName("Configs")
    @js.native
    object ConfigsNs extends js.Object {
      /**
        * PlayStation DualShock 4 Gamepad Configuration.
        * Sony PlayStation DualShock 4 (v2) wireless controller
        */
      var DUALSHOCK_4: js.Object = js.native
      /**
        * Tatar SNES USB Controller Gamepad Configuration.
        * USB Gamepad  (STANDARD GAMEPAD Vendor: 0079 Product: 0011)
        */
      var SNES_USB: js.Object = js.native
      /**
        * XBox 360 Gamepad Configuration.
        */
      var XBOX_360: js.Object = js.native
    }
    
    @JSName("Events")
    @js.native
    object EventsNs extends js.Object {
      /**
        * The Gamepad Button Down Event.
        * 
        * This event is dispatched by the Gamepad Plugin when a button has been pressed on any active Gamepad.
        * 
        * Listen to this event from within a Scene using: `this.input.gamepad.on('down', listener)`.
        * 
        * You can also listen for a DOWN event from a Gamepad instance. See the [GAMEPAD_BUTTON_DOWN]{@linkcode Phaser.Input.Gamepad.Events#event:GAMEPAD_BUTTON_DOWN} event for details.
        */
      val BUTTON_DOWN: js.Any = js.native
      /**
        * The Gamepad Button Up Event.
        * 
        * This event is dispatched by the Gamepad Plugin when a button has been released on any active Gamepad.
        * 
        * Listen to this event from within a Scene using: `this.input.gamepad.on('up', listener)`.
        * 
        * You can also listen for an UP event from a Gamepad instance. See the [GAMEPAD_BUTTON_UP]{@linkcode Phaser.Input.Gamepad.Events#event:GAMEPAD_BUTTON_UP} event for details.
        */
      val BUTTON_UP: js.Any = js.native
      /**
        * The Gamepad Connected Event.
        * 
        * This event is dispatched by the Gamepad Plugin when a Gamepad has been connected.
        * 
        * Listen to this event from within a Scene using: `this.input.gamepad.once('connected', listener)`.
        * 
        * Note that the browser may require you to press a button on a gamepad before it will allow you to access it,
        * this is for security reasons. However, it may also trust the page already, in which case you won't get the
        * 'connected' event and instead should check `GamepadPlugin.total` to see if it thinks there are any gamepads
        * already connected.
        */
      val CONNECTED: js.Any = js.native
      /**
        * The Gamepad Disconnected Event.
        * 
        * This event is dispatched by the Gamepad Plugin when a Gamepad has been disconnected.
        * 
        * Listen to this event from within a Scene using: `this.input.gamepad.once('disconnected', listener)`.
        */
      val DISCONNECTED: js.Any = js.native
      /**
        * The Gamepad Button Down Event.
        * 
        * This event is dispatched by a Gamepad instance when a button has been pressed on it.
        * 
        * Listen to this event from a Gamepad instance. Once way to get this is from the `pad1`, `pad2`, etc properties on the Gamepad Plugin:
        * `this.input.gamepad.pad1.on('down', listener)`.
        * 
        * Note that you will not receive any Gamepad button events until the browser considers the Gamepad as being 'connected'.
        * 
        * You can also listen for a DOWN event from the Gamepad Plugin. See the [BUTTON_DOWN]{@linkcode Phaser.Input.Gamepad.Events#event:BUTTON_DOWN} event for details.
        */
      val GAMEPAD_BUTTON_DOWN: js.Any = js.native
      /**
        * The Gamepad Button Up Event.
        * 
        * This event is dispatched by a Gamepad instance when a button has been released on it.
        * 
        * Listen to this event from a Gamepad instance. Once way to get this is from the `pad1`, `pad2`, etc properties on the Gamepad Plugin:
        * `this.input.gamepad.pad1.on('up', listener)`.
        * 
        * Note that you will not receive any Gamepad button events until the browser considers the Gamepad as being 'connected'.
        * 
        * You can also listen for an UP event from the Gamepad Plugin. See the [BUTTON_UP]{@linkcode Phaser.Input.Gamepad.Events#event:BUTTON_UP} event for details.
        */
      val GAMEPAD_BUTTON_UP: js.Any = js.native
    }
    
  }
  
  @JSName("InputPluginCache")
  @js.native
  object InputPluginCacheNs extends js.Object {
    /**
      * Returns the input plugin object from the cache based on the given key.
      */
    var getCore: js.Function = js.native
    /**
      * Installs all of the registered Input Plugins into the given target.
      */
    var install: js.Function = js.native
    /**
      * Static method called directly by the Core internal Plugins.
      * Key is a reference used to get the plugin from the plugins object (i.e. InputPlugin)
      * Plugin is the object to instantiate to create the plugin
      * Mapping is what the plugin is injected into the Scene.Systems as (i.e. input)
      */
    var register: js.Function = js.native
    /**
      * Removes an input plugin based on the given key.
      */
    var remove: js.Function = js.native
  }
  
  @JSName("Keyboard")
  @js.native
  object KeyboardNs extends js.Object {
    /**
      * A generic Key object which can be passed to the Process functions (and so on)
      * keycode must be an integer
      */
    @js.native
    class Key protected ()
      extends phaserLib.PhaserNs.InputNs.KeyboardNs.Key {
      /**
        * 
        * @param plugin The Keyboard Plugin instance that owns this Key object.
        * @param keyCode The keycode of this key.
        */
      def this(plugin: phaserLib.PhaserNs.InputNs.KeyboardNs.KeyboardPlugin, keyCode: phaserLib.integer) = this()
    }
    
    /**
      * A KeyCombo will listen for a specific string of keys from the Keyboard, and when it receives them
      * it will emit a `keycombomatch` event from the Keyboard Manager.
      * 
      * The keys to be listened for can be defined as:
      * 
      * A string (i.e. 'ATARI')
      * An array of either integers (key codes) or strings, or a mixture of both
      * An array of objects (such as Key objects) with a public 'keyCode' property
      * 
      * For example, to listen for the Konami code (up, up, down, down, left, right, left, right, b, a, enter)
      * you could pass the following array of key codes:
      * 
      * ```javascript
      * this.input.keyboard.createCombo([ 38, 38, 40, 40, 37, 39, 37, 39, 66, 65, 13 ], { resetOnMatch: true });
      * 
      * this.input.keyboard.on('keycombomatch', function (event) {
      *     console.log('Konami Code entered!');
      * });
      * ```
      * 
      * Or, to listen for the user entering the word PHASER:
      * 
      * ```javascript
      * this.input.keyboard.createCombo('PHASER');
      * ```
      */
    @js.native
    class KeyCombo protected ()
      extends phaserLib.PhaserNs.InputNs.KeyboardNs.KeyCombo {
      /**
        * 
        * @param keyboardPlugin A reference to the Keyboard Plugin.
        * @param keys The keys that comprise this combo.
        * @param config A Key Combo configuration object.
        */
      def this(keyboardPlugin: phaserLib.PhaserNs.InputNs.KeyboardNs.KeyboardPlugin, keys: java.lang.String) = this()
      def this(keyboardPlugin: phaserLib.PhaserNs.InputNs.KeyboardNs.KeyboardPlugin, keys: js.Array[js.Object | phaserLib.integer]) = this()
      def this(keyboardPlugin: phaserLib.PhaserNs.InputNs.KeyboardNs.KeyboardPlugin, keys: java.lang.String, config: phaserLib.PhaserNs.TypesNs.InputNs.KeyboardNs.KeyComboConfig) = this()
      def this(keyboardPlugin: phaserLib.PhaserNs.InputNs.KeyboardNs.KeyboardPlugin, keys: js.Array[js.Object | phaserLib.integer], config: phaserLib.PhaserNs.TypesNs.InputNs.KeyboardNs.KeyComboConfig) = this()
    }
    
    /**
      * The Keyboard Manager is a helper class that belongs to the global Input Manager.
      * 
      * Its role is to listen for native DOM Keyboard Events and then store them for further processing by the Keyboard Plugin.
      * 
      * You do not need to create this class directly, the Input Manager will create an instance of it automatically if keyboard
      * input has been enabled in the Game Config.
      */
    @js.native
    class KeyboardManager protected ()
      extends phaserLib.PhaserNs.InputNs.KeyboardNs.KeyboardManager {
      /**
        * 
        * @param inputManager A reference to the Input Manager.
        */
      def this(inputManager: phaserLib.PhaserNs.InputNs.InputManager) = this()
    }
    
    /**
      * The Keyboard Plugin is an input plugin that belongs to the Scene-owned Input system.
      * 
      * Its role is to listen for native DOM Keyboard Events and then process them.
      * 
      * You do not need to create this class directly, the Input system will create an instance of it automatically.
      * 
      * You can access it from within a Scene using `this.input.keyboard`. For example, you can do:
      * 
      * ```javascript
      * this.input.keyboard.on('keydown', callback, context);
      * ```
      * 
      * Or, to listen for a specific key:
      * 
      * ```javascript
      * this.input.keyboard.on('keydown-A', callback, context);
      * ```
      * 
      * You can also create Key objects, which you can then poll in your game loop:
      * 
      * ```javascript
      * var spaceBar = this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.SPACE);
      * ```
      * 
      * If you have multiple parallel Scenes, each trying to get keyboard input, be sure to disable capture on them to stop them from
      * stealing input from another Scene in the list. You can do this with `this.input.keyboard.enabled = false` within the
      * Scene to stop all input, or `this.input.keyboard.preventDefault = false` to stop a Scene halting input on another Scene.
      * 
      * _Note_: Many keyboards are unable to process certain combinations of keys due to hardware limitations known as ghosting.
      * See http://www.html5gamedevs.com/topic/4876-impossible-to-use-more-than-2-keyboard-input-buttons-at-the-same-time/ for more details.
      * 
      * Also please be aware that certain browser extensions can disable or override Phaser keyboard handling.
      * For example the Chrome extension vimium is known to disable Phaser from using the D key, while EverNote disables the backtick key.
      * And there are others. So, please check your extensions before opening Phaser issues about keys that don't work.
      */
    @js.native
    class KeyboardPlugin protected ()
      extends phaserLib.PhaserNs.InputNs.KeyboardNs.KeyboardPlugin {
      /**
        * 
        * @param sceneInputPlugin A reference to the Scene Input Plugin that the KeyboardPlugin belongs to.
        */
      def this(sceneInputPlugin: phaserLib.PhaserNs.InputNs.InputPlugin) = this()
    }
    
    /**
      * Returns `true` if the Key was pressed down within the `duration` value given, based on the current
      * game clock time. Or `false` if it either isn't down, or was pressed down longer ago than the given duration.
      * @param key The Key object to test.
      * @param duration The duration, in ms, within which the key must have been pressed down. Default 50.
      */
    def DownDuration(key: phaserLib.PhaserNs.InputNs.KeyboardNs.Key): scala.Boolean = js.native
    def DownDuration(key: phaserLib.PhaserNs.InputNs.KeyboardNs.Key, duration: phaserLib.integer): scala.Boolean = js.native
    /**
      * The justDown value allows you to test if this Key has just been pressed down or not.
      * 
      * When you check this value it will return `true` if the Key is down, otherwise `false`.
      * 
      * You can only call justDown once per key press. It will only return `true` once, until the Key is released and pressed down again.
      * This allows you to use it in situations where you want to check if this key is down without using an event, such as in a core game loop.
      * @param key The Key to check to see if it's just down or not.
      */
    def JustDown(key: phaserLib.PhaserNs.InputNs.KeyboardNs.Key): scala.Boolean = js.native
    /**
      * The justUp value allows you to test if this Key has just been released or not.
      * 
      * When you check this value it will return `true` if the Key is up, otherwise `false`.
      * 
      * You can only call JustUp once per key release. It will only return `true` once, until the Key is pressed down and released again.
      * This allows you to use it in situations where you want to check if this key is up without using an event, such as in a core game loop.
      * @param key The Key to check to see if it's just up or not.
      */
    def JustUp(key: phaserLib.PhaserNs.InputNs.KeyboardNs.Key): scala.Boolean = js.native
    /**
      * Returns `true` if the Key was released within the `duration` value given, based on the current
      * game clock time. Or returns `false` if it either isn't up, or was released longer ago than the given duration.
      * @param key The Key object to test.
      * @param duration The duration, in ms, within which the key must have been released. Default 50.
      */
    def UpDuration(key: phaserLib.PhaserNs.InputNs.KeyboardNs.Key): scala.Boolean = js.native
    def UpDuration(key: phaserLib.PhaserNs.InputNs.KeyboardNs.Key, duration: phaserLib.integer): scala.Boolean = js.native
    @JSName("Events")
    @js.native
    object EventsNs extends js.Object {
      /**
        * The Global Key Down Event.
        * 
        * This event is dispatched by the Keyboard Plugin when any key on the keyboard is pressed down.
        * 
        * Listen to this event from within a Scene using: `this.input.keyboard.on('keydown', listener)`.
        * 
        * You can also listen for a specific key being pressed. See [Keyboard.Events.KEY_DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:KEY_DOWN} for details.
        * 
        * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:DOWN} for details.
        * 
        * _Note_: Many keyboards are unable to process certain combinations of keys due to hardware limitations known as ghosting.
        * Read [this article on ghosting]{@link http://www.html5gamedevs.com/topic/4876-impossible-to-use-more-than-2-keyboard-input-buttons-at-the-same-time/} for details.
        * 
        * Also, please be aware that some browser extensions can disable or override Phaser keyboard handling.
        * For example, the Chrome extension vimium is known to disable Phaser from using the D key, while EverNote disables the backtick key.
        * There are others. So, please check your extensions if you find you have specific keys that don't work.
        */
      val ANY_KEY_DOWN: js.Any = js.native
      /**
        * The Global Key Up Event.
        * 
        * This event is dispatched by the Keyboard Plugin when any key on the keyboard is released.
        * 
        * Listen to this event from within a Scene using: `this.input.keyboard.on('keyup', listener)`.
        * 
        * You can also listen for a specific key being released. See [Keyboard.Events.KEY_UP]{@linkcode Phaser.Input.Keyboard.Events#event:KEY_UP} for details.
        * 
        * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.UP]{@linkcode Phaser.Input.Keyboard.Events#event:UP} for details.
        */
      val ANY_KEY_UP: js.Any = js.native
      /**
        * The Key Combo Match Event.
        * 
        * This event is dispatched by the Keyboard Plugin when a [Key Combo]{@link Phaser.Input.Keyboard.KeyCombo} is matched.
        * 
        * Listen for this event from the Key Plugin after a combo has been created:
        * 
        * ```javascript
        * this.input.keyboard.createCombo([ 38, 38, 40, 40, 37, 39, 37, 39, 66, 65, 13 ], { resetOnMatch: true });
        * 
        * this.input.keyboard.on('keycombomatch', function (event) {
        *     console.log('Konami Code entered!');
        * });
        * ```
        */
      val COMBO_MATCH: js.Any = js.native
      /**
        * The Key Down Event.
        * 
        * This event is dispatched by a [Key]{@link Phaser.Input.Keyboard.Key} object when it is pressed.
        * 
        * Listen for this event from the Key object instance directly:
        * 
        * ```javascript
        * var spaceBar = this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.SPACE);
        * 
        * spaceBar.on('down', listener)
        * ```
        * 
        * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_DOWN} for details.
        */
      val DOWN: js.Any = js.native
      /**
        * The Key Down Event.
        * 
        * This event is dispatched by the Keyboard Plugin when any key on the keyboard is pressed down.
        * 
        * Unlike the `ANY_KEY_DOWN` event, this one has a special dynamic event name. For example, to listen for the `A` key being pressed
        * use the following from within a Scene: `this.input.keyboard.on('keydown-A', listener)`. You can replace the `-A` part of the event
        * name with any valid [Key Code string]{@link Phaser.Input.Keyboard.KeyCodes}. For example, this will listen for the space bar: 
        * `this.input.keyboard.on('keydown-SPACE', listener)`.
        * 
        * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_DOWN} for details.
        * 
        * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:DOWN} for details.
        * 
        * _Note_: Many keyboards are unable to process certain combinations of keys due to hardware limitations known as ghosting.
        * Read [this article on ghosting]{@link http://www.html5gamedevs.com/topic/4876-impossible-to-use-more-than-2-keyboard-input-buttons-at-the-same-time/} for details.
        * 
        * Also, please be aware that some browser extensions can disable or override Phaser keyboard handling.
        * For example, the Chrome extension vimium is known to disable Phaser from using the D key, while EverNote disables the backtick key.
        * There are others. So, please check your extensions if you find you have specific keys that don't work.
        */
      val KEY_DOWN: js.Any = js.native
      /**
        * The Key Up Event.
        * 
        * This event is dispatched by the Keyboard Plugin when any key on the keyboard is released.
        * 
        * Unlike the `ANY_KEY_UP` event, this one has a special dynamic event name. For example, to listen for the `A` key being released
        * use the following from within a Scene: `this.input.keyboard.on('keyup-A', listener)`. You can replace the `-A` part of the event
        * name with any valid [Key Code string]{@link Phaser.Input.Keyboard.KeyCodes}. For example, this will listen for the space bar: 
        * `this.input.keyboard.on('keyup-SPACE', listener)`.
        * 
        * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_UP]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_UP} for details.
        * 
        * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.UP]{@linkcode Phaser.Input.Keyboard.Events#event:UP} for details.
        */
      val KEY_UP: js.Any = js.native
      /**
        * The Key Up Event.
        * 
        * This event is dispatched by a [Key]{@link Phaser.Input.Keyboard.Key} object when it is released.
        * 
        * Listen for this event from the Key object instance directly:
        * 
        * ```javascript
        * var spaceBar = this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.SPACE);
        * 
        * spaceBar.on('up', listener)
        * ```
        * 
        * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_UP]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_UP} for details.
        */
      val UP: js.Any = js.native
    }
    
    /**
      * Keyboard Codes.
      */
    @JSName("KeyCodes")
    @js.native
    object KeyCodesNs extends js.Object {
      /**
        * The A key.
        */
      var A: phaserLib.integer = js.native
      /**
        * The ALT key.
        */
      var ALT: phaserLib.integer = js.native
      /**
        * The B key.
        */
      var B: phaserLib.integer = js.native
      /**
        * The BACKSPACE key.
        */
      var BACKSPACE: phaserLib.integer = js.native
      /**
        * The BACKTICK key.
        */
      var BACKTICK: phaserLib.integer = js.native
      /**
        * The BACK_SLASH key.
        */
      var BACK_SLASH: phaserLib.integer = js.native
      /**
        * The BRACKET_LEFT_FIREFOX key.
        */
      var BRACKET_LEFT_FIREFOX: phaserLib.integer = js.native
      /**
        * The BRACKET_RIGHT_FIREFOX key.
        */
      var BRACKET_RIGHT_FIREFOX: phaserLib.integer = js.native
      /**
        * The C key.
        */
      var C: phaserLib.integer = js.native
      /**
        * The CAPS_LOCK key.
        */
      var CAPS_LOCK: phaserLib.integer = js.native
      /**
        * The CLOSED_BRACKET key.
        */
      var CLOSED_BRACKET: phaserLib.integer = js.native
      /**
        * The COLON key.
        */
      var COLON: phaserLib.integer = js.native
      /**
        * The COMMA key.
        */
      var COMMA: phaserLib.integer = js.native
      /**
        * The COMMA_FIREFOX key.
        */
      var COMMA_FIREFOX: phaserLib.integer = js.native
      /**
        * The COMMA_FIREFOX_WINDOWS key.
        */
      var COMMA_FIREFOX_WINDOWS: phaserLib.integer = js.native
      /**
        * The CTRL key.
        */
      var CTRL: phaserLib.integer = js.native
      /**
        * The D key.
        */
      var D: phaserLib.integer = js.native
      /**
        * The DELETE key.
        */
      var DELETE: phaserLib.integer = js.native
      /**
        * The DOWN key.
        */
      var DOWN: phaserLib.integer = js.native
      /**
        * The E key.
        */
      var E: phaserLib.integer = js.native
      /**
        * The EIGHT key.
        */
      var EIGHT: phaserLib.integer = js.native
      /**
        * The END key.
        */
      var END: phaserLib.integer = js.native
      /**
        * The ENTER key.
        */
      var ENTER: phaserLib.integer = js.native
      /**
        * The ESC key.
        */
      var ESC: phaserLib.integer = js.native
      /**
        * The F key.
        */
      var F: phaserLib.integer = js.native
      /**
        * The F1 key.
        */
      var F1: phaserLib.integer = js.native
      /**
        * The F10 key.
        */
      var F10: phaserLib.integer = js.native
      /**
        * The F11 key.
        */
      var F11: phaserLib.integer = js.native
      /**
        * The F12 key.
        */
      var F12: phaserLib.integer = js.native
      /**
        * The F2 key.
        */
      var F2: phaserLib.integer = js.native
      /**
        * The F3 key.
        */
      var F3: phaserLib.integer = js.native
      /**
        * The F4 key.
        */
      var F4: phaserLib.integer = js.native
      /**
        * The F5 key.
        */
      var F5: phaserLib.integer = js.native
      /**
        * The F6 key.
        */
      var F6: phaserLib.integer = js.native
      /**
        * The F7 key.
        */
      var F7: phaserLib.integer = js.native
      /**
        * The F8 key.
        */
      var F8: phaserLib.integer = js.native
      /**
        * The F9 key.
        */
      var F9: phaserLib.integer = js.native
      /**
        * The FIVE key.
        */
      var FIVE: phaserLib.integer = js.native
      /**
        * The FORWARD_SLASH key.
        */
      var FORWARD_SLASH: phaserLib.integer = js.native
      /**
        * The FOUR key.
        */
      var FOUR: phaserLib.integer = js.native
      /**
        * The G key.
        */
      var G: phaserLib.integer = js.native
      /**
        * The H key.
        */
      var H: phaserLib.integer = js.native
      /**
        * The HOME key.
        */
      var HOME: phaserLib.integer = js.native
      /**
        * The I key.
        */
      var I: phaserLib.integer = js.native
      /**
        * The INSERT key.
        */
      var INSERT: phaserLib.integer = js.native
      /**
        * The J key.
        */
      var J: phaserLib.integer = js.native
      /**
        * The K key.
        */
      var K: phaserLib.integer = js.native
      /**
        * The L key.
        */
      var L: phaserLib.integer = js.native
      /**
        * The LEFT key.
        */
      var LEFT: phaserLib.integer = js.native
      /**
        * The M key.
        */
      var M: phaserLib.integer = js.native
      /**
        * The MINUS key.
        */
      var MINUS: phaserLib.integer = js.native
      /**
        * The N key.
        */
      var N: phaserLib.integer = js.native
      /**
        * The NINE key.
        */
      var NINE: phaserLib.integer = js.native
      /**
        * The NUMPAD_EIGHT key.
        */
      var NUMPAD_EIGHT: phaserLib.integer = js.native
      /**
        * The NUMPAD_FIVE key.
        */
      var NUMPAD_FIVE: phaserLib.integer = js.native
      /**
        * The NUMPAD_FOUR key.
        */
      var NUMPAD_FOUR: phaserLib.integer = js.native
      /**
        * The NUMPAD_NINE key.
        */
      var NUMPAD_NINE: phaserLib.integer = js.native
      /**
        * The NUMPAD_ONE key.
        */
      var NUMPAD_ONE: phaserLib.integer = js.native
      /**
        * The NUMPAD_SEVEN key.
        */
      var NUMPAD_SEVEN: phaserLib.integer = js.native
      /**
        * The NUMPAD_SIX key.
        */
      var NUMPAD_SIX: phaserLib.integer = js.native
      /**
        * The NUMPAD_THREE key.
        */
      var NUMPAD_THREE: phaserLib.integer = js.native
      /**
        * The NUMPAD_TWO key.
        */
      var NUMPAD_TWO: phaserLib.integer = js.native
      /**
        * The NUMPAD_ZERO key.
        */
      var NUMPAD_ZERO: phaserLib.integer = js.native
      /**
        * The O key.
        */
      var O: phaserLib.integer = js.native
      /**
        * The ONE key.
        */
      var ONE: phaserLib.integer = js.native
      /**
        * The OPEN_BRACKET key.
        */
      var OPEN_BRACKET: phaserLib.integer = js.native
      /**
        * The P key.
        */
      var P: phaserLib.integer = js.native
      /**
        * The PAGE_DOWN key.
        */
      var PAGE_DOWN: phaserLib.integer = js.native
      /**
        * The PAGE_UP key.
        */
      var PAGE_UP: phaserLib.integer = js.native
      /**
        * The PAUSE key.
        */
      var PAUSE: phaserLib.integer = js.native
      /**
        * The PERIOD key.
        */
      var PERIOD: phaserLib.integer = js.native
      /**
        * The PLUS key.
        */
      var PLUS: phaserLib.integer = js.native
      /**
        * The PRINT_SCREEN key.
        */
      var PRINT_SCREEN: phaserLib.integer = js.native
      /**
        * The Q key.
        */
      var Q: phaserLib.integer = js.native
      /**
        * The QUOTES key.
        */
      var QUOTES: phaserLib.integer = js.native
      /**
        * The R key.
        */
      var R: phaserLib.integer = js.native
      /**
        * The RIGHT key.
        */
      var RIGHT: phaserLib.integer = js.native
      /**
        * The S key.
        */
      var S: phaserLib.integer = js.native
      /**
        * The SEMICOLON key.
        */
      var SEMICOLON: phaserLib.integer = js.native
      /**
        * The SEMICOLON_FIREFOX key.
        */
      var SEMICOLON_FIREFOX: phaserLib.integer = js.native
      /**
        * The SEVEN key.
        */
      var SEVEN: phaserLib.integer = js.native
      /**
        * The SHIFT key.
        */
      var SHIFT: phaserLib.integer = js.native
      /**
        * The SIX key.
        */
      var SIX: phaserLib.integer = js.native
      /**
        * The SPACE key.
        */
      var SPACE: phaserLib.integer = js.native
      /**
        * The T key.
        */
      var T: phaserLib.integer = js.native
      /**
        * The TAB key.
        */
      var TAB: phaserLib.integer = js.native
      /**
        * The THREE key.
        */
      var THREE: phaserLib.integer = js.native
      /**
        * The TWO key.
        */
      var TWO: phaserLib.integer = js.native
      /**
        * The U key.
        */
      var U: phaserLib.integer = js.native
      /**
        * The UP key.
        */
      var UP: phaserLib.integer = js.native
      /**
        * The V key.
        */
      var V: phaserLib.integer = js.native
      /**
        * The W key.
        */
      var W: phaserLib.integer = js.native
      /**
        * The X key.
        */
      var X: phaserLib.integer = js.native
      /**
        * The Y key.
        */
      var Y: phaserLib.integer = js.native
      /**
        * The Z key.
        */
      var Z: phaserLib.integer = js.native
      /**
        * The ZERO key.
        */
      var ZERO: phaserLib.integer = js.native
    }
    
  }
  
  @JSName("Mouse")
  @js.native
  object MouseNs extends js.Object {
    /**
      * The Mouse Manager is a helper class that belongs to the Input Manager.
      * 
      * Its role is to listen for native DOM Mouse Events and then pass them onto the Input Manager for further processing.
      * 
      * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
      */
    @js.native
    class MouseManager protected ()
      extends phaserLib.PhaserNs.InputNs.MouseNs.MouseManager {
      /**
        * 
        * @param inputManager A reference to the Input Manager.
        */
      def this(inputManager: phaserLib.PhaserNs.InputNs.InputManager) = this()
    }
    
  }
  
  @JSName("Touch")
  @js.native
  object TouchNs extends js.Object {
    /**
      * The Touch Manager is a helper class that belongs to the Input Manager.
      * 
      * Its role is to listen for native DOM Touch Events and then pass them onto the Input Manager for further processing.
      * 
      * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
      */
    @js.native
    class TouchManager protected ()
      extends phaserLib.PhaserNs.InputNs.TouchNs.TouchManager {
      /**
        * 
        * @param inputManager A reference to the Input Manager.
        */
      def this(inputManager: phaserLib.PhaserNs.InputNs.InputManager) = this()
    }
    
  }
  
}

