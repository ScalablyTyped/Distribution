package typings.pixiAccessibility

import typings.pixiAccessibility.libAccessibleTargetMod.IAccessibleHTMLElement
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.mod.Rectangle
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAccessibilityManagerMod {
  
  @JSImport("@pixi/accessibility/lib/AccessibilityManager", "AccessibilityManager")
  @js.native
  open class AccessibilityManager protected () extends StObject {
    /**
      * @param {PIXI.CanvasRenderer|PIXI.Renderer} renderer - A reference to the current renderer
      */
    def this(renderer: IRenderer) = this()
    
    /**
      * Dispatch events with the EventSystem.
      * @param e
      * @param type
      * @private
      */
    /* private */ var _dispatchEvent: Any = js.native
    
    /** Button element for handling touch hooks. */
    /* private */ var _hookDiv: Any = js.native
    
    /** Internal variable, see isActive getter. */
    /* private */ var _isActive: Any = js.native
    
    /** Internal variable, see isMobileAccessibility getter. */
    /* private */ var _isMobileAccessibility: Any = js.native
    
    /**
      * Maps the div button press to pixi's EventSystem (click)
      * @private
      * @param {MouseEvent} e - The click event.
      */
    /* private */ var _onClick: Any = js.native
    
    /**
      * Maps the div focus events to pixi's EventSystem (mouseover)
      * @private
      * @param {FocusEvent} e - The focus event.
      */
    /* private */ var _onFocus: Any = js.native
    
    /**
      * Maps the div focus events to pixi's EventSystem (mouseout)
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
    var renderer: IRenderer = js.native
    
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
    @JSImport("@pixi/accessibility/lib/AccessibilityManager", "AccessibilityManager.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
