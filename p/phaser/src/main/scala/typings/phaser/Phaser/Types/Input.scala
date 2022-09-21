package typings.phaser.Phaser.Types

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Shape
import typings.phaser.Phaser.Input.Keyboard.Key
import typings.phaser.phaserNumbers.`0`
import typings.phaser.phaserNumbers.`1`
import typings.phaser.phaserNumbers.`2`
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  /**
    * A Phaser Input Event Data object.
    * 
    * This object is passed to the registered event listeners and allows you to stop any further propagation.
    */
  trait EventData extends StObject {
    
    /**
      * The cancelled state of this Event.
      */
    var cancelled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Call this method to stop this event from passing any further down the event chain.
      */
    var stopPropagation: js.Function
  }
  object EventData {
    
    inline def apply(stopPropagation: js.Function): EventData = {
      val __obj = js.Dynamic.literal(stopPropagation = stopPropagation.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    extension [Self <: EventData](x: Self) {
      
      inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
      
      inline def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    }
  }
  
  object Gamepad {
    
    /**
      * The Gamepad object, as extracted from GamepadEvent.
      */
    trait Pad extends StObject {
      
      /**
        * The ID of the Gamepad.
        */
      var id: String
      
      /**
        * The index of the Gamepad.
        */
      var index: Double
    }
    object Pad {
      
      inline def apply(id: String, index: Double): Pad = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
        __obj.asInstanceOf[Pad]
      }
      
      extension [Self <: Pad](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type HitAreaCallback = js.Function4[/* hitArea */ Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject, Unit]
  
  trait InputConfiguration extends StObject {
    
    /**
      * If `pixelPerfect` is set, this is the alpha tolerance threshold value used in the callback.
      */
    var alphaTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * The CSS string to be used when the cursor is over this Interactive Object.
      */
    var cursor: js.UndefOr[String] = js.undefined
    
    /**
      * If `true` the Interactive Object will be set to be draggable and emit drag events.
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` the Interactive Object will be set to be a drop zone for draggable objects.
      */
    var dropZone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The object / shape to use as the Hit Area. If not given it will try to create a Rectangle based on the texture frame.
      */
    var hitArea: js.UndefOr[Any] = js.undefined
    
    /**
      * The callback that determines if the pointer is within the Hit Area shape or not.
      */
    var hitAreaCallback: js.UndefOr[HitAreaCallback] = js.undefined
    
    /**
      * If `true` the a pixel perfect function will be set for the hit area callback. Only works with image texture based Game Objects, not Render Textures.
      */
    var pixelPerfect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` the Interactive Object will set the `pointer` hand cursor when a pointer is over it. This is a short-cut for setting `cursor: 'pointer'`.
      */
    var useHandCursor: js.UndefOr[Boolean] = js.undefined
  }
  object InputConfiguration {
    
    inline def apply(): InputConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputConfiguration]
    }
    
    extension [Self <: InputConfiguration](x: Self) {
      
      inline def setAlphaTolerance(value: Double): Self = StObject.set(x, "alphaTolerance", value.asInstanceOf[js.Any])
      
      inline def setAlphaToleranceUndefined: Self = StObject.set(x, "alphaTolerance", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDropZone(value: Boolean): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
      
      inline def setDropZoneUndefined: Self = StObject.set(x, "dropZone", js.undefined)
      
      inline def setHitArea(value: Any): Self = StObject.set(x, "hitArea", value.asInstanceOf[js.Any])
      
      inline def setHitAreaCallback(value: (/* hitArea */ Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject) => Unit): Self = StObject.set(x, "hitAreaCallback", js.Any.fromFunction4(value))
      
      inline def setHitAreaCallbackUndefined: Self = StObject.set(x, "hitAreaCallback", js.undefined)
      
      inline def setHitAreaUndefined: Self = StObject.set(x, "hitArea", js.undefined)
      
      inline def setPixelPerfect(value: Boolean): Self = StObject.set(x, "pixelPerfect", value.asInstanceOf[js.Any])
      
      inline def setPixelPerfectUndefined: Self = StObject.set(x, "pixelPerfect", js.undefined)
      
      inline def setUseHandCursor(value: Boolean): Self = StObject.set(x, "useHandCursor", value.asInstanceOf[js.Any])
      
      inline def setUseHandCursorUndefined: Self = StObject.set(x, "useHandCursor", js.undefined)
    }
  }
  
  trait InputPluginContainer extends StObject {
    
    /**
      * The unique name of this plugin in the input plugin cache.
      */
    var key: String
    
    /**
      * If this plugin is to be injected into the Input Plugin, this is the property key map used.
      */
    var mapping: js.UndefOr[String] = js.undefined
    
    /**
      * The plugin to be stored. Should be the source object, not instantiated.
      */
    var plugin: js.Function
  }
  object InputPluginContainer {
    
    inline def apply(key: String, plugin: js.Function): InputPluginContainer = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputPluginContainer]
    }
    
    extension [Self <: InputPluginContainer](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMapping(value: String): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      inline def setPlugin(value: js.Function): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractiveObject extends StObject {
    
    /**
      * An Interactive Object that is 'always enabled' will receive input even if the parent object is invisible or won't render.
      */
    var alwaysEnabled: Boolean
    
    /**
      * The most recent Camera to be tested against this Interactive Object.
      */
    var camera: Camera
    
    /**
      * Should this Interactive Object change the cursor (via css) when over? (desktop only)
      */
    var cursor: Boolean | String
    
    /**
      * Was the hitArea for this Interactive Object created based on texture size (false), or a custom shape? (true)
      */
    var customHitArea: Boolean
    
    /**
      * The x coordinate of the Game Object that owns this Interactive Object when the drag started.
      */
    var dragStartX: Double
    
    /**
      * The x coordinate that the Pointer started dragging this Interactive Object from.
      */
    var dragStartXGlobal: Double
    
    /**
      * The y coordinate of the Game Object that owns this Interactive Object when the drag started.
      */
    var dragStartY: Double
    
    /**
      * The y coordinate that the Pointer started dragging this Interactive Object from.
      */
    var dragStartYGlobal: Double
    
    /**
      * The current drag state of this Interactive Object. 0 = Not being dragged, 1 = being checked for drag, or 2 = being actively dragged.
      */
    var dragState: `0` | `1` | `2`
    
    /**
      * The x coordinate that this Interactive Object is currently being dragged to.
      */
    var dragX: Double
    
    /**
      * The y coordinate that this Interactive Object is currently being dragged to.
      */
    var dragY: Double
    
    /**
      * Is this Interactive Object draggable? Enable with `InputPlugin.setDraggable`.
      */
    var draggable: Boolean
    
    /**
      * Is this Interactive Object a drag-targets drop zone? Set when the object is created.
      */
    var dropZone: Boolean
    
    /**
      * Is this Interactive Object currently enabled for input events?
      */
    var enabled: Boolean
    
    /**
      * The Game Object to which this Interactive Object is bound.
      */
    var gameObject: GameObject
    
    /**
      * The hit area for this Interactive Object. Typically a geometry shape, like a Rectangle or Circle.
      */
    var hitArea: Any
    
    /**
      * The 'contains' check callback that the hit area shape will use for all hit tests.
      */
    def hitAreaCallback(hitArea: Any, x: Double, y: Double, gameObject: GameObject): Unit
    /**
      * The 'contains' check callback that the hit area shape will use for all hit tests.
      */
    @JSName("hitAreaCallback")
    var hitAreaCallback_Original: HitAreaCallback
    
    /**
      * If this Interactive Object has been enabled for debug, via `InputPlugin.enableDebug` then this property holds its debug shape.
      */
    var hitAreaDebug: Shape
    
    /**
      * The x coordinate that the Pointer interacted with this object on, relative to the Game Object's top-left position.
      */
    var localX: Double
    
    /**
      * The y coordinate that the Pointer interacted with this object on, relative to the Game Object's top-left position.
      */
    var localY: Double
    
    /**
      * An optional drop target for a draggable Interactive Object.
      */
    var target: GameObject
  }
  object InteractiveObject {
    
    inline def apply(
      alwaysEnabled: Boolean,
      camera: Camera,
      cursor: Boolean | String,
      customHitArea: Boolean,
      dragStartX: Double,
      dragStartXGlobal: Double,
      dragStartY: Double,
      dragStartYGlobal: Double,
      dragState: `0` | `1` | `2`,
      dragX: Double,
      dragY: Double,
      draggable: Boolean,
      dropZone: Boolean,
      enabled: Boolean,
      gameObject: GameObject,
      hitArea: Any,
      hitAreaCallback: (/* hitArea */ Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject) => Unit,
      hitAreaDebug: Shape,
      localX: Double,
      localY: Double,
      target: GameObject
    ): InteractiveObject = {
      val __obj = js.Dynamic.literal(alwaysEnabled = alwaysEnabled.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], customHitArea = customHitArea.asInstanceOf[js.Any], dragStartX = dragStartX.asInstanceOf[js.Any], dragStartXGlobal = dragStartXGlobal.asInstanceOf[js.Any], dragStartY = dragStartY.asInstanceOf[js.Any], dragStartYGlobal = dragStartYGlobal.asInstanceOf[js.Any], dragState = dragState.asInstanceOf[js.Any], dragX = dragX.asInstanceOf[js.Any], dragY = dragY.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any], dropZone = dropZone.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], gameObject = gameObject.asInstanceOf[js.Any], hitArea = hitArea.asInstanceOf[js.Any], hitAreaCallback = js.Any.fromFunction4(hitAreaCallback), hitAreaDebug = hitAreaDebug.asInstanceOf[js.Any], localX = localX.asInstanceOf[js.Any], localY = localY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractiveObject]
    }
    
    extension [Self <: InteractiveObject](x: Self) {
      
      inline def setAlwaysEnabled(value: Boolean): Self = StObject.set(x, "alwaysEnabled", value.asInstanceOf[js.Any])
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCursor(value: Boolean | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCustomHitArea(value: Boolean): Self = StObject.set(x, "customHitArea", value.asInstanceOf[js.Any])
      
      inline def setDragStartX(value: Double): Self = StObject.set(x, "dragStartX", value.asInstanceOf[js.Any])
      
      inline def setDragStartXGlobal(value: Double): Self = StObject.set(x, "dragStartXGlobal", value.asInstanceOf[js.Any])
      
      inline def setDragStartY(value: Double): Self = StObject.set(x, "dragStartY", value.asInstanceOf[js.Any])
      
      inline def setDragStartYGlobal(value: Double): Self = StObject.set(x, "dragStartYGlobal", value.asInstanceOf[js.Any])
      
      inline def setDragState(value: `0` | `1` | `2`): Self = StObject.set(x, "dragState", value.asInstanceOf[js.Any])
      
      inline def setDragX(value: Double): Self = StObject.set(x, "dragX", value.asInstanceOf[js.Any])
      
      inline def setDragY(value: Double): Self = StObject.set(x, "dragY", value.asInstanceOf[js.Any])
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDropZone(value: Boolean): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setGameObject(value: GameObject): Self = StObject.set(x, "gameObject", value.asInstanceOf[js.Any])
      
      inline def setHitArea(value: Any): Self = StObject.set(x, "hitArea", value.asInstanceOf[js.Any])
      
      inline def setHitAreaCallback(value: (/* hitArea */ Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject) => Unit): Self = StObject.set(x, "hitAreaCallback", js.Any.fromFunction4(value))
      
      inline def setHitAreaDebug(value: Shape): Self = StObject.set(x, "hitAreaDebug", value.asInstanceOf[js.Any])
      
      inline def setLocalX(value: Double): Self = StObject.set(x, "localX", value.asInstanceOf[js.Any])
      
      inline def setLocalY(value: Double): Self = StObject.set(x, "localY", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: GameObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  object Keyboard {
    
    trait CursorKeys extends StObject {
      
      /**
        * A Key object mapping to the DOWN arrow key.
        */
      var down: Key
      
      /**
        * A Key object mapping to the LEFT arrow key.
        */
      var left: Key
      
      /**
        * A Key object mapping to the RIGHT arrow key.
        */
      var right: Key
      
      /**
        * A Key object mapping to the SHIFT key.
        */
      var shift: Key
      
      /**
        * A Key object mapping to the SPACE BAR key.
        */
      var space: Key
      
      /**
        * A Key object mapping to the UP arrow key.
        */
      var up: Key
    }
    object CursorKeys {
      
      inline def apply(down: Key, left: Key, right: Key, shift: Key, space: Key, up: Key): CursorKeys = {
        val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
        __obj.asInstanceOf[CursorKeys]
      }
      
      extension [Self <: CursorKeys](x: Self) {
        
        inline def setDown(value: Key): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        inline def setLeft(value: Key): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setRight(value: Key): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setShift(value: Key): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
        
        inline def setSpace(value: Key): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
        
        inline def setUp(value: Key): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      }
    }
    
    trait KeyComboConfig extends StObject {
      
      /**
        * If the combo matches, will it delete itself?
        */
      var deleteOnMatch: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The max delay in ms between each key press. Above this the combo is reset. 0 means disabled.
        */
      var maxKeyDelay: js.UndefOr[Double] = js.undefined
      
      /**
        * If previously matched and they press the first key of the combo again, will it reset?
        */
      var resetOnMatch: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If they press the wrong key do we reset the combo?
        */
      var resetOnWrongKey: js.UndefOr[Boolean] = js.undefined
    }
    object KeyComboConfig {
      
      inline def apply(): KeyComboConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[KeyComboConfig]
      }
      
      extension [Self <: KeyComboConfig](x: Self) {
        
        inline def setDeleteOnMatch(value: Boolean): Self = StObject.set(x, "deleteOnMatch", value.asInstanceOf[js.Any])
        
        inline def setDeleteOnMatchUndefined: Self = StObject.set(x, "deleteOnMatch", js.undefined)
        
        inline def setMaxKeyDelay(value: Double): Self = StObject.set(x, "maxKeyDelay", value.asInstanceOf[js.Any])
        
        inline def setMaxKeyDelayUndefined: Self = StObject.set(x, "maxKeyDelay", js.undefined)
        
        inline def setResetOnMatch(value: Boolean): Self = StObject.set(x, "resetOnMatch", value.asInstanceOf[js.Any])
        
        inline def setResetOnMatchUndefined: Self = StObject.set(x, "resetOnMatch", js.undefined)
        
        inline def setResetOnWrongKey(value: Boolean): Self = StObject.set(x, "resetOnWrongKey", value.asInstanceOf[js.Any])
        
        inline def setResetOnWrongKeyUndefined: Self = StObject.set(x, "resetOnWrongKey", js.undefined)
      }
    }
    
    type KeyboardKeydownCallback = js.Function1[/* event */ KeyboardEvent, Unit]
  }
}
