package typings.pixiColor

import typings.colord.typesMod.HslColor
import typings.colord.typesMod.HslaColor
import typings.colord.typesMod.HsvColor
import typings.colord.typesMod.HsvaColor
import typings.colord.typesMod.RgbColor
import typings.colord.typesMod.RgbaColor
import typings.std.Exclude
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorMod {
  
  @JSImport("@pixi/color/lib/Color", "Color")
  @js.native
  /**
    * @param {PIXI.ColorSource} value - Optional value to use, if not provided, white is used.
    */
  open class Color () extends StObject {
    def this(value: ColorSource) = this()
    
    /**
      * Clamps values to a range. Will override original values
      * @param value - Value(s) to clamp
      * @param min - Minimum value
      * @param max - Maximum value
      */
    /* private */ var _clamp: Any = js.native
    
    /** Normalized rgba component, floats from 0-1 */
    /* private */ var _components: Any = js.native
    
    /** Cache color as number */
    /* private */ var _int: Any = js.native
    
    /** Internal color source, from constructor or set value */
    /* private */ var _value: Any = js.native
    
    /** Get alpha component (0 - 1) */
    def alpha: Double = js.native
    
    /** Get blue component (0 - 1) */
    def blue: Double = js.native
    
    /**
      * Copy a color source internally.
      * @param value - Color source
      */
    /* private */ var cloneSource: Any = js.native
    
    /** Get green component (0 - 1) */
    def green: Double = js.native
    
    /**
      * Equality check for color sources.
      * @param value1 - First color source
      * @param value2 - Second color source
      * @returns `true` if the color sources are equal, `false` otherwise.
      */
    /* private */ var isSourceEqual: Any = js.native
    
    /**
      * Multiply with another color. This action is destructive, and will
      * override the previous `value` property to be `null`.
      * @param {PIXI.ColorSource} value - The color to multiply by.
      */
    def multiply(value: ColorSource): this.type = js.native
    
    /**
      * Normalize the input value into rgba
      * @param value - Input value
      */
    /* private */ var normalize: Any = js.native
    
    /**
      * Converts color to a premultiplied alpha format. This action is destructive, and will
      * override the previous `value` property to be `null`.
      * @param alpha - The alpha to multiply by.
      * @param {boolean} [applyToRGB=true] - Whether to premultiply RGB channels.
      * @returns {PIXI.Color} - Itself.
      */
    def premultiply(alpha: Double): this.type = js.native
    def premultiply(alpha: Double, applyToRGB: Boolean): this.type = js.native
    
    /** Get red component (0 - 1) */
    def red: Double = js.native
    
    /** Refresh the internal color rgb number */
    /* private */ var refreshInt: Any = js.native
    
    /**
      * Rounds the specified color according to the step. This action is destructive, and will
      * override the previous `value` property to be `null`. The alpha component is not rounded.
      * @param steps - Number of steps which will be used as a cap when rounding colors
      */
    def round(steps: Double): this.type = js.native
    
    /**
      * Set alpha, suitable for chaining.
      * @param alpha
      */
    def setAlpha(alpha: Double): this.type = js.native
    
    /**
      * Set the value, suitable for chaining
      * @param value
      * @see PIXI.Color.value
      */
    def setValue(value: ColorSource): this.type = js.native
    
    /**
      * Convert to an [R, G, B, A] array of normalized floats (numbers from 0.0 to 1.0).
      * @example
      * import { Color } from 'pixi.js';
      * new Color('white').toArray(); // returns [1, 1, 1, 1]
      * @param {number[]|Float32Array} [out] - Output array
      */
    def toArray(): js.Array[Double] = js.native
    def toArray(out: js.Array[Double]): js.Array[Double] = js.native
    def toArray(out: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
    
    /**
      * Convert to a hexidecimal string.
      * @example
      * import { Color } from 'pixi.js';
      * new Color('white').toHex(); // returns "#ffffff"
      */
    def toHex(): String = js.native
    
    /**
      * Convert to a hexidecimal string with alpha.
      * @example
      * import { Color } from 'pixi.js';
      * new Color('white').toHexa(); // returns "#ffffffff"
      */
    def toHexa(): String = js.native
    
    /**
      * Convert to a hexadecimal number in little endian format (e.g., BBGGRR).
      * @example
      * import { Color } from 'pixi.js';
      * new Color(0xffcc99).toLittleEndianNumber(); // returns 0x99ccff
      * @returns {number} - The color as a number in little endian format.
      */
    def toLittleEndianNumber(): Double = js.native
    
    /**
      * Convert to a hexadecimal number.
      * @example
      * import { Color } from 'pixi.js';
      * new Color('white').toNumber(); // returns 16777215
      */
    def toNumber(): Double = js.native
    
    /**
      * Premultiplies alpha with current color.
      * @param {number} alpha - The alpha to multiply by.
      * @param {boolean} [applyToRGB=true] - Whether to premultiply RGB channels.
      * @returns {number} tint multiplied by alpha
      */
    def toPremultiplied(alpha: Double): Double = js.native
    def toPremultiplied(alpha: Double, applyToRGB: Boolean): Double = js.native
    
    /**
      * Convert to a RGB color object.
      * @example
      * import { Color } from 'pixi.js';
      * new Color('white').toRgb(); // returns { r: 1, g: 1, b: 1 }
      */
    def toRgb(): RgbColor = js.native
    
    /**
      * Convert to an [R, G, B] array of normalized floats (numbers from 0.0 to 1.0).
      * @example
      * import { Color } from 'pixi.js';
      * new Color('white').toRgbArray(); // returns [1, 1, 1]
      * @param {number[]|Float32Array} [out] - Output array
      */
    def toRgbArray(): js.Array[Double] = js.native
    def toRgbArray(out: js.Array[Double]): js.Array[Double] = js.native
    def toRgbArray(out: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
    
    /**
      * Convert to a RGBA color object.
      * @example
      * import { Color } from 'pixi.js';
      * new Color('white').toRgb(); // returns { r: 1, g: 1, b: 1, a: 1 }
      */
    def toRgba(): RgbaColor = js.native
    
    /** Convert to a CSS-style rgba string: `rgba(255,255,255,1.0)`. */
    def toRgbaString(): String = js.native
    
    /**
      * Convert to an [R, G, B] array of clamped uint8 values (0 to 255).
      * @example
      * import { Color } from 'pixi.js';
      * new Color('white').toUint8RgbArray(); // returns [255, 255, 255]
      * @param {number[]|Uint8Array|Uint8ClampedArray} [out] - Output array
      */
    def toUint8RgbArray(): js.Array[Double] = js.native
    def toUint8RgbArray(out: js.Array[Double]): js.Array[Double] = js.native
    def toUint8RgbArray(out: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def toUint8RgbArray(out: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray = js.native
    
    def value: (Exclude[ColorSource, Color]) | Null = js.native
    /**
      * The current color source.
      *
      * When setting:
      * - Setting to an instance of `Color` will copy its color source and components.
      * - Otherwise, `Color` will try to normalize the color source and set the components.
      *   If the color source is invalid, an `Error` will be thrown and the `Color` will left unchanged.
      *
      * Note: The `null` in the setter's parameter type is added to match the TypeScript rule: return type of getter
      * must be assignable to its setter's parameter type. Setting `value` to `null` will throw an `Error`.
      *
      * When getting:
      * - A return value of `null` means the previous value was overridden (e.g., {@link PIXI.Color.multiply multiply},
      *   {@link PIXI.Color.premultiply premultiply} or {@link PIXI.Color.round round}).
      * - Otherwise, the color source used when setting is returned.
      * @type {PIXI.ColorSource}
      */
    def value_=(value: ColorSource | Null): Unit = js.native
  }
  /* static members */
  object Color {
    
    /** Pattern for hex strings */
    @JSImport("@pixi/color/lib/Color", "Color.HEX_PATTERN")
    @js.native
    val HEX_PATTERN: Any = js.native
    
    /**
      * Default Color object for static uses
      * @example
      * import { Color } from 'pixi.js';
      * Color.shared.setValue(0xffffff).toHex(); // '#ffffff'
      */
    @JSImport("@pixi/color/lib/Color", "Color.shared")
    @js.native
    val shared: Color = js.native
    
    /**
      * Temporary Color object for static uses internally.
      * As to not conflict with Color.shared.
      * @ignore
      */
    @JSImport("@pixi/color/lib/Color", "Color.temp")
    @js.native
    val temp: Any = js.native
  }
  
  type ColorSource = String | Double | js.Array[Double] | js.typedarray.Float32Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | HslColor | HslaColor | HsvColor | HsvaColor | RgbColor | RgbaColor | Color | Number
}
