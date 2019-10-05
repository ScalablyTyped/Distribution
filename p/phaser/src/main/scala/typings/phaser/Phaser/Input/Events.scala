package typings.phaser.Phaser.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Input.Events")
@js.native
object Events extends js.Object {
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
    * The Game Object Pointer Wheel Event.
    * 
    * This event is dispatched by an interactive Game Object if a pointer has its wheel moved while over it.
    * 
    * Listen to this event from a Game Object using: `gameObject.on('wheel', listener)`.
    * Note that the scope of the listener is automatically set to be the Game Object instance itself.
    * 
    * To receive this event, the Game Object must have been set as interactive.
    * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
    * 
    * The event hierarchy is as follows:
    * 
    * 1. [GAMEOBJECT_POINTER_WHEEL]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_WHEEL}
    * 2. [GAMEOBJECT_WHEEL]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_WHEEL}
    * 3. [POINTER_WHEEL]{@linkcode Phaser.Input.Events#event:POINTER_WHEEL}
    * 
    * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
    * the propagation of this event.
    */
  val GAMEOBJECT_POINTER_WHEEL: js.Any = js.native
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
    * The Game Object Wheel Input Event.
    * 
    * This event is dispatched by the Input Plugin belonging to a Scene if a pointer has its wheel moved while over _any_ interactive Game Object.
    * 
    * Listen to this event from within a Scene using: `this.input.on('gameobjectwheel', listener)`.
    * 
    * To receive this event, the Game Objects must have been set as interactive.
    * See [GameObject.setInteractive]{@link Phaser.GameObjects.GameObject#setInteractive} for more details.
    * 
    * To listen for this event from a _specific_ Game Object, use the [GAMEOBJECT_POINTER_WHEEL]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_WHEEL} event instead.
    * 
    * The event hierarchy is as follows:
    * 
    * 1. [GAMEOBJECT_POINTER_WHEEL]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_WHEEL}
    * 2. [GAMEOBJECT_WHEEL]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_WHEEL}
    * 3. [POINTER_WHEEL]{@linkcode Phaser.Input.Events#event:POINTER_WHEEL}
    * 
    * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
    * the propagation of this event.
    */
  val GAMEOBJECT_WHEEL: js.Any = js.native
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
    * The Pointer Wheel Input Event.
    * 
    * This event is dispatched by the Input Plugin belonging to a Scene if a pointer has its wheel updated.
    * 
    * Listen to this event from within a Scene using: `this.input.on('wheel', listener)`.
    * 
    * The event hierarchy is as follows:
    * 
    * 1. [GAMEOBJECT_POINTER_WHEEL]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_POINTER_WHEEL}
    * 2. [GAMEOBJECT_WHEEL]{@linkcode Phaser.Input.Events#event:GAMEOBJECT_WHEEL}
    * 3. [POINTER_WHEEL]{@linkcode Phaser.Input.Events#event:POINTER_WHEEL}
    * 
    * With the top event being dispatched first and then flowing down the list. Note that higher-up event handlers can stop
    * the propagation of this event.
    */
  val POINTER_WHEEL: js.Any = js.native
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

