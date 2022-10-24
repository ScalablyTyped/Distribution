package typings.parallaxJs

import typings.parallaxJs.parallaxJsBooleans.`false`
import typings.parallaxJs.parallaxJsStrings.`3Dot1Dot0`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A `Parallax` object adds the parallax effect for a given scene.
    */
  @JSImport("parallax-js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Parallax {
    /**
      * Creates and enables a parallax effect on the given `scene`.
      *
      * @param scene the scene element contains the layers with `data-depth`
      *  attributes to apply the parallax effect to.
      * @param options the options object can be used to configure the parallax
      *  effect programmatically.
      */
    def this(scene: HTMLElement) = this()
    def this(scene: HTMLElement, options: ParallaxOptions) = this()
  }
  
  /**
    * A `Parallax` object adds the parallax effect for a given scene.
    */
  @js.native
  trait Parallax extends StObject {
    
    /**
      * @see {@link ParallaxOptions.calibrateX}
      * @see {@link ParallaxOptions.calibrateY}
      */
    def calibrate(): Unit = js.native
    def calibrate(x: Boolean): Unit = js.native
    def calibrate(x: Boolean, y: Boolean): Unit = js.native
    def calibrate(x: Unit, y: Boolean): Unit = js.native
    
    /**
      * Completely destroys a `Parallax` instance, allowing it to be garbage
      * collected.
      */
    def destroy(): Unit = js.native
    
    /**
      * Disables a running `Parallax` instance.
      */
    def disable(): Unit = js.native
    
    /**
      * Enables a disabled `Parallax` instance.
      */
    def enable(): Unit = js.native
    
    /**
      * @see {@link ParallaxOptions.frictionX}
      * @see {@link ParallaxOptions.frictionY}
      */
    def friction(x: floatBetween0And1, y: floatBetween0And1): Unit = js.native
    
    /**
      * @see {@link ParallaxOptions.invertX}
      * @see {@link ParallaxOptions.invertY}
      */
    def invert(): Unit = js.native
    def invert(x: Boolean): Unit = js.native
    def invert(x: Boolean, y: Boolean): Unit = js.native
    def invert(x: Unit, y: Boolean): Unit = js.native
    
    /**
      * @see {@link ParallaxOptions.limitX}
      * @see {@link ParallaxOptions.limitY}
      */
    def limit(): Unit = js.native
    def limit(x: Unit, y: integer): Unit = js.native
    def limit(x: integer): Unit = js.native
    def limit(x: integer, y: integer): Unit = js.native
    @JSName("limit")
    def limit_false(x: Unit, y: `false`): Unit = js.native
    @JSName("limit")
    def limit_false(x: integer, y: `false`): Unit = js.native
    @JSName("limit")
    def limit_false(x: `false`): Unit = js.native
    @JSName("limit")
    def limit_false(x: `false`, y: integer): Unit = js.native
    @JSName("limit")
    def limit_false(x: `false`, y: `false`): Unit = js.native
    
    /**
      * @see {@link ParallaxOptions.originX}
      * @see {@link ParallaxOptions.originY}
      */
    def origin(x: floatBetween0And1, y: floatBetween0And1): Unit = js.native
    
    /**
      * @see {@link ParallaxOptions.scalarX}
      * @see {@link ParallaxOptions.scalarY}
      */
    def scalar(): Unit = js.native
    def scalar(x: Double): Unit = js.native
    def scalar(x: Double, y: Double): Unit = js.native
    def scalar(x: Unit, y: Double): Unit = js.native
    
    /**
      * @see {@link ParallaxOptions.inputElement}
      */
    def setInputElement(): Unit = js.native
    def setInputElement(element: HTMLElement): Unit = js.native
    
    /**
      * Returns the version number of the Parallax library.
      */
    def version(): `3Dot1Dot0` = js.native
  }
  
  /**
    * The parallax options object can be used to configure the parallax effect
    * programmatically.
    * Alternatively, you can specify these options as HTML `data-*` attributes on
    * the scene HTML element.
    * Some options can also be updated programmatically at runtime through the
    * `Parallax` object.
    */
  trait ParallaxOptions extends StObject {
    
    /**
      * Caches the initial X axis value on initialization and calculates motion
      * relative to this.
      *
      * No effect when cursor is used.
      *
      * Defaults to `false`.
      *
      * Corresponding scene HTML attribute: `data-calibrate-x`
      *
      * This option can be updated at runtime though `Parallax.calibrate(x, y)`.
      */
    var calibrateX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Caches the initial Y axis value on initialization and calculates motion
      * relative to this.
      *
      * No effect when cursor is used.
      *
      * Defaults to `true`.
      *
      * Corresponding scene HTML attribute: `data-calibrate-y`
      *
      * This option can be updated at runtime though `Parallax.calibrate(x, y)`.
      */
    var calibrateY: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Clips mouse input to the bounds of the scene.
      * This means the movement stops as soon as the edge of the scene element is
      * reached by the cursor.
      *
      * No effect when gyroscope is used, or `hoverOnly` is active.
      *
      * Defaults to `false`.
      *
      * Corresponding scene HTML attribute: `data-clip-relative-input`
      *
      * This option cannot be updated at runtime.
      */
    var clipRelativeInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Amount of friction applied to the layers.
      * At `1` the layers will instantly go to their new positions, everything
      * below `1` adds some easing.
      * The default value of `0.1` adds some sensible easing.
      * Try `0.15` or `0.075` for some difference.
      *
      * Defaults to `0.1`.
      *
      * Corresponding scene HTML attribute: `data-friction-x`
      *
      * This option can be updated at runtime though `Parallax.friction(x, y)`.
      */
    var frictionX: js.UndefOr[floatBetween0And1] = js.undefined
    
    /**
      * Amount of friction applied to the layers.
      * At `1` the layers will instantly go to their new positions, everything
      * below `1` adds some easing.
      * The default value of `0.1` adds some sensible easing.
      * Try `0.15` or `0.075` for some difference.
      *
      * Defaults to `0.1`.
      *
      * Corresponding scene HTML attribute: `data-friction-y`
      *
      * This option can be updated at runtime though `Parallax.friction(x, y)`.
      */
    var frictionY: js.UndefOr[floatBetween0And1] = js.undefined
    
    /**
      * Parallax will only be in effect while the cursor is over the scene
      * element, otherwise all layers move back to their initial position.
      * Works best in combination with `relativeInput`.
      *
      * No effect when gyroscope is used.
      *
      * Defaults to `false`.
      *
      * Corresponding scene HTML attribute: `data-hover-only`
      *
      * This option cannot be updated at runtime.
      */
    var hoverOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows usage of a different element for cursor input.
      *
      * Will only work in combination with `relativeInput`, setting `hoverOnly`
      * might make sense too.
      * No effect when gyroscope is used.
      *
      * Defaults to `null`.
      *
      * Corresponding scene HTML attribute: `data-input-element` (the attribute
      * takes a
      * [query selector string](https://developer.mozilla.org/en-US/docs/Web/API/Document_object_model/Locating_DOM_elements_using_selectors)
      * to identify the input element)
      *
      * This option can be updated at runtime though `Parallax.setInputElement`.
      */
    var inputElement: js.UndefOr[HTMLElement | Null] = js.undefined
    
    /**
      * Inverts the movement of the layers relative to the input.
      * Setting both the `invertX` and `invertY` values to `false` will cause the
      * layers to move with the device motion or cursor.
      *
      * Defaults to `true`.
      *
      * Corresponding scene HTML attribute: `data-invert-x`
      *
      * This option can be updated at runtime though `Parallax.invert(x, y)`.
      */
    var invertX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inverts the movement of the layers relative to the input.
      * Setting both the `invertX` and `invertY` values to `false` will cause the
      * layers to move with the device motion or cursor.
      *
      * Defaults to `true`.
      *
      * Corresponding scene HTML attribute: `data-invert-y`
      *
      * This option can be updated at runtime though `Parallax.invert(x, y)`.
      */
    var invertY: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limits the movement of layers on the X axis.
      * Leaving this value at `false` gives complete freedom to the movement.
      *
      * Defaults to `false`.
      *
      * Corresponding scene HTML attribute: `data-limit-x`
      *
      * This option can be updated at runtime though `Parallax.limit(x, y)`.
      */
    var limitX: js.UndefOr[`false` | integer] = js.undefined
    
    /**
      * Limits the movement of layers on the Y axis.
      * Leaving this value at `false` gives complete freedom to the movement.
      *
      * Defaults to `false`.
      *
      * Corresponding scene HTML attribute: `data-limit-y`
      *
      * This option can be updated at runtime though `Parallax.limit(x, y)`.
      */
    var limitY: js.UndefOr[`false` | integer] = js.undefined
    
    /**
      * Callback function that will be called as soon as the `Parallax` instance
      * has finished its setup.
      * This might currently take up to `1000ms` (`calibrationDelay * 2`).
      *
      * Defaults to `null`.
      *
      * This option does not have a corresponding scene HTML attribute.
      *
      * This option cannot be updated at runtime.
      */
    var onReady: js.UndefOr[Null | js.Function0[Unit]] = js.undefined
    
    /**
      * X origin of the mouse input.
      * The default of `0.5` refers to the center of the screen or element,
      * `0` is the left border, `1` the right.
      *
      * No effect when gyroscope is used.
      *
      * Defaults to `0.5`.
      *
      * Corresponding scene HTML attribute: `data-origin-x`
      *
      * This option can be updated at runtime though `Parallax.origin(x, y)`.
      */
    var originX: js.UndefOr[floatBetween0And1] = js.undefined
    
    /**
      * Y origin of the mouse input.
      * The default of `0.5` refers to the center of the screen or element,
      * `0` is the top border, `1` the bottom.
      *
      * No effect when gyroscope is used.
      *
      * Defaults to `0.5`.
      *
      * Corresponding scene HTML attribute: `data-origin-y`
      *
      * This option can be updated at runtime though `Parallax.origin(x, y)`.
      */
    var originY: js.UndefOr[floatBetween0And1] = js.undefined
    
    /**
      * Set to `true` to enable interactions with the scene and layer elements.
      * When set to the default of `false`, the CSS attribute
      * `pointer-events: none` will be applied for performance reasons.
      * Setting this to `true` alone will not be enough to fully interact with
      * all layers, since they will be overlapping.
      * You have to either set `position: absolute` on all layer child elements,
      * or keep `pointerEvents` at `false` and set `pointer-events: all` for the
      * interactable elements only.
      *
      * Defaults to `false`.
      *
      * Corresponding scene HTML attribute: `data-pointer-events`
      *
      * This option cannot be updated at runtime.
      */
    var pointerEvents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Decimals the element positions will be rounded to.
      * `1` is a sensible default which you should not need to change in the next
      * few years, unless you have a very interesting and unique setup.
      *
      * Defaults to `1`.
      *
      * Corresponding scene HTML attribute: `data-precision`
      *
      * This option cannot be updated at runtime.
      */
    var precision: js.UndefOr[integer] = js.undefined
    
    /**
      * Makes mouse input relative to the position of the scene element.
      *
      * No effect when gyroscope is used.
      *
      * Defaults to `false`.
      *
      * Corresponding scene HTML attribute: `data-relative-input`
      *
      * This option cannot be updated at runtime.
      */
    var relativeInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Multiplies the input motion by this value, increasing or decreasing the
      * movement speed and range.
      *
      * Defaults to `10.0`.
      *
      * Corresponding scene HTML attribute: `data-scalar-x`
      *
      * This option can be updated at runtime though `Parallax.scalar(x, y)`.
      */
    var scalarX: js.UndefOr[Double] = js.undefined
    
    /**
      * Multiplies the input motion by this value, increasing or decreasing the
      * movement speed and range.
      *
      * Defaults to `10.0`.
      *
      * Corresponding scene HTML attribute: `data-scalar-y`
      *
      * This option can be updated at runtime though `Parallax.scalar(x, y)`.
      */
    var scalarY: js.UndefOr[Double] = js.undefined
    
    /**
      * String that will be fed to `querySelectorAll` on the scene element to
      * select the layer elements.
      * When `null`, will simply select all direct child elements.
      * Use `.layer` for legacy behaviour, selecting only child elements having
      * the class name `layer`.
      *
      * Defaults to `null`.
      *
      * Corresponding scene HTML attribute: `data-selector`
      *
      * This option cannot be updated at runtime.
      */
    var selector: js.UndefOr[String | Null] = js.undefined
  }
  object ParallaxOptions {
    
    inline def apply(): ParallaxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParallaxOptions]
    }
    
    extension [Self <: ParallaxOptions](x: Self) {
      
      inline def setCalibrateX(value: Boolean): Self = StObject.set(x, "calibrateX", value.asInstanceOf[js.Any])
      
      inline def setCalibrateXUndefined: Self = StObject.set(x, "calibrateX", js.undefined)
      
      inline def setCalibrateY(value: Boolean): Self = StObject.set(x, "calibrateY", value.asInstanceOf[js.Any])
      
      inline def setCalibrateYUndefined: Self = StObject.set(x, "calibrateY", js.undefined)
      
      inline def setClipRelativeInput(value: Boolean): Self = StObject.set(x, "clipRelativeInput", value.asInstanceOf[js.Any])
      
      inline def setClipRelativeInputUndefined: Self = StObject.set(x, "clipRelativeInput", js.undefined)
      
      inline def setFrictionX(value: floatBetween0And1): Self = StObject.set(x, "frictionX", value.asInstanceOf[js.Any])
      
      inline def setFrictionXUndefined: Self = StObject.set(x, "frictionX", js.undefined)
      
      inline def setFrictionY(value: floatBetween0And1): Self = StObject.set(x, "frictionY", value.asInstanceOf[js.Any])
      
      inline def setFrictionYUndefined: Self = StObject.set(x, "frictionY", js.undefined)
      
      inline def setHoverOnly(value: Boolean): Self = StObject.set(x, "hoverOnly", value.asInstanceOf[js.Any])
      
      inline def setHoverOnlyUndefined: Self = StObject.set(x, "hoverOnly", js.undefined)
      
      inline def setInputElement(value: HTMLElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
      
      inline def setInputElementNull: Self = StObject.set(x, "inputElement", null)
      
      inline def setInputElementUndefined: Self = StObject.set(x, "inputElement", js.undefined)
      
      inline def setInvertX(value: Boolean): Self = StObject.set(x, "invertX", value.asInstanceOf[js.Any])
      
      inline def setInvertXUndefined: Self = StObject.set(x, "invertX", js.undefined)
      
      inline def setInvertY(value: Boolean): Self = StObject.set(x, "invertY", value.asInstanceOf[js.Any])
      
      inline def setInvertYUndefined: Self = StObject.set(x, "invertY", js.undefined)
      
      inline def setLimitX(value: `false` | integer): Self = StObject.set(x, "limitX", value.asInstanceOf[js.Any])
      
      inline def setLimitXUndefined: Self = StObject.set(x, "limitX", js.undefined)
      
      inline def setLimitY(value: `false` | integer): Self = StObject.set(x, "limitY", value.asInstanceOf[js.Any])
      
      inline def setLimitYUndefined: Self = StObject.set(x, "limitY", js.undefined)
      
      inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      inline def setOnReadyNull: Self = StObject.set(x, "onReady", null)
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOriginX(value: floatBetween0And1): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
      
      inline def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
      
      inline def setOriginY(value: floatBetween0And1): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
      
      inline def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
      
      inline def setPointerEvents(value: Boolean): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPrecision(value: integer): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRelativeInput(value: Boolean): Self = StObject.set(x, "relativeInput", value.asInstanceOf[js.Any])
      
      inline def setRelativeInputUndefined: Self = StObject.set(x, "relativeInput", js.undefined)
      
      inline def setScalarX(value: Double): Self = StObject.set(x, "scalarX", value.asInstanceOf[js.Any])
      
      inline def setScalarXUndefined: Self = StObject.set(x, "scalarX", js.undefined)
      
      inline def setScalarY(value: Double): Self = StObject.set(x, "scalarY", value.asInstanceOf[js.Any])
      
      inline def setScalarYUndefined: Self = StObject.set(x, "scalarY", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorNull: Self = StObject.set(x, "selector", null)
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  type floatBetween0And1 = Double
  
  type integer = Double
}
