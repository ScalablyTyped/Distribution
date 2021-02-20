package typings.phaser.Phaser.Types

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Shape
import typings.phaser.Phaser.Input.Keyboard.Key
import typings.phaser.integer
import typings.phaser.phaserNumbers.`0`
import typings.phaser.phaserNumbers.`1`
import typings.phaser.phaserNumbers.`2`
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  /**
    * A Phaser Input Event Data object.
    * 
    * This object is passed to the registered event listeners and allows you to stop any further propagation.
    */
  @js.native
  trait EventData extends StObject {
    
    /**
      * The cancelled state of this Event.
      */
    var cancelled: js.UndefOr[Boolean] = js.native
    
    /**
      * Call this method to stop this event from passing any further down the event chain.
      */
    var stopPropagation: js.Function = js.native
  }
  object EventData {
    
    @scala.inline
    def apply(stopPropagation: js.Function): EventData = {
      val __obj = js.Dynamic.literal(stopPropagation = stopPropagation.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    @scala.inline
    implicit class EventDataMutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
      
      @scala.inline
      def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    }
  }
  
  object Gamepad {
    
    /**
      * The Gamepad object, as extracted from GamepadEvent.
      */
    @js.native
    trait Pad extends StObject {
      
      /**
        * The ID of the Gamepad.
        */
      var id: String = js.native
      
      /**
        * The index of the Gamepad.
        */
      var index: integer = js.native
    }
    object Pad {
      
      @scala.inline
      def apply(id: String, index: integer): Pad = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
        __obj.asInstanceOf[Pad]
      }
      
      @scala.inline
      implicit class PadMutableBuilder[Self <: Pad] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndex(value: integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type HitAreaCallback = js.Function4[/* hitArea */ js.Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject, Unit]
  
  @js.native
  trait InputConfiguration extends StObject {
    
    /**
      * If `pixelPerfect` is set, this is the alpha tolerance threshold value used in the callback.
      */
    var alphaTolerance: js.UndefOr[integer] = js.native
    
    /**
      * The CSS string to be used when the cursor is over this Interactive Object.
      */
    var cursor: js.UndefOr[String] = js.native
    
    /**
      * If `true` the Interactive Object will be set to be draggable and emit drag events.
      */
    var draggable: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true` the Interactive Object will be set to be a drop zone for draggable objects.
      */
    var dropZone: js.UndefOr[Boolean] = js.native
    
    /**
      * The object / shape to use as the Hit Area. If not given it will try to create a Rectangle based on the texture frame.
      */
    var hitArea: js.UndefOr[js.Any] = js.native
    
    /**
      * The callback that determines if the pointer is within the Hit Area shape or not.
      */
    var hitAreaCallback: js.UndefOr[js.Function] = js.native
    
    /**
      * If `true` the a pixel perfect function will be set for the hit area callback. Only works with texture based Game Objects.
      */
    var pixelPerfect: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true` the Interactive Object will set the `pointer` hand cursor when a pointer is over it. This is a short-cut for setting `cursor: 'pointer'`.
      */
    var useHandCursor: js.UndefOr[Boolean] = js.native
  }
  object InputConfiguration {
    
    @scala.inline
    def apply(): InputConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputConfiguration]
    }
    
    @scala.inline
    implicit class InputConfigurationMutableBuilder[Self <: InputConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphaTolerance(value: integer): Self = StObject.set(x, "alphaTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaToleranceUndefined: Self = StObject.set(x, "alphaTolerance", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDropZone(value: Boolean): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropZoneUndefined: Self = StObject.set(x, "dropZone", js.undefined)
      
      @scala.inline
      def setHitArea(value: js.Any): Self = StObject.set(x, "hitArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitAreaCallback(value: js.Function): Self = StObject.set(x, "hitAreaCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitAreaCallbackUndefined: Self = StObject.set(x, "hitAreaCallback", js.undefined)
      
      @scala.inline
      def setHitAreaUndefined: Self = StObject.set(x, "hitArea", js.undefined)
      
      @scala.inline
      def setPixelPerfect(value: Boolean): Self = StObject.set(x, "pixelPerfect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelPerfectUndefined: Self = StObject.set(x, "pixelPerfect", js.undefined)
      
      @scala.inline
      def setUseHandCursor(value: Boolean): Self = StObject.set(x, "useHandCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseHandCursorUndefined: Self = StObject.set(x, "useHandCursor", js.undefined)
    }
  }
  
  @js.native
  trait InputPluginContainer extends StObject {
    
    /**
      * The unique name of this plugin in the input plugin cache.
      */
    var key: String = js.native
    
    /**
      * If this plugin is to be injected into the Input Plugin, this is the property key map used.
      */
    var mapping: js.UndefOr[String] = js.native
    
    /**
      * The plugin to be stored. Should be the source object, not instantiated.
      */
    var plugin: js.Function = js.native
  }
  object InputPluginContainer {
    
    @scala.inline
    def apply(key: String, plugin: js.Function): InputPluginContainer = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputPluginContainer]
    }
    
    @scala.inline
    implicit class InputPluginContainerMutableBuilder[Self <: InputPluginContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapping(value: String): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      @scala.inline
      def setPlugin(value: js.Function): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InteractiveObject extends StObject {
    
    /**
      * An Interactive Object that is 'always enabled' will receive input even if the parent object is invisible or won't render.
      */
    var alwaysEnabled: Boolean = js.native
    
    /**
      * The most recent Camera to be tested against this Interactive Object.
      */
    var camera: Camera = js.native
    
    /**
      * Should this Interactive Object change the cursor (via css) when over? (desktop only)
      */
    var cursor: Boolean | String = js.native
    
    /**
      * Was the hitArea for this Interactive Object created based on texture size (false), or a custom shape? (true)
      */
    var customHitArea: Boolean = js.native
    
    /**
      * The x coordinate of the Game Object that owns this Interactive Object when the drag started.
      */
    var dragStartX: Double = js.native
    
    /**
      * The x coordinate that the Pointer started dragging this Interactive Object from.
      */
    var dragStartXGlobal: Double = js.native
    
    /**
      * The y coordinate of the Game Object that owns this Interactive Object when the drag started.
      */
    var dragStartY: Double = js.native
    
    /**
      * The y coordinate that the Pointer started dragging this Interactive Object from.
      */
    var dragStartYGlobal: Double = js.native
    
    /**
      * The current drag state of this Interactive Object. 0 = Not being dragged, 1 = being checked for drag, or 2 = being actively dragged.
      */
    var dragState: `0` | `1` | `2` = js.native
    
    /**
      * The x coordinate that this Interactive Object is currently being dragged to.
      */
    var dragX: Double = js.native
    
    /**
      * The y coordinate that this Interactive Object is currently being dragged to.
      */
    var dragY: Double = js.native
    
    /**
      * Is this Interactive Object draggable? Enable with `InputPlugin.setDraggable`.
      */
    var draggable: Boolean = js.native
    
    /**
      * Is this Interactive Object a drag-targets drop zone? Set when the object is created.
      */
    var dropZone: Boolean = js.native
    
    /**
      * Is this Interactive Object currently enabled for input events?
      */
    var enabled: Boolean = js.native
    
    /**
      * The Game Object to which this Interactive Object is bound.
      */
    var gameObject: GameObject = js.native
    
    /**
      * The hit area for this Interactive Object. Typically a geometry shape, like a Rectangle or Circle.
      */
    var hitArea: js.Any = js.native
    
    /**
      * The 'contains' check callback that the hit area shape will use for all hit tests.
      */
    def hitAreaCallback(hitArea: js.Any, x: Double, y: Double, gameObject: GameObject): Unit = js.native
    /**
      * The 'contains' check callback that the hit area shape will use for all hit tests.
      */
    @JSName("hitAreaCallback")
    var hitAreaCallback_Original: HitAreaCallback = js.native
    
    /**
      * If this Interactive Object has been enabled for debug, via `InputPlugin.enableDebug` then this property holds its debug shape.
      */
    var hitAreaDebug: Shape = js.native
    
    /**
      * The x coordinate that the Pointer interacted with this object on, relative to the Game Object's top-left position.
      */
    var localX: Double = js.native
    
    /**
      * The y coordinate that the Pointer interacted with this object on, relative to the Game Object's top-left position.
      */
    var localY: Double = js.native
    
    /**
      * An optional drop target for a draggable Interactive Object.
      */
    var target: GameObject = js.native
  }
  
  object Keyboard {
    
    @js.native
    trait CursorKeys extends StObject {
      
      /**
        * A Key object mapping to the DOWN arrow key.
        */
      var down: js.UndefOr[Key] = js.native
      
      /**
        * A Key object mapping to the LEFT arrow key.
        */
      var left: js.UndefOr[Key] = js.native
      
      /**
        * A Key object mapping to the RIGHT arrow key.
        */
      var right: js.UndefOr[Key] = js.native
      
      /**
        * A Key object mapping to the SHIFT key.
        */
      var shift: js.UndefOr[Key] = js.native
      
      /**
        * A Key object mapping to the SPACE BAR key.
        */
      var space: js.UndefOr[Key] = js.native
      
      /**
        * A Key object mapping to the UP arrow key.
        */
      var up: js.UndefOr[Key] = js.native
    }
    object CursorKeys {
      
      @scala.inline
      def apply(): CursorKeys = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CursorKeys]
      }
      
      @scala.inline
      implicit class CursorKeysMutableBuilder[Self <: CursorKeys] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDown(value: Key): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
        
        @scala.inline
        def setLeft(value: Key): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        @scala.inline
        def setRight(value: Key): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        @scala.inline
        def setShift(value: Key): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
        
        @scala.inline
        def setSpace(value: Key): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
        
        @scala.inline
        def setUp(value: Key): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      }
    }
    
    @js.native
    trait KeyComboConfig extends StObject {
      
      /**
        * If the combo matches, will it delete itself?
        */
      var deleteOnMatch: js.UndefOr[Boolean] = js.native
      
      /**
        * The max delay in ms between each key press. Above this the combo is reset. 0 means disabled.
        */
      var maxKeyDelay: js.UndefOr[Double] = js.native
      
      /**
        * If previously matched and they press the first key of the combo again, will it reset?
        */
      var resetOnMatch: js.UndefOr[Boolean] = js.native
      
      /**
        * If they press the wrong key do we reset the combo?
        */
      var resetOnWrongKey: js.UndefOr[Boolean] = js.native
    }
    object KeyComboConfig {
      
      @scala.inline
      def apply(): KeyComboConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[KeyComboConfig]
      }
      
      @scala.inline
      implicit class KeyComboConfigMutableBuilder[Self <: KeyComboConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeleteOnMatch(value: Boolean): Self = StObject.set(x, "deleteOnMatch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteOnMatchUndefined: Self = StObject.set(x, "deleteOnMatch", js.undefined)
        
        @scala.inline
        def setMaxKeyDelay(value: Double): Self = StObject.set(x, "maxKeyDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxKeyDelayUndefined: Self = StObject.set(x, "maxKeyDelay", js.undefined)
        
        @scala.inline
        def setResetOnMatch(value: Boolean): Self = StObject.set(x, "resetOnMatch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResetOnMatchUndefined: Self = StObject.set(x, "resetOnMatch", js.undefined)
        
        @scala.inline
        def setResetOnWrongKey(value: Boolean): Self = StObject.set(x, "resetOnWrongKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResetOnWrongKeyUndefined: Self = StObject.set(x, "resetOnWrongKey", js.undefined)
      }
    }
    
    type KeyboardKeydownCallback = js.Function1[/* event */ KeyboardEvent, Unit]
  }
}
