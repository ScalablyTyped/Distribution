package typings.phaser.Phaser

import typings.phaser.Phaser.Device.Fullscreen
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Structs.Size
import typings.phaser.Phaser.Types.Core.GameConfig
import typings.phaser.integer
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Scale {
  
  @js.native
  sealed trait Center extends StObject
  /**
    * Phaser Scale Manager constants for centering the game canvas.
    */
  @JSGlobal("Phaser.Scale.Center")
  @js.native
  object Center extends StObject {
    
    /**
      * The game canvas is centered both horizontally and vertically within the parent.
      * To do this, the parent has to have a bounds that can be calculated and not be empty.
      * 
      * Centering is achieved by setting the margin left and top properties of the
      * game canvas, and does not factor in any other CSS styles you may have applied.
      */
    @js.native
    sealed trait CENTER_BOTH
      extends StObject
         with Center
    
    /**
      * The game canvas is centered horizontally within the parent.
      * To do this, the parent has to have a bounds that can be calculated and not be empty.
      * 
      * Centering is achieved by setting the margin left and top properties of the
      * game canvas, and does not factor in any other CSS styles you may have applied.
      */
    @js.native
    sealed trait CENTER_HORIZONTALLY
      extends StObject
         with Center
    
    /**
      * The game canvas is centered both vertically within the parent.
      * To do this, the parent has to have a bounds that can be calculated and not be empty.
      * 
      * Centering is achieved by setting the margin left and top properties of the
      * game canvas, and does not factor in any other CSS styles you may have applied.
      */
    @js.native
    sealed trait CENTER_VERTICALLY
      extends StObject
         with Center
    
    /**
      * The game canvas is not centered within the parent by Phaser.
      * You can still center it yourself via CSS.
      */
    @js.native
    sealed trait NO_CENTER
      extends StObject
         with Center
  }
  
  @js.native
  sealed trait Orientation extends StObject
  /**
    * Phaser Scale Manager constants for orientation.
    */
  @JSGlobal("Phaser.Scale.Orientation")
  @js.native
  object Orientation extends StObject {
    
    /**
      * A landscape orientation.
      */
    @js.native
    sealed trait LANDSCAPE
      extends StObject
         with Orientation
    
    /**
      * A portrait orientation.
      */
    @js.native
    sealed trait PORTRAIT
      extends StObject
         with Orientation
  }
  
  @js.native
  sealed trait ScaleModes extends StObject
  /**
    * Phaser Scale Manager constants for the different scale modes available.
    */
  @JSGlobal("Phaser.Scale.ScaleModes")
  @js.native
  object ScaleModes extends StObject {
    
    /**
      * The width and height are automatically adjusted to make the size cover the entire target
      * area while keeping the aspect ratio. This may extend further out than the target size.
      */
    @js.native
    sealed trait ENVELOP
      extends StObject
         with typings.phaser.Phaser.Scale.ScaleModes
    
    /**
      * The width and height are automatically adjusted to fit inside the given target area,
      * while keeping the aspect ratio. Depending on the aspect ratio there may be some space
      * inside the area which is not covered.
      */
    @js.native
    sealed trait FIT
      extends StObject
         with typings.phaser.Phaser.Scale.ScaleModes
    
    /**
      * The width is automatically adjusted based on the height.
      */
    @js.native
    sealed trait HEIGHT_CONTROLS_WIDTH
      extends StObject
         with typings.phaser.Phaser.Scale.ScaleModes
    
    /**
      * No scaling happens at all. The canvas is set to the size given in the game config and Phaser doesn't change it
      * again from that point on. If you change the canvas size, either via CSS, or directly via code, then you need
      * to call the Scale Managers `resize` method to give the new dimensions, or input events will stop working.
      */
    @js.native
    sealed trait NONE
      extends StObject
         with typings.phaser.Phaser.Scale.ScaleModes
    
    /**
      * The Canvas is resized to fit all available _parent_ space, regardless of aspect ratio.
      */
    @js.native
    sealed trait RESIZE
      extends StObject
         with typings.phaser.Phaser.Scale.ScaleModes
    
    /**
      * The height is automatically adjusted based on the width.
      */
    @js.native
    sealed trait WIDTH_CONTROLS_HEIGHT
      extends StObject
         with typings.phaser.Phaser.Scale.ScaleModes
  }
  
  @js.native
  sealed trait Zoom extends StObject
  /**
    * Phaser Scale Manager constants for zoom modes.
    */
  @JSGlobal("Phaser.Scale.Zoom")
  @js.native
  object Zoom extends StObject {
    
    /**
      * Calculate the zoom value based on the maximum multiplied game size that will
      * fit into the parent, or browser window if no parent is set.
      */
    @js.native
    sealed trait MAX_ZOOM
      extends StObject
         with Zoom
    
    /**
      * The game canvas will not be zoomed by Phaser.
      */
    @js.native
    sealed trait NO_ZOOM
      extends StObject
         with Zoom
    
    /**
      * The game canvas will be 2x zoomed by Phaser.
      */
    @js.native
    sealed trait ZOOM_2X
      extends StObject
         with Zoom
    
    /**
      * The game canvas will be 4x zoomed by Phaser.
      */
    @js.native
    sealed trait ZOOM_4X
      extends StObject
         with Zoom
  }
  
  /**
    * Phaser Scale Manager constants for centering the game canvas.
    * 
    * To find out what each mode does please see [Phaser.Scale.Center]{@link Phaser.Scale.Center}.
    */
  type CenterType = Center
  
  /**
    * Phaser Scale Manager constants for orientation.
    * 
    * To find out what each mode does please see [Phaser.Scale.Orientation]{@link Phaser.Scale.Orientation}.
    */
  type OrientationType = Orientation
  
  /**
    * The Scale Manager handles the scaling, resizing and alignment of the game canvas.
    * 
    * The way scaling is handled is by setting the game canvas to a fixed size, which is defined in the
    * game configuration. You also define the parent container in the game config. If no parent is given,
    * it will default to using the document body. The Scale Manager will then look at the available space
    * within the _parent_ and scale the canvas accordingly. Scaling is handled by setting the canvas CSS
    * width and height properties, leaving the width and height of the canvas element itself untouched.
    * Scaling is therefore achieved by keeping the core canvas the same size and 'stretching'
    * it via its CSS properties. This gives the same result and speed as using the `transform-scale` CSS
    * property, without the need for browser prefix handling.
    * 
    * The calculations for the scale are heavily influenced by the bounding parent size, which is the computed
    * dimensions of the canvas's parent. The CSS rules of the parent element play an important role in the
    * operation of the Scale Manager. For example, if the parent has no defined width or height, then actions
    * like auto-centering will fail to achieve the required result. The Scale Manager works in tandem with the
    * CSS you set-up on the page hosting your game, rather than taking control of it.
    * 
    * #### Parent and Display canvas containment guidelines:
    * 
    * - Style the Parent element (of the game canvas) to control the Parent size and thus the games size and layout.
    * 
    * - The Parent element's CSS styles should _effectively_ apply maximum (and minimum) bounding behavior.
    * 
    * - The Parent element should _not_ apply a padding as this is not accounted for.
    *   If a padding is required apply it to the Parent's parent or apply a margin to the Parent.
    *   If you need to add a border, margin or any other CSS around your game container, then use a parent element and
    *   apply the CSS to this instead, otherwise you'll be constantly resizing the shape of the game container.
    * 
    * - The Display canvas layout CSS styles (i.e. margins, size) should not be altered / specified as
    *   they may be updated by the Scale Manager.
    * 
    * #### Scale Modes
    * 
    * The way the scaling is handled is determined by the `scaleMode` property. The default is `NONE`,
    * which prevents Phaser from scaling or touching the canvas, or its parent, at all. In this mode, you are
    * responsible for all scaling. The other scaling modes afford you automatic scaling.
    * 
    * If you wish to scale your game so that it always fits into the available space within the parent, you
    * should use the scale mode `FIT`. Look at the documentation for other scale modes to see what options are
    * available. Here is a basic config showing how to set this scale mode:
    * 
    * ```javascript
    * scale: {
    *     parent: 'yourgamediv',
    *     mode: Phaser.Scale.FIT,
    *     width: 800,
    *     height: 600
    * }
    * ```
    * 
    * Place the `scale` config object within your game config.
    * 
    * If you wish for the canvas to be resized directly, so that the canvas itself fills the available space
    * (i.e. it isn't scaled, it's resized) then use the `RESIZE` scale mode. This will give you a 1:1 mapping
    * of canvas pixels to game size. In this mode CSS isn't used to scale the canvas, it's literally adjusted
    * to fill all available space within the parent. You should be extremely careful about the size of the
    * canvas you're creating when doing this, as the larger the area, the more work the GPU has to do and it's
    * very easy to hit fill-rate limits quickly.
    * 
    * For complex, custom-scaling requirements, you should probably consider using the `RESIZE` scale mode,
    * with your own limitations in place re: canvas dimensions and managing the scaling with the game scenes
    * yourself. For the vast majority of games, however, the `FIT` mode is likely to be the most used.
    * 
    * Please appreciate that the Scale Manager cannot perform miracles. All it does is scale your game canvas
    * as best it can, based on what it can infer from its surrounding area. There are all kinds of environments
    * where it's up to you to guide and help the canvas position itself, especially when built into rendering
    * frameworks like React and Vue. If your page requires meta tags to prevent user scaling gestures, or such
    * like, then it's up to you to ensure they are present in the html.
    * 
    * #### Centering
    * 
    * You can also have the game canvas automatically centered. Again, this relies heavily on the parent being
    * properly configured and styled, as the centering offsets are based entirely on the available space
    * within the parent element. Centering is disabled by default, or can be applied horizontally, vertically,
    * or both. Here's an example:
    * 
    * ```javascript
    * scale: {
    *     parent: 'yourgamediv',
    *     autoCenter: Phaser.Scale.CENTER_BOTH,
    *     width: 800,
    *     height: 600
    * }
    * ```
    * 
    * #### Fullscreen API
    * 
    * If the browser supports it, you can send your game into fullscreen mode. In this mode, the game will fill
    * the entire display, removing all browser UI and anything else present on the screen. It will remain in this
    * mode until your game either disables it, or until the user tabs out or presses ESCape if on desktop. It's a
    * great way to achieve a desktop-game like experience from the browser, but it does require a modern browser
    * to handle it. Some mobile browsers also support this.
    */
  @js.native
  trait ScaleManager
    extends StObject
       with EventEmitter {
    
    /**
      * Internal flag set when the game zoom factor is modified.
      */
    val _resetZoom: Boolean = js.native
    
    /**
      * Automatically center the canvas within the parent? The different centering modes are:
      * 
      * 1. No centering.
      * 2. Center both horizontally and vertically.
      * 3. Center horizontally.
      * 4. Center vertically.
      * 
      * Please be aware that in order to center the game canvas, you must have specified a parent
      * that has a size set, or the canvas parent is the document.body.
      */
    var autoCenter: CenterType = js.native
    
    /**
      * If set, the canvas sizes will be automatically passed through Math.floor.
      * This results in rounded pixel display values, which is important for performance on legacy
      * and low powered devices, but at the cost of not achieving a 'perfect' fit in some browser windows.
      */
    var autoRound: Boolean = js.native
    
    /**
      * The Base Size component.
      * 
      * The modified game size, which is the gameSize * resolution, used to set the canvas width and height
      * (but not the CSS style)
      */
    var baseSize: Size = js.native
    
    /**
      * The Boot handler is called by Phaser.Game when it first starts up.
      * The renderer is available by now and the canvas has been added to the DOM.
      */
    /* protected */ def boot(): Unit = js.native
    
    /**
      * A reference to the HTML Canvas Element that Phaser uses to render the game.
      */
    var canvas: HTMLCanvasElement = js.native
    
    /**
      * The DOM bounds of the canvas element.
      */
    var canvasBounds: Rectangle = js.native
    
    /**
      * The dirty state of the Scale Manager.
      * Set if there is a change between the parent size and the current size.
      */
    var dirty: Boolean = js.native
    
    /**
      * The scale factor between the baseSize and the canvasBounds.
      */
    var displayScale: Vector2 = js.native
    
    /**
      * The Display Size component.
      * 
      * The size used for the canvas style, factoring in the scale mode, parent and other values.
      */
    var displaySize: Size = js.native
    
    /**
      * A reference to the Device.Fullscreen object.
      */
    var fullscreen: Fullscreen = js.native
    
    /**
      * The DOM Element which is sent into fullscreen mode.
      */
    var fullscreenTarget: js.Any = js.native
    
    /**
      * A reference to the Phaser.Game instance.
      */
    val game: Game = js.native
    
    /**
      * The Game Size component.
      * 
      * The un-modified game size, as requested in the game config (the raw width / height),
      * as used for world bounds, cameras, etc
      */
    var gameSize: Size = js.native
    
    /**
      * An internal method that gets the target element that is used when entering fullscreen mode.
      */
    def getFullscreenTarget(): js.Object = js.native
    
    /**
      * Calculates and returns the largest possible zoom factor, based on the current
      * parent and game sizes. If the parent has no dimensions (i.e. an unstyled div),
      * or is smaller than the un-zoomed game, then this will return a value of 1 (no zoom)
      */
    def getMaxZoom(): integer = js.native
    
    /**
      * Determines the parent element of the game canvas, if any, based on the game configuration.
      * @param config The Game configuration object.
      */
    def getParent(config: GameConfig): Unit = js.native
    
    /**
      * Calculates the size of the parent bounds and updates the `parentSize` component, if the canvas has a dom parent.
      */
    def getParentBounds(): Boolean = js.native
    
    /**
      * The game height.
      * 
      * This is typically the size given in the game configuration.
      */
    val height: Double = js.native
    
    /**
      * Is the browser currently in fullscreen mode or not?
      */
    val isFullscreen: Boolean = js.native
    
    /**
      * Are the game dimensions landscape? (i.e. wider than they are tall)
      * 
      * This is different to the device itself being in a landscape orientation.
      */
    val isGameLandscape: Boolean = js.native
    
    /**
      * Are the game dimensions portrait? (i.e. taller than they are wide)
      * 
      * This is different to the device itself being in a portrait orientation.
      */
    val isGamePortrait: Boolean = js.native
    
    /**
      * Is the device in a landscape orientation as reported by the Orientation API?
      * This value is usually only available on mobile devices.
      */
    val isLandscape: Boolean = js.native
    
    /**
      * Is the device in a portrait orientation as reported by the Orientation API?
      * This value is usually only available on mobile devices.
      */
    val isPortrait: Boolean = js.native
    
    /**
      * Attempts to lock the orientation of the web browser using the Screen Orientation API.
      * 
      * This API is only available on modern mobile browsers.
      * See https://developer.mozilla.org/en-US/docs/Web/API/Screen/lockOrientation for details.
      * @param orientation The orientation you'd like to lock the browser in. Should be an API string such as 'landscape', 'landscape-primary', 'portrait', etc.
      */
    def lockOrientation(orientation: String): Boolean = js.native
    
    /**
      * Triggered when a fullscreenchange event is dispatched by the DOM.
      */
    def onFullScreenChange(): Unit = js.native
    
    /**
      * Triggered when a fullscreenerror event is dispatched by the DOM.
      */
    def onFullScreenError(): Unit = js.native
    
    /**
      * The current device orientation.
      * 
      * Orientation events are dispatched via the Device Orientation API, typically only on mobile browsers.
      */
    var orientation: OrientationType = js.native
    
    /**
      * The parent object of the Canvas. Often a div, or the browser window, or nothing in non-browser environments.
      * 
      * This is set in the Game Config as the `parent` property. If undefined (or just not present), it will default
      * to use the document body. If specifically set to `null` Phaser will ignore all parent operations.
      */
    var parent: js.Any = js.native
    
    /**
      * Is the parent element the browser window?
      */
    var parentIsWindow: Boolean = js.native
    
    /**
      * The Parent Size component.
      */
    var parentSize: Size = js.native
    
    /**
      * Parses the game configuration to set-up the scale defaults.
      * @param config The Game configuration object.
      */
    /* protected */ def parseConfig(config: GameConfig): Unit = js.native
    
    /**
      * Called _before_ the canvas object is created and added to the DOM.
      */
    /* protected */ def preBoot(): Unit = js.native
    
    /**
      * Refreshes the internal scale values, bounds sizes and orientation checks.
      * 
      * Once finished, dispatches the resize event.
      * 
      * This is called automatically by the Scale Manager when the browser window size changes,
      * as long as it is using a Scale Mode other than 'NONE'.
      * @param previousWidth The previous width of the game. Only set if the gameSize has changed.
      * @param previousHeight The previous height of the game. Only set if the gameSize has changed.
      */
    def refresh(): this.type = js.native
    def refresh(previousWidth: Double): this.type = js.native
    def refresh(previousWidth: Double, previousHeight: Double): this.type = js.native
    def refresh(previousWidth: Unit, previousHeight: Double): this.type = js.native
    
    /**
      * Removes the fullscreen target that was added to the DOM.
      */
    def removeFullscreenTarget(): Unit = js.native
    
    /**
      * Call this to modify the size of the Phaser canvas element directly.
      * You should only use this if you are using the `NONE` scale mode,
      * it will update all internal components completely.
      * 
      * If all you want to do is change the size of the parent, see the `setParentSize` method.
      * 
      * If all you want is to change the base size of the game, but still have the Scale Manager
      * manage all the scaling (i.e. you're **not** using `NONE`), then see the `setGameSize` method.
      * 
      * This method will set the `gameSize`, `baseSize` and `displaySize` components to the given
      * dimensions. It will then resize the canvas width and height to the values given, by
      * directly setting the properties. Finally, if you have set the Scale Manager zoom value
      * to anything other than 1 (the default), it will set the canvas CSS width and height to
      * be the given size multiplied by the zoom factor (the canvas pixel size remains untouched).
      * 
      * If you have enabled `autoCenter`, it is then passed to the `updateCenter` method and
      * the margins are set, allowing the canvas to be centered based on its parent element
      * alone. Finally, the `displayScale` is adjusted and the RESIZE event dispatched.
      * @param width The new width of the game.
      * @param height The new height of the game.
      */
    def resize(width: Double, height: Double): this.type = js.native
    
    /**
      * How many milliseconds should elapse before checking if the browser size has changed?
      * 
      * Most modern browsers dispatch a 'resize' event, which the Scale Manager will listen for.
      * However, older browsers fail to do this, or do it consistently, so we fall back to a
      * more traditional 'size check' based on a time interval. You can control how often it is
      * checked here.
      */
    var resizeInterval: integer = js.native
    
    /**
      * The canvas resolution.
      * 
      * This is hard-coded to a value of 1 in the 3.16 release of Phaser and will be enabled at a later date.
      */
    var resolution: Double = js.native
    
    /**
      * The game scale mode.
      */
    var scaleMode: ScaleModeType = js.native
    
    /**
      * This method will set a new size for your game.
      * 
      * It should only be used if you're looking to change the base size of your game and are using
      * one of the Scale Manager scaling modes, i.e. `FIT`. If you're using `NONE` and wish to
      * change the game and canvas size directly, then please use the `resize` method instead.
      * @param width The new width of the game.
      * @param height The new height of the game.
      */
    def setGameSize(width: Double, height: Double): this.type = js.native
    
    /**
      * Sets the zoom to be the maximum possible based on the _current_ parent size.
      */
    def setMaxZoom(): this.type = js.native
    
    /**
      * This method will set the size of the Parent Size component, which is used in scaling
      * and centering calculations. You only need to call this method if you have explicitly
      * disabled the use of a parent in your game config, but still wish to take advantage of
      * other Scale Manager features.
      * @param width The new width of the parent.
      * @param height The new height of the parent.
      */
    def setParentSize(width: Double, height: Double): this.type = js.native
    
    /**
      * Sets the zoom value of the Scale Manager.
      * @param value The new zoom value of the game.
      */
    def setZoom(value: integer): this.type = js.native
    
    /**
      * Sends a request to the browser to ask it to go in to full screen mode, using the {@link https://developer.mozilla.org/en-US/docs/Web/API/Fullscreen_API Fullscreen API}.
      * 
      * If the browser does not support this, a `FULLSCREEN_UNSUPPORTED` event will be emitted.
      * 
      * This method _must_ be called from a user-input gesture, such as `pointerup`. You cannot launch
      * games fullscreen without this, as most browsers block it. Games within an iframe will also be blocked
      * from fullscreen unless the iframe has the `allowfullscreen` attribute.
      * 
      * On touch devices, such as Android and iOS Safari, you should always use `pointerup` and NOT `pointerdown`,
      * otherwise the request will fail unless the document in which your game is embedded has already received
      * some form of touch input, which you cannot guarantee. Activating fullscreen via `pointerup` circumvents
      * this issue.
      * 
      * Performing an action that navigates to another page, or opens another tab, will automatically cancel
      * fullscreen mode, as will the user pressing the ESC key. To cancel fullscreen mode directly from your game,
      * i.e. by clicking an icon, call the `stopFullscreen` method.
      * 
      * A browser can only send one DOM element into fullscreen. You can control which element this is by
      * setting the `fullscreenTarget` property in your game config, or changing the property in the Scale Manager.
      * Note that the game canvas _must_ be a child of the target. If you do not give a target, Phaser will
      * automatically create a blank `<div>` element and move the canvas into it, before going fullscreen.
      * When it leaves fullscreen, the div will be removed.
      * @param fullscreenOptions The FullscreenOptions dictionary is used to provide configuration options when entering full screen.
      */
    def startFullscreen(): Unit = js.native
    def startFullscreen(fullscreenOptions: js.Object): Unit = js.native
    
    /**
      * An internal method that starts the different DOM event listeners running.
      */
    def startListeners(): Unit = js.native
    
    /**
      * Internal method, called automatically by the game step.
      * Monitors the elapsed time and resize interval to see if a parent bounds check needs to take place.
      * @param time The time value from the most recent Game step. Typically a high-resolution timer value, or Date.now().
      * @param delta The delta value since the last frame. This is smoothed to avoid delta spikes by the TimeStep class.
      */
    def step(time: Double, delta: Double): Unit = js.native
    
    /**
      * Calling this method will cancel fullscreen mode, if the browser has entered it.
      */
    def stopFullscreen(): Unit = js.native
    
    /**
      * Stops all DOM event listeners.
      */
    def stopListeners(): Unit = js.native
    
    /**
      * Toggles the fullscreen mode. If already in fullscreen, calling this will cancel it.
      * If not in fullscreen, this will request the browser to enter fullscreen mode.
      * 
      * If the browser does not support this, a `FULLSCREEN_UNSUPPORTED` event will be emitted.
      * 
      * This method _must_ be called from a user-input gesture, such as `pointerdown`. You cannot launch
      * games fullscreen without this, as most browsers block it. Games within an iframe will also be blocked
      * from fullscreen unless the iframe has the `allowfullscreen` attribute.
      * @param fullscreenOptions The FullscreenOptions dictionary is used to provide configuration options when entering full screen.
      */
    def toggleFullscreen(): Unit = js.native
    def toggleFullscreen(fullscreenOptions: js.Object): Unit = js.native
    
    /**
      * Transforms the pageX value into the scaled coordinate space of the Scale Manager.
      * @param pageX The DOM pageX value.
      */
    def transformX(pageX: Double): Double = js.native
    
    /**
      * Transforms the pageY value into the scaled coordinate space of the Scale Manager.
      * @param pageY The DOM pageY value.
      */
    def transformY(pageY: Double): Double = js.native
    
    /**
      * Updates the `canvasBounds` rectangle to match the bounding client rectangle of the
      * canvas element being used to track input events.
      */
    def updateBounds(): Unit = js.native
    
    /**
      * Calculates and updates the canvas CSS style in order to center it within the
      * bounds of its parent. If you have explicitly set parent to be `null` in your
      * game config then this method will likely give incorrect results unless you have called the
      * `setParentSize` method first.
      * 
      * It works by modifying the canvas CSS `marginLeft` and `marginTop` properties.
      * 
      * If they have already been set by your own style sheet, or code, this will overwrite them.
      * 
      * To prevent the Scale Manager from centering the canvas, either do not set the
      * `autoCenter` property in your game config, or make sure it is set to `NO_CENTER`.
      */
    def updateCenter(): Unit = js.native
    
    /**
      * Internal method that checks the current screen orientation, only if the internal check flag is set.
      * 
      * If the orientation has changed it updates the orientation property and then dispatches the orientation change event.
      */
    def updateOrientation(): Unit = js.native
    
    /**
      * Internal method that manages updating the size components based on the scale mode.
      */
    def updateScale(): Unit = js.native
    
    /**
      * The game width.
      * 
      * This is typically the size given in the game configuration.
      */
    val width: Double = js.native
    
    /**
      * The game zoom factor.
      * 
      * This value allows you to multiply your games base size by the given zoom factor.
      * This is then used when calculating the display size, even in `NONE` situations.
      * If you don't want Phaser to touch the canvas style at all, this value should be 1.
      * 
      * Can also be set to `MAX_ZOOM` in which case the zoom value will be derived based
      * on the game size and available space within the parent.
      */
    var zoom: Double = js.native
  }
  
  /**
    * Phaser Scale Manager constants for the different scale modes available.
    * 
    * To find out what each mode does please see [Phaser.Scale.ScaleModes]{@link Phaser.Scale.ScaleModes}.
    */
  type ScaleModeType = typings.phaser.Phaser.Scale.ScaleModes
  
  /**
    * Phaser Scale Manager constants for zoom modes.
    * 
    * To find out what each mode does please see [Phaser.Scale.Zoom]{@link Phaser.Scale.Zoom}.
    */
  type ZoomType = Zoom
}
