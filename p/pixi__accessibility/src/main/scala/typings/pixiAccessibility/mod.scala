package typings.pixiAccessibility

import typings.pixiCore.mod.AbstractRenderer
import typings.pixiCore.mod.Renderer
import typings.pixiDisplay.mod.DisplayObject
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.mod.Rectangle
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/accessibility", "AccessibilityManager")
  @js.native
  open class AccessibilityManager protected () extends StObject {
    /**
      * @param {PIXI.CanvasRenderer|PIXI.Renderer} renderer - A reference to the current renderer
      */
    def this(renderer: AbstractRenderer) = this()
    def this(renderer: Renderer) = this()
    
    /** Button element for handling touch hooks. */
    /* private */ var _hookDiv: Any = js.native
    
    /** Internal variable, see isActive getter. */
    /* private */ var _isActive: Any = js.native
    
    /** Internal variable, see isMobileAccessibility getter. */
    /* private */ var _isMobileAccessibility: Any = js.native
    
    /**
      * Maps the div button press to pixi's InteractionManager (click)
      * @private
      * @param {MouseEvent} e - The click event.
      */
    /* private */ var _onClick: Any = js.native
    
    /**
      * Maps the div focus events to pixi's InteractionManager (mouseover)
      * @private
      * @param {FocusEvent} e - The focus event.
      */
    /* private */ var _onFocus: Any = js.native
    
    /**
      * Maps the div focus events to pixi's InteractionManager (mouseout)
      * @private
      * @param {FocusEvent} e - The focusout event.
      */
    /* private */ var _onFocusOut: Any = js.native
    
    /**
      * Is called when a key is pressed
      * @private
      * @param {KeyboardEvent} e - The keydown event.
      */
    /* private */ var _onKeyDown: Any = js.native
    
    /**
      * Is called when the mouse moves across the renderer element
      * @private
      * @param {MouseEvent} e - The mouse event.
      */
    /* private */ var _onMouseMove: Any = js.native
    
    /**
      * Activating will cause the Accessibility layer to be shown.
      * This is called when a user presses the tab key.
      * @private
      */
    /* private */ var activate: Any = js.native
    
    /**
      * Adds a DisplayObject to the accessibility manager
      * @private
      * @param {PIXI.DisplayObject} displayObject - The child to make accessible.
      */
    /* private */ var addChild: Any = js.native
    
    /** Count to throttle div updates on android devices. */
    /* private */ var androidUpdateCount: Any = js.native
    
    /**  The frequency to update the div elements. */
    /* private */ var androidUpdateFrequency: Any = js.native
    
    /**
      * Adjust the hit area based on the bounds of a display object
      * @param {PIXI.Rectangle} hitArea - Bounds of the child
      */
    def capHitArea(hitArea: Rectangle): Unit = js.native
    
    /** The array of currently active accessible items. */
    /* private */ var children: Any = js.native
    
    /**
      * Creates the touch hooks.
      * @private
      */
    /* private */ var createTouchHook: Any = js.native
    
    /**
      * Deactivating will cause the Accessibility layer to be hidden.
      * This is called when a user moves the mouse.
      * @private
      */
    /* private */ var deactivate: Any = js.native
    
    /** Setting this to true will visually show the divs. */
    var debug: Boolean = js.native
    
    /** Destroys the accessibility manager */
    def destroy(): Unit = js.native
    
    /**
      * Destroys the touch hooks.
      * @private
      */
    /* private */ var destroyTouchHook: Any = js.native
    
    /** This is the dom element that will sit over the PixiJS element. This is where the div overlays will go. */
    /* private */ var div: Any = js.native
    
    /**
      * Value of `true` if accessibility is currently active and accessibility layers are showing.
      * @member {boolean}
      * @readonly
      */
    def isActive: Boolean = js.native
    
    /**
      * Value of `true` if accessibility is enabled for touch devices.
      * @member {boolean}
      * @readonly
      */
    def isMobileAccessibility: Boolean = js.native
    
    /** A simple pool for storing divs. */
    /* private */ var pool: Any = js.native
    
    /** This is a tick used to check if an object is no longer being rendered. */
    /* private */ var renderId: Any = js.native
    
    /**
      * The renderer this accessibility manager works for.
      * @type {PIXI.CanvasRenderer|PIXI.Renderer}
      */
    var renderer: AbstractRenderer | Renderer = js.native
    
    /**
      * Before each render this function will ensure that all divs are mapped correctly to their DisplayObjects.
      * @private
      */
    /* private */ var update: Any = js.native
    
    /**
      * This recursive function will run through the scene graph and add any new accessible objects to the DOM layer.
      * @private
      * @param {PIXI.Container} displayObject - The DisplayObject to check.
      */
    /* private */ var updateAccessibleObjects: Any = js.native
    
    /**
      * private function that will visually add the information to the
      * accessability div
      * @param {HTMLElement} div -
      */
    def updateDebugHTML(div: IAccessibleHTMLElement): Unit = js.native
  }
  /* static members */
  object AccessibilityManager {
    
    /** @ignore */
    @JSImport("@pixi/accessibility", "AccessibilityManager.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  @JSImport("@pixi/accessibility", "accessibleTarget")
  @js.native
  val accessibleTarget: IAccessibleTarget = js.native
  
  @js.native
  trait IAccessibleHTMLElement
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var displayObject: js.UndefOr[DisplayObject] = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  
  trait IAccessibleTarget extends StObject {
    
    var _accessibleActive: Boolean
    
    var _accessibleDiv: IAccessibleHTMLElement
    
    var accessible: Boolean
    
    var accessibleChildren: Boolean
    
    var accessibleHint: String
    
    var accessiblePointerEvents: PointerEvents
    
    var accessibleTitle: String
    
    var accessibleType: String
    
    var renderId: Double
    
    var tabIndex: Double
  }
  object IAccessibleTarget {
    
    inline def apply(
      _accessibleActive: Boolean,
      _accessibleDiv: IAccessibleHTMLElement,
      accessible: Boolean,
      accessibleChildren: Boolean,
      accessibleHint: String,
      accessiblePointerEvents: PointerEvents,
      accessibleTitle: String,
      accessibleType: String,
      renderId: Double,
      tabIndex: Double
    ): IAccessibleTarget = {
      val __obj = js.Dynamic.literal(_accessibleActive = _accessibleActive.asInstanceOf[js.Any], _accessibleDiv = _accessibleDiv.asInstanceOf[js.Any], accessible = accessible.asInstanceOf[js.Any], accessibleChildren = accessibleChildren.asInstanceOf[js.Any], accessibleHint = accessibleHint.asInstanceOf[js.Any], accessiblePointerEvents = accessiblePointerEvents.asInstanceOf[js.Any], accessibleTitle = accessibleTitle.asInstanceOf[js.Any], accessibleType = accessibleType.asInstanceOf[js.Any], renderId = renderId.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAccessibleTarget]
    }
    
    extension [Self <: IAccessibleTarget](x: Self) {
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleChildren(value: Boolean): Self = StObject.set(x, "accessibleChildren", value.asInstanceOf[js.Any])
      
      inline def setAccessibleHint(value: String): Self = StObject.set(x, "accessibleHint", value.asInstanceOf[js.Any])
      
      inline def setAccessiblePointerEvents(value: PointerEvents): Self = StObject.set(x, "accessiblePointerEvents", value.asInstanceOf[js.Any])
      
      inline def setAccessibleTitle(value: String): Self = StObject.set(x, "accessibleTitle", value.asInstanceOf[js.Any])
      
      inline def setAccessibleType(value: String): Self = StObject.set(x, "accessibleType", value.asInstanceOf[js.Any])
      
      inline def setRenderId(value: Double): Self = StObject.set(x, "renderId", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def set_accessibleActive(value: Boolean): Self = StObject.set(x, "_accessibleActive", value.asInstanceOf[js.Any])
      
      inline def set_accessibleDiv(value: IAccessibleHTMLElement): Self = StObject.set(x, "_accessibleDiv", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiAccessibility.pixiAccessibilityStrings.auto
    - typings.pixiAccessibility.pixiAccessibilityStrings.none
    - typings.pixiAccessibility.pixiAccessibilityStrings.visiblePainted
    - typings.pixiAccessibility.pixiAccessibilityStrings.visibleFill
    - typings.pixiAccessibility.pixiAccessibilityStrings.visibleStroke
    - typings.pixiAccessibility.pixiAccessibilityStrings.visible
    - typings.pixiAccessibility.pixiAccessibilityStrings.painted
    - typings.pixiAccessibility.pixiAccessibilityStrings.fill
    - typings.pixiAccessibility.pixiAccessibilityStrings.stroke
    - typings.pixiAccessibility.pixiAccessibilityStrings.all
    - typings.pixiAccessibility.pixiAccessibilityStrings.inherit
  */
  trait PointerEvents extends StObject
  object PointerEvents {
    
    inline def all: typings.pixiAccessibility.pixiAccessibilityStrings.all = "all".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.all]
    
    inline def auto: typings.pixiAccessibility.pixiAccessibilityStrings.auto = "auto".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.auto]
    
    inline def fill: typings.pixiAccessibility.pixiAccessibilityStrings.fill = "fill".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.fill]
    
    inline def inherit: typings.pixiAccessibility.pixiAccessibilityStrings.inherit = "inherit".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.inherit]
    
    inline def none: typings.pixiAccessibility.pixiAccessibilityStrings.none = "none".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.none]
    
    inline def painted: typings.pixiAccessibility.pixiAccessibilityStrings.painted = "painted".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.painted]
    
    inline def stroke: typings.pixiAccessibility.pixiAccessibilityStrings.stroke = "stroke".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.stroke]
    
    inline def visible: typings.pixiAccessibility.pixiAccessibilityStrings.visible = "visible".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.visible]
    
    inline def visibleFill: typings.pixiAccessibility.pixiAccessibilityStrings.visibleFill = "visibleFill".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.visibleFill]
    
    inline def visiblePainted: typings.pixiAccessibility.pixiAccessibilityStrings.visiblePainted = "visiblePainted".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.visiblePainted]
    
    inline def visibleStroke: typings.pixiAccessibility.pixiAccessibilityStrings.visibleStroke = "visibleStroke".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.visibleStroke]
  }
}
