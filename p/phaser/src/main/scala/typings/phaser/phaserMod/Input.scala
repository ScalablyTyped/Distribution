package typings.phaser.phaserMod

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Types.Input.Gamepad.Pad
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.Phaser.Types.Input.InputPluginContainer
import typings.phaser.Phaser.Types.Input.InteractiveObject
import typings.phaser.Phaser.Types.Input.Keyboard.KeyComboConfig
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  @JSImport("phaser", "Input")
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def CreateInteractiveObject(gameObject: GameObject, hitArea: js.Any, hitAreaCallback: HitAreaCallback): InteractiveObject = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateInteractiveObject")(gameObject.asInstanceOf[js.Any], hitArea.asInstanceOf[js.Any], hitAreaCallback.asInstanceOf[js.Any])).asInstanceOf[InteractiveObject]
  
  /**
    * Creates a new Pixel Perfect Handler function.
    * 
    * Access via `InputPlugin.makePixelPerfect` rather than calling it directly.
    * @param textureManager A reference to the Texture Manager.
    * @param alphaTolerance The alpha level that the pixel should be above to be included as a successful interaction.
    */
  @scala.inline
  def CreatePixelPerfectHandler(textureManager: TextureManager, alphaTolerance: integer): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePixelPerfectHandler")(textureManager.asInstanceOf[js.Any], alphaTolerance.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  object Events {
    
    /**
      * The Input Plugin Boot Event.
      * 
      * This internal event is dispatched by the Input Plugin when it boots, signalling to all of its systems to create themselves.
      */
    @JSImport("phaser", "Input.Events.BOOT")
    @js.native
    val BOOT: js.Any = js.native
    
    /**
      * The Input Plugin Destroy Event.
      * 
      * This internal event is dispatched by the Input Plugin when it is destroyed, signalling to all of its systems to destroy themselves.
      */
    @JSImport("phaser", "Input.Events.DESTROY")
    @js.native
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
    @JSImport("phaser", "Input.Events.DRAG")
    @js.native
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
    @JSImport("phaser", "Input.Events.DRAG_END")
    @js.native
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
    @JSImport("phaser", "Input.Events.DRAG_ENTER")
    @js.native
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
    @JSImport("phaser", "Input.Events.DRAG_LEAVE")
    @js.native
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
    @JSImport("phaser", "Input.Events.DRAG_OVER")
    @js.native
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
    @JSImport("phaser", "Input.Events.DRAG_START")
    @js.native
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
    @JSImport("phaser", "Input.Events.DROP")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_DOWN")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_DRAG")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_DRAG_END")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_DRAG_ENTER")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_DRAG_LEAVE")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_DRAG_OVER")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_DRAG_START")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_DROP")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_MOVE")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_OUT")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_OVER")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_POINTER_DOWN")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_POINTER_MOVE")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_POINTER_OUT")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_POINTER_OVER")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_POINTER_UP")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_POINTER_WHEEL")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_UP")
    @js.native
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
    @JSImport("phaser", "Input.Events.GAMEOBJECT_WHEEL")
    @js.native
    val GAMEOBJECT_WHEEL: js.Any = js.native
    
    /**
      * The Input Plugin Game Out Event.
      * 
      * This event is dispatched by the Input Plugin if the active pointer leaves the game canvas and is now
      * outside of it, elsewhere on the web page.
      * 
      * Listen to this event from within a Scene using: `this.input.on('gameout', listener)`.
      */
    @JSImport("phaser", "Input.Events.GAME_OUT")
    @js.native
    val GAME_OUT: js.Any = js.native
    
    /**
      * The Input Plugin Game Over Event.
      * 
      * This event is dispatched by the Input Plugin if the active pointer enters the game canvas and is now
      * over of it, having previously been elsewhere on the web page.
      * 
      * Listen to this event from within a Scene using: `this.input.on('gameover', listener)`.
      */
    @JSImport("phaser", "Input.Events.GAME_OVER")
    @js.native
    val GAME_OVER: js.Any = js.native
    
    /**
      * The Input Manager Boot Event.
      * 
      * This internal event is dispatched by the Input Manager when it boots.
      */
    @JSImport("phaser", "Input.Events.MANAGER_BOOT")
    @js.native
    val MANAGER_BOOT: js.Any = js.native
    
    /**
      * The Input Manager Process Event.
      * 
      * This internal event is dispatched by the Input Manager when not using the legacy queue system,
      * and it wants the Input Plugins to update themselves.
      */
    @JSImport("phaser", "Input.Events.MANAGER_PROCESS")
    @js.native
    val MANAGER_PROCESS: js.Any = js.native
    
    /**
      * The Input Manager Update Event.
      * 
      * This internal event is dispatched by the Input Manager as part of its update step.
      */
    @JSImport("phaser", "Input.Events.MANAGER_UPDATE")
    @js.native
    val MANAGER_UPDATE: js.Any = js.native
    
    /**
      * The Input Manager Pointer Lock Change Event.
      * 
      * This event is dispatched by the Input Manager when it is processing a native Pointer Lock Change DOM Event.
      */
    @JSImport("phaser", "Input.Events.POINTERLOCK_CHANGE")
    @js.native
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
    @JSImport("phaser", "Input.Events.POINTER_DOWN")
    @js.native
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
    @JSImport("phaser", "Input.Events.POINTER_DOWN_OUTSIDE")
    @js.native
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
    @JSImport("phaser", "Input.Events.POINTER_MOVE")
    @js.native
    val POINTER_MOVE: js.Any = js.native
    
    /**
      * The Pointer Out Input Event.
      * 
      * This event is dispatched by the Input Plugin belonging to a Scene if a pointer moves out of any interactive Game Object.
      * 
      * Listen to this event from within a Scene using: `this.input.on('pointerout', listener)`.
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
    @JSImport("phaser", "Input.Events.POINTER_OUT")
    @js.native
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
    @JSImport("phaser", "Input.Events.POINTER_OVER")
    @js.native
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
    @JSImport("phaser", "Input.Events.POINTER_UP")
    @js.native
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
    @JSImport("phaser", "Input.Events.POINTER_UP_OUTSIDE")
    @js.native
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
    @JSImport("phaser", "Input.Events.POINTER_WHEEL")
    @js.native
    val POINTER_WHEEL: js.Any = js.native
    
    /**
      * The Input Plugin Pre-Update Event.
      * 
      * This internal event is dispatched by the Input Plugin at the start of its `preUpdate` method.
      * This hook is designed specifically for input plugins, but can also be listened to from user-land code.
      */
    @JSImport("phaser", "Input.Events.PRE_UPDATE")
    @js.native
    val PRE_UPDATE: js.Any = js.native
    
    /**
      * The Input Plugin Shutdown Event.
      * 
      * This internal event is dispatched by the Input Plugin when it shuts down, signalling to all of its systems to shut themselves down.
      */
    @JSImport("phaser", "Input.Events.SHUTDOWN")
    @js.native
    val SHUTDOWN: js.Any = js.native
    
    /**
      * The Input Plugin Start Event.
      * 
      * This internal event is dispatched by the Input Plugin when it has finished setting-up,
      * signalling to all of its internal systems to start.
      */
    @JSImport("phaser", "Input.Events.START")
    @js.native
    val START: js.Any = js.native
    
    /**
      * The Input Plugin Update Event.
      * 
      * This internal event is dispatched by the Input Plugin at the start of its `update` method.
      * This hook is designed specifically for input plugins, but can also be listened to from user-land code.
      */
    @JSImport("phaser", "Input.Events.UPDATE")
    @js.native
    val UPDATE: js.Any = js.native
  }
  
  object Gamepad {
    
    /**
      * Contains information about a specific Gamepad Axis.
      * Axis objects are created automatically by the Gamepad as they are needed.
      */
    @JSImport("phaser", "Input.Gamepad.Axis")
    @js.native
    class Axis protected ()
      extends StObject
         with typings.phaser.Phaser.Input.Gamepad.Axis {
      /**
        * 
        * @param pad A reference to the Gamepad that this Axis belongs to.
        * @param index The index of this Axis.
        */
      def this(pad: typings.phaser.Phaser.Input.Gamepad.Gamepad, index: integer) = this()
      
      /**
        * Destroys this Axis instance and releases external references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * An event emitter to use to emit the axis events.
        */
      /* CompleteClass */
      var events: EventEmitter = js.native
      
      /**
        * Applies the `threshold` value to the axis and returns it.
        */
      /* CompleteClass */
      override def getValue(): Double = js.native
      
      /**
        * The index of this Axis.
        */
      /* CompleteClass */
      var index: integer = js.native
      
      /**
        * A reference to the Gamepad that this Axis belongs to.
        */
      /* CompleteClass */
      var pad: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
      
      /**
        * Movement tolerance threshold below which axis values are ignored in `getValue`.
        */
      /* CompleteClass */
      var threshold: Double = js.native
      
      /**
        * The raw axis value, between -1 and 1 with 0 being dead center.
        * Use the method `getValue` to get a normalized value with the threshold applied.
        */
      /* CompleteClass */
      var value: Double = js.native
    }
    
    /**
      * Contains information about a specific button on a Gamepad.
      * Button objects are created automatically by the Gamepad as they are needed.
      */
    @JSImport("phaser", "Input.Gamepad.Button")
    @js.native
    class Button protected ()
      extends StObject
         with typings.phaser.Phaser.Input.Gamepad.Button {
      /**
        * 
        * @param pad A reference to the Gamepad that this Button belongs to.
        * @param index The index of this Button.
        */
      def this(pad: typings.phaser.Phaser.Input.Gamepad.Gamepad, index: integer) = this()
      
      /**
        * Destroys this Button instance and releases external references it holds.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * An event emitter to use to emit the button events.
        */
      /* CompleteClass */
      var events: EventEmitter = js.native
      
      /**
        * The index of this Button.
        */
      /* CompleteClass */
      var index: integer = js.native
      
      /**
        * A reference to the Gamepad that this Button belongs to.
        */
      /* CompleteClass */
      var pad: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
      
      /**
        * Is the Button being pressed down or not?
        */
      /* CompleteClass */
      var pressed: Boolean = js.native
      
      /**
        * Can be set for analogue buttons to enable a 'pressure' threshold,
        * before a button is considered as being 'pressed'.
        */
      /* CompleteClass */
      var threshold: Double = js.native
      
      /**
        * Between 0 and 1.
        */
      /* CompleteClass */
      var value: Double = js.native
    }
    
    object Configs {
      
      @JSImport("phaser", "Input.Gamepad.Configs")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * PlayStation DualShock 4 Gamepad Configuration.
        * Sony PlayStation DualShock 4 (v2) wireless controller
        */
      @JSImport("phaser", "Input.Gamepad.Configs.DUALSHOCK_4")
      @js.native
      def DUALSHOCK_4: js.Object = js.native
      @scala.inline
      def DUALSHOCK_4_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DUALSHOCK_4")(x.asInstanceOf[js.Any])
      
      /**
        * Tatar SNES USB Controller Gamepad Configuration.
        * USB Gamepad  (STANDARD GAMEPAD Vendor: 0079 Product: 0011)
        */
      @JSImport("phaser", "Input.Gamepad.Configs.SNES_USB")
      @js.native
      def SNES_USB: js.Object = js.native
      @scala.inline
      def SNES_USB_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNES_USB")(x.asInstanceOf[js.Any])
      
      /**
        * XBox 360 Gamepad Configuration.
        */
      @JSImport("phaser", "Input.Gamepad.Configs.XBOX_360")
      @js.native
      def XBOX_360: js.Object = js.native
      @scala.inline
      def XBOX_360_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XBOX_360")(x.asInstanceOf[js.Any])
    }
    
    object Events {
      
      /**
        * The Gamepad Button Down Event.
        * 
        * This event is dispatched by the Gamepad Plugin when a button has been pressed on any active Gamepad.
        * 
        * Listen to this event from within a Scene using: `this.input.gamepad.on('down', listener)`.
        * 
        * You can also listen for a DOWN event from a Gamepad instance. See the [GAMEPAD_BUTTON_DOWN]{@linkcode Phaser.Input.Gamepad.Events#event:GAMEPAD_BUTTON_DOWN} event for details.
        */
      @JSImport("phaser", "Input.Gamepad.Events.BUTTON_DOWN")
      @js.native
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
      @JSImport("phaser", "Input.Gamepad.Events.BUTTON_UP")
      @js.native
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
      @JSImport("phaser", "Input.Gamepad.Events.CONNECTED")
      @js.native
      val CONNECTED: js.Any = js.native
      
      /**
        * The Gamepad Disconnected Event.
        * 
        * This event is dispatched by the Gamepad Plugin when a Gamepad has been disconnected.
        * 
        * Listen to this event from within a Scene using: `this.input.gamepad.once('disconnected', listener)`.
        */
      @JSImport("phaser", "Input.Gamepad.Events.DISCONNECTED")
      @js.native
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
      @JSImport("phaser", "Input.Gamepad.Events.GAMEPAD_BUTTON_DOWN")
      @js.native
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
      @JSImport("phaser", "Input.Gamepad.Events.GAMEPAD_BUTTON_UP")
      @js.native
      val GAMEPAD_BUTTON_UP: js.Any = js.native
    }
    
    /**
      * A single Gamepad.
      * 
      * These are created, updated and managed by the Gamepad Plugin.
      */
    @JSImport("phaser", "Input.Gamepad.Gamepad")
    @js.native
    class Gamepad protected ()
      extends StObject
         with typings.phaser.Phaser.Input.Gamepad.Gamepad {
      /**
        * 
        * @param manager A reference to the Gamepad Plugin.
        * @param pad The Gamepad object, as extracted from GamepadEvent.
        */
      def this(manager: typings.phaser.Phaser.Input.Gamepad.GamepadPlugin, pad: Pad) = this()
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
    @JSImport("phaser", "Input.Gamepad.GamepadPlugin")
    @js.native
    class GamepadPlugin protected ()
      extends StObject
         with typings.phaser.Phaser.Input.Gamepad.GamepadPlugin {
      /**
        * 
        * @param sceneInputPlugin A reference to the Scene Input Plugin that the KeyboardPlugin belongs to.
        */
      def this(sceneInputPlugin: typings.phaser.Phaser.Input.InputPlugin) = this()
    }
  }
  
  /**
    * The Input Manager is responsible for handling the pointer related systems in a single Phaser Game instance.
    * 
    * Based on the Game Config it will create handlers for mouse and touch support.
    * 
    * Keyboard and Gamepad are plugins, handled directly by the InputPlugin class.
    * 
    * It then manages the events, pointer creation and general hit test related operations.
    * 
    * You rarely need to interact with the Input Manager directly, and as such, all of its properties and methods
    * should be considered private. Instead, you should use the Input Plugin, which is a Scene level system, responsible
    * for dealing with all input events for a Scene.
    */
  @JSImport("phaser", "Input.InputManager")
  @js.native
  class InputManager protected ()
    extends StObject
       with typings.phaser.Phaser.Input.InputManager {
    /**
      * 
      * @param game The Game instance that owns the Input Manager.
      * @param config The Input Configuration object, as set in the Game Config.
      */
    def this(game: typings.phaser.Phaser.Game, config: js.Object) = this()
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
    * There are lots of game configuration options available relating to input.
    * See the [Input Config object]{@linkcode Phaser.Types.Core.InputConfig} for more details, including how to deal with Phaser
    * listening for input events outside of the canvas, how to set a default number of pointers, input
    * capture settings and more.
    * 
    * Please also see the Input examples and tutorials for further information.
    */
  @JSImport("phaser", "Input.InputPlugin")
  @js.native
  class InputPlugin protected ()
    extends StObject
       with typings.phaser.Phaser.Input.InputPlugin {
    /**
      * 
      * @param scene A reference to the Scene that this Input Plugin is responsible for.
      */
    def this(scene: typings.phaser.Phaser.Scene) = this()
  }
  
  object InputPluginCache {
    
    @JSImport("phaser", "Input.InputPluginCache")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the input plugin object from the cache based on the given key.
      * @param key The key of the input plugin to get.
      */
    @scala.inline
    def getCore(key: String): InputPluginContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("getCore")(key.asInstanceOf[js.Any]).asInstanceOf[InputPluginContainer]
    
    /**
      * Installs all of the registered Input Plugins into the given target.
      * @param target The target InputPlugin to install the plugins into.
      */
    @scala.inline
    def install(target: typings.phaser.Phaser.Input.InputPlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Static method called directly by the Core internal Plugins.
      * Key is a reference used to get the plugin from the plugins object (i.e. InputPlugin)
      * Plugin is the object to instantiate to create the plugin
      * Mapping is what the plugin is injected into the Scene.Systems as (i.e. input)
      * @param key A reference used to get this plugin from the plugin cache.
      * @param plugin The plugin to be stored. Should be the core object, not instantiated.
      * @param mapping If this plugin is to be injected into the Input Plugin, this is the property key used.
      * @param settingsKey The key in the Scene Settings to check to see if this plugin should install or not.
      * @param configKey The key in the Game Config to check to see if this plugin should install or not.
      */
    @scala.inline
    def register(key: String, plugin: js.Function, mapping: String, settingsKey: String, configKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(key.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], settingsKey.asInstanceOf[js.Any], configKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Removes an input plugin based on the given key.
      * @param key The key of the input plugin to remove.
      */
    @scala.inline
    def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object Keyboard {
    
    @JSImport("phaser", "Input.Keyboard")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns `true` if the Key was pressed down within the `duration` value given, based on the current
      * game clock time. Or `false` if it either isn't down, or was pressed down longer ago than the given duration.
      * @param key The Key object to test.
      * @param duration The duration, in ms, within which the key must have been pressed down. Default 50.
      */
    @scala.inline
    def DownDuration(key: typings.phaser.Phaser.Input.Keyboard.Key): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("DownDuration")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def DownDuration(key: typings.phaser.Phaser.Input.Keyboard.Key, duration: integer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("DownDuration")(key.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    object Events {
      
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
      @JSImport("phaser", "Input.Keyboard.Events.ANY_KEY_DOWN")
      @js.native
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
      @JSImport("phaser", "Input.Keyboard.Events.ANY_KEY_UP")
      @js.native
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
      @JSImport("phaser", "Input.Keyboard.Events.COMBO_MATCH")
      @js.native
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
      @JSImport("phaser", "Input.Keyboard.Events.DOWN")
      @js.native
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
      @JSImport("phaser", "Input.Keyboard.Events.KEY_DOWN")
      @js.native
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
      @JSImport("phaser", "Input.Keyboard.Events.KEY_UP")
      @js.native
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
      @JSImport("phaser", "Input.Keyboard.Events.UP")
      @js.native
      val UP: js.Any = js.native
    }
    
    /**
      * The justDown value allows you to test if this Key has just been pressed down or not.
      * 
      * When you check this value it will return `true` if the Key is down, otherwise `false`.
      * 
      * You can only call justDown once per key press. It will only return `true` once, until the Key is released and pressed down again.
      * This allows you to use it in situations where you want to check if this key is down without using an event, such as in a core game loop.
      * @param key The Key to check to see if it's just down or not.
      */
    @scala.inline
    def JustDown(key: typings.phaser.Phaser.Input.Keyboard.Key): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("JustDown")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * The justUp value allows you to test if this Key has just been released or not.
      * 
      * When you check this value it will return `true` if the Key is up, otherwise `false`.
      * 
      * You can only call JustUp once per key release. It will only return `true` once, until the Key is pressed down and released again.
      * This allows you to use it in situations where you want to check if this key is up without using an event, such as in a core game loop.
      * @param key The Key to check to see if it's just up or not.
      */
    @scala.inline
    def JustUp(key: typings.phaser.Phaser.Input.Keyboard.Key): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("JustUp")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * A generic Key object which can be passed to the Process functions (and so on)
      * keycode must be an integer
      */
    @JSImport("phaser", "Input.Keyboard.Key")
    @js.native
    class Key protected ()
      extends StObject
         with typings.phaser.Phaser.Input.Keyboard.Key {
      /**
        * 
        * @param plugin The Keyboard Plugin instance that owns this Key object.
        * @param keyCode The keycode of this key.
        */
      def this(plugin: typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin, keyCode: integer) = this()
    }
    
    /**
      * Keyboard Codes.
      */
    object KeyCodes {
      
      @JSImport("phaser", "Input.Keyboard.KeyCodes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The A key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.A")
      @js.native
      def A: integer = js.native
      
      /**
        * The ALT key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.ALT")
      @js.native
      def ALT: integer = js.native
      @scala.inline
      def ALT_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALT")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def A_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("A")(x.asInstanceOf[js.Any])
      
      /**
        * The B key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.B")
      @js.native
      def B: integer = js.native
      
      /**
        * The BACKSPACE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.BACKSPACE")
      @js.native
      def BACKSPACE: integer = js.native
      @scala.inline
      def BACKSPACE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKSPACE")(x.asInstanceOf[js.Any])
      
      /**
        * The BACKTICK key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.BACKTICK")
      @js.native
      def BACKTICK: integer = js.native
      @scala.inline
      def BACKTICK_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKTICK")(x.asInstanceOf[js.Any])
      
      /**
        * The BACK_SLASH key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.BACK_SLASH")
      @js.native
      def BACK_SLASH: integer = js.native
      @scala.inline
      def BACK_SLASH_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACK_SLASH")(x.asInstanceOf[js.Any])
      
      /**
        * The BRACKET_LEFT_FIREFOX key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.BRACKET_LEFT_FIREFOX")
      @js.native
      def BRACKET_LEFT_FIREFOX: integer = js.native
      @scala.inline
      def BRACKET_LEFT_FIREFOX_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BRACKET_LEFT_FIREFOX")(x.asInstanceOf[js.Any])
      
      /**
        * The BRACKET_RIGHT_FIREFOX key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.BRACKET_RIGHT_FIREFOX")
      @js.native
      def BRACKET_RIGHT_FIREFOX: integer = js.native
      @scala.inline
      def BRACKET_RIGHT_FIREFOX_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BRACKET_RIGHT_FIREFOX")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def B_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("B")(x.asInstanceOf[js.Any])
      
      /**
        * The C key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.C")
      @js.native
      def C: integer = js.native
      
      /**
        * The CAPS_LOCK key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.CAPS_LOCK")
      @js.native
      def CAPS_LOCK: integer = js.native
      @scala.inline
      def CAPS_LOCK_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPS_LOCK")(x.asInstanceOf[js.Any])
      
      /**
        * The CLOSED_BRACKET key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.CLOSED_BRACKET")
      @js.native
      def CLOSED_BRACKET: integer = js.native
      @scala.inline
      def CLOSED_BRACKET_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_BRACKET")(x.asInstanceOf[js.Any])
      
      /**
        * The COLON key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.COLON")
      @js.native
      def COLON: integer = js.native
      @scala.inline
      def COLON_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLON")(x.asInstanceOf[js.Any])
      
      /**
        * The COMMA key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.COMMA")
      @js.native
      def COMMA: integer = js.native
      @scala.inline
      def COMMA_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMA")(x.asInstanceOf[js.Any])
      
      /**
        * The COMMA_FIREFOX key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.COMMA_FIREFOX")
      @js.native
      def COMMA_FIREFOX: integer = js.native
      @scala.inline
      def COMMA_FIREFOX_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMA_FIREFOX")(x.asInstanceOf[js.Any])
      
      /**
        * The COMMA_FIREFOX_WINDOWS key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.COMMA_FIREFOX_WINDOWS")
      @js.native
      def COMMA_FIREFOX_WINDOWS: integer = js.native
      @scala.inline
      def COMMA_FIREFOX_WINDOWS_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMA_FIREFOX_WINDOWS")(x.asInstanceOf[js.Any])
      
      /**
        * The CTRL key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.CTRL")
      @js.native
      def CTRL: integer = js.native
      @scala.inline
      def CTRL_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CTRL")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def C_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C")(x.asInstanceOf[js.Any])
      
      /**
        * The D key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.D")
      @js.native
      def D: integer = js.native
      
      /**
        * The DELETE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.DELETE")
      @js.native
      def DELETE: integer = js.native
      @scala.inline
      def DELETE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
      
      /**
        * The DOWN key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.DOWN")
      @js.native
      def DOWN: integer = js.native
      @scala.inline
      def DOWN_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def D_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("D")(x.asInstanceOf[js.Any])
      
      /**
        * The E key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.E")
      @js.native
      def E: integer = js.native
      
      /**
        * The EIGHT key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.EIGHT")
      @js.native
      def EIGHT: integer = js.native
      @scala.inline
      def EIGHT_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EIGHT")(x.asInstanceOf[js.Any])
      
      /**
        * The END key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.END")
      @js.native
      def END: integer = js.native
      @scala.inline
      def END_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
      
      /**
        * The ENTER key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.ENTER")
      @js.native
      def ENTER: integer = js.native
      @scala.inline
      def ENTER_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER")(x.asInstanceOf[js.Any])
      
      /**
        * The ESC key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.ESC")
      @js.native
      def ESC: integer = js.native
      @scala.inline
      def ESC_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ESC")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def E_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("E")(x.asInstanceOf[js.Any])
      
      /**
        * The F key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F")
      @js.native
      def F: integer = js.native
      
      /**
        * The F1 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F1")
      @js.native
      def F1: integer = js.native
      
      /**
        * The F10 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F10")
      @js.native
      def F10: integer = js.native
      @scala.inline
      def F10_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F10")(x.asInstanceOf[js.Any])
      
      /**
        * The F11 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F11")
      @js.native
      def F11: integer = js.native
      @scala.inline
      def F11_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F11")(x.asInstanceOf[js.Any])
      
      /**
        * The F12 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F12")
      @js.native
      def F12: integer = js.native
      @scala.inline
      def F12_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F12")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def F1_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F1")(x.asInstanceOf[js.Any])
      
      /**
        * The F2 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F2")
      @js.native
      def F2: integer = js.native
      @scala.inline
      def F2_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F2")(x.asInstanceOf[js.Any])
      
      /**
        * The F3 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F3")
      @js.native
      def F3: integer = js.native
      @scala.inline
      def F3_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F3")(x.asInstanceOf[js.Any])
      
      /**
        * The F4 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F4")
      @js.native
      def F4: integer = js.native
      @scala.inline
      def F4_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F4")(x.asInstanceOf[js.Any])
      
      /**
        * The F5 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F5")
      @js.native
      def F5: integer = js.native
      @scala.inline
      def F5_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F5")(x.asInstanceOf[js.Any])
      
      /**
        * The F6 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F6")
      @js.native
      def F6: integer = js.native
      @scala.inline
      def F6_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F6")(x.asInstanceOf[js.Any])
      
      /**
        * The F7 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F7")
      @js.native
      def F7: integer = js.native
      @scala.inline
      def F7_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F7")(x.asInstanceOf[js.Any])
      
      /**
        * The F8 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F8")
      @js.native
      def F8: integer = js.native
      @scala.inline
      def F8_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F8")(x.asInstanceOf[js.Any])
      
      /**
        * The F9 key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.F9")
      @js.native
      def F9: integer = js.native
      @scala.inline
      def F9_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F9")(x.asInstanceOf[js.Any])
      
      /**
        * The FIVE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.FIVE")
      @js.native
      def FIVE: integer = js.native
      @scala.inline
      def FIVE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIVE")(x.asInstanceOf[js.Any])
      
      /**
        * The FORWARD_SLASH key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.FORWARD_SLASH")
      @js.native
      def FORWARD_SLASH: integer = js.native
      @scala.inline
      def FORWARD_SLASH_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD_SLASH")(x.asInstanceOf[js.Any])
      
      /**
        * The FOUR key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.FOUR")
      @js.native
      def FOUR: integer = js.native
      @scala.inline
      def FOUR_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOUR")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def F_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F")(x.asInstanceOf[js.Any])
      
      /**
        * The G key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.G")
      @js.native
      def G: integer = js.native
      @scala.inline
      def G_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("G")(x.asInstanceOf[js.Any])
      
      /**
        * The H key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.H")
      @js.native
      def H: integer = js.native
      
      /**
        * The HOME key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.HOME")
      @js.native
      def HOME: integer = js.native
      @scala.inline
      def HOME_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def H_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("H")(x.asInstanceOf[js.Any])
      
      /**
        * The I key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.I")
      @js.native
      def I: integer = js.native
      
      /**
        * The INSERT key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.INSERT")
      @js.native
      def INSERT: integer = js.native
      @scala.inline
      def INSERT_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSERT")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def I_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("I")(x.asInstanceOf[js.Any])
      
      /**
        * The J key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.J")
      @js.native
      def J: integer = js.native
      @scala.inline
      def J_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("J")(x.asInstanceOf[js.Any])
      
      /**
        * The K key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.K")
      @js.native
      def K: integer = js.native
      @scala.inline
      def K_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("K")(x.asInstanceOf[js.Any])
      
      /**
        * The L key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.L")
      @js.native
      def L: integer = js.native
      
      /**
        * The LEFT key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.LEFT")
      @js.native
      def LEFT: integer = js.native
      @scala.inline
      def LEFT_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def L_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("L")(x.asInstanceOf[js.Any])
      
      /**
        * The M key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.M")
      @js.native
      def M: integer = js.native
      
      /**
        * The MINUS key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.MINUS")
      @js.native
      def MINUS: integer = js.native
      @scala.inline
      def MINUS_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUS")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def M_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("M")(x.asInstanceOf[js.Any])
      
      /**
        * The N key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.N")
      @js.native
      def N: integer = js.native
      
      /**
        * The NINE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NINE")
      @js.native
      def NINE: integer = js.native
      @scala.inline
      def NINE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NINE")(x.asInstanceOf[js.Any])
      
      /**
        * The Numpad Addition (+) key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_ADD")
      @js.native
      def NUMPAD_ADD: integer = js.native
      @scala.inline
      def NUMPAD_ADD_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_ADD")(x.asInstanceOf[js.Any])
      
      /**
        * The NUMPAD_EIGHT key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_EIGHT")
      @js.native
      def NUMPAD_EIGHT: integer = js.native
      @scala.inline
      def NUMPAD_EIGHT_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_EIGHT")(x.asInstanceOf[js.Any])
      
      /**
        * The NUMPAD_FIVE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_FIVE")
      @js.native
      def NUMPAD_FIVE: integer = js.native
      @scala.inline
      def NUMPAD_FIVE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_FIVE")(x.asInstanceOf[js.Any])
      
      /**
        * The NUMPAD_FOUR key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_FOUR")
      @js.native
      def NUMPAD_FOUR: integer = js.native
      @scala.inline
      def NUMPAD_FOUR_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_FOUR")(x.asInstanceOf[js.Any])
      
      /**
        * The NUMPAD_NINE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_NINE")
      @js.native
      def NUMPAD_NINE: integer = js.native
      @scala.inline
      def NUMPAD_NINE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_NINE")(x.asInstanceOf[js.Any])
      
      /**
        * The NUMPAD_ONE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_ONE")
      @js.native
      def NUMPAD_ONE: integer = js.native
      @scala.inline
      def NUMPAD_ONE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_ONE")(x.asInstanceOf[js.Any])
      
      /**
        * The NUMPAD_SEVEN key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_SEVEN")
      @js.native
      def NUMPAD_SEVEN: integer = js.native
      @scala.inline
      def NUMPAD_SEVEN_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_SEVEN")(x.asInstanceOf[js.Any])
      
      /**
        * The NUMPAD_SIX key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_SIX")
      @js.native
      def NUMPAD_SIX: integer = js.native
      @scala.inline
      def NUMPAD_SIX_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_SIX")(x.asInstanceOf[js.Any])
      
      /**
        * The Numpad Subtraction (-) key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_SUBTRACT")
      @js.native
      def NUMPAD_SUBTRACT: integer = js.native
      @scala.inline
      def NUMPAD_SUBTRACT_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_SUBTRACT")(x.asInstanceOf[js.Any])
      
      /**
        * The NUMPAD_THREE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_THREE")
      @js.native
      def NUMPAD_THREE: integer = js.native
      @scala.inline
      def NUMPAD_THREE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_THREE")(x.asInstanceOf[js.Any])
      
      /**
        * The NUMPAD_TWO key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_TWO")
      @js.native
      def NUMPAD_TWO: integer = js.native
      @scala.inline
      def NUMPAD_TWO_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_TWO")(x.asInstanceOf[js.Any])
      
      /**
        * The NUMPAD_ZERO key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.NUMPAD_ZERO")
      @js.native
      def NUMPAD_ZERO: integer = js.native
      @scala.inline
      def NUMPAD_ZERO_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_ZERO")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def N_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("N")(x.asInstanceOf[js.Any])
      
      /**
        * The O key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.O")
      @js.native
      def O: integer = js.native
      
      /**
        * The ONE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.ONE")
      @js.native
      def ONE: integer = js.native
      @scala.inline
      def ONE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
      
      /**
        * The OPEN_BRACKET key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.OPEN_BRACKET")
      @js.native
      def OPEN_BRACKET: integer = js.native
      @scala.inline
      def OPEN_BRACKET_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_BRACKET")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def O_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("O")(x.asInstanceOf[js.Any])
      
      /**
        * The P key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.P")
      @js.native
      def P: integer = js.native
      
      /**
        * The PAGE_DOWN key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.PAGE_DOWN")
      @js.native
      def PAGE_DOWN: integer = js.native
      @scala.inline
      def PAGE_DOWN_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAGE_DOWN")(x.asInstanceOf[js.Any])
      
      /**
        * The PAGE_UP key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.PAGE_UP")
      @js.native
      def PAGE_UP: integer = js.native
      @scala.inline
      def PAGE_UP_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAGE_UP")(x.asInstanceOf[js.Any])
      
      /**
        * The PAUSE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.PAUSE")
      @js.native
      def PAUSE: integer = js.native
      @scala.inline
      def PAUSE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAUSE")(x.asInstanceOf[js.Any])
      
      /**
        * The PERIOD key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.PERIOD")
      @js.native
      def PERIOD: integer = js.native
      @scala.inline
      def PERIOD_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERIOD")(x.asInstanceOf[js.Any])
      
      /**
        * The PLUS key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.PLUS")
      @js.native
      def PLUS: integer = js.native
      @scala.inline
      def PLUS_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLUS")(x.asInstanceOf[js.Any])
      
      /**
        * The PRINT_SCREEN key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.PRINT_SCREEN")
      @js.native
      def PRINT_SCREEN: integer = js.native
      @scala.inline
      def PRINT_SCREEN_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRINT_SCREEN")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def P_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("P")(x.asInstanceOf[js.Any])
      
      /**
        * The Q key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.Q")
      @js.native
      def Q: integer = js.native
      
      /**
        * The QUOTES key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.QUOTES")
      @js.native
      def QUOTES: integer = js.native
      @scala.inline
      def QUOTES_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTES")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def Q_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Q")(x.asInstanceOf[js.Any])
      
      /**
        * The R key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.R")
      @js.native
      def R: integer = js.native
      
      /**
        * The RIGHT key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.RIGHT")
      @js.native
      def RIGHT: integer = js.native
      @scala.inline
      def RIGHT_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def R_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("R")(x.asInstanceOf[js.Any])
      
      /**
        * The S key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.S")
      @js.native
      def S: integer = js.native
      
      /**
        * The SEMICOLON key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.SEMICOLON")
      @js.native
      def SEMICOLON: integer = js.native
      @scala.inline
      def SEMICOLON_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEMICOLON")(x.asInstanceOf[js.Any])
      
      /**
        * The SEMICOLON_FIREFOX key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.SEMICOLON_FIREFOX")
      @js.native
      def SEMICOLON_FIREFOX: integer = js.native
      @scala.inline
      def SEMICOLON_FIREFOX_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEMICOLON_FIREFOX")(x.asInstanceOf[js.Any])
      
      /**
        * The SEVEN key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.SEVEN")
      @js.native
      def SEVEN: integer = js.native
      @scala.inline
      def SEVEN_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEVEN")(x.asInstanceOf[js.Any])
      
      /**
        * The SHIFT key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.SHIFT")
      @js.native
      def SHIFT: integer = js.native
      @scala.inline
      def SHIFT_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHIFT")(x.asInstanceOf[js.Any])
      
      /**
        * The SIX key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.SIX")
      @js.native
      def SIX: integer = js.native
      @scala.inline
      def SIX_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIX")(x.asInstanceOf[js.Any])
      
      /**
        * The SPACE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.SPACE")
      @js.native
      def SPACE: integer = js.native
      @scala.inline
      def SPACE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def S_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S")(x.asInstanceOf[js.Any])
      
      /**
        * The T key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.T")
      @js.native
      def T: integer = js.native
      
      /**
        * The TAB key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.TAB")
      @js.native
      def TAB: integer = js.native
      @scala.inline
      def TAB_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB")(x.asInstanceOf[js.Any])
      
      /**
        * The THREE key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.THREE")
      @js.native
      def THREE: integer = js.native
      @scala.inline
      def THREE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THREE")(x.asInstanceOf[js.Any])
      
      /**
        * The TWO key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.TWO")
      @js.native
      def TWO: integer = js.native
      @scala.inline
      def TWO_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def T_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("T")(x.asInstanceOf[js.Any])
      
      /**
        * The U key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.U")
      @js.native
      def U: integer = js.native
      
      /**
        * The UP key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.UP")
      @js.native
      def UP: integer = js.native
      @scala.inline
      def UP_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def U_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("U")(x.asInstanceOf[js.Any])
      
      /**
        * The V key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.V")
      @js.native
      def V: integer = js.native
      @scala.inline
      def V_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V")(x.asInstanceOf[js.Any])
      
      /**
        * The W key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.W")
      @js.native
      def W: integer = js.native
      @scala.inline
      def W_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("W")(x.asInstanceOf[js.Any])
      
      /**
        * The X key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.X")
      @js.native
      def X: integer = js.native
      @scala.inline
      def X_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
      
      /**
        * The Y key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.Y")
      @js.native
      def Y: integer = js.native
      @scala.inline
      def Y_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y")(x.asInstanceOf[js.Any])
      
      /**
        * The Z key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.Z")
      @js.native
      def Z: integer = js.native
      
      /**
        * The ZERO key.
        */
      @JSImport("phaser", "Input.Keyboard.KeyCodes.ZERO")
      @js.native
      def ZERO: integer = js.native
      @scala.inline
      def ZERO_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def Z_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z")(x.asInstanceOf[js.Any])
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
    @JSImport("phaser", "Input.Keyboard.KeyCombo")
    @js.native
    class KeyCombo protected ()
      extends StObject
         with typings.phaser.Phaser.Input.Keyboard.KeyCombo {
      /**
        * 
        * @param keyboardPlugin A reference to the Keyboard Plugin.
        * @param keys The keys that comprise this combo.
        * @param config A Key Combo configuration object.
        */
      def this(keyboardPlugin: typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin, keys: String) = this()
      def this(
        keyboardPlugin: typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin,
        keys: js.Array[js.Object | integer]
      ) = this()
      def this(
        keyboardPlugin: typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin,
        keys: String,
        config: KeyComboConfig
      ) = this()
      def this(
        keyboardPlugin: typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin,
        keys: js.Array[js.Object | integer],
        config: KeyComboConfig
      ) = this()
      
      /**
        * The current keyCode the combo is waiting for.
        */
      /* CompleteClass */
      var current: integer = js.native
      
      /**
        * If the combo matches, will it delete itself?
        */
      /* CompleteClass */
      var deleteOnMatch: Boolean = js.native
      
      /**
        * Destroys this Key Combo and all of its references.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * A flag that controls if this Key Combo is actively processing keys or not.
        */
      /* CompleteClass */
      var enabled: Boolean = js.native
      
      /**
        * The current index of the key being waited for in the 'keys' string.
        */
      /* CompleteClass */
      var index: integer = js.native
      
      /**
        * An array of the keycodes that comprise this combo.
        */
      /* CompleteClass */
      var keyCodes: js.Array[js.Any] = js.native
      
      /**
        * A reference to the Keyboard Manager
        */
      /* CompleteClass */
      var manager: typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin = js.native
      
      /**
        * Has this Key Combo been matched yet?
        */
      /* CompleteClass */
      var matched: Boolean = js.native
      
      /**
        * The max delay in ms between each key press. Above this the combo is reset. 0 means disabled.
        */
      /* CompleteClass */
      var maxKeyDelay: integer = js.native
      
      /**
        * How far complete is this combo? A value between 0 and 1.
        */
      /* CompleteClass */
      override val progress: Double = js.native
      
      /**
        * If previously matched and they press the first key of the combo again, will it reset?
        */
      /* CompleteClass */
      var resetOnMatch: Boolean = js.native
      
      /**
        * If they press the wrong key do we reset the combo?
        */
      /* CompleteClass */
      var resetOnWrongKey: Boolean = js.native
      
      /**
        * The length of this combo (in keycodes)
        */
      /* CompleteClass */
      var size: Double = js.native
      
      /**
        * The time the previous key in the combo was matched.
        */
      /* CompleteClass */
      var timeLastMatched: Double = js.native
      
      /**
        * The time the entire combo was matched.
        */
      /* CompleteClass */
      var timeMatched: Double = js.native
    }
    
    /**
      * The Keyboard Manager is a helper class that belongs to the global Input Manager.
      * 
      * Its role is to listen for native DOM Keyboard Events and then store them for further processing by the Keyboard Plugin.
      * 
      * You do not need to create this class directly, the Input Manager will create an instance of it automatically if keyboard
      * input has been enabled in the Game Config.
      */
    @JSImport("phaser", "Input.Keyboard.KeyboardManager")
    @js.native
    class KeyboardManager protected ()
      extends StObject
         with typings.phaser.Phaser.Input.Keyboard.KeyboardManager {
      /**
        * 
        * @param inputManager A reference to the Input Manager.
        */
      def this(inputManager: typings.phaser.Phaser.Input.InputManager) = this()
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
    @JSImport("phaser", "Input.Keyboard.KeyboardPlugin")
    @js.native
    class KeyboardPlugin protected ()
      extends StObject
         with typings.phaser.Phaser.Input.Keyboard.KeyboardPlugin {
      /**
        * 
        * @param sceneInputPlugin A reference to the Scene Input Plugin that the KeyboardPlugin belongs to.
        */
      def this(sceneInputPlugin: typings.phaser.Phaser.Input.InputPlugin) = this()
    }
    
    /**
      * Returns `true` if the Key was released within the `duration` value given, based on the current
      * game clock time. Or returns `false` if it either isn't up, or was released longer ago than the given duration.
      * @param key The Key object to test.
      * @param duration The duration, in ms, within which the key must have been released. Default 50.
      */
    @scala.inline
    def UpDuration(key: typings.phaser.Phaser.Input.Keyboard.Key): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("UpDuration")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def UpDuration(key: typings.phaser.Phaser.Input.Keyboard.Key, duration: integer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("UpDuration")(key.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /**
    * The mouse pointer is being held down.
    */
  @JSImport("phaser", "Input.MOUSE_DOWN")
  @js.native
  def MOUSE_DOWN: integer = js.native
  @scala.inline
  def MOUSE_DOWN_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSE_DOWN")(x.asInstanceOf[js.Any])
  
  /**
    * The mouse pointer is being moved.
    */
  @JSImport("phaser", "Input.MOUSE_MOVE")
  @js.native
  def MOUSE_MOVE: integer = js.native
  @scala.inline
  def MOUSE_MOVE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSE_MOVE")(x.asInstanceOf[js.Any])
  
  /**
    * The mouse pointer is released.
    */
  @JSImport("phaser", "Input.MOUSE_UP")
  @js.native
  def MOUSE_UP: integer = js.native
  @scala.inline
  def MOUSE_UP_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSE_UP")(x.asInstanceOf[js.Any])
  
  /**
    * The mouse wheel changes.
    */
  @JSImport("phaser", "Input.MOUSE_WHEEL")
  @js.native
  def MOUSE_WHEEL: integer = js.native
  @scala.inline
  def MOUSE_WHEEL_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSE_WHEEL")(x.asInstanceOf[js.Any])
  
  object Mouse {
    
    /**
      * The Mouse Manager is a helper class that belongs to the Input Manager.
      * 
      * Its role is to listen for native DOM Mouse Events and then pass them onto the Input Manager for further processing.
      * 
      * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
      */
    @JSImport("phaser", "Input.Mouse.MouseManager")
    @js.native
    class MouseManager protected ()
      extends StObject
         with typings.phaser.Phaser.Input.Mouse.MouseManager {
      /**
        * 
        * @param inputManager A reference to the Input Manager.
        */
      def this(inputManager: typings.phaser.Phaser.Input.InputManager) = this()
      
      /**
        * If true the DOM mouse events will have event.preventDefault applied to them, if false they will propagate fully.
        */
      /* CompleteClass */
      var capture: Boolean = js.native
      
      /**
        * Destroys this Mouse Manager instance.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Attempts to disable the context menu from appearing if you right-click on the browser.
        * 
        * Works by listening for the `contextmenu` event and prevent defaulting it.
        * 
        * Use this if you need to enable right-button mouse support in your game, and the browser
        * menu keeps getting in the way.
        */
      /* CompleteClass */
      override def disableContextMenu(): this.type = js.native
      
      /**
        * A boolean that controls if the Mouse Manager is enabled or not.
        * Can be toggled on the fly.
        */
      /* CompleteClass */
      var enabled: Boolean = js.native
      
      /**
        * If the mouse has been pointer locked successfully this will be set to true.
        */
      /* CompleteClass */
      var locked: Boolean = js.native
      
      /**
        * A reference to the Input Manager.
        */
      /* CompleteClass */
      var manager: typings.phaser.Phaser.Input.InputManager = js.native
      
      /**
        * The Mouse Down Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onMouseDown: js.Function = js.native
      
      /**
        * The Mouse Down Event handler specifically for events on the Window.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onMouseDownWindow: js.Function = js.native
      
      /**
        * The Mouse Move Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onMouseMove: js.Function = js.native
      
      /**
        * The Mouse Out Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onMouseOut: js.Function = js.native
      
      /**
        * The Mouse Over Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onMouseOver: js.Function = js.native
      
      /**
        * The Mouse Up Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onMouseUp: js.Function = js.native
      
      /**
        * The Mouse Up Event handler specifically for events on the Window.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onMouseUpWindow: js.Function = js.native
      
      /**
        * The Mouse Wheel Event handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onMouseWheel: js.Function = js.native
      
      /**
        * Internal pointerLockChange handler.
        * This function is sent the native DOM MouseEvent.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var pointerLockChange: js.Function = js.native
      
      /**
        * If the browser supports pointer lock, this will request that the pointer lock is released. If
        * the browser successfully enters a locked state, a 'POINTER_LOCK_CHANGE_EVENT' will be
        * dispatched - from the game's input manager - with an `isPointerLocked` property.
        */
      /* CompleteClass */
      override def releasePointerLock(): Unit = js.native
      
      /**
        * If the browser supports it, you can request that the pointer be locked to the browser window.
        * 
        * This is classically known as 'FPS controls', where the pointer can't leave the browser until
        * the user presses an exit key.
        * 
        * If the browser successfully enters a locked state, a `POINTER_LOCK_CHANGE_EVENT` will be dispatched,
        * from the games Input Manager, with an `isPointerLocked` property.
        * 
        * It is important to note that pointer lock can only be enabled after an 'engagement gesture',
        * see: https://w3c.github.io/pointerlock/#dfn-engagement-gesture.
        */
      /* CompleteClass */
      override def requestPointerLock(): Unit = js.native
      
      /**
        * Starts the Mouse Event listeners running.
        * This is called automatically and does not need to be manually invoked.
        */
      /* CompleteClass */
      override def startListeners(): Unit = js.native
      
      /**
        * Stops the Mouse Event listeners.
        * This is called automatically and does not need to be manually invoked.
        */
      /* CompleteClass */
      override def stopListeners(): Unit = js.native
      
      /**
        * The Mouse target, as defined in the Game Config.
        * Typically the canvas to which the game is rendering, but can be any interactive DOM element.
        */
      /* CompleteClass */
      var target: js.Any = js.native
    }
  }
  
  /**
    * The pointer lock has changed.
    */
  @JSImport("phaser", "Input.POINTER_LOCK_CHANGE")
  @js.native
  def POINTER_LOCK_CHANGE: integer = js.native
  @scala.inline
  def POINTER_LOCK_CHANGE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINTER_LOCK_CHANGE")(x.asInstanceOf[js.Any])
  
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
  @JSImport("phaser", "Input.Pointer")
  @js.native
  class Pointer protected ()
    extends StObject
       with typings.phaser.Phaser.Input.Pointer {
    /**
      * 
      * @param manager A reference to the Input Manager.
      * @param id The internal ID of this Pointer.
      */
    def this(manager: typings.phaser.Phaser.Input.InputManager, id: integer) = this()
  }
  
  /**
    * A touch pointer has been been cancelled by the browser.
    */
  @JSImport("phaser", "Input.TOUCH_CANCEL")
  @js.native
  def TOUCH_CANCEL: integer = js.native
  @scala.inline
  def TOUCH_CANCEL_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_CANCEL")(x.asInstanceOf[js.Any])
  
  /**
    * A touch pointer has been started.
    */
  @JSImport("phaser", "Input.TOUCH_END")
  @js.native
  def TOUCH_END: integer = js.native
  @scala.inline
  def TOUCH_END_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_END")(x.asInstanceOf[js.Any])
  
  /**
    * A touch pointer has been started.
    */
  @JSImport("phaser", "Input.TOUCH_MOVE")
  @js.native
  def TOUCH_MOVE: integer = js.native
  @scala.inline
  def TOUCH_MOVE_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MOVE")(x.asInstanceOf[js.Any])
  
  /**
    * A touch pointer has been started.
    */
  @JSImport("phaser", "Input.TOUCH_START")
  @js.native
  def TOUCH_START: integer = js.native
  @scala.inline
  def TOUCH_START_=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_START")(x.asInstanceOf[js.Any])
  
  object Touch {
    
    /**
      * The Touch Manager is a helper class that belongs to the Input Manager.
      * 
      * Its role is to listen for native DOM Touch Events and then pass them onto the Input Manager for further processing.
      * 
      * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
      */
    @JSImport("phaser", "Input.Touch.TouchManager")
    @js.native
    class TouchManager protected ()
      extends StObject
         with typings.phaser.Phaser.Input.Touch.TouchManager {
      /**
        * 
        * @param inputManager A reference to the Input Manager.
        */
      def this(inputManager: typings.phaser.Phaser.Input.InputManager) = this()
      
      /**
        * If true the DOM events will have event.preventDefault applied to them, if false they will propagate fully.
        */
      /* CompleteClass */
      var capture: Boolean = js.native
      
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
        * A boolean that controls if the Touch Manager is enabled or not.
        * Can be toggled on the fly.
        */
      /* CompleteClass */
      var enabled: Boolean = js.native
      
      /**
        * A reference to the Input Manager.
        */
      /* CompleteClass */
      var manager: typings.phaser.Phaser.Input.InputManager = js.native
      
      /**
        * The Touch Cancel event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onTouchCancel: js.Function = js.native
      
      /**
        * The Touch Cancel event handler function specifically for events on the Window.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onTouchCancelWindow: js.Function = js.native
      
      /**
        * The Touch End event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onTouchEnd: js.Function = js.native
      
      /**
        * The Touch End event handler function specifically for events on the Window.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onTouchEndWindow: js.Function = js.native
      
      /**
        * The Touch Move event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onTouchMove: js.Function = js.native
      
      /**
        * The Touch Out event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onTouchOut: js.Function = js.native
      
      /**
        * The Touch Over event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onTouchOver: js.Function = js.native
      
      /**
        * The Touch Start event handler function.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onTouchStart: js.Function = js.native
      
      /**
        * The Touch Start event handler function specifically for events on the Window.
        * Initially empty and bound in the `startListeners` method.
        */
      /* CompleteClass */
      var onTouchStartWindow: js.Function = js.native
      
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
      
      /**
        * The Touch Event target, as defined in the Game Config.
        * Typically the canvas to which the game is rendering, but can be any interactive DOM element.
        */
      /* CompleteClass */
      var target: js.Any = js.native
    }
  }
}
