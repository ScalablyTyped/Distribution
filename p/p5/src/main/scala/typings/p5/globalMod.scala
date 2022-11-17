package typings.p5

import typings.p5.mod.ANGLE_MODE
import typings.p5.mod.ARC_MODE
import typings.p5.mod.BEGIN_KIND
import typings.p5.mod.BEZIER
import typings.p5.mod.BLEND
import typings.p5.mod.BLEND_MODE
import typings.p5.mod.CHAR
import typings.p5.mod.COLOR_MODE
import typings.p5.mod.CURSOR_TYPE
import typings.p5.mod.CURVE
import typings.p5.mod.Camera
import typings.p5.mod.Color
import typings.p5.mod.Convolver
import typings.p5.mod.DEBUG_MODE
import typings.p5.mod.DEGREES
import typings.p5.mod.DESCRIBE_DISPLAY
import typings.p5.mod.ELLIPSE_MODE
import typings.p5.mod.END_MODE
import typings.p5.mod.Element
import typings.p5.mod.FILL
import typings.p5.mod.FILTER_TYPE
import typings.p5.mod.Font
import typings.p5.mod.GRID_DISPLAY
import typings.p5.mod.Geometry
import typings.p5.mod.Graphics
import typings.p5.mod.HORIZ_ALIGN
import typings.p5.mod.IMAGE_MODE
import typings.p5.mod.Image
import typings.p5.mod.MediaElement
import typings.p5.mod.NORMAL
import typings.p5.mod.NumberDict
import typings.p5.mod.PrintWriter
import typings.p5.mod.RADIANS
import typings.p5.mod.RECT_MODE
import typings.p5.mod.RENDERER_
import typings.p5.mod.ROUND
import typings.p5.mod.Renderer
import typings.p5.mod.SQUARE
import typings.p5.mod.STROKE
import typings.p5.mod.STROKE_CAP
import typings.p5.mod.STROKE_JOIN
import typings.p5.mod.Shader
import typings.p5.mod.SoundFile
import typings.p5.mod.StringDict
import typings.p5.mod.TEXT
import typings.p5.mod.TEXTURE
import typings.p5.mod.TEXTURE_MODE
import typings.p5.mod.TEXT_DISPLAY
import typings.p5.mod.THE_STYLE
import typings.p5.mod.TYPE
import typings.p5.mod.Table
import typings.p5.mod.UNKNOWN_P5_CONSTANT
import typings.p5.mod.VERT_ALIGN
import typings.p5.mod.Vector
import typings.p5.mod.WRAP_STYLE
import typings.p5.mod.WRAP_X
import typings.p5.mod.WRAP_Y
import typings.p5.mod.^
import typings.std.Event
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  object global {
    
    @JSGlobal("ADD")
    @js.native
    val ADD: typings.p5.mod.ADD = js.native
    
    @JSGlobal("ALT")
    @js.native
    val ALT: Double = js.native
    
    @JSGlobal("ARROW")
    @js.native
    val ARROW: typings.p5.mod.ARROW = js.native
    
    @JSGlobal("AUDIO")
    @js.native
    val AUDIO: typings.p5.mod.AUDIO = js.native
    
    /**
      *   AUTO allows us to automatically set the width or
      *   height of an element (but not both), based on the
      *   current height and width of the element. Only one
      *   parameter can be passed to the size function as
      *   AUTO, at a time.
      */
    @JSGlobal("AUTO")
    @js.native
    val AUTO: typings.p5.mod.AUTO = js.native
    
    @JSGlobal("AXES")
    @js.native
    val AXES: typings.p5.mod.AXES = js.native
    
    @JSGlobal("BACKSPACE")
    @js.native
    val BACKSPACE: Double = js.native
    
    @JSGlobal("BASELINE")
    @js.native
    val BASELINE: typings.p5.mod.BASELINE = js.native
    
    @JSGlobal("BEVEL")
    @js.native
    val BEVEL: typings.p5.mod.BEVEL = js.native
    
    @JSGlobal("BEZIER")
    @js.native
    val BEZIER_ : BEZIER = js.native
    
    @JSGlobal("BLEND")
    @js.native
    val BLEND_ : BLEND = js.native
    
    @JSGlobal("BLUR")
    @js.native
    val BLUR: typings.p5.mod.BLUR = js.native
    
    @JSGlobal("BOLD")
    @js.native
    val BOLD: typings.p5.mod.BOLD = js.native
    
    @JSGlobal("BOLDITALIC")
    @js.native
    val BOLDITALIC: typings.p5.mod.BOLDITALIC = js.native
    
    @JSGlobal("BOTTOM")
    @js.native
    val BOTTOM: typings.p5.mod.BOTTOM = js.native
    
    @JSGlobal("BURN")
    @js.native
    val BURN: typings.p5.mod.BURN = js.native
    
    @JSGlobal("CENTER")
    @js.native
    val CENTER: typings.p5.mod.CENTER = js.native
    
    @JSGlobal("CHAR")
    @js.native
    val CHAR_ : CHAR = js.native
    
    @JSGlobal("CHORD")
    @js.native
    val CHORD: typings.p5.mod.CHORD = js.native
    
    @JSGlobal("CLAMP")
    @js.native
    val CLAMP: typings.p5.mod.CLAMP = js.native
    
    @JSGlobal("CLOSE")
    @js.native
    val CLOSE: typings.p5.mod.CLOSE = js.native
    
    @JSGlobal("CONTROL")
    @js.native
    val CONTROL: Double = js.native
    
    @JSGlobal("CORNER")
    @js.native
    val CORNER: typings.p5.mod.CORNER = js.native
    
    @JSGlobal("CORNERS")
    @js.native
    val CORNERS: typings.p5.mod.CORNERS = js.native
    
    @JSGlobal("CROSS")
    @js.native
    val CROSS: typings.p5.mod.CROSS = js.native
    
    @JSGlobal("CURVE")
    @js.native
    val CURVE_ : CURVE = js.native
    
    @JSGlobal("DARKEST")
    @js.native
    val DARKEST: typings.p5.mod.DARKEST = js.native
    
    /**
      *   Constant to be used with angleMode() function, to
      *   set the mode which p5.js interprets and calculates
      *   angles (either DEGREES or RADIANS).
      */
    @JSGlobal("DEGREES")
    @js.native
    val DEGREES_ : DEGREES = js.native
    
    @JSGlobal("DELETE")
    @js.native
    val DELETE: Double = js.native
    
    @JSGlobal("DIFFERENCE")
    @js.native
    val DIFFERENCE: typings.p5.mod.DIFFERENCE = js.native
    
    @JSGlobal("DILATE")
    @js.native
    val DILATE: typings.p5.mod.DILATE = js.native
    
    @JSGlobal("DODGE")
    @js.native
    val DODGE: typings.p5.mod.DODGE = js.native
    
    @JSGlobal("DOWN_ARROW")
    @js.native
    val DOWN_ARROW: Double = js.native
    
    @JSGlobal("ENTER")
    @js.native
    val ENTER: Double = js.native
    
    @JSGlobal("ERODE")
    @js.native
    val ERODE: typings.p5.mod.ERODE = js.native
    
    @JSGlobal("ESCAPE")
    @js.native
    val ESCAPE: Double = js.native
    
    @JSGlobal("EXCLUSION")
    @js.native
    val EXCLUSION: typings.p5.mod.EXCLUSION = js.native
    
    @JSGlobal("FALLBACK")
    @js.native
    val FALLBACK: typings.p5.mod.FALLBACK = js.native
    
    @JSGlobal("FILL")
    @js.native
    val FILL_ : FILL = js.native
    
    @JSGlobal("GRAY")
    @js.native
    val GRAY: typings.p5.mod.GRAY = js.native
    
    @JSGlobal("GRID")
    @js.native
    val GRID: typings.p5.mod.GRID = js.native
    
    /**
      *   HALF_PI is a mathematical constant with the value
      *   1.57079632679489661923. It is half the ratio of
      *   the circumference of a circle to its diameter. It
      *   is useful in combination with the trigonometric
      *   functions sin() and cos().
      */
    @JSGlobal("HALF_PI")
    @js.native
    val HALF_PI: Double = js.native
    
    @JSGlobal("HAND")
    @js.native
    val HAND: typings.p5.mod.HAND = js.native
    
    @JSGlobal("HARD_LIGHT")
    @js.native
    val HARD_LIGHT: typings.p5.mod.HARD_LIGHT = js.native
    
    /**
      *   HSB (hue, saturation, brightness) is a type of
      *   color model. You can learn more about it at HSB.
      */
    @JSGlobal("HSB")
    @js.native
    val HSB: typings.p5.mod.HSB = js.native
    
    @JSGlobal("HSL")
    @js.native
    val HSL: typings.p5.mod.HSL = js.native
    
    @JSGlobal("IMAGE")
    @js.native
    val IMAGE_ : typings.p5.mod.IMAGE_ = js.native
    
    @JSGlobal("IMMEDIATE")
    @js.native
    val IMMEDIATE: typings.p5.mod.IMMEDIATE = js.native
    
    @JSGlobal("INVERT")
    @js.native
    val INVERT: typings.p5.mod.INVERT = js.native
    
    @JSGlobal("ITALIC")
    @js.native
    val ITALIC: typings.p5.mod.ITALIC = js.native
    
    @JSGlobal("LABEL")
    @js.native
    val LABEL: typings.p5.mod.LABEL = js.native
    
    @JSGlobal("LANDSCAPE")
    @js.native
    val LANDSCAPE: typings.p5.mod.LANDSCAPE = js.native
    
    @JSGlobal("LEFT")
    @js.native
    val LEFT: typings.p5.mod.LEFT = js.native
    
    @JSGlobal("LEFT_ARROW")
    @js.native
    val LEFT_ARROW: Double = js.native
    
    @JSGlobal("LIGHTEST")
    @js.native
    val LIGHTEST: typings.p5.mod.LIGHTEST = js.native
    
    @JSGlobal("LINEAR")
    @js.native
    val LINEAR: typings.p5.mod.LINEAR = js.native
    
    @JSGlobal("LINES")
    @js.native
    val LINES: typings.p5.mod.LINES = js.native
    
    @JSGlobal("LINE_LOOP")
    @js.native
    val LINE_LOOP: typings.p5.mod.LINE_LOOP = js.native
    
    @JSGlobal("LINE_STRIP")
    @js.native
    val LINE_STRIP: typings.p5.mod.LINE_STRIP = js.native
    
    @JSGlobal("MIRROR")
    @js.native
    val MIRROR: typings.p5.mod.MIRROR = js.native
    
    @JSGlobal("MITER")
    @js.native
    val MITER: typings.p5.mod.MITER = js.native
    
    @JSGlobal("MOVE")
    @js.native
    val MOVE: typings.p5.mod.MOVE = js.native
    
    @JSGlobal("MULTIPLY")
    @js.native
    val MULTIPLY: typings.p5.mod.MULTIPLY = js.native
    
    @JSGlobal("NEAREST")
    @js.native
    val NEAREST: typings.p5.mod.NEAREST = js.native
    
    @JSGlobal("NORMAL")
    @js.native
    val NORMAL_ : NORMAL = js.native
    
    @JSGlobal("OPAQUE")
    @js.native
    val OPAQUE: typings.p5.mod.OPAQUE = js.native
    
    @JSGlobal("OPEN")
    @js.native
    val OPEN: typings.p5.mod.OPEN = js.native
    
    @JSGlobal("OPTION")
    @js.native
    val OPTION: Double = js.native
    
    @JSGlobal("OVERLAY")
    @js.native
    val OVERLAY: typings.p5.mod.OVERLAY = js.native
    
    /**
      *   The default, two-dimensional renderer.
      */
    @JSGlobal("P2D")
    @js.native
    val P2D: typings.p5.mod.P2D = js.native
    
    /**
      *   PI is a mathematical constant with the value
      *   3.14159265358979323846. It is the ratio of the
      *   circumference of a circle to its diameter. It is
      *   useful in combination with the trigonometric
      *   functions sin() and cos().
      */
    @JSGlobal("PI")
    @js.native
    val PI: Double = js.native
    
    @JSGlobal("PIE")
    @js.native
    val PIE: typings.p5.mod.PIE = js.native
    
    @JSGlobal("POINTS")
    @js.native
    val POINTS: typings.p5.mod.POINTS = js.native
    
    @JSGlobal("PORTRAIT")
    @js.native
    val PORTRAIT: typings.p5.mod.PORTRAIT = js.native
    
    @JSGlobal("POSTERIZE")
    @js.native
    val POSTERIZE: typings.p5.mod.POSTERIZE = js.native
    
    @JSGlobal("PROJECT")
    @js.native
    val PROJECT: typings.p5.mod.PROJECT = js.native
    
    @JSGlobal("QUADRATIC")
    @js.native
    val QUADRATIC: typings.p5.mod.QUADRATIC = js.native
    
    @JSGlobal("QUADS")
    @js.native
    val QUADS: typings.p5.mod.QUADS = js.native
    
    @JSGlobal("QUAD_STRIP")
    @js.native
    val QUAD_STRIP: typings.p5.mod.QUAD_STRIP = js.native
    
    /**
      *   QUARTER_PI is a mathematical constant with the
      *   value 0.7853982. It is one quarter the ratio of
      *   the circumference of a circle to its diameter. It
      *   is useful in combination with the trigonometric
      *   functions sin() and cos().
      */
    @JSGlobal("QUARTER_PI")
    @js.native
    val QUARTER_PI: Double = js.native
    
    /**
      *   Constant to be used with angleMode() function, to
      *   set the mode which p5.js interprets and calculates
      *   angles (either RADIANS or DEGREES).
      */
    @JSGlobal("RADIANS")
    @js.native
    val RADIANS_ : RADIANS = js.native
    
    @JSGlobal("RADIUS")
    @js.native
    val RADIUS: typings.p5.mod.RADIUS = js.native
    
    @JSGlobal("REMOVE")
    @js.native
    val REMOVE: typings.p5.mod.REMOVE = js.native
    
    @JSGlobal("REPEAT")
    @js.native
    val REPEAT: typings.p5.mod.REPEAT = js.native
    
    @JSGlobal("REPLACE")
    @js.native
    val REPLACE: typings.p5.mod.REPLACE = js.native
    
    @JSGlobal("RETURN")
    @js.native
    val RETURN: Double = js.native
    
    @JSGlobal("RGB")
    @js.native
    val RGB: typings.p5.mod.RGB = js.native
    
    @JSGlobal("RIGHT")
    @js.native
    val RIGHT: typings.p5.mod.RIGHT = js.native
    
    @JSGlobal("RIGHT_ARROW")
    @js.native
    val RIGHT_ARROW: Double = js.native
    
    @JSGlobal("ROUND")
    @js.native
    val ROUND_ : ROUND = js.native
    
    @JSGlobal("SCREEN")
    @js.native
    val SCREEN: typings.p5.mod.SCREEN = js.native
    
    @JSGlobal("SHIFT")
    @js.native
    val SHIFT: Double = js.native
    
    @JSGlobal("SOFT_LIGHT")
    @js.native
    val SOFT_LIGHT: typings.p5.mod.SOFT_LIGHT = js.native
    
    @JSGlobal("SQUARE")
    @js.native
    val SQUARE_ : SQUARE = js.native
    
    @JSGlobal("STROKE")
    @js.native
    val STROKE_ : STROKE = js.native
    
    @JSGlobal("SUBTRACT")
    @js.native
    val SUBTRACT: typings.p5.mod.SUBTRACT = js.native
    
    @JSGlobal("TAB")
    @js.native
    val TAB: Double = js.native
    
    /**
      *   TAU is an alias for TWO_PI, a mathematical
      *   constant with the value 6.28318530717958647693. It
      *   is twice the ratio of the circumference of a
      *   circle to its diameter. It is useful in
      *   combination with the trigonometric functions sin()
      *   and cos().
      */
    @JSGlobal("TAU")
    @js.native
    val TAU: Double = js.native
    
    @JSGlobal("TESS")
    @js.native
    val TESS: typings.p5.mod.TESS = js.native
    
    @JSGlobal("TEXTURE")
    @js.native
    val TEXTURE_ : TEXTURE = js.native
    
    @JSGlobal("TEXT")
    @js.native
    val TEXT_ : TEXT = js.native
    
    @JSGlobal("THRESHOLD")
    @js.native
    val THRESHOLD: typings.p5.mod.THRESHOLD = js.native
    
    @JSGlobal("TOP")
    @js.native
    val TOP: typings.p5.mod.TOP = js.native
    
    @JSGlobal("TRIANGLES")
    @js.native
    val TRIANGLES: typings.p5.mod.TRIANGLES = js.native
    
    @JSGlobal("TRIANGLE_FAN")
    @js.native
    val TRIANGLE_FAN: typings.p5.mod.TRIANGLE_FAN = js.native
    
    @JSGlobal("TRIANGLE_STRIP")
    @js.native
    val TRIANGLE_STRIP: typings.p5.mod.TRIANGLE_STRIP = js.native
    
    /**
      *   TWO_PI is a mathematical constant with the value
      *   6.28318530717958647693. It is twice the ratio of
      *   the circumference of a circle to its diameter. It
      *   is useful in combination with the trigonometric
      *   functions sin() and cos().
      */
    @JSGlobal("TWO_PI")
    @js.native
    val TWO_PI: Double = js.native
    
    @JSGlobal("UP_ARROW")
    @js.native
    val UP_ARROW: Double = js.native
    
    /**
      *   Version of this p5.js.
      */
    @JSGlobal("VERSION")
    @js.native
    val VERSION: typings.p5.mod.VERSION = js.native
    
    @JSGlobal("VIDEO")
    @js.native
    val VIDEO: typings.p5.mod.VIDEO = js.native
    
    @JSGlobal("WAIT")
    @js.native
    val WAIT: typings.p5.mod.WAIT = js.native
    
    /**
      *   One of the two render modes in p5.js: P2D (default
      *   renderer) and WEBGL Enables 3D render by
      *   introducing the third dimension: Z
      */
    @JSGlobal("WEBGL")
    @js.native
    val WEBGL: typings.p5.mod.WEBGL = js.native
    
    @JSGlobal("WORD")
    @js.native
    val WORD: typings.p5.mod.WORD = js.native
    
    /**
      *   Calculates the absolute value (magnitude) of a
      *   number. Maps to Math.abs(). The absolute value of
      *   a number is always positive.
      *   @param n number to compute
      *   @return absolute value of given number
      */
    inline def abs(n: Double): Double = js.Dynamic.global.applyDynamic("abs")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   The system variable accelerationX always contains
      *   the acceleration of the device along the x axis.
      *   Value is represented as meters per second squared.
      */
    @JSGlobal("accelerationX")
    @js.native
    def accelerationX: Double = js.native
    inline def accelerationX_=(x: Double): Unit = js.Dynamic.global.updateDynamic("accelerationX")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable accelerationY always contains
      *   the acceleration of the device along the y axis.
      *   Value is represented as meters per second squared.
      */
    @JSGlobal("accelerationY")
    @js.native
    def accelerationY: Double = js.native
    inline def accelerationY_=(x: Double): Unit = js.Dynamic.global.updateDynamic("accelerationY")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable accelerationZ always contains
      *   the acceleration of the device along the z axis.
      *   Value is represented as meters per second squared.
      */
    @JSGlobal("accelerationZ")
    @js.native
    def accelerationZ: Double = js.native
    inline def accelerationZ_=(x: Double): Unit = js.Dynamic.global.updateDynamic("accelerationZ")(x.asInstanceOf[js.Any])
    
    /**
      *   The inverse of cos(), returns the arc cosine of a
      *   value. This function expects the values in the
      *   range of -1 to 1 and values are returned in the
      *   range 0 to PI (3.1415927) if the angleMode is
      *   RADIANS or 0 to 180 if the angle mode is DEGREES.
      *   @param value the value whose arc cosine is to be
      *   returned
      *   @return the arc cosine of the given value
      */
    inline def acos(value: Double): Double = js.Dynamic.global.applyDynamic("acos")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def alpha(color: String): Double = js.Dynamic.global.applyDynamic("alpha")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def alpha(color: js.Array[Double]): Double = js.Dynamic.global.applyDynamic("alpha")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      *   Extracts the alpha value from a color or pixel
      *   array.
      *   @param color p5.Color object, color components, or
      *   CSS color
      *   @return the alpha value
      */
    inline def alpha(color: Color): Double = js.Dynamic.global.applyDynamic("alpha")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Creates an ambient light with a color. Ambient
      *   light is light that comes from everywhere on the
      *   canvas. It has no particular source.
      *   @param color the ambient light color
      *   @chainable
      */
    inline def ambientLight(color: Color): ^ = js.Dynamic.global.applyDynamic("ambientLight")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Creates an ambient light with a color. Ambient
      *   light is light that comes from everywhere on the
      *   canvas. It has no particular source.
      *   @param gray a gray value
      *   @param [alpha] the alpha value
      *   @chainable
      */
    inline def ambientLight(gray: Double): ^ = js.Dynamic.global.applyDynamic("ambientLight")(gray.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def ambientLight(gray: Double, alpha: Double): ^ = (js.Dynamic.global.applyDynamic("ambientLight")(gray.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Creates an ambient light with a color. Ambient
      *   light is light that comes from everywhere on the
      *   canvas. It has no particular source.
      *   @param v1 red or hue value relative to the current
      *   color range
      *   @param v2 green or saturation value relative to
      *   the current color range
      *   @param v3 blue or brightness value relative to the
      *   current color range
      *   @param [alpha] the alpha value
      *   @chainable
      */
    inline def ambientLight(v1: Double, v2: Double, v3: Double): ^ = (js.Dynamic.global.applyDynamic("ambientLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ambientLight(v1: Double, v2: Double, v3: Double, alpha: Double): ^ = (js.Dynamic.global.applyDynamic("ambientLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Creates an ambient light with a color. Ambient
      *   light is light that comes from everywhere on the
      *   canvas. It has no particular source.
      *   @param value a color string
      *   @chainable
      */
    inline def ambientLight(value: String): ^ = js.Dynamic.global.applyDynamic("ambientLight")(value.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Creates an ambient light with a color. Ambient
      *   light is light that comes from everywhere on the
      *   canvas. It has no particular source.
      *   @param values an array containing the
      *   red,green,blue & and alpha components of the color
      *   @chainable
      */
    inline def ambientLight(values: js.Array[Double]): ^ = js.Dynamic.global.applyDynamic("ambientLight")(values.asInstanceOf[js.Any]).asInstanceOf[^]
    
    inline def ambientMaterial(color: String): ^ = js.Dynamic.global.applyDynamic("ambientMaterial")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Ambient material for geometry with a given color.
      *   Ambient material defines the color the object
      *   reflects under any lighting. For example, if the
      *   ambient material of an object is pure red, but the
      *   ambient lighting only contains green, the object
      *   will not reflect any light. Here's an example
      *   containing all possible materials.
      *   @param color color, color Array, or CSS color
      *   string
      *   @chainable
      */
    inline def ambientMaterial(color: js.Array[Double]): ^ = js.Dynamic.global.applyDynamic("ambientMaterial")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def ambientMaterial(color: Color): ^ = js.Dynamic.global.applyDynamic("ambientMaterial")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Ambient material for geometry with a given color.
      *   Ambient material defines the color the object
      *   reflects under any lighting. For example, if the
      *   ambient material of an object is pure red, but the
      *   ambient lighting only contains green, the object
      *   will not reflect any light. Here's an example
      *   containing all possible materials.
      *   @param v1 gray value, red or hue value (depending
      *   on the current color mode),
      *   @param [v2] green or saturation value
      *   @param [v3] blue or brightness value
      *   @chainable
      */
    inline def ambientMaterial(v1: Double): ^ = js.Dynamic.global.applyDynamic("ambientMaterial")(v1.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def ambientMaterial(v1: Double, v2: Double): ^ = (js.Dynamic.global.applyDynamic("ambientMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ambientMaterial(v1: Double, v2: Double, v3: Double): ^ = (js.Dynamic.global.applyDynamic("ambientMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ambientMaterial(v1: Double, v2: Unit, v3: Double): ^ = (js.Dynamic.global.applyDynamic("ambientMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Sets the current mode of p5 to given mode. Default
      *   mode is RADIANS.
      *   @param mode either RADIANS or DEGREES
      */
    inline def angleMode(mode: ANGLE_MODE): Unit = js.Dynamic.global.applyDynamic("angleMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   Adds a value to the end of an array. Extends the
      *   length of the array by one. Maps to Array.push().
      *   @param array Array to append
      *   @param value to be added to the Array
      *   @return the array that was appended to
      */
    inline def append(array: js.Array[Any], value: Any): js.Array[Any] = (js.Dynamic.global.applyDynamic("append")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def applyMatrix(a: js.Array[Any], b: Double, c: Double, d: Double, e: Double, f: Double): ^ = (js.Dynamic.global.applyDynamic("applyMatrix")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Multiplies the current matrix by the one specified
      *   through the parameters. This is a powerful
      *   operation that can perform the equivalent of
      *   translate, scale, shear and rotate all at once.
      *   You can learn more about transformation matrices
      *   on  Wikipedia. The naming of the arguments here
      *   follows the naming of the  WHATWG specification
      *   and corresponds to a transformation matrix of the
      *   form:
      *   @param a numbers which define the 2×3 matrix to be
      *   multiplied, or an array of numbers
      *   @param b numbers which define the 2×3 matrix to be
      *   multiplied
      *   @param c numbers which define the 2×3 matrix to be
      *   multiplied
      *   @param d numbers which define the 2×3 matrix to be
      *   multiplied
      *   @param e numbers which define the 2×3 matrix to be
      *   multiplied
      *   @param f numbers which define the 2×3 matrix to be
      *   multiplied
      *   @chainable
      */
    inline def applyMatrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): ^ = (js.Dynamic.global.applyDynamic("applyMatrix")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Draw an arc to the screen. If called with only x,
      *   y, w, h, start and stop, the arc will be drawn and
      *   filled as an open pie segment. If a mode parameter
      *   is provided, the arc will be filled like an open
      *   semi-circle (OPEN), a closed semi-circle (CHORD),
      *   or as a closed pie segment (PIE). The origin may
      *   be changed with the ellipseMode() function. The
      *   arc is always drawn clockwise from wherever start
      *   falls to wherever stop falls on the ellipse.
      *   Adding or subtracting TWO_PI to either angle does
      *   not change where they fall. If both start and stop
      *   fall at the same place, a full ellipse will be
      *   drawn. Be aware that the y-axis increases in the
      *   downward direction, therefore angles are measured
      *   clockwise from the positive x-direction ("3
      *   o'clock").
      *   @param x x-coordinate of the arc's ellipse
      *   @param y y-coordinate of the arc's ellipse
      *   @param w width of the arc's ellipse by default
      *   @param h height of the arc's ellipse by default
      *   @param start angle to start the arc, specified in
      *   radians
      *   @param stop angle to stop the arc, specified in
      *   radians
      *   @param [mode] optional parameter to determine the
      *   way of drawing the arc. either CHORD, PIE or OPEN
      *   @param [detail] optional parameter for WebGL mode
      *   only. This is to specify the number of vertices
      *   that makes up the perimeter of the arc. Default
      *   value is 25. Won't draw a stroke for a detail of
      *   more than 50.
      *   @chainable
      */
    inline def arc(x: Double, y: Double, w: Double, h: Double, start: Double, stop: Double): ^ = (js.Dynamic.global.applyDynamic("arc")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def arc(
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      start: Double,
      stop: Double,
      mode: Unit,
      detail: Double
    ): ^ = (js.Dynamic.global.applyDynamic("arc")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def arc(x: Double, y: Double, w: Double, h: Double, start: Double, stop: Double, mode: ARC_MODE): ^ = (js.Dynamic.global.applyDynamic("arc")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def arc(
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      start: Double,
      stop: Double,
      mode: ARC_MODE,
      detail: Double
    ): ^ = (js.Dynamic.global.applyDynamic("arc")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Copies an array (or part of an array) to another
      *   array. The src array is copied to the dst array,
      *   beginning at the position specified by srcPosition
      *   and into the position specified by dstPosition.
      *   The number of elements to copy is determined by
      *   length. Note that copying values overwrites
      *   existing values in the destination array. To
      *   append values instead of overwriting them, use
      *   concat(). The simplified version with only two
      *   arguments, arrayCopy(src, dst), copies an entire
      *   array to another of the same size. It is
      *   equivalent to arrayCopy(src, 0, dst, 0,
      *   src.length).
      *
      *   Using this function is far more efficient for
      *   copying array data than iterating through a for()
      *   loop and copying each element individually.
      *   @param src the source Array
      *   @param dst the destination Array
      *   @param [length] number of Array elements to be
      *   copied
      */
    inline def arrayCopy(src: js.Array[Any], dst: js.Array[Any]): Unit = (js.Dynamic.global.applyDynamic("arrayCopy")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def arrayCopy(src: js.Array[Any], dst: js.Array[Any], length: Double): Unit = (js.Dynamic.global.applyDynamic("arrayCopy")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Copies an array (or part of an array) to another
      *   array. The src array is copied to the dst array,
      *   beginning at the position specified by srcPosition
      *   and into the position specified by dstPosition.
      *   The number of elements to copy is determined by
      *   length. Note that copying values overwrites
      *   existing values in the destination array. To
      *   append values instead of overwriting them, use
      *   concat(). The simplified version with only two
      *   arguments, arrayCopy(src, dst), copies an entire
      *   array to another of the same size. It is
      *   equivalent to arrayCopy(src, 0, dst, 0,
      *   src.length).
      *
      *   Using this function is far more efficient for
      *   copying array data than iterating through a for()
      *   loop and copying each element individually.
      *   @param src the source Array
      *   @param srcPosition starting position in the source
      *   Array
      *   @param dst the destination Array
      *   @param dstPosition starting position in the
      *   destination Array
      *   @param length number of Array elements to be
      *   copied
      */
    inline def arrayCopy(src: js.Array[Any], srcPosition: Double, dst: js.Array[Any], dstPosition: Double, length: Double): Unit = (js.Dynamic.global.applyDynamic("arrayCopy")(src.asInstanceOf[js.Any], srcPosition.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], dstPosition.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   The inverse of sin(), returns the arc sine of a
      *   value. This function expects the values in the
      *   range of -1 to 1 and values are returned in the
      *   range -PI/2 to PI/2 if the angleMode is RADIANS or
      *   -90 to 90 if the angle mode is DEGREES.
      *   @param value the value whose arc sine is to be
      *   returned
      *   @return the arc sine of the given value
      */
    inline def asin(value: Double): Double = js.Dynamic.global.applyDynamic("asin")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   The inverse of tan(), returns the arc tangent of a
      *   value. This function expects the values in the
      *   range of -Infinity to Infinity (exclusive) and
      *   values are returned in the range -PI/2 to PI/2 if
      *   the angleMode is RADIANS or -90 to 90 if the angle
      *   mode is DEGREES.
      *   @param value the value whose arc tangent is to be
      *   returned
      *   @return the arc tangent of the given value
      */
    inline def atan(value: Double): Double = js.Dynamic.global.applyDynamic("atan")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Calculates the angle (in radians) from a specified
      *   point to the coordinate origin as measured from
      *   the positive x-axis. Values are returned as a
      *   float in the range from PI to -PI if the angleMode
      *   is RADIANS or 180 to -180 if the angleMode is
      *   DEGREES. The atan2() function is most often used
      *   for orienting geometry to the position of the
      *   cursor. Note: The y-coordinate of the point is the
      *   first parameter, and the x-coordinate is the
      *   second parameter, due the the structure of
      *   calculating the tangent.
      *   @param y y-coordinate of the point
      *   @param x x-coordinate of the point
      *   @return the arc tangent of the given point
      */
    inline def atan2(y: Double, x: Double): Double = (js.Dynamic.global.applyDynamic("atan2")(y.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   The background() function sets the color used for
      *   the background of the p5.js canvas. The default
      *   background is transparent. This function is
      *   typically used within draw() to clear the display
      *   window at the beginning of each frame, but it can
      *   be used inside setup() to set the background on
      *   the first frame of animation or if the background
      *   need only be set once. The color is either
      *   specified in terms of the RGB, HSB, or HSL color
      *   depending on the current colorMode. (The default
      *   color space is RGB, with each value in the range
      *   from 0 to 255). The alpha range by default is also
      *   0 to 255.
      *
      *
      *
      *   If a single string argument is provided, RGB, RGBA
      *   and Hex CSS color strings and all named color
      *   strings are supported. In this case, an alpha
      *   number value as a second argument is not
      *   supported, the RGBA form should be used.
      *
      *   A p5.Color object can also be provided to set the
      *   background color.
      *
      *   A p5.Image can also be provided to set the
      *   background image.
      *   @param colorstring color string, possible formats
      *   include: integer rgb() or rgba(), percentage rgb()
      *   or rgba(), 3-digit hex, 6-digit hex
      *   @param [a] opacity of the background relative to
      *   current color range (default is 0-255)
      *   @chainable
      */
    inline def background(colorstring: String): ^ = js.Dynamic.global.applyDynamic("background")(colorstring.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def background(colorstring: String, a: Double): ^ = (js.Dynamic.global.applyDynamic("background")(colorstring.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   The background() function sets the color used for
      *   the background of the p5.js canvas. The default
      *   background is transparent. This function is
      *   typically used within draw() to clear the display
      *   window at the beginning of each frame, but it can
      *   be used inside setup() to set the background on
      *   the first frame of animation or if the background
      *   need only be set once. The color is either
      *   specified in terms of the RGB, HSB, or HSL color
      *   depending on the current colorMode. (The default
      *   color space is RGB, with each value in the range
      *   from 0 to 255). The alpha range by default is also
      *   0 to 255.
      *
      *
      *
      *   If a single string argument is provided, RGB, RGBA
      *   and Hex CSS color strings and all named color
      *   strings are supported. In this case, an alpha
      *   number value as a second argument is not
      *   supported, the RGBA form should be used.
      *
      *   A p5.Color object can also be provided to set the
      *   background color.
      *
      *   A p5.Image can also be provided to set the
      *   background image.
      *   @param color any value created by the color()
      *   function
      *   @chainable
      */
    inline def background(color: Color): ^ = js.Dynamic.global.applyDynamic("background")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   The background() function sets the color used for
      *   the background of the p5.js canvas. The default
      *   background is transparent. This function is
      *   typically used within draw() to clear the display
      *   window at the beginning of each frame, but it can
      *   be used inside setup() to set the background on
      *   the first frame of animation or if the background
      *   need only be set once. The color is either
      *   specified in terms of the RGB, HSB, or HSL color
      *   depending on the current colorMode. (The default
      *   color space is RGB, with each value in the range
      *   from 0 to 255). The alpha range by default is also
      *   0 to 255.
      *
      *
      *
      *   If a single string argument is provided, RGB, RGBA
      *   and Hex CSS color strings and all named color
      *   strings are supported. In this case, an alpha
      *   number value as a second argument is not
      *   supported, the RGBA form should be used.
      *
      *   A p5.Color object can also be provided to set the
      *   background color.
      *
      *   A p5.Image can also be provided to set the
      *   background image.
      *   @param gray specifies a value between white and
      *   black
      *   @param [a] opacity of the background relative to
      *   current color range (default is 0-255)
      *   @chainable
      */
    inline def background(gray: Double): ^ = js.Dynamic.global.applyDynamic("background")(gray.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def background(gray: Double, a: Double): ^ = (js.Dynamic.global.applyDynamic("background")(gray.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   The background() function sets the color used for
      *   the background of the p5.js canvas. The default
      *   background is transparent. This function is
      *   typically used within draw() to clear the display
      *   window at the beginning of each frame, but it can
      *   be used inside setup() to set the background on
      *   the first frame of animation or if the background
      *   need only be set once. The color is either
      *   specified in terms of the RGB, HSB, or HSL color
      *   depending on the current colorMode. (The default
      *   color space is RGB, with each value in the range
      *   from 0 to 255). The alpha range by default is also
      *   0 to 255.
      *
      *
      *
      *   If a single string argument is provided, RGB, RGBA
      *   and Hex CSS color strings and all named color
      *   strings are supported. In this case, an alpha
      *   number value as a second argument is not
      *   supported, the RGBA form should be used.
      *
      *   A p5.Color object can also be provided to set the
      *   background color.
      *
      *   A p5.Image can also be provided to set the
      *   background image.
      *   @param image image created with loadImage() or
      *   createImage(), to set as background (must be same
      *   size as the sketch window)
      *   @param [a] opacity of the background relative to
      *   current color range (default is 0-255)
      *   @chainable
      */
    inline def background(image: Image): ^ = js.Dynamic.global.applyDynamic("background")(image.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def background(image: Image, a: Double): ^ = (js.Dynamic.global.applyDynamic("background")(image.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   The background() function sets the color used for
      *   the background of the p5.js canvas. The default
      *   background is transparent. This function is
      *   typically used within draw() to clear the display
      *   window at the beginning of each frame, but it can
      *   be used inside setup() to set the background on
      *   the first frame of animation or if the background
      *   need only be set once. The color is either
      *   specified in terms of the RGB, HSB, or HSL color
      *   depending on the current colorMode. (The default
      *   color space is RGB, with each value in the range
      *   from 0 to 255). The alpha range by default is also
      *   0 to 255.
      *
      *
      *
      *   If a single string argument is provided, RGB, RGBA
      *   and Hex CSS color strings and all named color
      *   strings are supported. In this case, an alpha
      *   number value as a second argument is not
      *   supported, the RGBA form should be used.
      *
      *   A p5.Color object can also be provided to set the
      *   background color.
      *
      *   A p5.Image can also be provided to set the
      *   background image.
      *   @param v1 red or hue value (depending on the
      *   current color mode)
      *   @param v2 green or saturation value (depending on
      *   the current color mode)
      *   @param v3 blue or brightness value (depending on
      *   the current color mode)
      *   @param [a] opacity of the background relative to
      *   current color range (default is 0-255)
      *   @chainable
      */
    inline def background(v1: Double, v2: Double, v3: Double): ^ = (js.Dynamic.global.applyDynamic("background")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def background(v1: Double, v2: Double, v3: Double, a: Double): ^ = (js.Dynamic.global.applyDynamic("background")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   The background() function sets the color used for
      *   the background of the p5.js canvas. The default
      *   background is transparent. This function is
      *   typically used within draw() to clear the display
      *   window at the beginning of each frame, but it can
      *   be used inside setup() to set the background on
      *   the first frame of animation or if the background
      *   need only be set once. The color is either
      *   specified in terms of the RGB, HSB, or HSL color
      *   depending on the current colorMode. (The default
      *   color space is RGB, with each value in the range
      *   from 0 to 255). The alpha range by default is also
      *   0 to 255.
      *
      *
      *
      *   If a single string argument is provided, RGB, RGBA
      *   and Hex CSS color strings and all named color
      *   strings are supported. In this case, an alpha
      *   number value as a second argument is not
      *   supported, the RGBA form should be used.
      *
      *   A p5.Color object can also be provided to set the
      *   background color.
      *
      *   A p5.Image can also be provided to set the
      *   background image.
      *   @param values an array containing the red, green,
      *   blue and alpha components of the color
      *   @chainable
      */
    inline def background(values: js.Array[Double]): ^ = js.Dynamic.global.applyDynamic("background")(values.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Use the beginContour() and endContour() functions
      *   to create negative shapes within shapes such as
      *   the center of the letter 'O'. beginContour()
      *   begins recording vertices for the shape and
      *   endContour() stops recording. The vertices that
      *   define a negative shape must "wind" in the
      *   opposite direction from the exterior shape. First
      *   draw vertices for the exterior clockwise order,
      *   then for internal shapes, draw vertices shape in
      *   counter-clockwise. These functions can only be
      *   used within a beginShape()/endShape() pair and
      *   transformations such as translate(), rotate(), and
      *   scale() do not work within a
      *   beginContour()/endContour() pair. It is also not
      *   possible to use other shapes, such as ellipse() or
      *   rect() within.
      *   @chainable
      */
    inline def beginContour(): ^ = js.Dynamic.global.applyDynamic("beginContour")().asInstanceOf[^]
    
    /**
      *   Using the beginShape() and endShape() functions
      *   allow creating more complex forms. beginShape()
      *   begins recording vertices for a shape and
      *   endShape() stops recording. The value of the kind
      *   parameter tells it which types of shapes to create
      *   from the provided vertices. With no mode
      *   specified, the shape can be any irregular polygon.
      *   The parameters available for beginShape() are:
      *
      *   POINTS Draw a series of points
      *
      *   LINES Draw a series of unconnected line segments
      *   (individual lines)
      *
      *   TRIANGLES Draw a series of separate triangles
      *
      *   TRIANGLE_FAN Draw a series of connected triangles
      *   sharing the first vertex in a fan-like fashion
      *
      *   TRIANGLE_STRIP Draw a series of connected
      *   triangles in strip fashion
      *
      *   QUADS Draw a series of separate quad
      *
      *   QUAD_STRIP Draw quad strip using adjacent edges to
      *   form the next quad
      *
      *   TESS (WebGl only) Handle irregular polygon for
      *   filling curve by explicit tessellation
      *
      *   After calling the beginShape() function, a series
      *   of vertex() commands must follow. To stop drawing
      *   the shape, call endShape(). Each shape will be
      *   outlined with the current stroke color and filled
      *   with the fill color.
      *
      *   Transformations such as translate(), rotate(), and
      *   scale() do not work within beginShape(). It is
      *   also not possible to use other shapes, such as
      *   ellipse() or rect() within beginShape().
      *   @param [kind] either POINTS, LINES, TRIANGLES,
      *   TRIANGLE_FAN TRIANGLE_STRIP, QUADS, QUAD_STRIP or
      *   TESS
      *   @chainable
      */
    inline def beginShape(): ^ = js.Dynamic.global.applyDynamic("beginShape")().asInstanceOf[^]
    inline def beginShape(kind: BEGIN_KIND): ^ = js.Dynamic.global.applyDynamic("beginShape")(kind.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Draws a cubic Bezier curve on the screen. These
      *   curves are defined by a series of anchor and
      *   control points. The first two parameters specify
      *   the first anchor point and the last two parameters
      *   specify the other anchor point, which become the
      *   first and last points on the curve. The middle
      *   parameters specify the two control points which
      *   define the shape of the curve. Approximately
      *   speaking, control points "pull" the curve towards
      *   them. Bezier curves were developed by French
      *   automotive engineer Pierre Bezier, and are
      *   commonly used in computer graphics to define
      *   gently sloping curves. See also curve().
      *   @param x1 x-coordinate for the first anchor point
      *   @param y1 y-coordinate for the first anchor point
      *   @param x2 x-coordinate for the first control point
      *   @param y2 y-coordinate for the first control point
      *   @param x3 x-coordinate for the second control
      *   point
      *   @param y3 y-coordinate for the second control
      *   point
      *   @param x4 x-coordinate for the second anchor point
      *   @param y4 y-coordinate for the second anchor point
      *   @chainable
      */
    inline def bezier(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): ^ = (js.Dynamic.global.applyDynamic("bezier")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Draws a cubic Bezier curve on the screen. These
      *   curves are defined by a series of anchor and
      *   control points. The first two parameters specify
      *   the first anchor point and the last two parameters
      *   specify the other anchor point, which become the
      *   first and last points on the curve. The middle
      *   parameters specify the two control points which
      *   define the shape of the curve. Approximately
      *   speaking, control points "pull" the curve towards
      *   them. Bezier curves were developed by French
      *   automotive engineer Pierre Bezier, and are
      *   commonly used in computer graphics to define
      *   gently sloping curves. See also curve().
      *   @param x1 x-coordinate for the first anchor point
      *   @param y1 y-coordinate for the first anchor point
      *   @param z1 z-coordinate for the first anchor point
      *   @param x2 x-coordinate for the first control point
      *   @param y2 y-coordinate for the first control point
      *   @param z2 z-coordinate for the first control point
      *   @param x3 x-coordinate for the second control
      *   point
      *   @param y3 y-coordinate for the second control
      *   point
      *   @param z3 z-coordinate for the second control
      *   point
      *   @param x4 x-coordinate for the second anchor point
      *   @param y4 y-coordinate for the second anchor point
      *   @param z4 z-coordinate for the second anchor point
      *   @chainable
      */
    inline def bezier(
      x1: Double,
      y1: Double,
      z1: Double,
      x2: Double,
      y2: Double,
      z2: Double,
      x3: Double,
      y3: Double,
      z3: Double,
      x4: Double,
      y4: Double,
      z4: Double
    ): ^ = (js.Dynamic.global.applyDynamic("bezier")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], z3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], z4.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Sets the resolution at which Bezier's curve is
      *   displayed. The default value is 20. Note, This
      *   function is only useful when using the WEBGL
      *   renderer as the default canvas renderer does not
      *   use this information.
      *   @param detail resolution of the curves
      *   @chainable
      */
    inline def bezierDetail(detail: Double): ^ = js.Dynamic.global.applyDynamic("bezierDetail")(detail.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Given the x or y co-ordinate values of control and
      *   anchor points of a bezier curve, it evaluates the
      *   x or y coordinate of the bezier at position t. The
      *   parameters a and d are the x or y coordinates of
      *   first and last points on the curve while b and c
      *   are of the control points.The final parameter t is
      *   the position of the resultant point which is given
      *   between 0 and 1. This can be done once with the x
      *   coordinates and a second time with the y
      *   coordinates to get the location of a bezier curve
      *   at t.
      *   @param a coordinate of first point on the curve
      *   @param b coordinate of first control point
      *   @param c coordinate of second control point
      *   @param d coordinate of second point on the curve
      *   @param t value between 0 and 1
      *   @return the value of the Bezier at position t
      */
    inline def bezierPoint(a: Double, b: Double, c: Double, d: Double, t: Double): Double = (js.Dynamic.global.applyDynamic("bezierPoint")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   Evaluates the tangent to the Bezier at position t
      *   for points a, b, c, d. The parameters a and d are
      *   the first and last points on the curve, and b and
      *   c are the control points. The final parameter t
      *   varies between 0 and 1.
      *   @param a coordinate of first point on the curve
      *   @param b coordinate of first control point
      *   @param c coordinate of second control point
      *   @param d coordinate of second point on the curve
      *   @param t value between 0 and 1
      *   @return the tangent at position t
      */
    inline def bezierTangent(a: Double, b: Double, c: Double, d: Double, t: Double): Double = (js.Dynamic.global.applyDynamic("bezierTangent")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   Specifies vertex coordinates for Bezier curves.
      *   Each call to bezierVertex() defines the position
      *   of two control points and one anchor point of a
      *   Bezier curve, adding a new segment to a line or
      *   shape. For WebGL mode bezierVertex() can be used
      *   in 2D as well as 3D mode. 2D mode expects 6
      *   parameters, while 3D mode expects 9 parameters
      *   (including z coordinates). The first time
      *   bezierVertex() is used within a beginShape() call,
      *   it must be prefaced with a call to vertex() to set
      *   the first anchor point. This function must be used
      *   between beginShape() and endShape() and only when
      *   there is no MODE or POINTS parameter specified to
      *   beginShape().
      *   @param x2 x-coordinate for the first control point
      *   @param y2 y-coordinate for the first control point
      *   @param x3 x-coordinate for the second control
      *   point
      *   @param y3 y-coordinate for the second control
      *   point
      *   @param x4 x-coordinate for the anchor point
      *   @param y4 y-coordinate for the anchor point
      *   @chainable
      */
    inline def bezierVertex(x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): ^ = (js.Dynamic.global.applyDynamic("bezierVertex")(x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Specifies vertex coordinates for Bezier curves.
      *   Each call to bezierVertex() defines the position
      *   of two control points and one anchor point of a
      *   Bezier curve, adding a new segment to a line or
      *   shape. For WebGL mode bezierVertex() can be used
      *   in 2D as well as 3D mode. 2D mode expects 6
      *   parameters, while 3D mode expects 9 parameters
      *   (including z coordinates). The first time
      *   bezierVertex() is used within a beginShape() call,
      *   it must be prefaced with a call to vertex() to set
      *   the first anchor point. This function must be used
      *   between beginShape() and endShape() and only when
      *   there is no MODE or POINTS parameter specified to
      *   beginShape().
      *   @param x2 x-coordinate for the first control point
      *   @param y2 y-coordinate for the first control point
      *   @param z2 z-coordinate for the first control point
      *   (for WebGL mode)
      *   @param x3 x-coordinate for the second control
      *   point
      *   @param y3 y-coordinate for the second control
      *   point
      *   @param z3 z-coordinate for the second control
      *   point (for WebGL mode)
      *   @param x4 x-coordinate for the anchor point
      *   @param y4 y-coordinate for the anchor point
      *   @param z4 z-coordinate for the anchor point (for
      *   WebGL mode)
      *   @chainable
      */
    inline def bezierVertex(
      x2: Double,
      y2: Double,
      z2: Double,
      x3: Double,
      y3: Double,
      z3: Double,
      x4: Double,
      y4: Double,
      z4: Double
    ): ^ = (js.Dynamic.global.applyDynamic("bezierVertex")(x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], z3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], z4.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Copies a region of pixels from one image to
      *   another, using a specified blend mode to do the
      *   operation.
      *   @param srcImage source image
      *   @param sx X coordinate of the source's upper left
      *   corner
      *   @param sy Y coordinate of the source's upper left
      *   corner
      *   @param sw source image width
      *   @param sh source image height
      *   @param dx X coordinate of the destination's upper
      *   left corner
      *   @param dy Y coordinate of the destination's upper
      *   left corner
      *   @param dw destination image width
      *   @param dh destination image height
      *   @param blendMode the blend mode. either BLEND,
      *   DARKEST, LIGHTEST, DIFFERENCE, MULTIPLY,
      *   EXCLUSION, SCREEN, REPLACE, OVERLAY, HARD_LIGHT,
      *   SOFT_LIGHT, DODGE, BURN, ADD or NORMAL.
      */
    inline def blend(
      srcImage: Image,
      sx: Double,
      sy: Double,
      sw: Double,
      sh: Double,
      dx: Double,
      dy: Double,
      dw: Double,
      dh: Double,
      blendMode: BLEND_MODE
    ): Unit = (js.Dynamic.global.applyDynamic("blend")(srcImage.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dw.asInstanceOf[js.Any], dh.asInstanceOf[js.Any], blendMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Copies a region of pixels from one image to
      *   another, using a specified blend mode to do the
      *   operation.
      *   @param sx X coordinate of the source's upper left
      *   corner
      *   @param sy Y coordinate of the source's upper left
      *   corner
      *   @param sw source image width
      *   @param sh source image height
      *   @param dx X coordinate of the destination's upper
      *   left corner
      *   @param dy Y coordinate of the destination's upper
      *   left corner
      *   @param dw destination image width
      *   @param dh destination image height
      *   @param blendMode the blend mode. either BLEND,
      *   DARKEST, LIGHTEST, DIFFERENCE, MULTIPLY,
      *   EXCLUSION, SCREEN, REPLACE, OVERLAY, HARD_LIGHT,
      *   SOFT_LIGHT, DODGE, BURN, ADD or NORMAL.
      */
    inline def blend(
      sx: Double,
      sy: Double,
      sw: Double,
      sh: Double,
      dx: Double,
      dy: Double,
      dw: Double,
      dh: Double,
      blendMode: UNKNOWN_P5_CONSTANT
    ): Unit = (js.Dynamic.global.applyDynamic("blend")(sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dw.asInstanceOf[js.Any], dh.asInstanceOf[js.Any], blendMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Blends the pixels in the display window according
      *   to the defined mode. There is a choice of the
      *   following modes to blend the source pixels (A)
      *   with the ones of pixels already in the display
      *   window (B): - BLEND - linear interpolation of
      *   colours: C = A*factor + B. This is the default
      *   blending mode.
      *   - ADD - sum of A and B
      *   - DARKEST - only the darkest colour succeeds: C =
      *   min(A*factor, B).
      *   - LIGHTEST - only the lightest colour succeeds: C
      *   = max(A*factor, B).
      *   - DIFFERENCE - subtract colors from underlying
      *   image.
      *   - EXCLUSION - similar to DIFFERENCE, but less
      *   extreme.
      *   - MULTIPLY - multiply the colors, result will
      *   always be darker.
      *   - SCREEN - opposite multiply, uses inverse values
      *   of the colors.
      *   - REPLACE - the pixels entirely replace the others
      *   and don't utilize alpha (transparency) values.
      *   - REMOVE - removes pixels from B with the alpha
      *   strength of A.
      *   - OVERLAY - mix of MULTIPLY and SCREEN .
      *   Multiplies dark values, and screens light values.
      *   (2D)
      *   - HARD_LIGHT - SCREEN when greater than 50% gray,
      *   MULTIPLY when lower. (2D)
      *   - SOFT_LIGHT - mix of DARKEST and LIGHTEST. Works
      *   like OVERLAY, but not as harsh. (2D)
      *   - DODGE - lightens light tones and increases
      *   contrast, ignores darks. (2D)
      *   - BURN - darker areas are applied, increasing
      *   contrast, ignores lights. (2D)
      *   - SUBTRACT - remainder of A and B (3D)
      *
      *   (2D) indicates that this blend mode only works in
      *   the 2D renderer.
      *
      *   (3D) indicates that this blend mode only works in
      *   the WEBGL renderer.
      *   @param mode blend mode to set for canvas. either
      *   BLEND, DARKEST, LIGHTEST, DIFFERENCE, MULTIPLY,
      *   EXCLUSION, SCREEN, REPLACE, OVERLAY, HARD_LIGHT,
      *   SOFT_LIGHT, DODGE, BURN, ADD, REMOVE or SUBTRACT
      */
    inline def blendMode(mode: BLEND_MODE): Unit = js.Dynamic.global.applyDynamic("blendMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def blue(color: String): Double = js.Dynamic.global.applyDynamic("blue")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def blue(color: js.Array[Double]): Double = js.Dynamic.global.applyDynamic("blue")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      *   Extracts the blue value from a color or pixel
      *   array.
      *   @param color p5.Color object, color components, or
      *   CSS color
      *   @return the blue value
      */
    inline def blue(color: Color): Double = js.Dynamic.global.applyDynamic("blue")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Converts a number or string to its boolean
      *   representation. For a number, any non-zero value
      *   (positive or negative) evaluates to true, while
      *   zero evaluates to false. For a string, the value
      *   "true" evaluates to true, while any other value
      *   evaluates to false. When an array of number or
      *   string values is passed in, then a array of
      *   booleans of the same length is returned.
      *   @param n value to parse
      *   @return boolean representation of value
      */
    inline def boolean(n: String): Boolean = js.Dynamic.global.applyDynamic("boolean")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def boolean(n: js.Array[Any]): Boolean = js.Dynamic.global.applyDynamic("boolean")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def boolean(n: Boolean): Boolean = js.Dynamic.global.applyDynamic("boolean")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def boolean(n: Double): Boolean = js.Dynamic.global.applyDynamic("boolean")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      *   Draw a box with given width, height and depth
      *   @param [width] width of the box
      *   @param [Height] height of the box
      *   @param [depth] depth of the box
      *   @param [detailX] Optional number of triangle
      *   subdivisions in x-dimension
      *   @param [detailY] Optional number of triangle
      *   subdivisions in y-dimension
      *   @chainable
      */
    inline def box(): ^ = js.Dynamic.global.applyDynamic("box")().asInstanceOf[^]
    inline def box(width: Double): ^ = js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def box(width: Double, Height: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Double, depth: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Double, depth: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Double, depth: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Double, depth: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Double, depth: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Double, depth: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Double, depth: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Unit, depth: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Unit, depth: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Unit, depth: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Unit, depth: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Unit, depth: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Unit, depth: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Double, Height: Unit, depth: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Double, depth: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Double, depth: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Double, depth: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Double, depth: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Double, depth: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Double, depth: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Double, depth: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Unit, depth: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Unit, depth: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Unit, depth: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Unit, depth: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Unit, depth: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Unit, depth: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def box(width: Unit, Height: Unit, depth: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("box")(width.asInstanceOf[js.Any], Height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    
    inline def brightness(color: String): Double = js.Dynamic.global.applyDynamic("brightness")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def brightness(color: js.Array[Double]): Double = js.Dynamic.global.applyDynamic("brightness")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      *   Extracts the HSB brightness value from a color or
      *   pixel array.
      *   @param color p5.Color object, color components, or
      *   CSS color
      *   @return the brightness value
      */
    inline def brightness(color: Color): Double = js.Dynamic.global.applyDynamic("brightness")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Converts a number, string representation of a
      *   number, or boolean to its byte representation. A
      *   byte can be only a whole number between -128 and
      *   127, so when a value outside of this range is
      *   converted, it wraps around to the corresponding
      *   byte representation. When an array of number,
      *   string or boolean values is passed in, then an
      *   array of bytes the same length is returned.
      *   @param n value to parse
      *   @return byte representation of value
      */
    inline def byte(n: String): Double = js.Dynamic.global.applyDynamic("byte")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def byte(n: Boolean): Double = js.Dynamic.global.applyDynamic("byte")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def byte(n: Double): Double = js.Dynamic.global.applyDynamic("byte")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      *   Converts a number, string representation of a
      *   number, or boolean to its byte representation. A
      *   byte can be only a whole number between -128 and
      *   127, so when a value outside of this range is
      *   converted, it wraps around to the corresponding
      *   byte representation. When an array of number,
      *   string or boolean values is passed in, then an
      *   array of bytes the same length is returned.
      *   @param ns values to parse
      *   @return array of byte representation of values
      */
    inline def byte(ns: js.Array[Any]): js.Array[Double] = js.Dynamic.global.applyDynamic("byte")(ns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    /**
      *   Sets the position of the current camera in a 3D
      *   sketch. Parameters for this function define the
      *   camera's position, the center of the sketch (where
      *   the camera is pointing), and an up direction (the
      *   orientation of the camera). This function
      *   simulates the movements of the camera, allowing
      *   objects to be viewed from various angles.
      *   Remember, it does not move the objects themselves
      *   but the camera instead. For example when the
      *   centerX value is positive, and the camera is
      *   rotating to the right side of the sketch, the
      *   object will seem like it's moving to the left.
      *
      *   See this example to view the position of your
      *   camera.
      *
      *   If no parameters are given, the following default
      *   is used: camera(0, 0, (height/2) / tan(PI/6), 0,
      *   0, 0, 0, 1, 0)
      *   @param [x] camera position value on x axis
      *   @param [y] camera position value on y axis
      *   @param [z] camera position value on z axis
      *   @param [centerX] x coordinate representing center
      *   of the sketch
      *   @param [centerY] y coordinate representing center
      *   of the sketch
      *   @param [centerZ] z coordinate representing center
      *   of the sketch
      *   @param [upX] x component of direction 'up' from
      *   camera
      *   @param [upY] y component of direction 'up' from
      *   camera
      *   @param [upZ] z component of direction 'up' from
      *   camera
      *   @chainable
      */
    inline def camera(
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      z: js.UndefOr[Double],
      centerX: js.UndefOr[Double],
      centerY: js.UndefOr[Double],
      centerZ: js.UndefOr[Double],
      upX: js.UndefOr[Double],
      upY: js.UndefOr[Double],
      upZ: js.UndefOr[Double]
    ): ^ = (js.Dynamic.global.applyDynamic("camera")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], centerZ.asInstanceOf[js.Any], upX.asInstanceOf[js.Any], upY.asInstanceOf[js.Any], upZ.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Calculates the closest int value that is greater
      *   than or equal to the value of the parameter. Maps
      *   to Math.ceil(). For example, ceil(9.03) returns
      *   the value 10.
      *   @param n number to round up
      *   @return rounded up number
      */
    inline def ceil(n: Double): Double = js.Dynamic.global.applyDynamic("ceil")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   The .changed() function is called when the value
      *   of an element changes. This can be used to attach
      *   an element specific event listener.
      *   @param fxn function to be fired when the value of
      *   an element changes. if false is passed instead,
      *   the previously firing function will no longer
      *   fire.
      *   @chainable
      */
    inline def changed(fxn: js.Function1[/* repeated */ Any, Any]): ^ = js.Dynamic.global.applyDynamic("changed")(fxn.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def changed(fxn: Boolean): ^ = js.Dynamic.global.applyDynamic("changed")(fxn.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Converts a number or string to its corresponding
      *   single-character string representation. If a
      *   string parameter is provided, it is first parsed
      *   as an integer and then translated into a
      *   single-character string. When an array of number
      *   or string values is passed in, then an array of
      *   single-character strings of the same length is
      *   returned.
      *   @param n value to parse
      *   @return string representation of value
      */
    inline def char(n: String): String = js.Dynamic.global.applyDynamic("char")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def char(n: Double): String = js.Dynamic.global.applyDynamic("char")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
      *   Converts a number or string to its corresponding
      *   single-character string representation. If a
      *   string parameter is provided, it is first parsed
      *   as an integer and then translated into a
      *   single-character string. When an array of number
      *   or string values is passed in, then an array of
      *   single-character strings of the same length is
      *   returned.
      *   @param ns values to parse
      *   @return array of string representation of values
      */
    inline def char(ns: js.Array[Any]): js.Array[String] = js.Dynamic.global.applyDynamic("char")(ns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      *   Draws a circle to the screen. A circle is a simple
      *   closed shape. It is the set of all points in a
      *   plane that are at a given distance from a given
      *   point, the centre. This function is a special case
      *   of the ellipse() function, where the width and
      *   height of the ellipse are the same. Height and
      *   width of the ellipse correspond to the diameter of
      *   the circle. By default, the first two parameters
      *   set the location of the centre of the circle, the
      *   third sets the diameter of the circle.
      *   @param x x-coordinate of the centre of the circle.
      *   @param y y-coordinate of the centre of the circle.
      *   @param d diameter of the circle.
      *   @chainable
      */
    inline def circle(x: Double, y: Double, d: Double): ^ = (js.Dynamic.global.applyDynamic("circle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Clears the pixels within a buffer. This function
      *   only clears the canvas. It will not clear objects
      *   created by createX() methods such as createVideo()
      *   or createDiv(). Unlike the main graphics context,
      *   pixels in additional graphics areas created with
      *   createGraphics() can be entirely or partially
      *   transparent. This function clears everything to
      *   make all of the pixels 100% transparent. Note: In
      *   WebGL mode, this function can be passed normalized
      *   RGBA color values in order to clear the screen to
      *   a specific color. In addition to color, it will
      *   also clear the depth buffer. If you are not using
      *   the webGL renderer these color values will have no
      *   effect.
      *   @param r normalized red val.
      *   @param g normalized green val.
      *   @param b normalized blue val.
      *   @param a normalized alpha val.
      *   @chainable
      */
    inline def clear(r: Double, g: Double, b: Double, a: Double): ^ = (js.Dynamic.global.applyDynamic("clear")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Clears all local storage items set with
      *   storeItem() for the current domain.
      */
    inline def clearStorage(): Unit = js.Dynamic.global.applyDynamic("clearStorage")().asInstanceOf[Unit]
    
    /**
      *   Creates colors for storing in variables of the
      *   color datatype. The parameters are interpreted as
      *   RGB or HSB values depending on the current
      *   colorMode(). The default mode is RGB values from 0
      *   to 255 and, therefore, the function call
      *   color(255, 204, 0) will return a bright yellow
      *   color. Note that if only one value is provided to
      *   color(), it will be interpreted as a grayscale
      *   value. Add a second value, and it will be used for
      *   alpha transparency. When three values are
      *   specified, they are interpreted as either RGB or
      *   HSB values. Adding a fourth value applies alpha
      *   transparency.
      *
      *   If a single string argument is provided, RGB, RGBA
      *   and Hex CSS color strings and all named color
      *   strings are supported. In this case, an alpha
      *   number value as a second argument is not
      *   supported, the RGBA form should be used.
      */
    inline def color(color: Color): Color = js.Dynamic.global.applyDynamic("color")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
    /**
      *   Creates colors for storing in variables of the
      *   color datatype. The parameters are interpreted as
      *   RGB or HSB values depending on the current
      *   colorMode(). The default mode is RGB values from 0
      *   to 255 and, therefore, the function call
      *   color(255, 204, 0) will return a bright yellow
      *   color. Note that if only one value is provided to
      *   color(), it will be interpreted as a grayscale
      *   value. Add a second value, and it will be used for
      *   alpha transparency. When three values are
      *   specified, they are interpreted as either RGB or
      *   HSB values. Adding a fourth value applies alpha
      *   transparency.
      *
      *   If a single string argument is provided, RGB, RGBA
      *   and Hex CSS color strings and all named color
      *   strings are supported. In this case, an alpha
      *   number value as a second argument is not
      *   supported, the RGBA form should be used.
      *   @param gray number specifying value between white
      *   and black.
      *   @param [alpha] alpha value relative to current
      *   color range (default is 0-255)
      *   @return resulting color
      */
    inline def color(gray: Double): Color = js.Dynamic.global.applyDynamic("color")(gray.asInstanceOf[js.Any]).asInstanceOf[Color]
    inline def color(gray: Double, alpha: Double): Color = (js.Dynamic.global.applyDynamic("color")(gray.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
    /**
      *   Creates colors for storing in variables of the
      *   color datatype. The parameters are interpreted as
      *   RGB or HSB values depending on the current
      *   colorMode(). The default mode is RGB values from 0
      *   to 255 and, therefore, the function call
      *   color(255, 204, 0) will return a bright yellow
      *   color. Note that if only one value is provided to
      *   color(), it will be interpreted as a grayscale
      *   value. Add a second value, and it will be used for
      *   alpha transparency. When three values are
      *   specified, they are interpreted as either RGB or
      *   HSB values. Adding a fourth value applies alpha
      *   transparency.
      *
      *   If a single string argument is provided, RGB, RGBA
      *   and Hex CSS color strings and all named color
      *   strings are supported. In this case, an alpha
      *   number value as a second argument is not
      *   supported, the RGBA form should be used.
      *   @param v1 red or hue value relative to the current
      *   color range
      *   @param v2 green or saturation value relative to
      *   the current color range
      *   @param v3 blue or brightness value relative to the
      *   current color range
      *   @param [alpha] alpha value relative to current
      *   color range (default is 0-255)
      */
    inline def color(v1: Double, v2: Double, v3: Double): Color = (js.Dynamic.global.applyDynamic("color")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Color]
    inline def color(v1: Double, v2: Double, v3: Double, alpha: Double): Color = (js.Dynamic.global.applyDynamic("color")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
    /**
      *   Creates colors for storing in variables of the
      *   color datatype. The parameters are interpreted as
      *   RGB or HSB values depending on the current
      *   colorMode(). The default mode is RGB values from 0
      *   to 255 and, therefore, the function call
      *   color(255, 204, 0) will return a bright yellow
      *   color. Note that if only one value is provided to
      *   color(), it will be interpreted as a grayscale
      *   value. Add a second value, and it will be used for
      *   alpha transparency. When three values are
      *   specified, they are interpreted as either RGB or
      *   HSB values. Adding a fourth value applies alpha
      *   transparency.
      *
      *   If a single string argument is provided, RGB, RGBA
      *   and Hex CSS color strings and all named color
      *   strings are supported. In this case, an alpha
      *   number value as a second argument is not
      *   supported, the RGBA form should be used.
      *   @param value a color string
      */
    inline def color(value: String): Color = js.Dynamic.global.applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
    /**
      *   Creates colors for storing in variables of the
      *   color datatype. The parameters are interpreted as
      *   RGB or HSB values depending on the current
      *   colorMode(). The default mode is RGB values from 0
      *   to 255 and, therefore, the function call
      *   color(255, 204, 0) will return a bright yellow
      *   color. Note that if only one value is provided to
      *   color(), it will be interpreted as a grayscale
      *   value. Add a second value, and it will be used for
      *   alpha transparency. When three values are
      *   specified, they are interpreted as either RGB or
      *   HSB values. Adding a fourth value applies alpha
      *   transparency.
      *
      *   If a single string argument is provided, RGB, RGBA
      *   and Hex CSS color strings and all named color
      *   strings are supported. In this case, an alpha
      *   number value as a second argument is not
      *   supported, the RGBA form should be used.
      *   @param values an array containing the
      *   red,green,blue & and alpha components of the color
      */
    inline def color(values: js.Array[Double]): Color = js.Dynamic.global.applyDynamic("color")(values.asInstanceOf[js.Any]).asInstanceOf[Color]
    
    /**
      *   colorMode() changes the way p5.js interprets color
      *   data. By default, the parameters for fill(),
      *   stroke(), background(), and color() are defined by
      *   values between 0 and 255 using the RGB color
      *   model. This is equivalent to setting
      *   colorMode(RGB, 255). Setting colorMode(HSB) lets
      *   you use the HSB system instead. By default, this
      *   is colorMode(HSB, 360, 100, 100, 1). You can also
      *   use HSL. Note: existing color objects remember the
      *   mode that they were created in, so you can change
      *   modes as you like without affecting their
      *   appearance.
      *   @param mode either RGB, HSB or HSL, corresponding
      *   to Red/Green/Blue and Hue/Saturation/Brightness
      *   (or Lightness)
      *   @param [max] range for all values
      *   @chainable
      */
    inline def colorMode(mode: COLOR_MODE): ^ = js.Dynamic.global.applyDynamic("colorMode")(mode.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def colorMode(mode: COLOR_MODE, max: Double): ^ = (js.Dynamic.global.applyDynamic("colorMode")(mode.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   colorMode() changes the way p5.js interprets color
      *   data. By default, the parameters for fill(),
      *   stroke(), background(), and color() are defined by
      *   values between 0 and 255 using the RGB color
      *   model. This is equivalent to setting
      *   colorMode(RGB, 255). Setting colorMode(HSB) lets
      *   you use the HSB system instead. By default, this
      *   is colorMode(HSB, 360, 100, 100, 1). You can also
      *   use HSL. Note: existing color objects remember the
      *   mode that they were created in, so you can change
      *   modes as you like without affecting their
      *   appearance.
      *   @param mode either RGB, HSB or HSL, corresponding
      *   to Red/Green/Blue and Hue/Saturation/Brightness
      *   (or Lightness)
      *   @param max1 range for the red or hue depending on
      *   the current color mode
      *   @param max2 range for the green or saturation
      *   depending on the current color mode
      *   @param max3 range for the blue or
      *   brightness/lightness depending on the current
      *   color mode
      *   @param [maxA] range for the alpha
      *   @chainable
      */
    inline def colorMode(mode: UNKNOWN_P5_CONSTANT, max1: Double, max2: Double, max3: Double): ^ = (js.Dynamic.global.applyDynamic("colorMode")(mode.asInstanceOf[js.Any], max1.asInstanceOf[js.Any], max2.asInstanceOf[js.Any], max3.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def colorMode(mode: UNKNOWN_P5_CONSTANT, max1: Double, max2: Double, max3: Double, maxA: Double): ^ = (js.Dynamic.global.applyDynamic("colorMode")(mode.asInstanceOf[js.Any], max1.asInstanceOf[js.Any], max2.asInstanceOf[js.Any], max3.asInstanceOf[js.Any], maxA.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Concatenates two arrays, maps to Array.concat().
      *   Does not modify the input arrays.
      *   @param a first Array to concatenate
      *   @param b second Array to concatenate
      *   @return concatenated array
      */
    inline def concat(a: js.Array[Any], b: js.Array[Any]): js.Array[Any] = (js.Dynamic.global.applyDynamic("concat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      *   Draw a cone with given radius and height DetailX
      *   and detailY determine the number of subdivisions
      *   in the x-dimension and the y-dimension of a cone.
      *   More subdivisions make the cone seem smoother. The
      *   recommended maximum value for detailX is 24. Using
      *   a value greater than 24 may cause a warning or
      *   slow down the browser.
      *   @param [radius] radius of the bottom surface
      *   @param [height] height of the cone
      *   @param [detailX] number of segments, the more
      *   segments the smoother geometry default is 24
      *   @param [detailY] number of segments, the more
      *   segments the smoother geometry default is 1
      *   @param [cap] whether to draw the base of the cone
      *   @chainable
      */
    inline def cone(): ^ = js.Dynamic.global.applyDynamic("cone")().asInstanceOf[^]
    inline def cone(radius: Double): ^ = js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def cone(radius: Double, height: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Double, detailX: Double, detailY: Double, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Double, detailX: Double, detailY: Unit, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Double, detailX: Unit, detailY: Double, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Double, detailX: Unit, detailY: Unit, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Unit, detailX: Double, detailY: Double, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Unit, detailX: Double, detailY: Unit, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Unit, detailX: Unit, detailY: Double, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Double, height: Unit, detailX: Unit, detailY: Unit, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Double, detailX: Double, detailY: Double, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Double, detailX: Double, detailY: Unit, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Double, detailX: Unit, detailY: Double, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Double, detailX: Unit, detailY: Unit, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Unit, detailX: Double, detailY: Double, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Unit, detailX: Double, detailY: Unit, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Unit, detailX: Unit, detailY: Double, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def cone(radius: Unit, height: Unit, detailX: Unit, detailY: Unit, cap: Boolean): ^ = (js.Dynamic.global.applyDynamic("cone")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], cap.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Constrains a value between a minimum and maximum
      *   value.
      *   @param n number to constrain
      *   @param low minimum limit
      *   @param high maximum limit
      *   @return constrained number
      */
    inline def constrain(n: Double, low: Double, high: Double): Double = (js.Dynamic.global.applyDynamic("constrain")(n.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def copy(
      srcImage: Element,
      sx: Double,
      sy: Double,
      sw: Double,
      sh: Double,
      dx: Double,
      dy: Double,
      dw: Double,
      dh: Double
    ): Unit = (js.Dynamic.global.applyDynamic("copy")(srcImage.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dw.asInstanceOf[js.Any], dh.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Copies a region of the canvas to another region of
      *   the canvas and copies a region of pixels from an
      *   image used as the srcImg parameter into the canvas
      *   srcImage is specified this is used as the source.
      *   If the source and destination regions aren't the
      *   same size, it will automatically resize source
      *   pixels to fit the specified target region.
      *   @param srcImage source image
      *   @param sx X coordinate of the source's upper left
      *   corner
      *   @param sy Y coordinate of the source's upper left
      *   corner
      *   @param sw source image width
      *   @param sh source image height
      *   @param dx X coordinate of the destination's upper
      *   left corner
      *   @param dy Y coordinate of the destination's upper
      *   left corner
      *   @param dw destination image width
      *   @param dh destination image height
      */
    inline def copy(
      srcImage: Image,
      sx: Double,
      sy: Double,
      sw: Double,
      sh: Double,
      dx: Double,
      dy: Double,
      dw: Double,
      dh: Double
    ): Unit = (js.Dynamic.global.applyDynamic("copy")(srcImage.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dw.asInstanceOf[js.Any], dh.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Copies a region of the canvas to another region of
      *   the canvas and copies a region of pixels from an
      *   image used as the srcImg parameter into the canvas
      *   srcImage is specified this is used as the source.
      *   If the source and destination regions aren't the
      *   same size, it will automatically resize source
      *   pixels to fit the specified target region.
      *   @param sx X coordinate of the source's upper left
      *   corner
      *   @param sy Y coordinate of the source's upper left
      *   corner
      *   @param sw source image width
      *   @param sh source image height
      *   @param dx X coordinate of the destination's upper
      *   left corner
      *   @param dy Y coordinate of the destination's upper
      *   left corner
      *   @param dw destination image width
      *   @param dh destination image height
      */
    inline def copy(sx: Double, sy: Double, sw: Double, sh: Double, dx: Double, dy: Double, dw: Double, dh: Double): Unit = (js.Dynamic.global.applyDynamic("copy")(sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dw.asInstanceOf[js.Any], dh.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Calculates the cosine of an angle. This function
      *   takes into account the current angleMode. Values
      *   are returned in the range -1 to 1.
      *   @param angle the angle
      *   @return the cosine of the angle
      */
    inline def cos(angle: Double): Double = js.Dynamic.global.applyDynamic("cos")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Creates an <a></a> element in the DOM for
      *   including a hyperlink.
      *   @param href url of page to link to
      *   @param html inner html of link element to display
      *   @param [target] target where new link should open,
      *   could be _blank, _self, _parent, _top.
      *   @return pointer to p5.Element holding created node
      */
    inline def createA(href: String, html: String): Element = (js.Dynamic.global.applyDynamic("createA")(href.asInstanceOf[js.Any], html.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def createA(href: String, html: String, target: String): Element = (js.Dynamic.global.applyDynamic("createA")(href.asInstanceOf[js.Any], html.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    /**
      *   Creates a hidden HTML5 <audio> element in the DOM
      *   for simple audio playback. The first parameter can
      *   be either a single string path to a audio file, or
      *   an array of string paths to different formats of
      *   the same audio. This is useful for ensuring that
      *   your audio can play across different browsers, as
      *   each supports different formats. See this page for
      *   further information about supported formats.
      *   @param [src] path to an audio file, or array of
      *   paths for supporting different browsers
      *   @param [callback] callback function to be called
      *   upon 'canplaythrough' event fire, that is, when
      *   the browser can play the media, and estimates that
      *   enough data has been loaded to play the media up
      *   to its end without having to stop for further
      *   buffering of content
      *   @return pointer to audio p5.MediaElement
      */
    inline def createAudio(): MediaElement = js.Dynamic.global.applyDynamic("createAudio")().asInstanceOf[MediaElement]
    inline def createAudio(src: String): MediaElement = js.Dynamic.global.applyDynamic("createAudio")(src.asInstanceOf[js.Any]).asInstanceOf[MediaElement]
    inline def createAudio(src: String, callback: js.Function1[/* repeated */ Any, Any]): MediaElement = (js.Dynamic.global.applyDynamic("createAudio")(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MediaElement]
    inline def createAudio(src: js.Array[String]): MediaElement = js.Dynamic.global.applyDynamic("createAudio")(src.asInstanceOf[js.Any]).asInstanceOf[MediaElement]
    inline def createAudio(src: js.Array[String], callback: js.Function1[/* repeated */ Any, Any]): MediaElement = (js.Dynamic.global.applyDynamic("createAudio")(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MediaElement]
    inline def createAudio(src: Unit, callback: js.Function1[/* repeated */ Any, Any]): MediaElement = (js.Dynamic.global.applyDynamic("createAudio")(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MediaElement]
    
    /**
      *   Creates a <button></button> element in the DOM.
      *   Use .size() to set the display size of the button.
      *   Use .mousePressed() to specify behavior on press.
      *   @param label label displayed on the button
      *   @param [value] value of the button
      *   @return pointer to p5.Element holding created node
      */
    inline def createButton(label: String): Element = js.Dynamic.global.applyDynamic("createButton")(label.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def createButton(label: String, value: String): Element = (js.Dynamic.global.applyDynamic("createButton")(label.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    /**
      *   Creates a new p5.Camera object and sets it as the
      *   current (active) camera. The new camera is
      *   initialized with a default position (see camera())
      *   and a default perspective projection (see
      *   perspective()). Its properties can be controlled
      *   with the p5.Camera methods.
      *
      *   Note: Every 3D sketch starts with a default camera
      *   initialized. This camera can be controlled with
      *   the global methods camera(), perspective(),
      *   ortho(), and frustum() if it is the only camera in
      *   the scene.
      *   @return The newly created camera object.
      */
    inline def createCamera(): Camera = js.Dynamic.global.applyDynamic("createCamera")().asInstanceOf[Camera]
    
    /**
      *   Creates a canvas element in the document, and sets
      *   the dimensions of it in pixels. This method should
      *   be called only once at the start of setup. Calling
      *   createCanvas more than once in a sketch will
      *   result in very unpredictable behavior. If you want
      *   more than one drawing canvas you could use
      *   createGraphics (hidden by default but it can be
      *   shown). Important note: in 2D mode (i.e. when
      *   p5.Renderer is not set) the origin (0,0) is
      *   positioned at the top left of the screen. In 3D
      *   mode (i.e. when p5.Renderer is set to WEBGL), the
      *   origin is positioned at the center of the canvas.
      *   See this issue for more information.
      *
      *   The system variables width and height are set by
      *   the parameters passed to this function. If
      *   createCanvas() is not used, the window will be
      *   given a default size of 100×100 pixels.
      *
      *   For more ways to position the canvas, see the
      *   positioning the canvas wiki page.
      *   @param w width of the canvas
      *   @param h height of the canvas
      *   @param [renderer] either P2D or WEBGL
      */
    inline def createCanvas(w: Double, h: Double): Renderer = (js.Dynamic.global.applyDynamic("createCanvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Renderer]
    inline def createCanvas(w: Double, h: Double, renderer: RENDERER_): Renderer = (js.Dynamic.global.applyDynamic("createCanvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[Renderer]
    
    /**
      *   Creates a new HTML5 <video> element that contains
      *   the audio/video feed from a webcam. The element is
      *   separate from the canvas and is displayed by
      *   default. The element can be hidden using .hide().
      *   The feed can be drawn onto the canvas using
      *   image(). The loadedmetadata property can be used
      *   to detect when the element has fully loaded (see
      *   second example). More specific properties of the
      *   feed can be passing in a Constraints object. See
      *   the  W3C spec for possible properties. Note that
      *   not all of these are supported by all browsers.
      *
      *   Security note: A new browser security
      *   specification requires that getUserMedia, which is
      *   behind createCapture(), only works when you're
      *   running the code locally, or on HTTPS. Learn more
      *   here and here.
      *   @param type type of capture, either VIDEO or AUDIO
      *   if none specified, default both, or a Constraints
      *   object
      *   @param [callback] function to be called once
      *   stream has loaded
      *   @return capture video p5.Element
      */
    inline def createCapture(`type`: String | TYPE): Element = js.Dynamic.global.applyDynamic("createCapture")(`type`.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def createCapture(`type`: String | TYPE, callback: js.Function1[/* repeated */ Any, Any]): Element = (js.Dynamic.global.applyDynamic("createCapture")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def createCapture(`type`: js.Object): Element = js.Dynamic.global.applyDynamic("createCapture")(`type`.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def createCapture(`type`: js.Object, callback: js.Function1[/* repeated */ Any, Any]): Element = (js.Dynamic.global.applyDynamic("createCapture")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    /**
      *   Creates a checkbox <input></input> element in the
      *   DOM. Calling .checked() on a checkbox returns if
      *   it is checked or not
      *   @param [label] label displayed after checkbox
      *   @param [value] value of the checkbox; checked is
      *   true, unchecked is false
      *   @return pointer to p5.Element holding created node
      */
    inline def createCheckbox(): Element = js.Dynamic.global.applyDynamic("createCheckbox")().asInstanceOf[Element]
    inline def createCheckbox(label: String): Element = js.Dynamic.global.applyDynamic("createCheckbox")(label.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def createCheckbox(label: String, value: Boolean): Element = (js.Dynamic.global.applyDynamic("createCheckbox")(label.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def createCheckbox(label: Unit, value: Boolean): Element = (js.Dynamic.global.applyDynamic("createCheckbox")(label.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    /**
      *   Creates a colorPicker element in the DOM for color
      *   input. The .value() method will return a hex
      *   string (#rrggbb) of the color. The .color() method
      *   will return a p5.Color object with the current
      *   chosen color.
      *   @param [value] default color of element
      *   @return pointer to p5.Element holding created node
      */
    inline def createColorPicker(): Element = js.Dynamic.global.applyDynamic("createColorPicker")().asInstanceOf[Element]
    inline def createColorPicker(value: String): Element = js.Dynamic.global.applyDynamic("createColorPicker")(value.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def createColorPicker(value: Color): Element = js.Dynamic.global.applyDynamic("createColorPicker")(value.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      *   Create a p5.Convolver. Accepts a path to a
      *   soundfile that will be used to generate an impulse
      *   response.
      *   @param path path to a sound file
      *   @param [callback] function to call if loading is
      *   successful. The object will be passed in as the
      *   argument to the callback function.
      *   @param [errorCallback] function to call if loading
      *   is not successful. A custom error will be passed
      *   in as the argument to the callback function.
      */
    inline def createConvolver(path: String): Convolver = js.Dynamic.global.applyDynamic("createConvolver")(path.asInstanceOf[js.Any]).asInstanceOf[Convolver]
    inline def createConvolver(path: String, callback: js.Function1[/* repeated */ Any, Any]): Convolver = (js.Dynamic.global.applyDynamic("createConvolver")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Convolver]
    inline def createConvolver(
      path: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): Convolver = (js.Dynamic.global.applyDynamic("createConvolver")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Convolver]
    inline def createConvolver(path: String, callback: Unit, errorCallback: js.Function1[/* repeated */ Any, Any]): Convolver = (js.Dynamic.global.applyDynamic("createConvolver")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Convolver]
    
    /**
      *   Creates a <div></div> element in the DOM with
      *   given inner HTML.
      *   @param [html] inner HTML for element created
      *   @return pointer to p5.Element holding created node
      */
    inline def createDiv(): Element = js.Dynamic.global.applyDynamic("createDiv")().asInstanceOf[Element]
    inline def createDiv(html: String): Element = js.Dynamic.global.applyDynamic("createDiv")(html.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      *   Creates element with given tag in the DOM with
      *   given content.
      *   @param tag tag for the new element
      *   @param [content] html content to be inserted into
      *   the element
      *   @return pointer to p5.Element holding created node
      */
    inline def createElement(tag: String): Element = js.Dynamic.global.applyDynamic("createElement")(tag.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def createElement(tag: String, content: String): Element = (js.Dynamic.global.applyDynamic("createElement")(tag.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    /**
      *   Creates an <input></input> element in the DOM of
      *   type 'file'. This allows users to select local
      *   files for use in a sketch.
      *   @param callback callback function for when a file
      *   is loaded
      *   @param [multiple] optional, to allow multiple
      *   files to be selected
      *   @return pointer to p5.Element holding created DOM
      *   element
      */
    inline def createFileInput(callback: js.Function1[/* repeated */ Any, Any]): Element = js.Dynamic.global.applyDynamic("createFileInput")(callback.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def createFileInput(callback: js.Function1[/* repeated */ Any, Any], multiple: Boolean): Element = (js.Dynamic.global.applyDynamic("createFileInput")(callback.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    /**
      *   Creates and returns a new p5.Renderer object. Use
      *   this class if you need to draw into an off-screen
      *   graphics buffer. The two parameters define the
      *   width and height in pixels.
      *   @param w width of the offscreen graphics buffer
      *   @param h height of the offscreen graphics buffer
      *   @param [renderer] either P2D or WEBGL undefined
      *   defaults to p2d
      *   @return offscreen graphics buffer
      */
    inline def createGraphics(w: Double, h: Double): Graphics = (js.Dynamic.global.applyDynamic("createGraphics")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Graphics]
    inline def createGraphics(w: Double, h: Double, renderer: RENDERER_): Graphics = (js.Dynamic.global.applyDynamic("createGraphics")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[Graphics]
    
    /**
      *   Creates a new p5.Image (the datatype for storing
      *   images). This provides a fresh buffer of pixels to
      *   play with. Set the size of the buffer with the
      *   width and height parameters. .pixels gives access
      *   to an array containing the values for all the
      *   pixels in the display window. These values are
      *   numbers. This array is the size (including an
      *   appropriate factor for the pixelDensity) of the
      *   display window x4, representing the R, G, B, A
      *   values in order for each pixel, moving from left
      *   to right across each row, then down each column.
      *   See .pixels for more info. It may also be simpler
      *   to use set() or get().
      *
      *   Before accessing the pixels of an image, the data
      *   must loaded with the loadPixels() function. After
      *   the array data has been modified, the
      *   updatePixels() function must be run to update the
      *   changes.
      *   @param width width in pixels
      *   @param height height in pixels
      *   @return the p5.Image object
      */
    inline def createImage(width: Double, height: Double): Image = (js.Dynamic.global.applyDynamic("createImage")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
    
    /**
      *   Creates an <img> element in the DOM with given src
      *   and alternate text.
      *   @param src src path or url for image
      *   @param alt alternate text to be used if image does
      *   not load. You can use also an empty string ("") if
      *   that an image is not intended to be viewed.
      *   @return pointer to p5.Element holding created node
      */
    inline def createImg(src: String, alt: String): Element = (js.Dynamic.global.applyDynamic("createImg")(src.asInstanceOf[js.Any], alt.asInstanceOf[js.Any])).asInstanceOf[Element]
    /**
      *   Creates an <img> element in the DOM with given src
      *   and alternate text.
      *   @param src src path or url for image
      *   @param alt alternate text to be used if image does
      *   not load. You can use also an empty string ("") if
      *   that an image is not intended to be viewed.
      *   @param crossOrigin crossOrigin property of the img
      *   element; use either 'anonymous' or
      *   'use-credentials' to retrieve the image with
      *   cross-origin access (for later use with canvas. if
      *   an empty string("") is passed, CORS is not used
      *   @param [successCallback] callback to be called
      *   once image data is loaded with the p5.Element as
      *   argument
      *   @return pointer to p5.Element holding created node
      */
    inline def createImg(src: String, alt: String, crossOrigin: String): Element = (js.Dynamic.global.applyDynamic("createImg")(src.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def createImg(
      src: String,
      alt: String,
      crossOrigin: String,
      successCallback: js.Function1[/* repeated */ Any, Any]
    ): Element = (js.Dynamic.global.applyDynamic("createImg")(src.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    /**
      *   Creates an <input></input> element in the DOM for
      *   text input. Use .size() to set the display length
      *   of the box.
      *   @param [value] default value of the input box
      */
    inline def createInput(): Element = js.Dynamic.global.applyDynamic("createInput")().asInstanceOf[Element]
    /**
      *   Creates an <input></input> element in the DOM for
      *   text input. Use .size() to set the display length
      *   of the box.
      *   @param value default value of the input box
      *   @param [type] type of text, ie text, password etc.
      *   Defaults to text. Needs a value to be specified
      *   first.
      *   @return pointer to p5.Element holding created node
      */
    inline def createInput(value: String): Element = js.Dynamic.global.applyDynamic("createInput")(value.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def createInput(value: String, `type`: String): Element = (js.Dynamic.global.applyDynamic("createInput")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    /**
      *   Creates a new instance of p5.NumberDict using the
      *   key-value pair or object you provide.
      */
    inline def createNumberDict(key: Double, value: Double): NumberDict = (js.Dynamic.global.applyDynamic("createNumberDict")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NumberDict]
    /**
      *   Creates a new instance of p5.NumberDict using the
      *   key-value pair or object you provide.
      *   @param object object
      */
    inline def createNumberDict(`object`: js.Object): NumberDict = js.Dynamic.global.applyDynamic("createNumberDict")(`object`.asInstanceOf[js.Any]).asInstanceOf[NumberDict]
    
    /**
      *   Creates a <p></p> element in the DOM with given
      *   inner HTML. Used for paragraph length text.
      *   @param [html] inner HTML for element created
      *   @return pointer to p5.Element holding created node
      */
    inline def createP(): Element = js.Dynamic.global.applyDynamic("createP")().asInstanceOf[Element]
    inline def createP(html: String): Element = js.Dynamic.global.applyDynamic("createP")(html.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      *   Creates a radio button element in the DOM.It also
      *   helps existing radio buttons assign methods of
      *   p5.Element. - .option(value, [label]) can be used
      *   to create a new option for the element. If an
      *   option with a value already exists, it will be
      *   returned. It is recommended to use string values
      *   as input for value. Optionally, a label can be
      *   provided as second argument for the option.
      *   - .remove(value) can be used to remove an option
      *   for the element. String values recommended as
      *   input for value.
      *   - .value() method will return the currently
      *   selected value.
      *   - .selected() method will return the currently
      *   selected input element.
      *   - .selected(value) method will select the option
      *   and return it. String values recommended as input
      *   for value.
      *   - .disable(Boolean) method will enable/disable the
      *   whole radio button element.
      *   @return pointer to p5.Element holding created node
      */
    inline def createRadio(): Element = js.Dynamic.global.applyDynamic("createRadio")().asInstanceOf[Element]
    /**
      *   Creates a radio button element in the DOM.It also
      *   helps existing radio buttons assign methods of
      *   p5.Element. - .option(value, [label]) can be used
      *   to create a new option for the element. If an
      *   option with a value already exists, it will be
      *   returned. It is recommended to use string values
      *   as input for value. Optionally, a label can be
      *   provided as second argument for the option.
      *   - .remove(value) can be used to remove an option
      *   for the element. String values recommended as
      *   input for value.
      *   - .value() method will return the currently
      *   selected value.
      *   - .selected() method will return the currently
      *   selected input element.
      *   - .selected(value) method will select the option
      *   and return it. String values recommended as input
      *   for value.
      *   - .disable(Boolean) method will enable/disable the
      *   whole radio button element.
      *   @param containerElement An container HTML Element
      *   either a div or span inside which all existing
      *   radio inputs will be considered as options.
      *   @param [name] A name parameter for each Input
      *   Element.
      *   @return pointer to p5.Element holding created node
      */
    inline def createRadio(containerElement: js.Object): Element = js.Dynamic.global.applyDynamic("createRadio")(containerElement.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def createRadio(containerElement: js.Object, name: String): Element = (js.Dynamic.global.applyDynamic("createRadio")(containerElement.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Element]
    /**
      *   Creates a radio button element in the DOM.It also
      *   helps existing radio buttons assign methods of
      *   p5.Element. - .option(value, [label]) can be used
      *   to create a new option for the element. If an
      *   option with a value already exists, it will be
      *   returned. It is recommended to use string values
      *   as input for value. Optionally, a label can be
      *   provided as second argument for the option.
      *   - .remove(value) can be used to remove an option
      *   for the element. String values recommended as
      *   input for value.
      *   - .value() method will return the currently
      *   selected value.
      *   - .selected() method will return the currently
      *   selected input element.
      *   - .selected(value) method will select the option
      *   and return it. String values recommended as input
      *   for value.
      *   - .disable(Boolean) method will enable/disable the
      *   whole radio button element.
      *   @param name A name parameter for each Input
      *   Element.
      *   @return pointer to p5.Element holding created node
      */
    inline def createRadio(name: String): Element = js.Dynamic.global.applyDynamic("createRadio")(name.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      *   Creates a dropdown menu <select></select> element
      *   in the DOM. It also helps to assign select-box
      *   methods to p5.Element when selecting existing
      *   select box. - .option(name, [value]) can be used
      *   to set options for the select after it is created.
      *   - .value() will return the currently selected
      *   option.
      *   - .selected() will return current dropdown element
      *   which is an instance of p5.Element
      *   - .selected(value) can be used to make given
      *   option selected by default when the page first
      *   loads.
      *   - .disable() marks whole of dropdown element as
      *   disabled.
      *   - .disable(value) marks given option as disabled
      *   @param [multiple] true if dropdown should support
      *   multiple selections
      */
    inline def createSelect(): Element = js.Dynamic.global.applyDynamic("createSelect")().asInstanceOf[Element]
    /**
      *   Creates a dropdown menu <select></select> element
      *   in the DOM. It also helps to assign select-box
      *   methods to p5.Element when selecting existing
      *   select box. - .option(name, [value]) can be used
      *   to set options for the select after it is created.
      *   - .value() will return the currently selected
      *   option.
      *   - .selected() will return current dropdown element
      *   which is an instance of p5.Element
      *   - .selected(value) can be used to make given
      *   option selected by default when the page first
      *   loads.
      *   - .disable() marks whole of dropdown element as
      *   disabled.
      *   - .disable(value) marks given option as disabled
      *   @param existing DOM select element
      */
    inline def createSelect(existing: js.Object): Element = js.Dynamic.global.applyDynamic("createSelect")(existing.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def createSelect(multiple: Boolean): Element = js.Dynamic.global.applyDynamic("createSelect")(multiple.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      *   Creates a new p5.Shader object from the provided
      *   vertex and fragment shader code. Note, shaders can
      *   only be used in WEBGL mode.
      *   @param vertSrc source code for the vertex shader
      *   @param fragSrc source code for the fragment shader
      *   @return a shader object created from the provided
      *   vertex and fragment shaders.
      */
    inline def createShader(vertSrc: String, fragSrc: String): Shader = (js.Dynamic.global.applyDynamic("createShader")(vertSrc.asInstanceOf[js.Any], fragSrc.asInstanceOf[js.Any])).asInstanceOf[Shader]
    
    /**
      *   Creates a slider <input></input> element in the
      *   DOM. Use .size() to set the display length of the
      *   slider.
      *   @param min minimum value of the slider
      *   @param max maximum value of the slider
      *   @param [value] default value of the slider
      *   @param [step] step size for each tick of the
      *   slider (if step is set to 0, the slider will move
      *   continuously from the minimum to the maximum
      *   value)
      *   @return pointer to p5.Element holding created node
      */
    inline def createSlider(min: Double, max: Double): Element = (js.Dynamic.global.applyDynamic("createSlider")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def createSlider(min: Double, max: Double, value: Double): Element = (js.Dynamic.global.applyDynamic("createSlider")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def createSlider(min: Double, max: Double, value: Double, step: Double): Element = (js.Dynamic.global.applyDynamic("createSlider")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def createSlider(min: Double, max: Double, value: Unit, step: Double): Element = (js.Dynamic.global.applyDynamic("createSlider")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    /**
      *   Creates a <span></span> element in the DOM with
      *   given inner HTML.
      *   @param [html] inner HTML for element created
      *   @return pointer to p5.Element holding created node
      */
    inline def createSpan(): Element = js.Dynamic.global.applyDynamic("createSpan")().asInstanceOf[Element]
    inline def createSpan(html: String): Element = js.Dynamic.global.applyDynamic("createSpan")(html.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      *   Creates a new instance of p5.StringDict using the
      *   key-value pair or the object you provide.
      */
    inline def createStringDict(key: String, value: String): StringDict = (js.Dynamic.global.applyDynamic("createStringDict")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[StringDict]
    /**
      *   Creates a new instance of p5.StringDict using the
      *   key-value pair or the object you provide.
      *   @param object object
      */
    inline def createStringDict(`object`: js.Object): StringDict = js.Dynamic.global.applyDynamic("createStringDict")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDict]
    
    /**
      *   Creates a new p5.Vector (the datatype for storing
      *   vectors). This provides a two or three dimensional
      *   vector, specifically a Euclidean (also known as
      *   geometric) vector. A vector is an entity that has
      *   both magnitude and direction.
      *   @param [x] x component of the vector
      *   @param [y] y component of the vector
      *   @param [z] z component of the vector
      */
    inline def createVector(): Vector = js.Dynamic.global.applyDynamic("createVector")().asInstanceOf[Vector]
    inline def createVector(x: Double): Vector = js.Dynamic.global.applyDynamic("createVector")(x.asInstanceOf[js.Any]).asInstanceOf[Vector]
    inline def createVector(x: Double, y: Double): Vector = (js.Dynamic.global.applyDynamic("createVector")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Vector]
    inline def createVector(x: Double, y: Double, z: Double): Vector = (js.Dynamic.global.applyDynamic("createVector")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vector]
    inline def createVector(x: Double, y: Unit, z: Double): Vector = (js.Dynamic.global.applyDynamic("createVector")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vector]
    inline def createVector(x: Unit, y: Double): Vector = (js.Dynamic.global.applyDynamic("createVector")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Vector]
    inline def createVector(x: Unit, y: Double, z: Double): Vector = (js.Dynamic.global.applyDynamic("createVector")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vector]
    inline def createVector(x: Unit, y: Unit, z: Double): Vector = (js.Dynamic.global.applyDynamic("createVector")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vector]
    
    /**
      *   Creates an HTML5 <video> element in the DOM for
      *   simple playback of audio/video. Shown by default,
      *   can be hidden with .hide() and drawn into canvas
      *   using image(). The first parameter can be either a
      *   single string path to a video file, or an array of
      *   string paths to different formats of the same
      *   video. This is useful for ensuring that your video
      *   can play across different browsers, as each
      *   supports different formats. See this page for
      *   further information about supported formats.
      *   @param src path to a video file, or array of paths
      *   for supporting different browsers
      *   @param [callback] callback function to be called
      *   upon 'canplaythrough' event fire, that is, when
      *   the browser can play the media, and estimates that
      *   enough data has been loaded to play the media up
      *   to its end without having to stop for further
      *   buffering of content
      *   @return pointer to video p5.MediaElement
      */
    inline def createVideo(src: String): MediaElement = js.Dynamic.global.applyDynamic("createVideo")(src.asInstanceOf[js.Any]).asInstanceOf[MediaElement]
    inline def createVideo(src: String, callback: js.Function1[/* repeated */ Any, Any]): MediaElement = (js.Dynamic.global.applyDynamic("createVideo")(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MediaElement]
    inline def createVideo(src: js.Array[String]): MediaElement = js.Dynamic.global.applyDynamic("createVideo")(src.asInstanceOf[js.Any]).asInstanceOf[MediaElement]
    inline def createVideo(src: js.Array[String], callback: js.Function1[/* repeated */ Any, Any]): MediaElement = (js.Dynamic.global.applyDynamic("createVideo")(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MediaElement]
    
    inline def createWriter(name: String): PrintWriter = js.Dynamic.global.applyDynamic("createWriter")(name.asInstanceOf[js.Any]).asInstanceOf[PrintWriter]
    inline def createWriter(name: String, `extension`: String): PrintWriter = (js.Dynamic.global.applyDynamic("createWriter")(name.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[PrintWriter]
    
    /**
      *   Sets the cursor to a predefined symbol or an
      *   image, or makes it visible if already hidden. If
      *   you are trying to set an image as the cursor, the
      *   recommended size is 16×16 or 32×32 pixels. The
      *   values for parameters x and y must be less than
      *   the dimensions of the image.
      *   @param type Built-In: either ARROW, CROSS, HAND,
      *   MOVE, TEXT and WAIT Native CSS properties: 'grab',
      *   'progress', 'cell' etc. External: path for
      *   cursor's images (Allowed File extensions: .cur,
      *   .gif, .jpg, .jpeg, .png) For more information on
      *   Native CSS cursors and url visit:
      *   https://developer.mozilla.org/en-US/docs/Web/CSS/cursor
      *   @param [x] the horizontal active spot of the
      *   cursor (must be less than 32)
      *   @param [y] the vertical active spot of the cursor
      *   (must be less than 32)
      */
    inline def cursor(`type`: CURSOR_TYPE | String): Unit = js.Dynamic.global.applyDynamic("cursor")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def cursor(`type`: CURSOR_TYPE | String, x: Double): Unit = (js.Dynamic.global.applyDynamic("cursor")(`type`.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cursor(`type`: CURSOR_TYPE | String, x: Double, y: Double): Unit = (js.Dynamic.global.applyDynamic("cursor")(`type`.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cursor(`type`: CURSOR_TYPE | String, x: Unit, y: Double): Unit = (js.Dynamic.global.applyDynamic("cursor")(`type`.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Draws a curved line on the screen between two
      *   points, given as the middle four parameters. The
      *   first two parameters are a control point, as if
      *   the curve came from this point even though it's
      *   not drawn. The last two parameters similarly
      *   describe the other control point.  Longer curves
      *   can be created by putting a series of curve()
      *   functions together or using curveVertex(). An
      *   additional function called curveTightness()
      *   provides control for the visual quality of the
      *   curve. The curve() function is an implementation
      *   of Catmull-Rom splines.
      *   @param x1 x-coordinate for the beginning control
      *   point
      *   @param y1 y-coordinate for the beginning control
      *   point
      *   @param x2 x-coordinate for the first point
      *   @param y2 y-coordinate for the first point
      *   @param x3 x-coordinate for the second point
      *   @param y3 y-coordinate for the second point
      *   @param x4 x-coordinate for the ending control
      *   point
      *   @param y4 y-coordinate for the ending control
      *   point
      *   @chainable
      */
    inline def curve(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): ^ = (js.Dynamic.global.applyDynamic("curve")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Draws a curved line on the screen between two
      *   points, given as the middle four parameters. The
      *   first two parameters are a control point, as if
      *   the curve came from this point even though it's
      *   not drawn. The last two parameters similarly
      *   describe the other control point.  Longer curves
      *   can be created by putting a series of curve()
      *   functions together or using curveVertex(). An
      *   additional function called curveTightness()
      *   provides control for the visual quality of the
      *   curve. The curve() function is an implementation
      *   of Catmull-Rom splines.
      *   @param x1 x-coordinate for the beginning control
      *   point
      *   @param y1 y-coordinate for the beginning control
      *   point
      *   @param z1 z-coordinate for the beginning control
      *   point
      *   @param x2 x-coordinate for the first point
      *   @param y2 y-coordinate for the first point
      *   @param z2 z-coordinate for the first point
      *   @param x3 x-coordinate for the second point
      *   @param y3 y-coordinate for the second point
      *   @param z3 z-coordinate for the second point
      *   @param x4 x-coordinate for the ending control
      *   point
      *   @param y4 y-coordinate for the ending control
      *   point
      *   @param z4 z-coordinate for the ending control
      *   point
      *   @chainable
      */
    inline def curve(
      x1: Double,
      y1: Double,
      z1: Double,
      x2: Double,
      y2: Double,
      z2: Double,
      x3: Double,
      y3: Double,
      z3: Double,
      x4: Double,
      y4: Double,
      z4: Double
    ): ^ = (js.Dynamic.global.applyDynamic("curve")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], z3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], z4.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Sets the resolution at which curves display. The
      *   default value is 20 while the minimum value is 3.
      *   This function is only useful when using the WEBGL
      *   renderer as the default canvas renderer does not
      *   use this information.
      *   @param resolution resolution of the curves
      *   @chainable
      */
    inline def curveDetail(resolution: Double): ^ = js.Dynamic.global.applyDynamic("curveDetail")(resolution.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Evaluates the curve at position t for points a, b,
      *   c, d. The parameter t varies between 0 and 1, a
      *   and d are control points of the curve, and b and c
      *   are the start and end points of the curve. This
      *   can be done once with the x coordinates and a
      *   second time with the y coordinates to get the
      *   location of a curve at t.
      *   @param a coordinate of first control point of the
      *   curve
      *   @param b coordinate of first point
      *   @param c coordinate of second point
      *   @param d coordinate of second control point
      *   @param t value between 0 and 1
      *   @return bezier value at position t
      */
    inline def curvePoint(a: Double, b: Double, c: Double, d: Double, t: Double): Double = (js.Dynamic.global.applyDynamic("curvePoint")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   Evaluates the tangent to the curve at position t
      *   for points a, b, c, d. The parameter t varies
      *   between 0 and 1, a and d are points on the curve,
      *   and b and c are the control points.
      *   @param a coordinate of first control point
      *   @param b coordinate of first point on the curve
      *   @param c coordinate of second point on the curve
      *   @param d coordinate of second conrol point
      *   @param t value between 0 and 1
      *   @return the tangent at position t
      */
    inline def curveTangent(a: Double, b: Double, c: Double, d: Double, t: Double): Double = (js.Dynamic.global.applyDynamic("curveTangent")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   Modifies the quality of forms created with curve()
      *   and curveVertex().The parameter tightness
      *   determines how the curve fits to the vertex
      *   points. The value 0.0 is the default value for
      *   tightness (this value defines the curves to be
      *   Catmull-Rom splines) and the value 1.0 connects
      *   all the points with straight lines. Values within
      *   the range -5.0 and 5.0 will deform the curves but
      *   will leave them recognizable and as values
      *   increase in magnitude, they will continue to
      *   deform.
      *   @param amount amount of deformation from the
      *   original vertices
      *   @chainable
      */
    inline def curveTightness(amount: Double): ^ = js.Dynamic.global.applyDynamic("curveTightness")(amount.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Specifies vertex coordinates for curves. This
      *   function may only be used between beginShape() and
      *   endShape() and only when there is no MODE
      *   parameter specified to beginShape(). For WebGL
      *   mode curveVertex() can be used in 2D as well as 3D
      *   mode. 2D mode expects 2 parameters, while 3D mode
      *   expects 3 parameters. The first and last points in
      *   a series of curveVertex() lines will be used to
      *   guide the beginning and end of the curve. A
      *   minimum of four points is required to draw a tiny
      *   curve between the second and third points. Adding
      *   a fifth point with curveVertex() will draw the
      *   curve between the second, third, and fourth
      *   points. The curveVertex() function is an
      *   implementation of Catmull-Rom splines.
      *   @param x x-coordinate of the vertex
      *   @param y y-coordinate of the vertex
      *   @chainable
      */
    /**
      *   Specifies vertex coordinates for curves. This
      *   function may only be used between beginShape() and
      *   endShape() and only when there is no MODE
      *   parameter specified to beginShape(). For WebGL
      *   mode curveVertex() can be used in 2D as well as 3D
      *   mode. 2D mode expects 2 parameters, while 3D mode
      *   expects 3 parameters. The first and last points in
      *   a series of curveVertex() lines will be used to
      *   guide the beginning and end of the curve. A
      *   minimum of four points is required to draw a tiny
      *   curve between the second and third points. Adding
      *   a fifth point with curveVertex() will draw the
      *   curve between the second, third, and fourth
      *   points. The curveVertex() function is an
      *   implementation of Catmull-Rom splines.
      *   @param x x-coordinate of the vertex
      *   @param y y-coordinate of the vertex
      *   @param [z] z-coordinate of the vertex (for WebGL
      *   mode)
      *   @chainable
      */
    inline def curveVertex(x: Double, y: Double): ^ = (js.Dynamic.global.applyDynamic("curveVertex")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def curveVertex(x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("curveVertex")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Draw a cylinder with given radius and height
      *   DetailX and detailY determines the number of
      *   subdivisions in the x-dimension and the
      *   y-dimension of a cylinder. More subdivisions make
      *   the cylinder seem smoother. The recommended
      *   maximum value for detailX is 24. Using a value
      *   greater than 24 may cause a warning or slow down
      *   the browser.
      *   @param [radius] radius of the surface
      *   @param [height] height of the cylinder
      *   @param [detailX] number of subdivisions in
      *   x-dimension; default is 24
      *   @param [detailY] number of subdivisions in
      *   y-dimension; default is 1
      *   @param [bottomCap] whether to draw the bottom of
      *   the cylinder
      *   @param [topCap] whether to draw the top of the
      *   cylinder
      *   @chainable
      */
    inline def cylinder(
      radius: js.UndefOr[Double],
      height: js.UndefOr[Double],
      detailX: js.UndefOr[Double],
      detailY: js.UndefOr[Double],
      bottomCap: js.UndefOr[Boolean],
      topCap: js.UndefOr[Boolean]
    ): ^ = (js.Dynamic.global.applyDynamic("cylinder")(radius.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any], bottomCap.asInstanceOf[js.Any], topCap.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   p5.js communicates with the clock on your
      *   computer. The day() function returns the current
      *   day as a value from 1 - 31.
      *   @return the current day
      */
    inline def day(): Double = js.Dynamic.global.applyDynamic("day")().asInstanceOf[Double]
    
    /**
      *   debugMode() helps visualize 3D space by adding a
      *   grid to indicate where the ‘ground’ is in a sketch
      *   and an axes icon which indicates the +X, +Y, and
      *   +Z directions. This function can be called without
      *   parameters to create a default grid and axes icon,
      *   or it can be called according to the examples
      *   above to customize the size and position of the
      *   grid and/or axes icon. The grid is drawn using the
      *   most recently set stroke color and weight. To
      *   specify these parameters, add a call to stroke()
      *   and strokeWeight() just before the end of the
      *   draw() loop. By default, the grid will run through
      *   the origin (0,0,0) of the sketch along the XZ
      *   plane and the axes icon will be offset from the
      *   origin. Both the grid and axes icon will be sized
      *   according to the current canvas size. Note that
      *   because the grid runs parallel to the default
      *   camera view, it is often helpful to use debugMode
      *   along with orbitControl to allow full view of the
      *   grid.
      */
    inline def debugMode(): Unit = js.Dynamic.global.applyDynamic("debugMode")().asInstanceOf[Unit]
    /**
      *   debugMode() helps visualize 3D space by adding a
      *   grid to indicate where the ‘ground’ is in a sketch
      *   and an axes icon which indicates the +X, +Y, and
      *   +Z directions. This function can be called without
      *   parameters to create a default grid and axes icon,
      *   or it can be called according to the examples
      *   above to customize the size and position of the
      *   grid and/or axes icon. The grid is drawn using the
      *   most recently set stroke color and weight. To
      *   specify these parameters, add a call to stroke()
      *   and strokeWeight() just before the end of the
      *   draw() loop. By default, the grid will run through
      *   the origin (0,0,0) of the sketch along the XZ
      *   plane and the axes icon will be offset from the
      *   origin. Both the grid and axes icon will be sized
      *   according to the current canvas size. Note that
      *   because the grid runs parallel to the default
      *   camera view, it is often helpful to use debugMode
      *   along with orbitControl to allow full view of the
      *   grid.
      *   @param [gridSize] size of one side of the grid
      *   @param [gridDivisions] number of divisions in the
      *   grid
      *   @param [axesSize] size of axes icon
      */
    inline def debugMode(
      gridSize: js.UndefOr[Double],
      gridDivisions: js.UndefOr[Double],
      gridXOff: js.UndefOr[Double],
      gridYOff: js.UndefOr[Double],
      gridZOff: js.UndefOr[Double],
      axesSize: js.UndefOr[Double],
      axesXOff: js.UndefOr[Double],
      axesYOff: js.UndefOr[Double],
      axesZOff: js.UndefOr[Double]
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], gridXOff.asInstanceOf[js.Any], gridYOff.asInstanceOf[js.Any], gridZOff.asInstanceOf[js.Any], axesSize.asInstanceOf[js.Any], axesXOff.asInstanceOf[js.Any], axesYOff.asInstanceOf[js.Any], axesZOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   debugMode() helps visualize 3D space by adding a
      *   grid to indicate where the ‘ground’ is in a sketch
      *   and an axes icon which indicates the +X, +Y, and
      *   +Z directions. This function can be called without
      *   parameters to create a default grid and axes icon,
      *   or it can be called according to the examples
      *   above to customize the size and position of the
      *   grid and/or axes icon. The grid is drawn using the
      *   most recently set stroke color and weight. To
      *   specify these parameters, add a call to stroke()
      *   and strokeWeight() just before the end of the
      *   draw() loop. By default, the grid will run through
      *   the origin (0,0,0) of the sketch along the XZ
      *   plane and the axes icon will be offset from the
      *   origin. Both the grid and axes icon will be sized
      *   according to the current canvas size. Note that
      *   because the grid runs parallel to the default
      *   camera view, it is often helpful to use debugMode
      *   along with orbitControl to allow full view of the
      *   grid.
      *   @param mode either GRID or AXES
      */
    inline def debugMode(mode: DEBUG_MODE): Unit = js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /**
      *   debugMode() helps visualize 3D space by adding a
      *   grid to indicate where the ‘ground’ is in a sketch
      *   and an axes icon which indicates the +X, +Y, and
      *   +Z directions. This function can be called without
      *   parameters to create a default grid and axes icon,
      *   or it can be called according to the examples
      *   above to customize the size and position of the
      *   grid and/or axes icon. The grid is drawn using the
      *   most recently set stroke color and weight. To
      *   specify these parameters, add a call to stroke()
      *   and strokeWeight() just before the end of the
      *   draw() loop. By default, the grid will run through
      *   the origin (0,0,0) of the sketch along the XZ
      *   plane and the axes icon will be offset from the
      *   origin. Both the grid and axes icon will be sized
      *   according to the current canvas size. Note that
      *   because the grid runs parallel to the default
      *   camera view, it is often helpful to use debugMode
      *   along with orbitControl to allow full view of the
      *   grid.
      *   @param mode either GRID or AXES
      *   @param [gridSize] size of one side of the grid
      *   @param [gridDivisions] number of divisions in the
      *   grid
      *   @param [xOff] X axis offset from origin (0,0,0)
      *   @param [yOff] Y axis offset from origin (0,0,0)
      *   @param [zOff] Z axis offset from origin (0,0,0)
      */
    /**
      *   debugMode() helps visualize 3D space by adding a
      *   grid to indicate where the ‘ground’ is in a sketch
      *   and an axes icon which indicates the +X, +Y, and
      *   +Z directions. This function can be called without
      *   parameters to create a default grid and axes icon,
      *   or it can be called according to the examples
      *   above to customize the size and position of the
      *   grid and/or axes icon. The grid is drawn using the
      *   most recently set stroke color and weight. To
      *   specify these parameters, add a call to stroke()
      *   and strokeWeight() just before the end of the
      *   draw() loop. By default, the grid will run through
      *   the origin (0,0,0) of the sketch along the XZ
      *   plane and the axes icon will be offset from the
      *   origin. Both the grid and axes icon will be sized
      *   according to the current canvas size. Note that
      *   because the grid runs parallel to the default
      *   camera view, it is often helpful to use debugMode
      *   along with orbitControl to allow full view of the
      *   grid.
      *   @param mode either GRID or AXES
      *   @param [axesSize] size of axes icon
      *   @param [xOff] X axis offset from origin (0,0,0)
      *   @param [yOff] Y axis offset from origin (0,0,0)
      *   @param [zOff] Z axis offset from origin (0,0,0)
      */
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT): Unit = js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Double, gridDivisions: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Double, gridDivisions: Double, xOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Double, gridDivisions: Double, xOff: Double, yOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Double,
      gridDivisions: Double,
      xOff: Double,
      yOff: Double,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Double,
      gridDivisions: Double,
      xOff: Double,
      yOff: Unit,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Double, gridDivisions: Double, xOff: Unit, yOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Double,
      gridDivisions: Double,
      xOff: Unit,
      yOff: Double,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Double,
      gridDivisions: Double,
      xOff: Unit,
      yOff: Unit,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Double, gridDivisions: Unit, xOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Double, gridDivisions: Unit, xOff: Double, yOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Double,
      gridDivisions: Unit,
      xOff: Double,
      yOff: Double,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Double,
      gridDivisions: Unit,
      xOff: Double,
      yOff: Unit,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Double, gridDivisions: Unit, xOff: Unit, yOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Double,
      gridDivisions: Unit,
      xOff: Unit,
      yOff: Double,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Double,
      gridDivisions: Unit,
      xOff: Unit,
      yOff: Unit,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Unit, gridDivisions: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Unit, gridDivisions: Double, xOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Unit, gridDivisions: Double, xOff: Double, yOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Unit,
      gridDivisions: Double,
      xOff: Double,
      yOff: Double,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Unit,
      gridDivisions: Double,
      xOff: Double,
      yOff: Unit,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Unit, gridDivisions: Double, xOff: Unit, yOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Unit,
      gridDivisions: Double,
      xOff: Unit,
      yOff: Double,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Unit,
      gridDivisions: Double,
      xOff: Unit,
      yOff: Unit,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Unit, gridDivisions: Unit, xOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Unit, gridDivisions: Unit, xOff: Double, yOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Unit,
      gridDivisions: Unit,
      xOff: Double,
      yOff: Double,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Unit,
      gridDivisions: Unit,
      xOff: Double,
      yOff: Unit,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(mode: UNKNOWN_P5_CONSTANT, gridSize: Unit, gridDivisions: Unit, xOff: Unit, yOff: Double): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Unit,
      gridDivisions: Unit,
      xOff: Unit,
      yOff: Double,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def debugMode(
      mode: UNKNOWN_P5_CONSTANT,
      gridSize: Unit,
      gridDivisions: Unit,
      xOff: Unit,
      yOff: Unit,
      zOff: Double
    ): Unit = (js.Dynamic.global.applyDynamic("debugMode")(mode.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any], gridDivisions.asInstanceOf[js.Any], xOff.asInstanceOf[js.Any], yOff.asInstanceOf[js.Any], zOff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Converts a radian measurement to its corresponding
      *   value in degrees. Radians and degrees are two ways
      *   of measuring the same thing. There are 360 degrees
      *   in a circle and 2*PI radians in a circle. For
      *   example, 90° = PI/2 = 1.5707964. This function
      *   does not take into account the current angleMode.
      *   @param radians the radians value to convert to
      *   degrees
      *   @return the converted angle
      */
    inline def degrees(radians: Double): Double = js.Dynamic.global.applyDynamic("degrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   The system variable deltaTime contains the time
      *   difference between the beginning of the previous
      *   frame and the beginning of the current frame in
      *   milliseconds. This variable is useful for creating
      *   time sensitive animation or physics calculation
      *   that should stay constant regardless of frame
      *   rate.
      */
    @JSGlobal("deltaTime")
    @js.native
    def deltaTime: Double = js.native
    inline def deltaTime_=(x: Double): Unit = js.Dynamic.global.updateDynamic("deltaTime")(x.asInstanceOf[js.Any])
    
    /**
      *   Creates a screen reader accessible description for
      *   the canvas. The first parameter should be a string
      *   with a description of the canvas. The second
      *   parameter is optional. If specified, it determines
      *   how the description is displayed. describe(text,
      *   LABEL) displays the description to all users as a
      *   tombstone or exhibit label/caption in a div
      *   adjacent to the canvas. You can style it as you
      *   wish in your CSS.
      *
      *   describe(text, FALLBACK) makes the description
      *   accessible to screen-reader users only, in  a sub
      *   DOM inside the canvas element. If a second
      *   parameter is not specified, by default, the
      *   description will only be available to
      *   screen-reader users.
      *   @param text description of the canvas
      *   @param [display] either LABEL or FALLBACK
      */
    inline def describe(text: String): Unit = js.Dynamic.global.applyDynamic("describe")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def describe(text: String, display: DESCRIBE_DISPLAY): Unit = (js.Dynamic.global.applyDynamic("describe")(text.asInstanceOf[js.Any], display.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   This function creates a screen-reader accessible
      *   description for elements —shapes or groups of
      *   shapes that create meaning together— in the
      *   canvas. The first paramater should be the name of
      *   the element. The second parameter should be a
      *   string with a description of the element. The
      *   third parameter is optional. If specified, it
      *   determines how the element description is
      *   displayed. describeElement(name, text, LABEL)
      *   displays the element description to all users as a
      *   tombstone or exhibit label/caption in a div
      *   adjacent to the canvas. You can style it as you
      *   wish in your CSS.
      *
      *   describeElement(name, text, FALLBACK) makes the
      *   element description accessible to screen-reader
      *   users only, in  a sub DOM inside the canvas
      *   element. If a second parameter is not specified,
      *   by default, the element description will only be
      *   available to screen-reader users.
      *   @param name name of the element
      *   @param text description of the element
      *   @param [display] either LABEL or FALLBACK
      */
    inline def describeElement(name: String, text: String): Unit = (js.Dynamic.global.applyDynamic("describeElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def describeElement(name: String, text: String, display: DESCRIBE_DISPLAY): Unit = (js.Dynamic.global.applyDynamic("describeElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], display.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   The deviceMoved() function is called when the
      *   device is moved by more than the threshold value
      *   along X, Y or Z axis. The default threshold is set
      *   to 0.5. The threshold value can be changed using
      *   setMoveThreshold().
      */
    inline def deviceMoved(): Unit = js.Dynamic.global.applyDynamic("deviceMoved")().asInstanceOf[Unit]
    
    /**
      *   The system variable deviceOrientation always
      *   contains the orientation of the device. The value
      *   of this variable will either be set 'landscape' or
      *   'portrait'. If no data is available it will be set
      *   to 'undefined'. either LANDSCAPE or PORTRAIT.
      */
    @JSGlobal("deviceOrientation")
    @js.native
    def deviceOrientation: UNKNOWN_P5_CONSTANT = js.native
    inline def deviceOrientation_=(x: UNKNOWN_P5_CONSTANT): Unit = js.Dynamic.global.updateDynamic("deviceOrientation")(x.asInstanceOf[js.Any])
    
    /**
      *   The deviceShaken() function is called when the
      *   device total acceleration changes of accelerationX
      *   and accelerationY values is more than the
      *   threshold value. The default threshold is set to
      *   30. The threshold value can be changed using
      *   setShakeThreshold().
      */
    inline def deviceShaken(): Unit = js.Dynamic.global.applyDynamic("deviceShaken")().asInstanceOf[Unit]
    
    /**
      *   The deviceTurned() function is called when the
      *   device rotates by more than 90 degrees
      *   continuously. The axis that triggers the
      *   deviceTurned() method is stored in the turnAxis
      *   variable. The deviceTurned() method can be locked
      *   to trigger on any axis: X, Y or Z by comparing the
      *   turnAxis variable to 'X', 'Y' or 'Z'.
      */
    inline def deviceTurned(): Unit = js.Dynamic.global.applyDynamic("deviceTurned")().asInstanceOf[Unit]
    
    inline def directionalLight(color: String, position: Vector): ^ = (js.Dynamic.global.applyDynamic("directionalLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def directionalLight(color: String, x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("directionalLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Creates a directional light with a color and a
      *   direction A maximum of 5 directionalLight can be
      *   active at one time
      *   @param color color Array, CSS color string, or
      *   p5.Color value
      *   @param position the direction of the light
      *   @chainable
      */
    inline def directionalLight(color: js.Array[Double], position: Vector): ^ = (js.Dynamic.global.applyDynamic("directionalLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Creates a directional light with a color and a
      *   direction A maximum of 5 directionalLight can be
      *   active at one time
      *   @param color color Array, CSS color string, or
      *   p5.Color value
      *   @param x x axis direction
      *   @param y y axis direction
      *   @param z z axis direction
      *   @chainable
      */
    inline def directionalLight(color: js.Array[Double], x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("directionalLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def directionalLight(color: Color, position: Vector): ^ = (js.Dynamic.global.applyDynamic("directionalLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def directionalLight(color: Color, x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("directionalLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Creates a directional light with a color and a
      *   direction A maximum of 5 directionalLight can be
      *   active at one time
      *   @param v1 red or hue value (depending on the
      *   current color mode),
      *   @param v2 green or saturation value
      *   @param v3 blue or brightness value
      *   @param position the direction of the light
      *   @chainable
      */
    inline def directionalLight(v1: Double, v2: Double, v3: Double, position: Vector): ^ = (js.Dynamic.global.applyDynamic("directionalLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Creates a directional light with a color and a
      *   direction A maximum of 5 directionalLight can be
      *   active at one time
      *   @param v1 red or hue value (depending on the
      *   current color mode),
      *   @param v2 green or saturation value
      *   @param v3 blue or brightness value
      *   @param x x axis direction
      *   @param y y axis direction
      *   @param z z axis direction
      *   @chainable
      */
    inline def directionalLight(v1: Double, v2: Double, v3: Double, x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("directionalLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Returns the pixel density of the current display
      *   the sketch is running on.
      *   @return current pixel density of the display
      */
    inline def displayDensity(): Double = js.Dynamic.global.applyDynamic("displayDensity")().asInstanceOf[Double]
    
    /**
      *   System variable that stores the height of the
      *   screen display according to The default
      *   pixelDensity. This is used to run a full-screen
      *   program on any display size. To return actual
      *   screen size, multiply this by pixelDensity.
      */
    @JSGlobal("displayHeight")
    @js.native
    def displayHeight: Double = js.native
    inline def displayHeight_=(x: Double): Unit = js.Dynamic.global.updateDynamic("displayHeight")(x.asInstanceOf[js.Any])
    
    /**
      *   System variable that stores the width of the
      *   screen display according to The default
      *   pixelDensity. This is used to run a full-screen
      *   program on any display size. To return actual
      *   screen size, multiply this by pixelDensity.
      */
    @JSGlobal("displayWidth")
    @js.native
    def displayWidth: Double = js.native
    inline def displayWidth_=(x: Double): Unit = js.Dynamic.global.updateDynamic("displayWidth")(x.asInstanceOf[js.Any])
    
    /**
      *   Calculates the distance between two points, in
      *   either two or three dimensions. If you looking for
      *   distance between two vectors see dist()
      *   @param x1 x-coordinate of the first point
      *   @param y1 y-coordinate of the first point
      *   @param x2 x-coordinate of the second point
      *   @param y2 y-coordinate of the second point
      *   @return distance between the two points
      */
    inline def dist(x1: Double, y1: Double, x2: Double, y2: Double): Double = (js.Dynamic.global.applyDynamic("dist")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    /**
      *   Calculates the distance between two points, in
      *   either two or three dimensions. If you looking for
      *   distance between two vectors see dist()
      *   @param x1 x-coordinate of the first point
      *   @param y1 y-coordinate of the first point
      *   @param z1 z-coordinate of the first point
      *   @param x2 x-coordinate of the second point
      *   @param y2 y-coordinate of the second point
      *   @param z2 z-coordinate of the second point
      *   @return distance between the two points
      */
    inline def dist(x1: Double, y1: Double, z1: Double, x2: Double, y2: Double, z2: Double): Double = (js.Dynamic.global.applyDynamic("dist")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   The doubleClicked() function is executed every
      *   time a event listener has detected a dblclick
      *   event which is a part of the DOM L3 specification.
      *   The doubleClicked event is fired when a pointing
      *   device button (usually a mouse's primary button)
      *   is clicked twice on a single element. For more
      *   info on the dblclick event refer to mozilla's
      *   documentation here:
      *   https://developer.mozilla.org/en-US/docs/Web/Events/dblclick
      *   @param [event] optional MouseEvent callback
      *   argument.
      */
    inline def doubleClicked(): Unit = js.Dynamic.global.applyDynamic("doubleClicked")().asInstanceOf[Unit]
    inline def doubleClicked(event: js.Object): Unit = js.Dynamic.global.applyDynamic("doubleClicked")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The p5.js API provides a lot of functionality for
      *   creating graphics, but there is some native HTML5
      *   Canvas functionality that is not exposed by p5.
      *   You can still call it directly using the variable
      *   drawingContext, as in the example shown. This is
      *   the equivalent of calling canvas.getContext('2d');
      *   or canvas.getContext('webgl');. See this
      *   reference for the native canvas API for possible
      *   drawing functions you can call.
      */
    @JSGlobal("drawingContext")
    @js.native
    def drawingContext: Any = js.native
    inline def drawingContext_=(x: Any): Unit = js.Dynamic.global.updateDynamic("drawingContext")(x.asInstanceOf[js.Any])
    
    /**
      *   Draws an ellipse (oval) to the screen. By default,
      *   the first two parameters set the location of the
      *   center of the ellipse, and the third and fourth
      *   parameters set the shape's width and height. If no
      *   height is specified, the value of width is used
      *   for both the width and height. If a negative
      *   height or width is specified, the absolute value
      *   is taken. An ellipse with equal width and height
      *   is a circle. The origin may be changed with the
      *   ellipseMode() function.
      *   @param x x-coordinate of the center of ellipse.
      *   @param y y-coordinate of the center of ellipse.
      *   @param w width of the ellipse.
      *   @param [h] height of the ellipse.
      *   @chainable
      */
    inline def ellipse(x: Double, y: Double, w: Double): ^ = (js.Dynamic.global.applyDynamic("ellipse")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Draws an ellipse (oval) to the screen. By default,
      *   the first two parameters set the location of the
      *   center of the ellipse, and the third and fourth
      *   parameters set the shape's width and height. If no
      *   height is specified, the value of width is used
      *   for both the width and height. If a negative
      *   height or width is specified, the absolute value
      *   is taken. An ellipse with equal width and height
      *   is a circle. The origin may be changed with the
      *   ellipseMode() function.
      *   @param x x-coordinate of the center of ellipse.
      *   @param y y-coordinate of the center of ellipse.
      *   @param w width of the ellipse.
      *   @param h height of the ellipse.
      *   @param [detail] optional parameter for WebGL mode
      *   only. This is to specify the number of vertices
      *   that makes up the perimeter of the ellipse.
      *   Default value is 25. Won't draw a stroke for a
      *   detail of more than 50.
      */
    inline def ellipse(x: Double, y: Double, w: Double, h: Double): Unit = (js.Dynamic.global.applyDynamic("ellipse")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ellipse(x: Double, y: Double, w: Double, h: Double, detail: Double): Unit = (js.Dynamic.global.applyDynamic("ellipse")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Modifies the location from which ellipses are
      *   drawn by changing the way in which parameters
      *   given to ellipse(), circle() and arc() are
      *   interpreted. The default mode is CENTER, in which
      *   the first two parameters are interpreted as the
      *   shape's center point's x and y coordinates
      *   respectively, while the third and fourth
      *   parameters are its width and height.
      *
      *   ellipseMode(RADIUS) also uses the first two
      *   parameters as the shape's center point's x and y
      *   coordinates, but uses the third and fourth
      *   parameters to specify half of the shapes's width
      *   and height.
      *
      *   ellipseMode(CORNER) interprets the first two
      *   parameters as the upper-left corner of the shape,
      *   while the third and fourth parameters are its
      *   width and height.
      *
      *   ellipseMode(CORNERS) interprets the first two
      *   parameters as the location of one corner of the
      *   ellipse's bounding box, and the third and fourth
      *   parameters as the location of the opposite corner.
      *
      *   The parameter to this method must be written in
      *   ALL CAPS because they are predefined as constants
      *   in ALL CAPS and Javascript is a case-sensitive
      *   language.
      *   @param mode either CENTER, RADIUS, CORNER, or
      *   CORNERS
      *   @chainable
      */
    inline def ellipseMode(mode: ELLIPSE_MODE): ^ = js.Dynamic.global.applyDynamic("ellipseMode")(mode.asInstanceOf[js.Any]).asInstanceOf[^]
    
    inline def `ellipse_^`(x: Double, y: Double, w: Double, h: Double): ^ = (js.Dynamic.global.applyDynamic("ellipse")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Draw an ellipsoid with given radius DetailX and
      *   detailY determine the number of subdivisions in
      *   the x-dimension and the y-dimension of a cone.
      *   More subdivisions make the ellipsoid appear to be
      *   smoother. Avoid detail number above 150, it may
      *   crash the browser.
      *   @param [radiusx] x-radius of ellipsoid
      *   @param [radiusy] y-radius of ellipsoid
      *   @param [radiusz] z-radius of ellipsoid
      *   @param [detailX] number of segments, the more
      *   segments the smoother geometry default is 24.
      *   Avoid detail number above 150, it may crash the
      *   browser.
      *   @param [detailY] number of segments, the more
      *   segments the smoother geometry default is 16.
      *   Avoid detail number above 150, it may crash the
      *   browser.
      *   @chainable
      */
    inline def ellipsoid(): ^ = js.Dynamic.global.applyDynamic("ellipsoid")().asInstanceOf[^]
    inline def ellipsoid(radiusx: Double): ^ = js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Double, radiusz: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Double, radiusz: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Double, radiusz: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Double, radiusz: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Double, radiusz: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Double, radiusz: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Double, radiusz: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Unit, radiusz: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Unit, radiusz: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Unit, radiusz: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Unit, radiusz: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Unit, radiusz: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Unit, radiusz: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Double, radiusy: Unit, radiusz: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Double, radiusz: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Double, radiusz: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Double, radiusz: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Double, radiusz: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Double, radiusz: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Double, radiusz: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Double, radiusz: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Unit, radiusz: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Unit, radiusz: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Unit, radiusz: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Unit, radiusz: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Unit, radiusz: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Unit, radiusz: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def ellipsoid(radiusx: Unit, radiusy: Unit, radiusz: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("ellipsoid")(radiusx.asInstanceOf[js.Any], radiusy.asInstanceOf[js.Any], radiusz.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    
    inline def emissiveMaterial(color: String): ^ = js.Dynamic.global.applyDynamic("emissiveMaterial")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Sets the emissive color of the material used for
      *   geometry drawn to the screen. This is a misnomer
      *   in the sense that the material does not actually
      *   emit light that effects surrounding polygons.
      *   Instead, it gives the appearance that the object
      *   is glowing. An emissive material will display at
      *   full strength even if there is no light for it to
      *   reflect.
      *   @param color color, color Array, or CSS color
      *   string
      *   @chainable
      */
    inline def emissiveMaterial(color: js.Array[Double]): ^ = js.Dynamic.global.applyDynamic("emissiveMaterial")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def emissiveMaterial(color: Color): ^ = js.Dynamic.global.applyDynamic("emissiveMaterial")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Sets the emissive color of the material used for
      *   geometry drawn to the screen. This is a misnomer
      *   in the sense that the material does not actually
      *   emit light that effects surrounding polygons.
      *   Instead, it gives the appearance that the object
      *   is glowing. An emissive material will display at
      *   full strength even if there is no light for it to
      *   reflect.
      *   @param v1 gray value, red or hue value (depending
      *   on the current color mode),
      *   @param [v2] green or saturation value
      *   @param [v3] blue or brightness value
      *   @param [a] opacity
      *   @chainable
      */
    inline def emissiveMaterial(v1: Double): ^ = js.Dynamic.global.applyDynamic("emissiveMaterial")(v1.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def emissiveMaterial(v1: Double, v2: Double): ^ = (js.Dynamic.global.applyDynamic("emissiveMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def emissiveMaterial(v1: Double, v2: Double, v3: Double): ^ = (js.Dynamic.global.applyDynamic("emissiveMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def emissiveMaterial(v1: Double, v2: Double, v3: Double, a: Double): ^ = (js.Dynamic.global.applyDynamic("emissiveMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def emissiveMaterial(v1: Double, v2: Double, v3: Unit, a: Double): ^ = (js.Dynamic.global.applyDynamic("emissiveMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def emissiveMaterial(v1: Double, v2: Unit, v3: Double): ^ = (js.Dynamic.global.applyDynamic("emissiveMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def emissiveMaterial(v1: Double, v2: Unit, v3: Double, a: Double): ^ = (js.Dynamic.global.applyDynamic("emissiveMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def emissiveMaterial(v1: Double, v2: Unit, v3: Unit, a: Double): ^ = (js.Dynamic.global.applyDynamic("emissiveMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Use the beginContour() and endContour() functions
      *   to create negative shapes within shapes such as
      *   the center of the letter 'O'. beginContour()
      *   begins recording vertices for the shape and
      *   endContour() stops recording. The vertices that
      *   define a negative shape must "wind" in the
      *   opposite direction from the exterior shape. First
      *   draw vertices for the exterior clockwise order,
      *   then for internal shapes, draw vertices shape in
      *   counter-clockwise. These functions can only be
      *   used within a beginShape()/endShape() pair and
      *   transformations such as translate(), rotate(), and
      *   scale() do not work within a
      *   beginContour()/endContour() pair. It is also not
      *   possible to use other shapes, such as ellipse() or
      *   rect() within.
      *   @chainable
      */
    inline def endContour(): ^ = js.Dynamic.global.applyDynamic("endContour")().asInstanceOf[^]
    
    /**
      *   The endShape() function is the companion to
      *   beginShape() and may only be called after
      *   beginShape(). When endShape() is called, all of
      *   image data defined since the previous call to
      *   beginShape() is written into the image buffer. The
      *   constant CLOSE as the value for the MODE parameter
      *   to close the shape (to connect the beginning and
      *   the end).
      *   @param [mode] use CLOSE to close the shape
      *   @chainable
      */
    inline def endShape(): ^ = js.Dynamic.global.applyDynamic("endShape")().asInstanceOf[^]
    inline def endShape(mode: END_MODE): ^ = js.Dynamic.global.applyDynamic("endShape")(mode.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   All drawing that follows erase() will subtract
      *   from the canvas.Erased areas will reveal the web
      *   page underneath the canvas.Erasing can be canceled
      *   with noErase(). Drawing done with image() and
      *   background() in between erase() and noErase() will
      *   not erase the canvas but works as usual.
      *   @param [strengthFill] A number (0-255) for the
      *   strength of erasing for a shape's fill. This will
      *   default to 255 when no argument is given, which is
      *   full strength.
      *   @param [strengthStroke] A number (0-255) for the
      *   strength of erasing for a shape's stroke. This
      *   will default to 255 when no argument is given,
      *   which is full strength.
      *   @chainable
      */
    inline def erase(): ^ = js.Dynamic.global.applyDynamic("erase")().asInstanceOf[^]
    inline def erase(strengthFill: Double): ^ = js.Dynamic.global.applyDynamic("erase")(strengthFill.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def erase(strengthFill: Double, strengthStroke: Double): ^ = (js.Dynamic.global.applyDynamic("erase")(strengthFill.asInstanceOf[js.Any], strengthStroke.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def erase(strengthFill: Unit, strengthStroke: Double): ^ = (js.Dynamic.global.applyDynamic("erase")(strengthFill.asInstanceOf[js.Any], strengthStroke.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   The function exitPointerLock() exits a previously
      *   triggered pointer Lock for example to make ui
      *   elements usable etc
      */
    inline def exitPointerLock(): Unit = js.Dynamic.global.applyDynamic("exitPointerLock")().asInstanceOf[Unit]
    
    /**
      *   Returns Euler's number e (2.71828...) raised to
      *   the power of the n parameter. Maps to Math.exp().
      *   @param n exponent to raise
      *   @return e^n
      */
    inline def exp(n: Double): Double = js.Dynamic.global.applyDynamic("exp")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Sets the color used to fill shapes. For example,
      *   if you run fill(204, 102, 0), all shapes drawn
      *   after the fill command will be filled with the
      *   color orange. This color is either specified in
      *   terms of the RGB or HSB color depending on the
      *   current colorMode(). (The default color space is
      *   RGB, with each value in the range from 0 to 255).
      *   The alpha range by default is also 0 to 255. If a
      *   single string argument is provided, RGB, RGBA and
      *   Hex CSS color strings and all named color strings
      *   are supported. In this case, an alpha number value
      *   as a second argument is not supported, the RGBA
      *   form should be used.
      *
      *   A p5 Color object can also be provided to set the
      *   fill color.
      *   @param color the fill color
      *   @chainable
      */
    inline def fill(color: Color): ^ = js.Dynamic.global.applyDynamic("fill")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Sets the color used to fill shapes. For example,
      *   if you run fill(204, 102, 0), all shapes drawn
      *   after the fill command will be filled with the
      *   color orange. This color is either specified in
      *   terms of the RGB or HSB color depending on the
      *   current colorMode(). (The default color space is
      *   RGB, with each value in the range from 0 to 255).
      *   The alpha range by default is also 0 to 255. If a
      *   single string argument is provided, RGB, RGBA and
      *   Hex CSS color strings and all named color strings
      *   are supported. In this case, an alpha number value
      *   as a second argument is not supported, the RGBA
      *   form should be used.
      *
      *   A p5 Color object can also be provided to set the
      *   fill color.
      *   @param gray a gray value
      *   @chainable
      */
    inline def fill(gray: Double): ^ = js.Dynamic.global.applyDynamic("fill")(gray.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def fill(gray: Double, alpha: Double): ^ = (js.Dynamic.global.applyDynamic("fill")(gray.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Sets the color used to fill shapes. For example,
      *   if you run fill(204, 102, 0), all shapes drawn
      *   after the fill command will be filled with the
      *   color orange. This color is either specified in
      *   terms of the RGB or HSB color depending on the
      *   current colorMode(). (The default color space is
      *   RGB, with each value in the range from 0 to 255).
      *   The alpha range by default is also 0 to 255. If a
      *   single string argument is provided, RGB, RGBA and
      *   Hex CSS color strings and all named color strings
      *   are supported. In this case, an alpha number value
      *   as a second argument is not supported, the RGBA
      *   form should be used.
      *
      *   A p5 Color object can also be provided to set the
      *   fill color.
      *   @param v1 red or hue value relative to the current
      *   color range
      *   @param v2 green or saturation value relative to
      *   the current color range
      *   @param v3 blue or brightness value relative to the
      *   current color range
      *   @chainable
      */
    inline def fill(v1: Double, v2: Double, v3: Double): ^ = (js.Dynamic.global.applyDynamic("fill")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def fill(v1: Double, v2: Double, v3: Double, alpha: Double): ^ = (js.Dynamic.global.applyDynamic("fill")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Sets the color used to fill shapes. For example,
      *   if you run fill(204, 102, 0), all shapes drawn
      *   after the fill command will be filled with the
      *   color orange. This color is either specified in
      *   terms of the RGB or HSB color depending on the
      *   current colorMode(). (The default color space is
      *   RGB, with each value in the range from 0 to 255).
      *   The alpha range by default is also 0 to 255. If a
      *   single string argument is provided, RGB, RGBA and
      *   Hex CSS color strings and all named color strings
      *   are supported. In this case, an alpha number value
      *   as a second argument is not supported, the RGBA
      *   form should be used.
      *
      *   A p5 Color object can also be provided to set the
      *   fill color.
      *   @param value a color string
      *   @chainable
      */
    inline def fill(value: String): ^ = js.Dynamic.global.applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Sets the color used to fill shapes. For example,
      *   if you run fill(204, 102, 0), all shapes drawn
      *   after the fill command will be filled with the
      *   color orange. This color is either specified in
      *   terms of the RGB or HSB color depending on the
      *   current colorMode(). (The default color space is
      *   RGB, with each value in the range from 0 to 255).
      *   The alpha range by default is also 0 to 255. If a
      *   single string argument is provided, RGB, RGBA and
      *   Hex CSS color strings and all named color strings
      *   are supported. In this case, an alpha number value
      *   as a second argument is not supported, the RGBA
      *   form should be used.
      *
      *   A p5 Color object can also be provided to set the
      *   fill color.
      *   @param values an array containing the
      *   red,green,blue & and alpha components of the color
      *   @chainable
      */
    inline def fill(values: js.Array[Double]): ^ = js.Dynamic.global.applyDynamic("fill")(values.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Applies a filter to the canvas. The presets
      *   options are: THRESHOLD Converts the image to black
      *   and white pixels depending if they are above or
      *   below the threshold defined by the level
      *   parameter. The parameter must be between 0.0
      *   (black) and 1.0 (white). If no level is specified,
      *   0.5 is used.
      *
      *   GRAY Converts any colors in the image to grayscale
      *   equivalents. No parameter is used.
      *
      *   OPAQUE Sets the alpha channel to entirely opaque.
      *   No parameter is used.
      *
      *   INVERT Sets each pixel to its inverse value. No
      *   parameter is used.
      *
      *   POSTERIZE Limits each channel of the image to the
      *   number of colors specified as the parameter. The
      *   parameter can be set to values between 2 and 255,
      *   but results are most noticeable in the lower
      *   ranges.
      *
      *   BLUR Executes a Gaussian blur with the level
      *   parameter specifying the extent of the blurring.
      *   If no parameter is used, the blur is equivalent to
      *   Gaussian blur of radius 1. Larger values increase
      *   the blur.
      *
      *   ERODE Reduces the light areas. No parameter is
      *   used.
      *
      *   DILATE Increases the light areas. No parameter is
      *   used.
      *
      *   filter() does not work in WEBGL mode. A similar
      *   effect can be achieved in WEBGL mode using custom
      *   shaders. Adam Ferriss has written a selection of
      *   shader examples that contains many of the effects
      *   present in the filter examples.
      *   @param filterType either THRESHOLD, GRAY, OPAQUE,
      *   INVERT, POSTERIZE, BLUR, ERODE, DILATE or BLUR.
      *   See Filters.js for docs on each available filter
      *   @param [filterParam] an optional parameter unique
      *   to each filter, see above
      */
    inline def filter(filterType: FILTER_TYPE): Unit = js.Dynamic.global.applyDynamic("filter")(filterType.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def filter(filterType: FILTER_TYPE, filterParam: Double): Unit = (js.Dynamic.global.applyDynamic("filter")(filterType.asInstanceOf[js.Any], filterParam.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Converts a string to its floating point
      *   representation. The contents of a string must
      *   resemble a number, or NaN (not a number) will be
      *   returned. For example, float("1234.56") evaluates
      *   to 1234.56, but float("giraffe") will return NaN.
      *   When an array of values is passed in, then an
      *   array of floats of the same length is returned.
      *   @param str float string to parse
      *   @return floating point representation of string
      */
    inline def float(str: String): Double = js.Dynamic.global.applyDynamic("float")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Calculates the closest int value that is less than
      *   or equal to the value of the parameter. Maps to
      *   Math.floor().
      *   @param n number to round down
      *   @return rounded down number
      */
    inline def floor(n: Double): Double = js.Dynamic.global.applyDynamic("floor")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Confirms if the window a p5.js program is in is
      *   "focused," meaning that the sketch will accept
      *   mouse or keyboard input. This variable is "true"
      *   if the window is focused and "false" if not.
      */
    @JSGlobal("focused")
    @js.native
    def focused: Boolean = js.native
    inline def focused_=(x: Boolean): Unit = js.Dynamic.global.updateDynamic("focused")(x.asInstanceOf[js.Any])
    
    /**
      *   Calculates the fractional part of a number.
      *   @param num Number whose fractional part needs to
      *   be found out
      *   @return fractional part of x, i.e, {x}
      */
    inline def fract(num: Double): Double = js.Dynamic.global.applyDynamic("fract")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   The system variable frameCount contains the number
      *   of frames that have been displayed since the
      *   program started. Inside setup() the value is 0,
      *   after the first iteration of draw it is 1, etc.
      */
    @JSGlobal("frameCount")
    @js.native
    def frameCount: Double = js.native
    inline def frameCount_=(x: Double): Unit = js.Dynamic.global.updateDynamic("frameCount")(x.asInstanceOf[js.Any])
    
    /**
      *   Specifies the number of frames to be displayed
      *   every second. For example, the function call
      *   frameRate(30) will attempt to refresh 30 times a
      *   second. If the processor is not fast enough to
      *   maintain the specified rate, the frame rate will
      *   not be achieved. Setting the frame rate within
      *   setup() is recommended. The default frame rate is
      *   based on the frame rate of the display (here also
      *   called "refresh rate"), which is set to 60 frames
      *   per second on most computers. A frame rate of 24
      *   frames per second (usual for movies) or above will
      *   be enough for smooth animations. This is the same
      *   as setFrameRate(val). Calling frameRate() with no
      *   arguments returns the current framerate. The draw
      *   function must run at least once before it will
      *   return a value. This is the same as
      *   getFrameRate().
      *
      *   Calling frameRate() with arguments that are not of
      *   the type numbers or are non positive also returns
      *   current framerate.
      *   @return current frameRate
      */
    inline def frameRate(): Double = js.Dynamic.global.applyDynamic("frameRate")().asInstanceOf[Double]
    /**
      *   Specifies the number of frames to be displayed
      *   every second. For example, the function call
      *   frameRate(30) will attempt to refresh 30 times a
      *   second. If the processor is not fast enough to
      *   maintain the specified rate, the frame rate will
      *   not be achieved. Setting the frame rate within
      *   setup() is recommended. The default frame rate is
      *   based on the frame rate of the display (here also
      *   called "refresh rate"), which is set to 60 frames
      *   per second on most computers. A frame rate of 24
      *   frames per second (usual for movies) or above will
      *   be enough for smooth animations. This is the same
      *   as setFrameRate(val). Calling frameRate() with no
      *   arguments returns the current framerate. The draw
      *   function must run at least once before it will
      *   return a value. This is the same as
      *   getFrameRate().
      *
      *   Calling frameRate() with arguments that are not of
      *   the type numbers or are non positive also returns
      *   current framerate.
      *   @param fps number of frames to be displayed every
      *   second
      *   @chainable
      */
    inline def frameRate(fps: Double): ^ = js.Dynamic.global.applyDynamic("frameRate")(fps.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Returns the closest MIDI note value for a given
      *   frequency.
      *   @param frequency A freqeuncy, for example, the "A"
      *   above Middle C is 440Hz
      *   @return MIDI note value
      */
    inline def freqToMidi(frequency: Double): Double = js.Dynamic.global.applyDynamic("freqToMidi")(frequency.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Sets the frustum of the current camera as defined
      *   by the parameters. A frustum is a geometric form:
      *   a pyramid with its top cut off. With the viewer's
      *   eye at the imaginary top of the pyramid, the six
      *   planes of the frustum act as clipping planes when
      *   rendering a 3D view. Thus, any form inside the
      *   clipping planes is visible; anything outside those
      *   planes is not visible.
      *
      *   Setting the frustum changes the perspective of the
      *   scene being rendered. This can be achieved more
      *   simply in many cases by using perspective().
      *
      *   If no parameters are given, the following default
      *   is used: frustum(-width/2, width/2, -height/2,
      *   height/2, 0, max(width, height)).
      *   @param [left] camera frustum left plane
      *   @param [right] camera frustum right plane
      *   @param [bottom] camera frustum bottom plane
      *   @param [top] camera frustum top plane
      *   @param [near] camera frustum near plane
      *   @param [far] camera frustum far plane
      *   @chainable
      */
    inline def frustum(
      left: js.UndefOr[Double],
      right: js.UndefOr[Double],
      bottom: js.UndefOr[Double],
      top: js.UndefOr[Double],
      near: js.UndefOr[Double],
      far: js.UndefOr[Double]
    ): ^ = (js.Dynamic.global.applyDynamic("frustum")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   If argument is given, sets the sketch to
      *   fullscreen or not based on the value of the
      *   argument. If no argument is given, returns the
      *   current fullscreen state. Note that due to browser
      *   restrictions this can only be called on user
      *   input, for example, on mouse press like the
      *   example below.
      *   @param [val] whether the sketch should be in
      *   fullscreen mode or not
      *   @return current fullscreen state
      */
    inline def fullscreen(): Boolean = js.Dynamic.global.applyDynamic("fullscreen")().asInstanceOf[Boolean]
    inline def fullscreen(`val`: Boolean): Boolean = js.Dynamic.global.applyDynamic("fullscreen")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      *   Get a region of pixels, or a single pixel, from
      *   the canvas. Returns an array of [R,G,B,A] values
      *   for any pixel or grabs a section of an image. If
      *   no parameters are specified, the entire image is
      *   returned. Use the x and y parameters to get the
      *   value of one pixel. Get a section of the display
      *   window by specifying additional w and h
      *   parameters. When getting an image, the x and y
      *   parameters define the coordinates for the
      *   upper-left corner of the image, regardless of the
      *   current imageMode().
      *
      *   Getting the color of a single pixel with get(x, y)
      *   is easy, but not as fast as grabbing the data
      *   directly from pixels[]. The equivalent statement
      *   to get(x, y) using pixels[] with pixel density d
      *   is
      *
      *   let x, y, d; // set these to the coordinates let
      *   off = (y * width + x) * d * 4; let components = [
      *   pixels[off], pixels[off + 1], pixels[off + 2],
      *   pixels[off + 3] ]; print(components);
      *
      *   See the reference for pixels[] for more
      *   information.
      *
      *   If you want to extract an array of colors or a
      *   subimage from an p5.Image object, take a look at
      *   p5.Image.get()
      *   @return the whole p5.Image
      */
    inline def get(): Image = js.Dynamic.global.applyDynamic("get")().asInstanceOf[Image]
    /**
      *   Get a region of pixels, or a single pixel, from
      *   the canvas. Returns an array of [R,G,B,A] values
      *   for any pixel or grabs a section of an image. If
      *   no parameters are specified, the entire image is
      *   returned. Use the x and y parameters to get the
      *   value of one pixel. Get a section of the display
      *   window by specifying additional w and h
      *   parameters. When getting an image, the x and y
      *   parameters define the coordinates for the
      *   upper-left corner of the image, regardless of the
      *   current imageMode().
      *
      *   Getting the color of a single pixel with get(x, y)
      *   is easy, but not as fast as grabbing the data
      *   directly from pixels[]. The equivalent statement
      *   to get(x, y) using pixels[] with pixel density d
      *   is
      *
      *   let x, y, d; // set these to the coordinates let
      *   off = (y * width + x) * d * 4; let components = [
      *   pixels[off], pixels[off + 1], pixels[off + 2],
      *   pixels[off + 3] ]; print(components);
      *
      *   See the reference for pixels[] for more
      *   information.
      *
      *   If you want to extract an array of colors or a
      *   subimage from an p5.Image object, take a look at
      *   p5.Image.get()
      *   @param x x-coordinate of the pixel
      *   @param y y-coordinate of the pixel
      *   @return color of pixel at x,y in array format [R,
      *   G, B, A]
      */
    inline def get(x: Double, y: Double): js.Array[Double] = (js.Dynamic.global.applyDynamic("get")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    /**
      *   Get a region of pixels, or a single pixel, from
      *   the canvas. Returns an array of [R,G,B,A] values
      *   for any pixel or grabs a section of an image. If
      *   no parameters are specified, the entire image is
      *   returned. Use the x and y parameters to get the
      *   value of one pixel. Get a section of the display
      *   window by specifying additional w and h
      *   parameters. When getting an image, the x and y
      *   parameters define the coordinates for the
      *   upper-left corner of the image, regardless of the
      *   current imageMode().
      *
      *   Getting the color of a single pixel with get(x, y)
      *   is easy, but not as fast as grabbing the data
      *   directly from pixels[]. The equivalent statement
      *   to get(x, y) using pixels[] with pixel density d
      *   is
      *
      *   let x, y, d; // set these to the coordinates let
      *   off = (y * width + x) * d * 4; let components = [
      *   pixels[off], pixels[off + 1], pixels[off + 2],
      *   pixels[off + 3] ]; print(components);
      *
      *   See the reference for pixels[] for more
      *   information.
      *
      *   If you want to extract an array of colors or a
      *   subimage from an p5.Image object, take a look at
      *   p5.Image.get()
      *   @param x x-coordinate of the pixel
      *   @param y y-coordinate of the pixel
      *   @param w width
      *   @param h height
      *   @return the rectangle p5.Image
      */
    inline def get(x: Double, y: Double, w: Double, h: Double): Image = (js.Dynamic.global.applyDynamic("get")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Image]
    
    /**
      *   Returns the Audio Context for this sketch. Useful
      *   for users who would like to dig deeper into the
      *   Web Audio API . Some browsers require users to
      *   startAudioContext with a user gesture, such as
      *   touchStarted in the example below.
      *   @return AudioContext for this sketch
      */
    inline def getAudioContext(): js.Object = js.Dynamic.global.applyDynamic("getAudioContext")().asInstanceOf[js.Object]
    
    /**
      *   Returns the value of an item that was stored in
      *   local storage using storeItem()
      *   @param key name that you wish to use to store in
      *   local storage
      *   @return Value of stored item
      */
    inline def getItem(key: String): Double | js.Object | String | Boolean | Color | Vector = js.Dynamic.global.applyDynamic("getItem")(key.asInstanceOf[js.Any]).asInstanceOf[Double | js.Object | String | Boolean | Color | Vector]
    
    // TODO: Fix userStartAudio() errors in lib/addons/p5.sound.js, line 198:
    //
    //    param "element(s)" is not a valid JS symbol name
    //
    // function userStartAudio(element(s)?: Element|any[], callback?: (...args: any[]) => any): Promise<any>
    /**
      *   Returns a number representing the output volume
      *   for sound in this sketch.
      *   @return Output volume for sound in this sketch.
      *   Should be between 0.0 (silence) and 1.0.
      */
    inline def getOutputVolume(): Double = js.Dynamic.global.applyDynamic("getOutputVolume")().asInstanceOf[Double]
    
    /**
      *   Gets the current URL. Note: when using the p5
      *   Editor, this will return an empty object because
      *   the sketch is embedded in an iframe. It will work
      *   correctly if you view the sketch using the
      *   editor's present or share URLs.
      *   @return url
      */
    inline def getURL(): String = js.Dynamic.global.applyDynamic("getURL")().asInstanceOf[String]
    
    /**
      *   Gets the current URL params as an Object. Note:
      *   when using the p5 Editor, this will return an
      *   empty object because the sketch is embedded in an
      *   iframe. It will work correctly if you view the
      *   sketch using the editor's present or share URLs.
      *   @return URL params
      */
    inline def getURLParams(): js.Object = js.Dynamic.global.applyDynamic("getURLParams")().asInstanceOf[js.Object]
    
    /**
      *   Gets the current URL path as an array. Note: when
      *   using the p5 Editor, this will return an empty
      *   object because the sketch is embedded in an
      *   iframe. It will work correctly if you view the
      *   sketch using the editor's present or share URLs.
      *   @return path components
      */
    inline def getURLPath(): js.Array[String] = js.Dynamic.global.applyDynamic("getURLPath")().asInstanceOf[js.Array[String]]
    
    inline def green(color: String): Double = js.Dynamic.global.applyDynamic("green")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def green(color: js.Array[Double]): Double = js.Dynamic.global.applyDynamic("green")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      *   Extracts the green value from a color or pixel
      *   array.
      *   @param color p5.Color object, color components, or
      *   CSS color
      *   @return the green value
      */
    inline def green(color: Color): Double = js.Dynamic.global.applyDynamic("green")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   gridOutput() lays out the content of the canvas in
      *   the form of a grid (html table) based on the
      *   spatial location of each shape. A brief
      *   description of the canvas is available before the
      *   table output. This description includes: color of
      *   the background, size of the canvas, number of
      *   objects, and object types (example: "lavender blue
      *   canvas is 200 by 200 and contains 4 objects - 3
      *   ellipses 1 rectangle"). The grid describes the
      *   content spatially, each element is placed on a
      *   cell of the table depending on its position.
      *   Within each cell an element the color and type of
      *   shape of that element are available (example:
      *   "orange ellipse"). These descriptions can be
      *   selected individually to get more details. A list
      *   of elements where shape, color, location, and area
      *   are described (example: "orange ellipse
      *   location=top left area=1%") is also available.
      *   gridOutput() and gridOutput(FALLBACK) make the
      *   output available in  a sub DOM inside the canvas
      *   element which is accessible to screen readers.
      *   gridOutput(LABEL) creates an additional div with
      *   the output adjacent to the canvas, this is useful
      *   for non-screen reader users that might want to
      *   display the output outside of the canvas' sub DOM
      *   as they code. However, using LABEL will create
      *   unnecessary redundancy for screen reader users. We
      *   recommend using LABEL only as part of the
      *   development process of a sketch and removing it
      *   before publishing or sharing with screen reader
      *   users.
      *   @param [display] either FALLBACK or LABEL
      */
    inline def gridOutput(): Unit = js.Dynamic.global.applyDynamic("gridOutput")().asInstanceOf[Unit]
    inline def gridOutput(display: GRID_DISPLAY): Unit = js.Dynamic.global.applyDynamic("gridOutput")(display.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   System variable that stores the height of the
      *   drawing canvas. This value is set by the second
      *   parameter of the createCanvas() function. For
      *   example, the function call createCanvas(320, 240)
      *   sets the height variable to the value 240. The
      *   value of height defaults to 100 if createCanvas()
      *   is not used in a program.
      */
    @JSGlobal("height")
    @js.native
    def height: Double = js.native
    inline def height_=(x: Double): Unit = js.Dynamic.global.updateDynamic("height")(x.asInstanceOf[js.Any])
    
    /**
      *   Converts a number to a string in its equivalent
      *   hexadecimal notation. If a second parameter is
      *   passed, it is used to set the number of characters
      *   to generate in the hexadecimal notation. When an
      *   array is passed in, an array of strings in
      *   hexadecimal notation of the same length is
      *   returned.
      *   @param n value to parse
      *   @return hexadecimal string representation of value
      */
    inline def hex(n: Double): String = js.Dynamic.global.applyDynamic("hex")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def hex(n: Double, digits: Double): String = (js.Dynamic.global.applyDynamic("hex")(n.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      *   Converts a number to a string in its equivalent
      *   hexadecimal notation. If a second parameter is
      *   passed, it is used to set the number of characters
      *   to generate in the hexadecimal notation. When an
      *   array is passed in, an array of strings in
      *   hexadecimal notation of the same length is
      *   returned.
      *   @param ns array of values to parse
      *   @return hexadecimal string representation of
      *   values
      */
    inline def hex(ns: js.Array[Double]): js.Array[String] = js.Dynamic.global.applyDynamic("hex")(ns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def hex(ns: js.Array[Double], digits: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("hex")(ns.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      *   p5.js communicates with the clock on your
      *   computer. The hour() function returns the current
      *   hour as a value from 0 - 23.
      *   @return the current hour
      */
    inline def hour(): Double = js.Dynamic.global.applyDynamic("hour")().asInstanceOf[Double]
    
    /**
      *   Method for executing an HTTP request. If data type
      *   is not specified, p5 will try to guess based on
      *   the URL, defaulting to text. For more advanced
      *   use, you may also pass in the path as the first
      *   argument and a object as the second argument, the
      *   signature follows the one specified in the Fetch
      *   API specification. This method is suitable for
      *   fetching files up to size of 64MB when "GET" is
      *   used.
      *   @param path name of the file or url to load
      *   @param [method] either "GET", "POST", or "PUT",
      *   defaults to "GET"
      *   @param [datatype] "json", "jsonp", "xml", or
      *   "text"
      *   @param [data] param data passed sent with request
      *   @param [callback] function to be executed after
      *   httpGet() completes, data is passed in as first
      *   argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      *   @return A promise that resolves with the data when
      *   the operation completes successfully or rejects
      *   with the error after one occurs.
      */
    inline def httpDo(path: String): js.Promise[Any] = js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def httpDo(path: String, method: String): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(path: String, method: String, datatype: String): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(path: String, method: String, datatype: String, data: js.Object): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: String,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: String,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: String,
      data: js.Object,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: String,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: String,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: String,
      data: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(path: String, method: String, datatype: Unit, data: js.Object): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: Unit,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: Unit,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: Unit,
      data: js.Object,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: Unit,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: Unit,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: String,
      datatype: Unit,
      data: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(path: String, method: Unit, datatype: String): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(path: String, method: Unit, datatype: String, data: js.Object): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: String,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: String,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: String,
      data: js.Object,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: String,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: String,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: String,
      data: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(path: String, method: Unit, datatype: Unit, data: js.Object): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: Unit,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: Unit,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: Unit,
      data: js.Object,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: Unit,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: Unit,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      method: Unit,
      datatype: Unit,
      data: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    /**
      *   Method for executing an HTTP request. If data type
      *   is not specified, p5 will try to guess based on
      *   the URL, defaulting to text. For more advanced
      *   use, you may also pass in the path as the first
      *   argument and a object as the second argument, the
      *   signature follows the one specified in the Fetch
      *   API specification. This method is suitable for
      *   fetching files up to size of 64MB when "GET" is
      *   used.
      *   @param path name of the file or url to load
      *   @param options Request object options as
      *   documented in the "fetch" API reference
      *   @param [callback] function to be executed after
      *   httpGet() completes, data is passed in as first
      *   argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      */
    inline def httpDo(path: String, options: js.Object): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(path: String, options: js.Object, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      options: js.Object,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpDo(
      path: String,
      options: js.Object,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpDo")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      *   Method for executing an HTTP GET request. If data
      *   type is not specified, p5 will try to guess based
      *   on the URL, defaulting to text. This is equivalent
      *   to calling httpDo(path, 'GET'). The 'binary'
      *   datatype will return a Blob object, and the
      *   'arrayBuffer' datatype will return an ArrayBuffer
      *   which can be used to initialize typed arrays (such
      *   as Uint8Array).
      *   @param path name of the file or url to load
      *   @param [datatype] "json", "jsonp", "binary",
      *   "arrayBuffer", "xml", or "text"
      *   @param [data] param data passed sent with request
      *   @param [callback] function to be executed after
      *   httpGet() completes, data is passed in as first
      *   argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      *   @return A promise that resolves with the data when
      *   the operation completes successfully or rejects
      *   with the error after one occurs.
      */
    inline def httpGet(path: String): js.Promise[Any] = js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    /**
      *   Method for executing an HTTP GET request. If data
      *   type is not specified, p5 will try to guess based
      *   on the URL, defaulting to text. This is equivalent
      *   to calling httpDo(path, 'GET'). The 'binary'
      *   datatype will return a Blob object, and the
      *   'arrayBuffer' datatype will return an ArrayBuffer
      *   which can be used to initialize typed arrays (such
      *   as Uint8Array).
      *   @param path name of the file or url to load
      *   @param callback function to be executed after
      *   httpGet() completes, data is passed in as first
      *   argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      */
    inline def httpGet(path: String, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    /**
      *   Method for executing an HTTP GET request. If data
      *   type is not specified, p5 will try to guess based
      *   on the URL, defaulting to text. This is equivalent
      *   to calling httpDo(path, 'GET'). The 'binary'
      *   datatype will return a Blob object, and the
      *   'arrayBuffer' datatype will return an ArrayBuffer
      *   which can be used to initialize typed arrays (such
      *   as Uint8Array).
      *   @param path name of the file or url to load
      *   @param data param data passed sent with request
      *   @param [callback] function to be executed after
      *   httpGet() completes, data is passed in as first
      *   argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      */
    inline def httpGet(path: String, data: js.Object): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, data: js.Object, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      data: js.Object,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, data: Boolean): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, data: Boolean, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      data: Boolean,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, data: Boolean, callback: Unit, errorCallback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, datatype: String): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, datatype: String, data: js.Object): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, datatype: String, data: js.Object, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: String,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: String,
      data: js.Object,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, datatype: String, data: Boolean): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, datatype: String, data: Boolean, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: String,
      data: Boolean,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: String,
      data: Boolean,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, datatype: String, data: Unit, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: String,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: String,
      data: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, datatype: Unit, data: js.Object): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, datatype: Unit, data: js.Object, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: Unit,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: Unit,
      data: js.Object,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, datatype: Unit, data: Boolean): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, datatype: Unit, data: Boolean, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: Unit,
      data: Boolean,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: Unit,
      data: Boolean,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(path: String, datatype: Unit, data: Unit, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: Unit,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpGet(
      path: String,
      datatype: Unit,
      data: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpGet")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      *   Method for executing an HTTP POST request. If data
      *   type is not specified, p5 will try to guess based
      *   on the URL, defaulting to text. This is equivalent
      *   to calling httpDo(path, 'POST').
      *   @param path name of the file or url to load
      *   @param [datatype] "json", "jsonp", "xml", or
      *   "text". If omitted, httpPost() will guess.
      *   @param [data] param data passed sent with request
      *   @param [callback] function to be executed after
      *   httpPost() completes, data is passed in as first
      *   argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      *   @return A promise that resolves with the data when
      *   the operation completes successfully or rejects
      *   with the error after one occurs.
      */
    inline def httpPost(path: String): js.Promise[Any] = js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    /**
      *   Method for executing an HTTP POST request. If data
      *   type is not specified, p5 will try to guess based
      *   on the URL, defaulting to text. This is equivalent
      *   to calling httpDo(path, 'POST').
      *   @param path name of the file or url to load
      *   @param callback function to be executed after
      *   httpPost() completes, data is passed in as first
      *   argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      */
    inline def httpPost(path: String, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    /**
      *   Method for executing an HTTP POST request. If data
      *   type is not specified, p5 will try to guess based
      *   on the URL, defaulting to text. This is equivalent
      *   to calling httpDo(path, 'POST').
      *   @param path name of the file or url to load
      *   @param data param data passed sent with request
      *   @param [callback] function to be executed after
      *   httpPost() completes, data is passed in as first
      *   argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      */
    inline def httpPost(path: String, data: js.Object): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, data: js.Object, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      data: js.Object,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, data: Boolean): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, data: Boolean, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      data: Boolean,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, data: Boolean, callback: Unit, errorCallback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, datatype: String): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, datatype: String, data: js.Object): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, datatype: String, data: js.Object, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: String,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: String,
      data: js.Object,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, datatype: String, data: Boolean): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, datatype: String, data: Boolean, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: String,
      data: Boolean,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: String,
      data: Boolean,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, datatype: String, data: Unit, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: String,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: String,
      data: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, datatype: Unit, data: js.Object): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, datatype: Unit, data: js.Object, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: Unit,
      data: js.Object,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: Unit,
      data: js.Object,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, datatype: Unit, data: Boolean): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, datatype: Unit, data: Boolean, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: Unit,
      data: Boolean,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: Unit,
      data: Boolean,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(path: String, datatype: Unit, data: Unit, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: Unit,
      data: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def httpPost(
      path: String,
      datatype: Unit,
      data: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = (js.Dynamic.global.applyDynamic("httpPost")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def hue(color: String): Double = js.Dynamic.global.applyDynamic("hue")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def hue(color: js.Array[Double]): Double = js.Dynamic.global.applyDynamic("hue")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      *   Extracts the hue value from a color or pixel
      *   array. Hue exists in both HSB and HSL. This
      *   function will return the HSB-normalized hue when
      *   supplied with an HSB color object (or when
      *   supplied with a pixel array while the color mode
      *   is HSB), but will default to the HSL-normalized
      *   hue otherwise. (The values will only be different
      *   if the maximum hue setting for each system is
      *   different.)
      *   @param color p5.Color object, color components, or
      *   CSS color
      *   @return the hue
      */
    inline def hue(color: Color): Double = js.Dynamic.global.applyDynamic("hue")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def image(img: Element, dx: Double, dy: Double, dWidth: Double, dHeight: Double, sx: Double, sy: Double): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dWidth.asInstanceOf[js.Any], dHeight.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(
      img: Element,
      dx: Double,
      dy: Double,
      dWidth: Double,
      dHeight: Double,
      sx: Double,
      sy: Double,
      sWidth: Double
    ): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dWidth.asInstanceOf[js.Any], dHeight.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(
      img: Element,
      dx: Double,
      dy: Double,
      dWidth: Double,
      dHeight: Double,
      sx: Double,
      sy: Double,
      sWidth: Double,
      sHeight: Double
    ): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dWidth.asInstanceOf[js.Any], dHeight.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sWidth.asInstanceOf[js.Any], sHeight.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(
      img: Element,
      dx: Double,
      dy: Double,
      dWidth: Double,
      dHeight: Double,
      sx: Double,
      sy: Double,
      sWidth: Unit,
      sHeight: Double
    ): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dWidth.asInstanceOf[js.Any], dHeight.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sWidth.asInstanceOf[js.Any], sHeight.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(img: Element, x: Double, y: Double): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(img: Element, x: Double, y: Double, width: Double): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(img: Element, x: Double, y: Double, width: Double, height: Double): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(img: Element, x: Double, y: Double, width: Unit, height: Double): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Draw an image to the p5.js canvas. This function
      *   can be used with different numbers of parameters.
      *   The simplest use requires only three parameters:
      *   img, x, and y—where (x, y) is the position of the
      *   image. Two more parameters can optionally be added
      *   to specify the width and height of the image.
      *
      *   This function can also be used with all eight
      *   Number parameters. To differentiate between all
      *   these parameters, p5.js uses the language of
      *   "destination rectangle" (which corresponds to
      *   "dx", "dy", etc.) and "source image" (which
      *   corresponds to "sx", "sy", etc.) below. Specifying
      *   the "source image" dimensions can be useful when
      *   you want to display a subsection of the source
      *   image instead of the whole thing. Here's a diagram
      *   to explain further:
      *   @param img the image to display
      *   @param dx the x-coordinate of the destination
      *   rectangle in which to draw the source image
      *   @param dy the y-coordinate of the destination
      *   rectangle in which to draw the source image
      *   @param dWidth the width of the destination
      *   rectangle
      *   @param dHeight the height of the destination
      *   rectangle
      *   @param sx the x-coordinate of the subsection of
      *   the source image to draw into the destination
      *   rectangle
      *   @param sy the y-coordinate of the subsection of
      *   the source image to draw into the destination
      *   rectangle
      *   @param [sWidth] the width of the subsection of the
      *   source image to draw into the destination
      *   rectangle
      *   @param [sHeight] the height of the subsection of
      *   the source image to draw into the destination
      *   rectangle
      */
    inline def image(img: Image, dx: Double, dy: Double, dWidth: Double, dHeight: Double, sx: Double, sy: Double): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dWidth.asInstanceOf[js.Any], dHeight.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(
      img: Image,
      dx: Double,
      dy: Double,
      dWidth: Double,
      dHeight: Double,
      sx: Double,
      sy: Double,
      sWidth: Double
    ): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dWidth.asInstanceOf[js.Any], dHeight.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(
      img: Image,
      dx: Double,
      dy: Double,
      dWidth: Double,
      dHeight: Double,
      sx: Double,
      sy: Double,
      sWidth: Double,
      sHeight: Double
    ): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dWidth.asInstanceOf[js.Any], dHeight.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sWidth.asInstanceOf[js.Any], sHeight.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(
      img: Image,
      dx: Double,
      dy: Double,
      dWidth: Double,
      dHeight: Double,
      sx: Double,
      sy: Double,
      sWidth: Unit,
      sHeight: Double
    ): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], dWidth.asInstanceOf[js.Any], dHeight.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sWidth.asInstanceOf[js.Any], sHeight.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Draw an image to the p5.js canvas. This function
      *   can be used with different numbers of parameters.
      *   The simplest use requires only three parameters:
      *   img, x, and y—where (x, y) is the position of the
      *   image. Two more parameters can optionally be added
      *   to specify the width and height of the image.
      *
      *   This function can also be used with all eight
      *   Number parameters. To differentiate between all
      *   these parameters, p5.js uses the language of
      *   "destination rectangle" (which corresponds to
      *   "dx", "dy", etc.) and "source image" (which
      *   corresponds to "sx", "sy", etc.) below. Specifying
      *   the "source image" dimensions can be useful when
      *   you want to display a subsection of the source
      *   image instead of the whole thing. Here's a diagram
      *   to explain further:
      *   @param img the image to display
      *   @param x the x-coordinate of the top-left corner
      *   of the image
      *   @param y the y-coordinate of the top-left corner
      *   of the image
      *   @param [width] the width to draw the image
      *   @param [height] the height to draw the image
      */
    inline def image(img: Image, x: Double, y: Double): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(img: Image, x: Double, y: Double, width: Double): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(img: Image, x: Double, y: Double, width: Double, height: Double): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def image(img: Image, x: Double, y: Double, width: Unit, height: Double): Unit = (js.Dynamic.global.applyDynamic("image")(img.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Set image mode. Modifies the location from which
      *   images are drawn by changing the way in which
      *   parameters given to image() are interpreted. The
      *   default mode is imageMode(CORNER), which
      *   interprets the second and third parameters of
      *   image() as the upper-left corner of the image. If
      *   two additional parameters are specified, they are
      *   used to set the image's width and height.
      *   imageMode(CORNERS) interprets the second and third
      *   parameters of image() as the location of one
      *   corner, and the fourth and fifth parameters as the
      *   opposite corner.
      *
      *   imageMode(CENTER) interprets the second and third
      *   parameters of image() as the image's center point.
      *   If two additional parameters are specified, they
      *   are used to set the image's width and height.
      *   @param mode either CORNER, CORNERS, or CENTER
      */
    inline def imageMode(mode: IMAGE_MODE): Unit = js.Dynamic.global.applyDynamic("imageMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The .input() function is called when any user
      *   input is detected with an element. The input event
      *   is often used to detect keystrokes in a input
      *   element, or changes on a slider element. This can
      *   be used to attach an element specific event
      *   listener.
      *   @param fxn function to be fired when any user
      *   input is detected within the element. if false is
      *   passed instead, the previously firing function
      *   will no longer fire.
      *   @chainable
      */
    inline def input(fxn: js.Function1[/* repeated */ Any, Any]): ^ = js.Dynamic.global.applyDynamic("input")(fxn.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def input(fxn: Boolean): ^ = js.Dynamic.global.applyDynamic("input")(fxn.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Converts a boolean, string, or float to its
      *   integer representation. When an array of values is
      *   passed in, then an int array of the same length is
      *   returned.
      *   @param n value to parse
      *   @param [radix] the radix to convert to (default:
      *   10)
      *   @return integer representation of value
      */
    inline def int(n: String): Double = js.Dynamic.global.applyDynamic("int")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def int(n: String, radix: Double): Double = (js.Dynamic.global.applyDynamic("int")(n.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def int(n: Boolean): Double = js.Dynamic.global.applyDynamic("int")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def int(n: Boolean, radix: Double): Double = (js.Dynamic.global.applyDynamic("int")(n.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def int(n: Double): Double = js.Dynamic.global.applyDynamic("int")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def int(n: Double, radix: Double): Double = (js.Dynamic.global.applyDynamic("int")(n.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]
    /**
      *   Converts a boolean, string, or float to its
      *   integer representation. When an array of values is
      *   passed in, then an int array of the same length is
      *   returned.
      *   @param ns values to parse
      *   @param [radix] the radix to convert to (default:
      *   10)
      *   @return integer representation of values
      */
    inline def int(ns: js.Array[Any]): js.Array[Double] = js.Dynamic.global.applyDynamic("int")(ns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def int(ns: js.Array[Any], radix: Double): js.Array[Double] = (js.Dynamic.global.applyDynamic("int")(ns.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      *   By default, p5.js loops through draw()
      *   continuously, executing the code within it. If the
      *   sketch is stopped with noLoop() or resumed with
      *   loop(), isLooping() returns the current state for
      *   use within custom event handlers.
      */
    inline def isLooping(): Boolean = js.Dynamic.global.applyDynamic("isLooping")().asInstanceOf[Boolean]
    
    /**
      *   Combines an array of Strings into one String, each
      *   separated by the character(s) used for the
      *   separator parameter. To join arrays of ints or
      *   floats, it's necessary to first convert them to
      *   Strings using nf() or nfs().
      *   @param list array of Strings to be joined
      *   @param separator String to be placed between each
      *   item
      *   @return joined String
      */
    inline def join(list: js.Array[Any], separator: String): String = (js.Dynamic.global.applyDynamic("join")(list.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      *   The system variable key always contains the value
      *   of the most recent key on the keyboard that was
      *   typed. To get the proper capitalization, it is
      *   best to use it within keyTyped(). For non-ASCII
      *   keys, use the keyCode variable.
      */
    @JSGlobal("key")
    @js.native
    def key: String = js.native
    
    /**
      *   The variable keyCode is used to detect special
      *   keys such as BACKSPACE, DELETE, ENTER, RETURN,
      *   TAB, ESCAPE, SHIFT, CONTROL, OPTION, ALT,
      *   UP_ARROW, DOWN_ARROW, LEFT_ARROW, RIGHT_ARROW. You
      *   can also check for custom keys by looking up the
      *   keyCode of any key on a site like this:
      *   keycode.info.
      */
    @JSGlobal("keyCode")
    @js.native
    def keyCode: Double = js.native
    inline def keyCode_=(x: Double): Unit = js.Dynamic.global.updateDynamic("keyCode")(x.asInstanceOf[js.Any])
    
    /**
      *   The keyIsDown() function checks if the key is
      *   currently down, i.e. pressed. It can be used if
      *   you have an object that moves, and you want
      *   several keys to be able to affect its behaviour
      *   simultaneously, such as moving a sprite
      *   diagonally. You can put in any number representing
      *   the keyCode of the key, or use any of the variable
      *   keyCode names listed here.
      *   @param code The key to check for.
      *   @return whether key is down or not
      */
    inline def keyIsDown(code: Double): Boolean = js.Dynamic.global.applyDynamic("keyIsDown")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      *   The boolean system variable keyIsPressed is true
      *   if any key is pressed and false if no keys are
      *   pressed.
      */
    @JSGlobal("keyIsPressed")
    @js.native
    def keyIsPressed: Boolean = js.native
    inline def keyIsPressed_=(x: Boolean): Unit = js.Dynamic.global.updateDynamic("keyIsPressed")(x.asInstanceOf[js.Any])
    
    /**
      *   The keyPressed() function is called once every
      *   time a key is pressed. The keyCode for the key
      *   that was pressed is stored in the keyCode
      *   variable. For non-ASCII keys, use the keyCode
      *   variable. You can check if the keyCode equals
      *   BACKSPACE, DELETE, ENTER, RETURN, TAB, ESCAPE,
      *   SHIFT, CONTROL, OPTION, ALT, UP_ARROW, DOWN_ARROW,
      *   LEFT_ARROW, RIGHT_ARROW.
      *
      *   For ASCII keys, the key that was pressed is stored
      *   in the key variable. However, it does not
      *   distinguish between uppercase and lowercase. For
      *   this reason, it is recommended to use keyTyped()
      *   to read the key variable, in which the case of the
      *   variable will be distinguished.
      *
      *   Because of how operating systems handle key
      *   repeats, holding down a key may cause multiple
      *   calls to keyTyped() (and keyReleased() as well).
      *   The rate of repeat is set by the operating system
      *   and how each computer is configured.
      *
      *
      *   Browsers may have different default behaviors
      *   attached to various key events. To prevent any
      *   default behavior for this event, add "return
      *   false" to the end of the method.
      *   @param [event] optional KeyboardEvent callback
      *   argument.
      */
    inline def keyPressed(): Unit = js.Dynamic.global.applyDynamic("keyPressed")().asInstanceOf[Unit]
    inline def keyPressed(event: js.Object): Unit = js.Dynamic.global.applyDynamic("keyPressed")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The keyReleased() function is called once every
      *   time a key is released. See key and keyCode for
      *   more information. Browsers may have different
      *   default behaviors attached to various key events.
      *   To prevent any default behavior for this event,
      *   add "return false" to the end of the method.
      *   @param [event] optional KeyboardEvent callback
      *   argument.
      */
    inline def keyReleased(): Unit = js.Dynamic.global.applyDynamic("keyReleased")().asInstanceOf[Unit]
    inline def keyReleased(event: js.Object): Unit = js.Dynamic.global.applyDynamic("keyReleased")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The keyTyped() function is called once every time
      *   a key is pressed, but action keys such as
      *   Backspace, Delete, Ctrl, Shift, and Alt are
      *   ignored. If you are trying to detect a keyCode for
      *   one of these keys, use the keyPressed() function
      *   instead. The most recent key typed will be stored
      *   in the key variable. Because of how operating
      *   systems handle key repeats, holding down a key
      *   will cause multiple calls to keyTyped() (and
      *   keyReleased() as well). The rate of repeat is set
      *   by the operating system and how each computer is
      *   configured.
      *
      *
      *   Browsers may have different default behaviors
      *   attached to various key events. To prevent any
      *   default behavior for this event, add "return
      *   false" to the end of the method.
      *   @param [event] optional KeyboardEvent callback
      *   argument.
      */
    inline def keyTyped(): Unit = js.Dynamic.global.applyDynamic("keyTyped")().asInstanceOf[Unit]
    inline def keyTyped(event: js.Object): Unit = js.Dynamic.global.applyDynamic("keyTyped")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def key_=(x: String): Unit = js.Dynamic.global.updateDynamic("key")(x.asInstanceOf[js.Any])
    
    /**
      *   Calculates a number between two numbers at a
      *   specific increment. The amt parameter is the
      *   amount to interpolate between the two values where
      *   0.0 equal to the first point, 0.1 is very near the
      *   first point, 0.5 is half-way in between, and 1.0
      *   is equal to the second point. If the value of amt
      *   is more than 1.0 or less than 0.0, the number will
      *   be calculated accordingly in the ratio of the two
      *   given numbers. The lerp function is convenient for
      *   creating motion along a straight path and for
      *   drawing dotted lines.
      *   @param start first value
      *   @param stop second value
      *   @param amt number
      *   @return lerped value
      */
    inline def lerp(start: Double, stop: Double, amt: Double): Double = (js.Dynamic.global.applyDynamic("lerp")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], amt.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   Blends two colors to find a third color somewhere
      *   between them. The amt parameter is the amount to
      *   interpolate between the two values where 0.0 is
      *   equal to the first color, 0.1 is very near the
      *   first color, 0.5 is halfway in between, etc. An
      *   amount below 0 will be treated as 0. Likewise,
      *   amounts above 1 will be capped at 1. This is
      *   different from the behavior of lerp(), but
      *   necessary because otherwise numbers outside the
      *   range will produce strange and unexpected colors.
      *   The way that colors are interpolated depends on
      *   the current color mode.
      *   @param c1 interpolate from this color
      *   @param c2 interpolate to this color
      *   @param amt number between 0 and 1
      *   @return interpolated color
      */
    inline def lerpColor(c1: Color, c2: Color, amt: Double): Color = (js.Dynamic.global.applyDynamic("lerpColor")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any], amt.asInstanceOf[js.Any])).asInstanceOf[Color]
    
    /**
      *   Sets the falloff rates for point lights. It
      *   affects only the elements which are created after
      *   it in the code. The default value is
      *   lightFalloff(1.0, 0.0, 0.0), and the parameters
      *   are used to calculate the falloff with the
      *   following equation: d = distance from light
      *   position to vertex position
      *
      *   falloff = 1 / (CONSTANT + d * LINEAR + ( d * d ) *
      *   QUADRATIC)
      *   @param constant constant value for determining
      *   falloff
      *   @param linear linear value for determining falloff
      *   @param quadratic quadratic value for determining
      *   falloff
      *   @chainable
      */
    inline def lightFalloff(constant: Double, linear: Double, quadratic: Double): ^ = (js.Dynamic.global.applyDynamic("lightFalloff")(constant.asInstanceOf[js.Any], linear.asInstanceOf[js.Any], quadratic.asInstanceOf[js.Any])).asInstanceOf[^]
    
    inline def lightness(color: String): Double = js.Dynamic.global.applyDynamic("lightness")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def lightness(color: js.Array[Double]): Double = js.Dynamic.global.applyDynamic("lightness")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      *   Extracts the HSL lightness value from a color or
      *   pixel array.
      *   @param color p5.Color object, color components, or
      *   CSS color
      *   @return the lightness
      */
    inline def lightness(color: Color): Double = js.Dynamic.global.applyDynamic("lightness")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Sets the default ambient and directional light.
      *   The defaults are ambientLight(128, 128, 128) and
      *   directionalLight(128, 128, 128, 0, 0, -1). Lights
      *   need to be included in the draw() to remain
      *   persistent in a looping program. Placing them in
      *   the setup() of a looping program will cause them
      *   to only have an effect the first time through the
      *   loop.
      *   @chainable
      */
    inline def lights(): ^ = js.Dynamic.global.applyDynamic("lights")().asInstanceOf[^]
    
    /**
      *   Draws a line (a direct path between two points) to
      *   the screen. If called with only 4 parameters, it
      *   will draw a line in 2D with a default width of 1
      *   pixel. This width can be modified by using the
      *   strokeWeight() function. A line cannot be filled,
      *   therefore the fill() function will not affect the
      *   color of a line. So to color a line, use the
      *   stroke() function.
      *   @param x1 the x-coordinate of the first point
      *   @param y1 the y-coordinate of the first point
      *   @param x2 the x-coordinate of the second point
      *   @param y2 the y-coordinate of the second point
      *   @chainable
      */
    inline def line(x1: Double, y1: Double, x2: Double, y2: Double): ^ = (js.Dynamic.global.applyDynamic("line")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Draws a line (a direct path between two points) to
      *   the screen. If called with only 4 parameters, it
      *   will draw a line in 2D with a default width of 1
      *   pixel. This width can be modified by using the
      *   strokeWeight() function. A line cannot be filled,
      *   therefore the fill() function will not affect the
      *   color of a line. So to color a line, use the
      *   stroke() function.
      *   @param x1 the x-coordinate of the first point
      *   @param y1 the y-coordinate of the first point
      *   @param z1 the z-coordinate of the first point
      *   @param x2 the x-coordinate of the second point
      *   @param y2 the y-coordinate of the second point
      *   @param z2 the z-coordinate of the second point
      *   @chainable
      */
    inline def line(x1: Double, y1: Double, z1: Double, x2: Double, y2: Double, z2: Double): ^ = (js.Dynamic.global.applyDynamic("line")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   This method is suitable for fetching files up to
      *   size of 64MB.
      *   @param file name of the file or URL to load
      *   @param [callback] function to be executed after
      *   loadBytes() completes
      *   @param [errorCallback] function to be executed if
      *   there is an error
      *   @return an object whose 'bytes' property will be
      *   the loaded buffer
      */
    inline def loadBytes(file: String): js.Object = js.Dynamic.global.applyDynamic("loadBytes")(file.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    inline def loadBytes(file: String, callback: js.Function1[/* repeated */ Any, Any]): js.Object = (js.Dynamic.global.applyDynamic("loadBytes")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadBytes(
      file: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadBytes")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadBytes(file: String, callback: Unit, errorCallback: js.Function1[/* repeated */ Any, Any]): js.Object = (js.Dynamic.global.applyDynamic("loadBytes")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    /**
      *   Loads an opentype font file (.otf, .ttf) from a
      *   file or a URL, and returns a PFont Object. This
      *   method is asynchronous, meaning it may not finish
      *   before the next line in your sketch is executed.
      *   The path to the font should be relative to the
      *   HTML file that links in your sketch. Loading fonts
      *   from a URL or other remote location may be blocked
      *   due to your browser's built-in security.
      *   @param path name of the file or url to load
      *   @param [callback] function to be executed after
      *   loadFont() completes
      *   @param [onError] function to be executed if an
      *   error occurs
      *   @return p5.Font object
      */
    inline def loadFont(path: String): Font = js.Dynamic.global.applyDynamic("loadFont")(path.asInstanceOf[js.Any]).asInstanceOf[Font]
    inline def loadFont(path: String, callback: js.Function1[/* repeated */ Any, Any]): Font = (js.Dynamic.global.applyDynamic("loadFont")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Font]
    inline def loadFont(
      path: String,
      callback: js.Function1[/* repeated */ Any, Any],
      onError: js.Function1[/* repeated */ Any, Any]
    ): Font = (js.Dynamic.global.applyDynamic("loadFont")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Font]
    inline def loadFont(path: String, callback: Unit, onError: js.Function1[/* repeated */ Any, Any]): Font = (js.Dynamic.global.applyDynamic("loadFont")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Font]
    
    /**
      *   Loads an image from a path and creates a p5.Image
      *   from it. The image may not be immediately
      *   available for rendering. If you want to ensure
      *   that the image is ready before doing anything with
      *   it, place the loadImage() call in preload(). You
      *   may also supply a callback function to handle the
      *   image when it's ready.
      *
      *   The path to the image should be relative to the
      *   HTML file that links in your sketch. Loading an
      *   image from a URL or other remote location may be
      *   blocked due to your browser's built-in security.
      *
      *   You can also pass in a string of a base64 encoded
      *   image as an alternative to the file path. Remember
      *   to add "data:image/png;base64," in front of the
      *   string.
      *   @param path Path of the image to be loaded
      *   @param [successCallback] Function to be called
      *   once the image is loaded. Will be passed the
      *   p5.Image.
      *   @param [failureCallback] called with event error
      *   if the image fails to load.
      *   @return the p5.Image object
      */
    inline def loadImage(path: String): Image = js.Dynamic.global.applyDynamic("loadImage")(path.asInstanceOf[js.Any]).asInstanceOf[Image]
    inline def loadImage(path: String, successCallback: js.Function1[/* p1 */ Image, Any]): Image = (js.Dynamic.global.applyDynamic("loadImage")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Image]
    inline def loadImage(
      path: String,
      successCallback: js.Function1[/* p1 */ Image, Any],
      failureCallback: js.Function1[/* p1 */ Event, Any]
    ): Image = (js.Dynamic.global.applyDynamic("loadImage")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[Image]
    inline def loadImage(path: String, successCallback: Unit, failureCallback: js.Function1[/* p1 */ Event, Any]): Image = (js.Dynamic.global.applyDynamic("loadImage")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[Image]
    
    /**
      *   Loads a JSON file from a file or a URL, and
      *   returns an Object. Note that even if the JSON file
      *   contains an Array, an Object will be returned with
      *   index numbers as keys. This method is
      *   asynchronous, meaning it may not finish before the
      *   next line in your sketch is executed. JSONP is
      *   supported via a polyfill and you can pass in as
      *   the second argument an object with definitions of
      *   the json callback following the syntax specified
      *   here.
      *
      *   This method is suitable for fetching files up to
      *   size of 64MB.
      *   @param path name of the file or url to load
      *   @param [jsonpOptions] options object for jsonp
      *   related settings
      *   @param [datatype] "json" or "jsonp"
      *   @param [callback] function to be executed after
      *   loadJSON() completes, data is passed in as first
      *   argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      *   @return JSON data
      */
    inline def loadJSON(path: String): js.Object | js.Array[Any] = js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any]).asInstanceOf[js.Object | js.Array[Any]]
    /**
      *   Loads a JSON file from a file or a URL, and
      *   returns an Object. Note that even if the JSON file
      *   contains an Array, an Object will be returned with
      *   index numbers as keys. This method is
      *   asynchronous, meaning it may not finish before the
      *   next line in your sketch is executed. JSONP is
      *   supported via a polyfill and you can pass in as
      *   the second argument an object with definitions of
      *   the json callback following the syntax specified
      *   here.
      *
      *   This method is suitable for fetching files up to
      *   size of 64MB.
      *   @param path name of the file or url to load
      *   @param callback function to be executed after
      *   loadJSON() completes, data is passed in as first
      *   argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      */
    inline def loadJSON(path: String, callback: js.Function1[/* repeated */ Any, Any]): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    /**
      *   Loads a JSON file from a file or a URL, and
      *   returns an Object. Note that even if the JSON file
      *   contains an Array, an Object will be returned with
      *   index numbers as keys. This method is
      *   asynchronous, meaning it may not finish before the
      *   next line in your sketch is executed. JSONP is
      *   supported via a polyfill and you can pass in as
      *   the second argument an object with definitions of
      *   the json callback following the syntax specified
      *   here.
      *
      *   This method is suitable for fetching files up to
      *   size of 64MB.
      *   @param path name of the file or url to load
      *   @param datatype "json" or "jsonp"
      *   @param [callback] function to be executed after
      *   loadJSON() completes, data is passed in as first
      *   argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      */
    inline def loadJSON(path: String, datatype: String): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(path: String, datatype: String, callback: js.Function1[/* repeated */ Any, Any]): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      datatype: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      datatype: String,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(path: String, jsonpOptions: js.Object): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(path: String, jsonpOptions: js.Object, datatype: String): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      jsonpOptions: js.Object,
      datatype: String,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      jsonpOptions: js.Object,
      datatype: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      jsonpOptions: js.Object,
      datatype: String,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      jsonpOptions: js.Object,
      datatype: Unit,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      jsonpOptions: js.Object,
      datatype: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      jsonpOptions: js.Object,
      datatype: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(path: String, jsonpOptions: Unit, datatype: String): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      jsonpOptions: Unit,
      datatype: String,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      jsonpOptions: Unit,
      datatype: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      jsonpOptions: Unit,
      datatype: String,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(path: String, jsonpOptions: Unit, datatype: Unit, callback: js.Function1[/* repeated */ Any, Any]): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      jsonpOptions: Unit,
      datatype: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    inline def loadJSON(
      path: String,
      jsonpOptions: Unit,
      datatype: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object | js.Array[Any] = (js.Dynamic.global.applyDynamic("loadJSON")(path.asInstanceOf[js.Any], jsonpOptions.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
    
    /**
      *   Load a 3d model from an OBJ or STL file.
      *   loadModel() should be placed inside of preload().
      *   This allows the model to load fully before the
      *   rest of your code is run.
      *
      *   One of the limitations of the OBJ and STL format
      *   is that it doesn't have a built-in sense of scale.
      *   This means that models exported from different
      *   programs might be very different sizes. If your
      *   model isn't displaying, try calling loadModel()
      *   with the normalized parameter set to true. This
      *   will resize the model to a scale appropriate for
      *   p5. You can also make additional changes to the
      *   final size of your model with the scale()
      *   function.
      *
      *   Also, the support for colored STL files is not
      *   present. STL files with color will be rendered
      *   without color properties.
      *   @param path Path of the model to be loaded
      *   @param [successCallback] Function to be called
      *   once the model is loaded. Will be passed the 3D
      *   model object.
      *   @param [failureCallback] called with event error
      *   if the model fails to load.
      *   @param [fileType] The file extension of the model
      *   (.stl, .obj).
      *   @return the p5.Geometry object
      */
    inline def loadModel(path: String): Geometry = js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any]).asInstanceOf[Geometry]
    /**
      *   Load a 3d model from an OBJ or STL file.
      *   loadModel() should be placed inside of preload().
      *   This allows the model to load fully before the
      *   rest of your code is run.
      *
      *   One of the limitations of the OBJ and STL format
      *   is that it doesn't have a built-in sense of scale.
      *   This means that models exported from different
      *   programs might be very different sizes. If your
      *   model isn't displaying, try calling loadModel()
      *   with the normalized parameter set to true. This
      *   will resize the model to a scale appropriate for
      *   p5. You can also make additional changes to the
      *   final size of your model with the scale()
      *   function.
      *
      *   Also, the support for colored STL files is not
      *   present. STL files with color will be rendered
      *   without color properties.
      *   @param path Path of the model to be loaded
      *   @param normalize If true, scale the model to a
      *   standardized size when loading
      *   @param [successCallback] Function to be called
      *   once the model is loaded. Will be passed the 3D
      *   model object.
      *   @param [failureCallback] called with event error
      *   if the model fails to load.
      *   @param [fileType] The file extension of the model
      *   (.stl, .obj).
      *   @return the p5.Geometry object
      */
    inline def loadModel(path: String, normalize: Boolean): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(path: String, normalize: Boolean, successCallback: js.Function1[/* p1 */ Geometry, Any]): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(
      path: String,
      normalize: Boolean,
      successCallback: js.Function1[/* p1 */ Geometry, Any],
      failureCallback: js.Function1[/* p1 */ Event, Any]
    ): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(
      path: String,
      normalize: Boolean,
      successCallback: js.Function1[/* p1 */ Geometry, Any],
      failureCallback: js.Function1[/* p1 */ Event, Any],
      fileType: String
    ): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(
      path: String,
      normalize: Boolean,
      successCallback: js.Function1[/* p1 */ Geometry, Any],
      failureCallback: Unit,
      fileType: String
    ): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(
      path: String,
      normalize: Boolean,
      successCallback: Unit,
      failureCallback: js.Function1[/* p1 */ Event, Any]
    ): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(
      path: String,
      normalize: Boolean,
      successCallback: Unit,
      failureCallback: js.Function1[/* p1 */ Event, Any],
      fileType: String
    ): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(path: String, normalize: Boolean, successCallback: Unit, failureCallback: Unit, fileType: String): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(path: String, successCallback: js.Function1[/* p1 */ Geometry, Any]): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(
      path: String,
      successCallback: js.Function1[/* p1 */ Geometry, Any],
      failureCallback: js.Function1[/* p1 */ Event, Any]
    ): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(
      path: String,
      successCallback: js.Function1[/* p1 */ Geometry, Any],
      failureCallback: js.Function1[/* p1 */ Event, Any],
      fileType: String
    ): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(
      path: String,
      successCallback: js.Function1[/* p1 */ Geometry, Any],
      failureCallback: Unit,
      fileType: String
    ): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(path: String, successCallback: Unit, failureCallback: js.Function1[/* p1 */ Event, Any]): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(
      path: String,
      successCallback: Unit,
      failureCallback: js.Function1[/* p1 */ Event, Any],
      fileType: String
    ): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def loadModel(path: String, successCallback: Unit, failureCallback: Unit, fileType: String): Geometry = (js.Dynamic.global.applyDynamic("loadModel")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    
    /**
      *   Loads the pixel data for the display window into
      *   the pixels[] array. This function must always be
      *   called before reading from or writing to pixels[].
      *   Note that only changes made with set() or direct
      *   manipulation of pixels[] will occur.
      */
    inline def loadPixels(): Unit = js.Dynamic.global.applyDynamic("loadPixels")().asInstanceOf[Unit]
    
    /**
      *   Creates a new p5.Shader object from the provided
      *   vertex and fragment shader files. The shader files
      *   are loaded asynchronously in the background, so
      *   this method should be used in preload().
      *
      *   Note, shaders can only be used in WEBGL mode.
      *   @param vertFilename path to file containing vertex
      *   shader source code
      *   @param fragFilename path to file containing
      *   fragment shader source code
      *   @param [callback] callback to be executed after
      *   loadShader completes. On success, the p5.Shader
      *   object is passed as the first argument.
      *   @param [errorCallback] callback to be executed
      *   when an error occurs inside loadShader. On error,
      *   the error is passed as the first argument.
      *   @return a shader object created from the provided
      *   vertex and fragment shader files.
      */
    inline def loadShader(vertFilename: String, fragFilename: String): Shader = (js.Dynamic.global.applyDynamic("loadShader")(vertFilename.asInstanceOf[js.Any], fragFilename.asInstanceOf[js.Any])).asInstanceOf[Shader]
    inline def loadShader(vertFilename: String, fragFilename: String, callback: js.Function1[/* repeated */ Any, Any]): Shader = (js.Dynamic.global.applyDynamic("loadShader")(vertFilename.asInstanceOf[js.Any], fragFilename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Shader]
    inline def loadShader(
      vertFilename: String,
      fragFilename: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): Shader = (js.Dynamic.global.applyDynamic("loadShader")(vertFilename.asInstanceOf[js.Any], fragFilename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Shader]
    inline def loadShader(
      vertFilename: String,
      fragFilename: String,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): Shader = (js.Dynamic.global.applyDynamic("loadShader")(vertFilename.asInstanceOf[js.Any], fragFilename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Shader]
    
    /**
      *   loadSound() returns a new p5.SoundFile from a
      *   specified path. If called during preload(), the
      *   p5.SoundFile will be ready to play in time for
      *   setup() and draw(). If called outside of preload,
      *   the p5.SoundFile will not be ready immediately, so
      *   loadSound accepts a callback as the second
      *   parameter. Using a  local server is recommended
      *   when loading external files.
      *   @param path Path to the sound file, or an array
      *   with paths to soundfiles in multiple formats i.e.
      *   ['sound.ogg', 'sound.mp3']. Alternately, accepts
      *   an object: either from the HTML5 File API, or a
      *   p5.File.
      *   @param [successCallback] Name of a function to
      *   call once file loads
      *   @param [errorCallback] Name of a function to call
      *   if there is an error loading the file.
      *   @param [whileLoading] Name of a function to call
      *   while file is loading. This function will receive
      *   the percentage loaded so far, from 0.0 to 1.0.
      *   @return Returns a p5.SoundFile
      */
    inline def loadSound(path: String): SoundFile = js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any]).asInstanceOf[SoundFile]
    inline def loadSound(path: String, successCallback: js.Function1[/* repeated */ Any, Any]): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(
      path: String,
      successCallback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(
      path: String,
      successCallback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any],
      whileLoading: js.Function1[/* repeated */ Any, Any]
    ): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], whileLoading.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(
      path: String,
      successCallback: js.Function1[/* repeated */ Any, Any],
      errorCallback: Unit,
      whileLoading: js.Function1[/* repeated */ Any, Any]
    ): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], whileLoading.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(path: String, successCallback: Unit, errorCallback: js.Function1[/* repeated */ Any, Any]): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(
      path: String,
      successCallback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any],
      whileLoading: js.Function1[/* repeated */ Any, Any]
    ): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], whileLoading.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(
      path: String,
      successCallback: Unit,
      errorCallback: Unit,
      whileLoading: js.Function1[/* repeated */ Any, Any]
    ): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], whileLoading.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(path: js.Array[Any]): SoundFile = js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any]).asInstanceOf[SoundFile]
    inline def loadSound(path: js.Array[Any], successCallback: js.Function1[/* repeated */ Any, Any]): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(
      path: js.Array[Any],
      successCallback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(
      path: js.Array[Any],
      successCallback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any],
      whileLoading: js.Function1[/* repeated */ Any, Any]
    ): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], whileLoading.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(
      path: js.Array[Any],
      successCallback: js.Function1[/* repeated */ Any, Any],
      errorCallback: Unit,
      whileLoading: js.Function1[/* repeated */ Any, Any]
    ): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], whileLoading.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(path: js.Array[Any], successCallback: Unit, errorCallback: js.Function1[/* repeated */ Any, Any]): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(
      path: js.Array[Any],
      successCallback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any],
      whileLoading: js.Function1[/* repeated */ Any, Any]
    ): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], whileLoading.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    inline def loadSound(
      path: js.Array[Any],
      successCallback: Unit,
      errorCallback: Unit,
      whileLoading: js.Function1[/* repeated */ Any, Any]
    ): SoundFile = (js.Dynamic.global.applyDynamic("loadSound")(path.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], whileLoading.asInstanceOf[js.Any])).asInstanceOf[SoundFile]
    
    /**
      *   Reads the contents of a file and creates a String
      *   array of its individual lines. If the name of the
      *   file is used as the parameter, as in the above
      *   example, the file must be located in the sketch
      *   directory/folder. Alternatively, the file maybe be
      *   loaded from anywhere on the local computer using
      *   an absolute path (something that starts with / on
      *   Unix and Linux, or a drive letter on Windows), or
      *   the filename parameter can be a URL for a file
      *   found on a network.
      *
      *   This method is asynchronous, meaning it may not
      *   finish before the next line in your sketch is
      *   executed.
      *
      *   This method is suitable for fetching files up to
      *   size of 64MB.
      *   @param filename name of the file or url to load
      *   @param [callback] function to be executed after
      *   loadStrings() completes, Array is passed in as
      *   first argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      *   @return Array of Strings
      */
    inline def loadStrings(filename: String): js.Array[String] = js.Dynamic.global.applyDynamic("loadStrings")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def loadStrings(filename: String, callback: js.Function1[/* repeated */ Any, Any]): js.Array[String] = (js.Dynamic.global.applyDynamic("loadStrings")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def loadStrings(
      filename: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Array[String] = (js.Dynamic.global.applyDynamic("loadStrings")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def loadStrings(filename: String, callback: Unit, errorCallback: js.Function1[/* repeated */ Any, Any]): js.Array[String] = (js.Dynamic.global.applyDynamic("loadStrings")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      *   Reads the contents of a file or URL and creates a
      *   p5.Table object with its values. If a file is
      *   specified, it must be located in the sketch's
      *   "data" folder. The filename parameter can also be
      *   a URL to a file found online. By default, the file
      *   is assumed to be comma-separated (in CSV format).
      *   Table only looks for a header row if the 'header'
      *   option is included. This method is asynchronous,
      *   meaning it may not finish before the next line in
      *   your sketch is executed. Calling loadTable()
      *   inside preload() guarantees to complete the
      *   operation before setup() and draw() are called.
      *   Outside of preload(), you may supply a callback
      *   function to handle the object:
      *
      *   All files loaded and saved use UTF-8 encoding.
      *   This method is suitable for fetching files up to
      *   size of 64MB.
      *   @param filename name of the file or URL to load
      *   @param [extension] parse the table by
      *   comma-separated values "csv", semicolon-separated
      *   values "ssv", or tab-separated values "tsv"
      *   @param [header] "header" to indicate table has
      *   header row
      *   @param [callback] function to be executed after
      *   loadTable() completes. On success, the Table
      *   object is passed in as the first argument.
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      *   @return Table object containing data
      */
    inline def loadTable(filename: String): js.Object = js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    inline def loadTable(filename: String, `extension`: String): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(filename: String, `extension`: String, header: String): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(
      filename: String,
      `extension`: String,
      header: String,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(
      filename: String,
      `extension`: String,
      header: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(
      filename: String,
      `extension`: String,
      header: String,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(
      filename: String,
      `extension`: String,
      header: Unit,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(
      filename: String,
      `extension`: String,
      header: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(
      filename: String,
      `extension`: String,
      header: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(filename: String, `extension`: Unit, header: String): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(
      filename: String,
      `extension`: Unit,
      header: String,
      callback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(
      filename: String,
      `extension`: Unit,
      header: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(
      filename: String,
      `extension`: Unit,
      header: String,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(filename: String, `extension`: Unit, header: Unit, callback: js.Function1[/* repeated */ Any, Any]): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(
      filename: String,
      `extension`: Unit,
      header: Unit,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadTable(
      filename: String,
      `extension`: Unit,
      header: Unit,
      callback: Unit,
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadTable")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], header.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    /**
      *   Reads the contents of a file and creates an XML
      *   object with its values. If the name of the file is
      *   used as the parameter, as in the above example,
      *   the file must be located in the sketch
      *   directory/folder. Alternatively, the file maybe be
      *   loaded from anywhere on the local computer using
      *   an absolute path (something that starts with / on
      *   Unix and Linux, or a drive letter on Windows), or
      *   the filename parameter can be a URL for a file
      *   found on a network.
      *
      *   This method is asynchronous, meaning it may not
      *   finish before the next line in your sketch is
      *   executed. Calling loadXML() inside preload()
      *   guarantees to complete the operation before
      *   setup() and draw() are called.
      *
      *   Outside of preload(), you may supply a callback
      *   function to handle the object.
      *
      *   This method is suitable for fetching files up to
      *   size of 64MB.
      *   @param filename name of the file or URL to load
      *   @param [callback] function to be executed after
      *   loadXML() completes, XML object is passed in as
      *   first argument
      *   @param [errorCallback] function to be executed if
      *   there is an error, response is passed in as first
      *   argument
      *   @return XML object containing data
      */
    inline def loadXML(filename: String): js.Object = js.Dynamic.global.applyDynamic("loadXML")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    inline def loadXML(filename: String, callback: js.Function1[/* repeated */ Any, Any]): js.Object = (js.Dynamic.global.applyDynamic("loadXML")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadXML(
      filename: String,
      callback: js.Function1[/* repeated */ Any, Any],
      errorCallback: js.Function1[/* repeated */ Any, Any]
    ): js.Object = (js.Dynamic.global.applyDynamic("loadXML")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def loadXML(filename: String, callback: Unit, errorCallback: js.Function1[/* repeated */ Any, Any]): js.Object = (js.Dynamic.global.applyDynamic("loadXML")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    /**
      *   Calculates the natural logarithm (the base-e
      *   logarithm) of a number. This function expects the
      *   n parameter to be a value greater than 0.0. Maps
      *   to Math.log().
      *   @param n number greater than 0
      *   @return natural logarithm of n
      */
    inline def log(n: Double): Double = js.Dynamic.global.applyDynamic("log")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   By default, p5.js loops through draw()
      *   continuously, executing the code within it.
      *   However, the draw() loop may be stopped by calling
      *   noLoop(). In that case, the draw() loop can be
      *   resumed with loop(). Avoid calling loop() from
      *   inside setup().
      *
      *   Use isLooping() to check current state of loop().
      */
    inline def loop(): Unit = js.Dynamic.global.applyDynamic("loop")().asInstanceOf[Unit]
    
    /**
      *   Calculates the magnitude (or length) of a vector.
      *   A vector is a direction in space commonly used in
      *   computer graphics and linear algebra. Because it
      *   has no "start" position, the magnitude of a vector
      *   can be thought of as the distance from the
      *   coordinate 0,0 to its x,y value. Therefore, mag()
      *   is a shortcut for writing dist(0, 0, x, y).
      *   @param a first value
      *   @param b second value
      *   @return magnitude of vector from (0,0) to (a,b)
      */
    inline def mag(a: Double, b: Double): Double = (js.Dynamic.global.applyDynamic("mag")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   Re-maps a number from one range to another. In the
      *   first example above, the number 25 is converted
      *   from a value in the range of 0 to 100 into a value
      *   that ranges from the left edge of the window (0)
      *   to the right edge (width).
      *   @param value the incoming value to be converted
      *   @param start1 lower bound of the value's current
      *   range
      *   @param stop1 upper bound of the value's current
      *   range
      *   @param start2 lower bound of the value's target
      *   range
      *   @param stop2 upper bound of the value's target
      *   range
      *   @param [withinBounds] constrain the value to the
      *   newly mapped range
      *   @return remapped number
      */
    inline def map(value: Double, start1: Double, stop1: Double, start2: Double, stop2: Double): Double = (js.Dynamic.global.applyDynamic("map")(value.asInstanceOf[js.Any], start1.asInstanceOf[js.Any], stop1.asInstanceOf[js.Any], start2.asInstanceOf[js.Any], stop2.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def map(value: Double, start1: Double, stop1: Double, start2: Double, stop2: Double, withinBounds: Boolean): Double = (js.Dynamic.global.applyDynamic("map")(value.asInstanceOf[js.Any], start1.asInstanceOf[js.Any], stop1.asInstanceOf[js.Any], start2.asInstanceOf[js.Any], stop2.asInstanceOf[js.Any], withinBounds.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   This function is used to apply a regular
      *   expression to a piece of text, and return matching
      *   groups (elements found inside parentheses) as a
      *   String array. If there are no matches, a null
      *   value will be returned. If no groups are specified
      *   in the regular expression, but the sequence
      *   matches, an array of length 1 (with the matched
      *   text as the first element of the array) will be
      *   returned. To use the function, first check to see
      *   if the result is null. If the result is null, then
      *   the sequence did not match at all. If the sequence
      *   did match, an array is returned.
      *
      *   If there are groups (specified by sets of
      *   parentheses) in the regular expression, then the
      *   contents of each will be returned in the array.
      *   Element [0] of a regular expression match returns
      *   the entire matching string, and the match groups
      *   start at element [1] (the first group is [1], the
      *   second [2], and so on).
      *   @param str the String to be searched
      *   @param regexp the regexp to be used for matching
      *   @return Array of Strings found
      */
    inline def `match`(str: String, regexp: String): js.Array[String] = (js.Dynamic.global.applyDynamic("match")(str.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      *   This function is used to apply a regular
      *   expression to a piece of text, and return a list
      *   of matching groups (elements found inside
      *   parentheses) as a two-dimensional String array. If
      *   there are no matches, a null value will be
      *   returned. If no groups are specified in the
      *   regular expression, but the sequence matches, a
      *   two dimensional array is still returned, but the
      *   second dimension is only of length one. To use the
      *   function, first check to see if the result is
      *   null. If the result is null, then the sequence did
      *   not match at all. If the sequence did match, a 2D
      *   array is returned.
      *
      *   If there are groups (specified by sets of
      *   parentheses) in the regular expression, then the
      *   contents of each will be returned in the array.
      *   Assuming a loop with counter variable i, element
      *   [i][0] of a regular expression match returns the
      *   entire matching string, and the match groups start
      *   at element [i][1] (the first group is [i][1], the
      *   second [i][2], and so on).
      *   @param str the String to be searched
      *   @param regexp the regexp to be used for matching
      *   @return 2d Array of Strings found
      */
    inline def matchAll(str: String, regexp: String): js.Array[String] = (js.Dynamic.global.applyDynamic("matchAll")(str.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      *   Determines the largest value in a sequence of
      *   numbers, and then returns that value. max()
      *   accepts any number of Number parameters, or an
      *   Array of any length.
      *   @param n0 Number to compare
      *   @param n1 Number to compare
      *   @return maximum Number
      */
    inline def max(n0: Double, n1: Double): Double = (js.Dynamic.global.applyDynamic("max")(n0.asInstanceOf[js.Any], n1.asInstanceOf[js.Any])).asInstanceOf[Double]
    /**
      *   Determines the largest value in a sequence of
      *   numbers, and then returns that value. max()
      *   accepts any number of Number parameters, or an
      *   Array of any length.
      *   @param nums Numbers to compare
      */
    inline def max(nums: js.Array[Double]): Double = js.Dynamic.global.applyDynamic("max")(nums.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Returns the frequency value of a MIDI note value.
      *   General MIDI treats notes as integers where middle
      *   C is 60, C# is 61, D is 62 etc. Useful for
      *   generating musical frequencies with oscillators.
      *   @param midiNote The number of a MIDI note
      *   @return Frequency value of the given MIDI note
      */
    inline def midiToFreq(midiNote: Double): Double = js.Dynamic.global.applyDynamic("midiToFreq")(midiNote.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Returns the number of milliseconds (thousandths of
      *   a second) since starting the sketch (when setup()
      *   is called). This information is often used for
      *   timing events and animation sequences.
      *   @return the number of milliseconds since starting
      *   the sketch
      */
    inline def millis(): Double = js.Dynamic.global.applyDynamic("millis")().asInstanceOf[Double]
    
    /**
      *   Determines the smallest value in a sequence of
      *   numbers, and then returns that value. min()
      *   accepts any number of Number parameters, or an
      *   Array of any length.
      *   @param n0 Number to compare
      *   @param n1 Number to compare
      *   @return minimum Number
      */
    inline def min(n0: Double, n1: Double): Double = (js.Dynamic.global.applyDynamic("min")(n0.asInstanceOf[js.Any], n1.asInstanceOf[js.Any])).asInstanceOf[Double]
    /**
      *   Determines the smallest value in a sequence of
      *   numbers, and then returns that value. min()
      *   accepts any number of Number parameters, or an
      *   Array of any length.
      *   @param nums Numbers to compare
      */
    inline def min(nums: js.Array[Double]): Double = js.Dynamic.global.applyDynamic("min")(nums.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   p5.js communicates with the clock on your
      *   computer. The minute() function returns the
      *   current minute as a value from 0 - 59.
      *   @return the current minute
      */
    inline def minute(): Double = js.Dynamic.global.applyDynamic("minute")().asInstanceOf[Double]
    
    /**
      *   Render a 3d model to the screen.
      *   @param model Loaded 3d model to be rendered
      */
    inline def model(model: Geometry): Unit = js.Dynamic.global.applyDynamic("model")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   p5.js communicates with the clock on your
      *   computer. The month() function returns the current
      *   month as a value from 1 - 12.
      *   @return the current month
      */
    inline def month(): Double = js.Dynamic.global.applyDynamic("month")().asInstanceOf[Double]
    
    /**
      *   p5 automatically tracks if the mouse button is
      *   pressed and which button is pressed. The value of
      *   the system variable mouseButton is either LEFT,
      *   RIGHT, or CENTER depending on which button was
      *   pressed last. Warning: different browsers may
      *   track mouseButton differently.
      */
    @JSGlobal("mouseButton")
    @js.native
    def mouseButton: UNKNOWN_P5_CONSTANT = js.native
    inline def mouseButton_=(x: UNKNOWN_P5_CONSTANT): Unit = js.Dynamic.global.updateDynamic("mouseButton")(x.asInstanceOf[js.Any])
    
    /**
      *   The mouseClicked() function is called once after a
      *   mouse button has been pressed and then released.
      *   Browsers handle clicks differently, so this
      *   function is only guaranteed to be run when the
      *   left mouse button is clicked. To handle other
      *   mouse buttons being pressed or released, see
      *   mousePressed() or mouseReleased().
      *
      *
      *   Browsers may have different default behaviors
      *   attached to various mouse events. To prevent any
      *   default behavior for this event, add "return
      *   false" to the end of the method.
      *   @param [event] optional MouseEvent callback
      *   argument.
      */
    inline def mouseClicked(): Unit = js.Dynamic.global.applyDynamic("mouseClicked")().asInstanceOf[Unit]
    inline def mouseClicked(event: js.Object): Unit = js.Dynamic.global.applyDynamic("mouseClicked")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The mouseDragged() function is called once every
      *   time the mouse moves and a mouse button is
      *   pressed. If no mouseDragged() function is defined,
      *   the touchMoved() function will be called instead
      *   if it is defined. Browsers may have different
      *   default behaviors attached to various mouse
      *   events. To prevent any default behavior for this
      *   event, add "return false" to the end of the
      *   method.
      *   @param [event] optional MouseEvent callback
      *   argument.
      */
    inline def mouseDragged(): Unit = js.Dynamic.global.applyDynamic("mouseDragged")().asInstanceOf[Unit]
    inline def mouseDragged(event: js.Object): Unit = js.Dynamic.global.applyDynamic("mouseDragged")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The boolean system variable mouseIsPressed is true
      *   if the mouse is pressed and false if not.
      */
    @JSGlobal("mouseIsPressed")
    @js.native
    def mouseIsPressed: Boolean = js.native
    inline def mouseIsPressed_=(x: Boolean): Unit = js.Dynamic.global.updateDynamic("mouseIsPressed")(x.asInstanceOf[js.Any])
    
    /**
      *   The mouseMoved() function is called every time the
      *   mouse moves and a mouse button is not pressed.
      *   Browsers may have different default behaviors
      *   attached to various mouse events. To prevent any
      *   default behavior for this event, add "return
      *   false" to the end of the method.
      *   @param [event] optional MouseEvent callback
      *   argument.
      */
    inline def mouseMoved(): Unit = js.Dynamic.global.applyDynamic("mouseMoved")().asInstanceOf[Unit]
    inline def mouseMoved(event: js.Object): Unit = js.Dynamic.global.applyDynamic("mouseMoved")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The mousePressed() function is called once after
      *   every time a mouse button is pressed. The
      *   mouseButton variable (see the related reference
      *   entry) can be used to determine which button has
      *   been pressed. If no mousePressed() function is
      *   defined, the touchStarted() function will be
      *   called instead if it is defined. Browsers may have
      *   different default behaviors attached to various
      *   mouse events. To prevent any default behavior for
      *   this event, add "return false" to the end of the
      *   method.
      *   @param [event] optional MouseEvent callback
      *   argument.
      */
    inline def mousePressed(): Unit = js.Dynamic.global.applyDynamic("mousePressed")().asInstanceOf[Unit]
    inline def mousePressed(event: js.Object): Unit = js.Dynamic.global.applyDynamic("mousePressed")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The mouseReleased() function is called every time
      *   a mouse button is released. If no mouseReleased()
      *   function is defined, the touchEnded() function
      *   will be called instead if it is defined. Browsers
      *   may have different default behaviors attached to
      *   various mouse events. To prevent any default
      *   behavior for this event, add "return false" to the
      *   end of the method.
      *   @param [event] optional MouseEvent callback
      *   argument.
      */
    inline def mouseReleased(): Unit = js.Dynamic.global.applyDynamic("mouseReleased")().asInstanceOf[Unit]
    inline def mouseReleased(event: js.Object): Unit = js.Dynamic.global.applyDynamic("mouseReleased")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The function mouseWheel() is executed every time a
      *   vertical mouse wheel event is detected either
      *   triggered by an actual mouse wheel or by a
      *   touchpad. The event.delta property returns the
      *   amount the mouse wheel have scrolled. The values
      *   can be positive or negative depending on the
      *   scroll direction (on OS X with "natural" scrolling
      *   enabled, the signs are inverted).
      *
      *
      *   Browsers may have different default behaviors
      *   attached to various mouse events. To prevent any
      *   default behavior for this event, add "return
      *   false" to the end of the method.
      *
      *
      *   Due to the current support of the "wheel" event on
      *   Safari, the function may only work as expected if
      *   "return false" is included while using Safari.
      *   @param [event] optional WheelEvent callback
      *   argument.
      */
    inline def mouseWheel(): Unit = js.Dynamic.global.applyDynamic("mouseWheel")().asInstanceOf[Unit]
    inline def mouseWheel(event: js.Object): Unit = js.Dynamic.global.applyDynamic("mouseWheel")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The system variable mouseX always contains the
      *   current horizontal position of the mouse, relative
      *   to (0, 0) of the canvas. The value at the top-left
      *   corner is (0, 0) for 2-D and (-width/2, -height/2)
      *   for WebGL. If touch is used instead of mouse
      *   input, mouseX will hold the x value of the most
      *   recent touch point.
      */
    @JSGlobal("mouseX")
    @js.native
    def mouseX: Double = js.native
    inline def mouseX_=(x: Double): Unit = js.Dynamic.global.updateDynamic("mouseX")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable mouseY always contains the
      *   current vertical position of the mouse, relative
      *   to (0, 0) of the canvas. The value at the top-left
      *   corner is (0, 0) for 2-D and (-width/2, -height/2)
      *   for WebGL. If touch is used instead of mouse
      *   input, mouseY will hold the y value of the most
      *   recent touch point.
      */
    @JSGlobal("mouseY")
    @js.native
    def mouseY: Double = js.native
    inline def mouseY_=(x: Double): Unit = js.Dynamic.global.updateDynamic("mouseY")(x.asInstanceOf[js.Any])
    
    /**
      *   The variable movedX contains the horizontal
      *   movement of the mouse since the last frame
      */
    @JSGlobal("movedX")
    @js.native
    def movedX: Double = js.native
    inline def movedX_=(x: Double): Unit = js.Dynamic.global.updateDynamic("movedX")(x.asInstanceOf[js.Any])
    
    /**
      *   The variable movedY contains the vertical movement
      *   of the mouse since the last frame
      */
    @JSGlobal("movedY")
    @js.native
    def movedY: Double = js.native
    inline def movedY_=(x: Double): Unit = js.Dynamic.global.updateDynamic("movedY")(x.asInstanceOf[js.Any])
    
    inline def nf(num: String): String = js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def nf(num: String, left: String): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: String, left: String, right: String): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: String, left: String, right: Double): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: String, left: Double): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: String, left: Double, right: String): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: String, left: Double, right: Double): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: String, left: Unit, right: String): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: String, left: Unit, right: Double): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      *   Utility function for formatting numbers into
      *   strings. There are two versions: one for
      *   formatting floats, and one for formatting ints.
      *   The values for the digits, left, and right
      *   parameters should always be positive integers.
      *
      *   (NOTE): Be cautious when using left and right
      *   parameters as it prepends numbers of 0's if the
      *   parameter if greater than the current length of
      *   the number.
      *
      *   For example if number is 123.2 and left parameter
      *   passed is 4 which is greater than length of 123
      *   (integer part) i.e 3 than result will be 0123.2.
      *   Same case for right parameter i.e. if right is 3
      *   than the result will be 123.200.
      *   @param num the Number to format
      *   @param [left] number of digits to the left of the
      *   decimal point
      *   @param [right] number of digits to the right of
      *   the decimal point
      *   @return formatted String
      */
    inline def nf(num: Double): String = js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def nf(num: Double, left: String): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: Double, left: String, right: String): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: Double, left: String, right: Double): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: Double, left: Double): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: Double, left: Double, right: String): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: Double, left: Double, right: Double): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: Double, left: Unit, right: String): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nf(num: Double, left: Unit, right: Double): String = (js.Dynamic.global.applyDynamic("nf")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      *   Utility function for formatting numbers into
      *   strings. There are two versions: one for
      *   formatting floats, and one for formatting ints.
      *   The values for the digits, left, and right
      *   parameters should always be positive integers.
      *
      *   (NOTE): Be cautious when using left and right
      *   parameters as it prepends numbers of 0's if the
      *   parameter if greater than the current length of
      *   the number.
      *
      *   For example if number is 123.2 and left parameter
      *   passed is 4 which is greater than length of 123
      *   (integer part) i.e 3 than result will be 0123.2.
      *   Same case for right parameter i.e. if right is 3
      *   than the result will be 123.200.
      *   @param nums the Numbers to format
      *   @param [left] number of digits to the left of the
      *   decimal point
      *   @param [right] number of digits to the right of
      *   the decimal point
      *   @return formatted Strings
      */
    inline def nf(nums: js.Array[Any]): js.Array[String] = js.Dynamic.global.applyDynamic("nf")(nums.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def nf(nums: js.Array[Any], left: String): js.Array[String] = (js.Dynamic.global.applyDynamic("nf")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nf(nums: js.Array[Any], left: String, right: String): js.Array[String] = (js.Dynamic.global.applyDynamic("nf")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nf(nums: js.Array[Any], left: String, right: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("nf")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nf(nums: js.Array[Any], left: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("nf")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nf(nums: js.Array[Any], left: Double, right: String): js.Array[String] = (js.Dynamic.global.applyDynamic("nf")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nf(nums: js.Array[Any], left: Double, right: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("nf")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nf(nums: js.Array[Any], left: Unit, right: String): js.Array[String] = (js.Dynamic.global.applyDynamic("nf")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nf(nums: js.Array[Any], left: Unit, right: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("nf")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    inline def nfc(num: String): String = js.Dynamic.global.applyDynamic("nfc")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def nfc(num: String, right: String): String = (js.Dynamic.global.applyDynamic("nfc")(num.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nfc(num: String, right: Double): String = (js.Dynamic.global.applyDynamic("nfc")(num.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      *   Utility function for formatting numbers into
      *   strings and placing appropriate commas to mark
      *   units of 1000. There are two versions: one for
      *   formatting ints, and one for formatting an array
      *   of ints. The value for the right parameter should
      *   always be a positive integer.
      *   @param num the Number to format
      *   @param [right] number of digits to the right of
      *   the decimal point
      *   @return formatted String
      */
    inline def nfc(num: Double): String = js.Dynamic.global.applyDynamic("nfc")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def nfc(num: Double, right: String): String = (js.Dynamic.global.applyDynamic("nfc")(num.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nfc(num: Double, right: Double): String = (js.Dynamic.global.applyDynamic("nfc")(num.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      *   Utility function for formatting numbers into
      *   strings and placing appropriate commas to mark
      *   units of 1000. There are two versions: one for
      *   formatting ints, and one for formatting an array
      *   of ints. The value for the right parameter should
      *   always be a positive integer.
      *   @param nums the Numbers to format
      *   @param [right] number of digits to the right of
      *   the decimal point
      *   @return formatted Strings
      */
    inline def nfc(nums: js.Array[Any]): js.Array[String] = js.Dynamic.global.applyDynamic("nfc")(nums.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def nfc(nums: js.Array[Any], right: String): js.Array[String] = (js.Dynamic.global.applyDynamic("nfc")(nums.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nfc(nums: js.Array[Any], right: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("nfc")(nums.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      *   Utility function for formatting numbers into
      *   strings. Similar to nf() but puts a "+" in front
      *   of positive numbers and a "-" in front of negative
      *   numbers. There are two versions: one for
      *   formatting floats, and one for formatting ints.
      *   The values for left, and right parameters should
      *   always be positive integers.
      *   @param num the Number to format
      *   @param [left] number of digits to the left of the
      *   decimal point
      *   @param [right] number of digits to the right of
      *   the decimal point
      *   @return formatted String
      */
    inline def nfp(num: Double): String = js.Dynamic.global.applyDynamic("nfp")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def nfp(num: Double, left: Double): String = (js.Dynamic.global.applyDynamic("nfp")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nfp(num: Double, left: Double, right: Double): String = (js.Dynamic.global.applyDynamic("nfp")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nfp(num: Double, left: Unit, right: Double): String = (js.Dynamic.global.applyDynamic("nfp")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      *   Utility function for formatting numbers into
      *   strings. Similar to nf() but puts a "+" in front
      *   of positive numbers and a "-" in front of negative
      *   numbers. There are two versions: one for
      *   formatting floats, and one for formatting ints.
      *   The values for left, and right parameters should
      *   always be positive integers.
      *   @param nums the Numbers to format
      *   @param [left] number of digits to the left of the
      *   decimal point
      *   @param [right] number of digits to the right of
      *   the decimal point
      *   @return formatted Strings
      */
    inline def nfp(nums: js.Array[Double]): js.Array[String] = js.Dynamic.global.applyDynamic("nfp")(nums.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def nfp(nums: js.Array[Double], left: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("nfp")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nfp(nums: js.Array[Double], left: Double, right: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("nfp")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nfp(nums: js.Array[Double], left: Unit, right: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("nfp")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      *   Utility function for formatting numbers into
      *   strings. Similar to nf() but puts an additional
      *   "_" (space) in front of positive numbers just in
      *   case to align it with negative numbers which
      *   includes "-" (minus) sign. The main usecase of
      *   nfs() can be seen when one wants to align the
      *   digits (place values) of a non-negative number
      *   with some negative number (See the example to get
      *   a clear picture). There are two versions: one for
      *   formatting float, and one for formatting int.
      *
      *   The values for the digits, left, and right
      *   parameters should always be positive integers.
      *
      *   (IMP): The result on the canvas basically the
      *   expected alignment can vary based on the typeface
      *   you are using.
      *
      *   (NOTE): Be cautious when using left and right
      *   parameters as it prepends numbers of 0's if the
      *   parameter if greater than the current length of
      *   the number.
      *
      *   For example if number is 123.2 and left parameter
      *   passed is 4 which is greater than length of 123
      *   (integer part) i.e 3 than result will be 0123.2.
      *   Same case for right parameter i.e. if right is 3
      *   than the result will be 123.200.
      *   @param num the Number to format
      *   @param [left] number of digits to the left of the
      *   decimal point
      *   @param [right] number of digits to the right of
      *   the decimal point
      *   @return formatted String
      */
    inline def nfs(num: Double): String = js.Dynamic.global.applyDynamic("nfs")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def nfs(num: Double, left: Double): String = (js.Dynamic.global.applyDynamic("nfs")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nfs(num: Double, left: Double, right: Double): String = (js.Dynamic.global.applyDynamic("nfs")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def nfs(num: Double, left: Unit, right: Double): String = (js.Dynamic.global.applyDynamic("nfs")(num.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      *   Utility function for formatting numbers into
      *   strings. Similar to nf() but puts an additional
      *   "_" (space) in front of positive numbers just in
      *   case to align it with negative numbers which
      *   includes "-" (minus) sign. The main usecase of
      *   nfs() can be seen when one wants to align the
      *   digits (place values) of a non-negative number
      *   with some negative number (See the example to get
      *   a clear picture). There are two versions: one for
      *   formatting float, and one for formatting int.
      *
      *   The values for the digits, left, and right
      *   parameters should always be positive integers.
      *
      *   (IMP): The result on the canvas basically the
      *   expected alignment can vary based on the typeface
      *   you are using.
      *
      *   (NOTE): Be cautious when using left and right
      *   parameters as it prepends numbers of 0's if the
      *   parameter if greater than the current length of
      *   the number.
      *
      *   For example if number is 123.2 and left parameter
      *   passed is 4 which is greater than length of 123
      *   (integer part) i.e 3 than result will be 0123.2.
      *   Same case for right parameter i.e. if right is 3
      *   than the result will be 123.200.
      *   @param nums the Numbers to format
      *   @param [left] number of digits to the left of the
      *   decimal point
      *   @param [right] number of digits to the right of
      *   the decimal point
      *   @return formatted Strings
      */
    inline def nfs(nums: js.Array[Any]): js.Array[String] = js.Dynamic.global.applyDynamic("nfs")(nums.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def nfs(nums: js.Array[Any], left: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("nfs")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nfs(nums: js.Array[Any], left: Double, right: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("nfs")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def nfs(nums: js.Array[Any], left: Unit, right: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("nfs")(nums.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      *   Removes the default canvas for a p5 sketch that
      *   doesn't require a canvas
      */
    inline def noCanvas(): Unit = js.Dynamic.global.applyDynamic("noCanvas")().asInstanceOf[Unit]
    
    /**
      *   Hides the cursor from view.
      */
    inline def noCursor(): Unit = js.Dynamic.global.applyDynamic("noCursor")().asInstanceOf[Unit]
    
    /**
      *   Turns off debugMode() in a 3D sketch.
      */
    inline def noDebugMode(): Unit = js.Dynamic.global.applyDynamic("noDebugMode")().asInstanceOf[Unit]
    
    /**
      *   Ends erasing that was started with erase(). The
      *   fill(), stroke(), and blendMode() settings will
      *   return to what they were prior to calling erase().
      *   @chainable
      */
    inline def noErase(): ^ = js.Dynamic.global.applyDynamic("noErase")().asInstanceOf[^]
    
    /**
      *   Disables filling geometry. If both noStroke() and
      *   noFill() are called, nothing will be drawn to the
      *   screen.
      *   @chainable
      */
    inline def noFill(): ^ = js.Dynamic.global.applyDynamic("noFill")().asInstanceOf[^]
    
    /**
      *   This function will remove all the lights from the
      *   sketch for the subsequent materials rendered. It
      *   affects all the subsequent methods. Calls to
      *   lighting methods made after noLights() will
      *   re-enable lights in the sketch.
      *   @chainable
      */
    inline def noLights(): ^ = js.Dynamic.global.applyDynamic("noLights")().asInstanceOf[^]
    
    /**
      *   Stops p5.js from continuously executing the code
      *   within draw(). If loop() is called, the code in
      *   draw() begins to run continuously again. If using
      *   noLoop() in setup(), it should be the last line
      *   inside the block. When noLoop() is used, it's not
      *   possible to manipulate or access the screen inside
      *   event handling functions such as mousePressed() or
      *   keyPressed(). Instead, use those functions to call
      *   redraw() or loop(), which will run draw(), which
      *   can update the screen properly. This means that
      *   when noLoop() has been called, no drawing can
      *   happen, and functions like saveFrames() or
      *   loadPixels() may not be used.
      *
      *   Note that if the sketch is resized, redraw() will
      *   be called to update the sketch, even after
      *   noLoop() has been specified. Otherwise, the sketch
      *   would enter an odd state until loop() was called.
      *
      *   Use isLooping() to check current state of loop().
      */
    inline def noLoop(): Unit = js.Dynamic.global.applyDynamic("noLoop")().asInstanceOf[Unit]
    
    /**
      *   Draws all geometry with jagged (aliased) edges.
      *   Note that smooth() is active by default in 2D
      *   mode, so it is necessary to call noSmooth() to
      *   disable smoothing of geometry, images, and fonts.
      *   In 3D mode, noSmooth() is enabled by default, so
      *   it is necessary to call smooth() if you would like
      *   smooth (antialiased) edges on your geometry.
      *   @chainable
      */
    inline def noSmooth(): ^ = js.Dynamic.global.applyDynamic("noSmooth")().asInstanceOf[^]
    
    /**
      *   Disables drawing the stroke (outline). If both
      *   noStroke() and noFill() are called, nothing will
      *   be drawn to the screen.
      *   @chainable
      */
    inline def noStroke(): ^ = js.Dynamic.global.applyDynamic("noStroke")().asInstanceOf[^]
    
    /**
      *   Removes the current fill value for displaying
      *   images and reverts to displaying images with their
      *   original hues.
      */
    inline def noTint(): Unit = js.Dynamic.global.applyDynamic("noTint")().asInstanceOf[Unit]
    
    /**
      *   Returns the Perlin noise value at specified
      *   coordinates. Perlin noise is a random sequence
      *   generator producing a more naturally ordered,
      *   harmonic succession of numbers compared to the
      *   standard random() function. It was invented by Ken
      *   Perlin in the 1980s and been used since in
      *   graphical applications to produce procedural
      *   textures, natural motion, shapes, terrains etc.
      *   The main difference to the random() function is
      *   that Perlin noise is defined in an infinite
      *   n-dimensional space where each pair of coordinates
      *   corresponds to a fixed semi-random value (fixed
      *   only for the lifespan of the program; see the
      *   noiseSeed() function). p5.js can compute 1D, 2D
      *   and 3D noise, depending on the number of
      *   coordinates given. The resulting value will always
      *   be between 0.0 and 1.0. The noise value can be
      *   animated by moving through the noise space as
      *   demonstrated in the example above. The 2nd and 3rd
      *   dimension can also be interpreted as time.
      *
      *   The actual noise is structured similar to an audio
      *   signal, in respect to the function's use of
      *   frequencies. Similar to the concept of harmonics
      *   in physics, perlin noise is computed over several
      *   octaves which are added together for the final
      *   result.
      *
      *   Another way to adjust the character of the
      *   resulting sequence is the scale of the input
      *   coordinates. As the function works within an
      *   infinite space the value of the coordinates
      *   doesn't matter as such, only the distance between
      *   successive coordinates does (eg. when using
      *   noise() within a loop). As a general rule the
      *   smaller the difference between coordinates, the
      *   smoother the resulting noise sequence will be.
      *   Steps of 0.005-0.03 work best for most
      *   applications, but this will differ depending on
      *   use.
      *   @param x x-coordinate in noise space
      *   @param [y] y-coordinate in noise space
      *   @param [z] z-coordinate in noise space
      *   @return Perlin noise value (between 0 and 1) at
      *   specified coordinates
      */
    inline def noise(x: Double): Double = js.Dynamic.global.applyDynamic("noise")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def noise(x: Double, y: Double): Double = (js.Dynamic.global.applyDynamic("noise")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def noise(x: Double, y: Double, z: Double): Double = (js.Dynamic.global.applyDynamic("noise")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def noise(x: Double, y: Unit, z: Double): Double = (js.Dynamic.global.applyDynamic("noise")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   Adjusts the character and level of detail produced
      *   by the Perlin noise function. Similar to harmonics
      *   in physics, noise is computed over several
      *   octaves. Lower octaves contribute more to the
      *   output signal and as such define the overall
      *   intensity of the noise, whereas higher octaves
      *   create finer grained details in the noise
      *   sequence. By default, noise is computed over 4
      *   octaves with each octave contributing exactly half
      *   than its predecessor, starting at 50% strength for
      *   the 1st octave. This falloff amount can be changed
      *   by adding an additional function parameter. Eg. a
      *   falloff factor of 0.75 means each octave will now
      *   have 75% impact (25% less) of the previous lower
      *   octave. Any value between 0.0 and 1.0 is valid,
      *   however note that values greater than 0.5 might
      *   result in greater than 1.0 values returned by
      *   noise(). By changing these parameters, the signal
      *   created by the noise() function can be adapted to
      *   fit very specific needs and characteristics.
      *   @param lod number of octaves to be used by the
      *   noise
      *   @param falloff falloff factor for each octave
      */
    inline def noiseDetail(lod: Double, falloff: Double): Unit = (js.Dynamic.global.applyDynamic("noiseDetail")(lod.asInstanceOf[js.Any], falloff.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Sets the seed value for noise(). By default,
      *   noise() produces different results each time the
      *   program is run. Set the value parameter to a
      *   constant to return the same pseudo-random numbers
      *   each time the software is run.
      *   @param seed the seed value
      */
    inline def noiseSeed(seed: Double): Unit = js.Dynamic.global.applyDynamic("noiseSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   Normalizes a number from another range into a
      *   value between 0 and 1. Identical to map(value,
      *   low, high, 0, 1). Numbers outside of the range are
      *   not clamped to 0 and 1, because out-of-range
      *   values are often intentional and useful. (See the
      *   example above.)
      *   @param value incoming value to be normalized
      *   @param start lower bound of the value's current
      *   range
      *   @param stop upper bound of the value's current
      *   range
      *   @return normalized number
      */
    inline def norm(value: Double, start: Double, stop: Double): Double = (js.Dynamic.global.applyDynamic("norm")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    // TODO: Fix vertex() errors in src/core/shape/vertex.js, line 965:
    //
    //    required param "u" follows an optional param
    //    required param "v" follows an optional param
    //
    // function vertex(x: number, y: number, z?: number, u: number, v: number): p5
    /**
      *   Sets the 3d vertex normal to use for subsequent
      *   vertices drawn with vertex(). A normal is a vector
      *   that is generally nearly perpendicular to a
      *   shape's surface which controls how much light will
      *   be reflected from that part of the surface.
      *   @param vector A p5.Vector representing the vertex
      *   normal.
      *   @chainable
      */
    inline def normal(vector: Vector): ^ = js.Dynamic.global.applyDynamic("normal")(vector.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Sets the 3d vertex normal to use for subsequent
      *   vertices drawn with vertex(). A normal is a vector
      *   that is generally nearly perpendicular to a
      *   shape's surface which controls how much light will
      *   be reflected from that part of the surface.
      *   @param x The x component of the vertex normal.
      *   @param y The y component of the vertex normal.
      *   @param z The z component of the vertex normal.
      *   @chainable
      */
    inline def normal(x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("normal")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Normal material for geometry is a material that is
      *   not affected by light. It is not reflective and is
      *   a placeholder material often used for debugging.
      *   Surfaces facing the X-axis, become red, those
      *   facing the Y-axis, become green and those facing
      *   the Z-axis, become blue. You can view all possible
      *   materials in this example.
      *   @chainable
      */
    inline def normalMaterial(): ^ = js.Dynamic.global.applyDynamic("normalMaterial")().asInstanceOf[^]
    
    /**
      *   Allows movement around a 3D sketch using a mouse
      *   or trackpad. Left-clicking and dragging will
      *   rotate the camera position about the center of the
      *   sketch, right-clicking and dragging will pan the
      *   camera position without rotation, and using the
      *   mouse wheel (scrolling) will move the camera
      *   closer or further from the center of the sketch.
      *   This function can be called with parameters
      *   dictating sensitivity to mouse movement along the
      *   X and Y axes. Calling this function without
      *   parameters is equivalent to calling
      *   orbitControl(1,1). To reverse direction of
      *   movement in either axis, enter a negative number
      *   for sensitivity.
      *   @param [sensitivityX] sensitivity to mouse
      *   movement along X axis
      *   @param [sensitivityY] sensitivity to mouse
      *   movement along Y axis
      *   @param [sensitivityZ] sensitivity to scroll
      *   movement along Z axis
      *   @chainable
      */
    inline def orbitControl(): ^ = js.Dynamic.global.applyDynamic("orbitControl")().asInstanceOf[^]
    inline def orbitControl(sensitivityX: Double): ^ = js.Dynamic.global.applyDynamic("orbitControl")(sensitivityX.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def orbitControl(sensitivityX: Double, sensitivityY: Double): ^ = (js.Dynamic.global.applyDynamic("orbitControl")(sensitivityX.asInstanceOf[js.Any], sensitivityY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def orbitControl(sensitivityX: Double, sensitivityY: Double, sensitivityZ: Double): ^ = (js.Dynamic.global.applyDynamic("orbitControl")(sensitivityX.asInstanceOf[js.Any], sensitivityY.asInstanceOf[js.Any], sensitivityZ.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def orbitControl(sensitivityX: Double, sensitivityY: Unit, sensitivityZ: Double): ^ = (js.Dynamic.global.applyDynamic("orbitControl")(sensitivityX.asInstanceOf[js.Any], sensitivityY.asInstanceOf[js.Any], sensitivityZ.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def orbitControl(sensitivityX: Unit, sensitivityY: Double): ^ = (js.Dynamic.global.applyDynamic("orbitControl")(sensitivityX.asInstanceOf[js.Any], sensitivityY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def orbitControl(sensitivityX: Unit, sensitivityY: Double, sensitivityZ: Double): ^ = (js.Dynamic.global.applyDynamic("orbitControl")(sensitivityX.asInstanceOf[js.Any], sensitivityY.asInstanceOf[js.Any], sensitivityZ.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def orbitControl(sensitivityX: Unit, sensitivityY: Unit, sensitivityZ: Double): ^ = (js.Dynamic.global.applyDynamic("orbitControl")(sensitivityX.asInstanceOf[js.Any], sensitivityY.asInstanceOf[js.Any], sensitivityZ.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Sets an orthographic projection for the current
      *   camera in a 3D sketch and defines a box-shaped
      *   viewing frustum within which objects are seen. In
      *   this projection, all objects with the same
      *   dimension appear the same size, regardless of
      *   whether they are near or far from the camera. The
      *   parameters to this function specify the viewing
      *   frustum where left and right are the minimum and
      *   maximum x values, top and bottom are the minimum
      *   and maximum y values, and near and far are the
      *   minimum and maximum z values.
      *
      *   If no parameters are given, the following default
      *   is used: ortho(-width/2, width/2, -height/2,
      *   height/2).
      *   @param [left] camera frustum left plane
      *   @param [right] camera frustum right plane
      *   @param [bottom] camera frustum bottom plane
      *   @param [top] camera frustum top plane
      *   @param [near] camera frustum near plane
      *   @param [far] camera frustum far plane
      *   @chainable
      */
    inline def ortho(
      left: js.UndefOr[Double],
      right: js.UndefOr[Double],
      bottom: js.UndefOr[Double],
      top: js.UndefOr[Double],
      near: js.UndefOr[Double],
      far: js.UndefOr[Double]
    ): ^ = (js.Dynamic.global.applyDynamic("ortho")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[^]
    
    inline def outputVolume(volume: js.Object): Unit = js.Dynamic.global.applyDynamic("outputVolume")(volume.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def outputVolume(volume: js.Object, rampTime: Double): Unit = (js.Dynamic.global.applyDynamic("outputVolume")(volume.asInstanceOf[js.Any], rampTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputVolume(volume: js.Object, rampTime: Double, timeFromNow: Double): Unit = (js.Dynamic.global.applyDynamic("outputVolume")(volume.asInstanceOf[js.Any], rampTime.asInstanceOf[js.Any], timeFromNow.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputVolume(volume: js.Object, rampTime: Unit, timeFromNow: Double): Unit = (js.Dynamic.global.applyDynamic("outputVolume")(volume.asInstanceOf[js.Any], rampTime.asInstanceOf[js.Any], timeFromNow.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Scale the output of all sound in this sketch
      *   Scaled between 0.0 (silence) and 1.0 (full
      *   volume). 1.0 is the maximum amplitude of a digital
      *   sound, so multiplying by greater than 1.0 may
      *   cause digital distortion. To fade, provide a
      *   rampTime parameter. For more complex fades, see
      *   the Envelope class. Alternately, you can pass in a
      *   signal source such as an oscillator to modulate
      *   the amplitude with an audio signal.
      *
      *   How This Works: When you load the p5.sound module,
      *   it creates a single instance of p5sound. All sound
      *   objects in this module output to p5sound before
      *   reaching your computer's output. So if you change
      *   the amplitude of p5sound, it impacts all of the
      *   sound in this module.
      *
      *   If no value is provided, returns a Web Audio API
      *   Gain Node
      *   @param volume Volume (amplitude) between 0.0 and
      *   1.0 or modulating signal/oscillator
      *   @param [rampTime] Fade for t seconds
      *   @param [timeFromNow] Schedule this event to happen
      *   at t seconds in the future
      */
    inline def outputVolume(volume: Double): Unit = js.Dynamic.global.applyDynamic("outputVolume")(volume.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def outputVolume(volume: Double, rampTime: Double): Unit = (js.Dynamic.global.applyDynamic("outputVolume")(volume.asInstanceOf[js.Any], rampTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputVolume(volume: Double, rampTime: Double, timeFromNow: Double): Unit = (js.Dynamic.global.applyDynamic("outputVolume")(volume.asInstanceOf[js.Any], rampTime.asInstanceOf[js.Any], timeFromNow.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputVolume(volume: Double, rampTime: Unit, timeFromNow: Double): Unit = (js.Dynamic.global.applyDynamic("outputVolume")(volume.asInstanceOf[js.Any], rampTime.asInstanceOf[js.Any], timeFromNow.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   The p5() constructor enables you to activate
      *   "instance mode" instead of normal "global mode".
      *   This is an advanced topic. A short description and
      *   example is included below. Please see  Dan
      *   Shiffman's Coding Train video tutorial or this
      *   tutorial page for more info. By default, all p5.js
      *   functions are in the global namespace (i.e. bound
      *   to the window object), meaning you can call them
      *   simply ellipse(), fill(), etc. However, this might
      *   be inconvenient if you are mixing with other JS
      *   libraries (synchronously or asynchronously) or
      *   writing long programs of your own. p5.js currently
      *   supports a way around this problem called
      *   "instance mode". In instance mode, all p5
      *   functions are bound up in a single variable
      *   instead of polluting your global namespace.
      *
      *   Optionally, you can specify a default container
      *   for the canvas and any other elements to append to
      *   with a second argument. You can give the ID of an
      *   element in your html, or an html node itself.
      *
      *   Note that creating instances like this also allows
      *   you to have more than one p5 sketch on a single
      *   web page, as they will each be wrapped up with
      *   their own set up variables. Of course, you could
      *   also use iframes to have multiple sketches in
      *   global mode.
      *   @param sketch a function containing a p5.js sketch
      *   @param node ID or pointer to HTML DOM node to
      *   contain sketch in
      */
    inline def p5(sketch: js.Object, node: String): Unit = (js.Dynamic.global.applyDynamic("p5")(sketch.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def p5(sketch: js.Object, node: js.Object): Unit = (js.Dynamic.global.applyDynamic("p5")(sketch.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   The system variable pAccelerationX always contains
      *   the acceleration of the device along the x axis in
      *   the frame previous to the current frame. Value is
      *   represented as meters per second squared.
      */
    @JSGlobal("pAccelerationX")
    @js.native
    def pAccelerationX: Double = js.native
    inline def pAccelerationX_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pAccelerationX")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable pAccelerationY always contains
      *   the acceleration of the device along the y axis in
      *   the frame previous to the current frame. Value is
      *   represented as meters per second squared.
      */
    @JSGlobal("pAccelerationY")
    @js.native
    def pAccelerationY: Double = js.native
    inline def pAccelerationY_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pAccelerationY")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable pAccelerationZ always contains
      *   the acceleration of the device along the z axis in
      *   the frame previous to the current frame. Value is
      *   represented as meters per second squared.
      */
    @JSGlobal("pAccelerationZ")
    @js.native
    def pAccelerationZ: Double = js.native
    inline def pAccelerationZ_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pAccelerationZ")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable pRotationX always contains the
      *   rotation of the device along the x axis in the
      *   frame previous to the current frame. If the sketch
      *   angleMode() is set to DEGREES, the value will be
      *   -180 to 180. If it is set to RADIANS, the value
      *   will be -PI to PI. pRotationX can also be used
      *   with rotationX to determine the rotate direction
      *   of the device along the X-axis.
      */
    @JSGlobal("pRotationX")
    @js.native
    def pRotationX: Double = js.native
    inline def pRotationX_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pRotationX")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable pRotationY always contains the
      *   rotation of the device along the y axis in the
      *   frame previous to the current frame. If the sketch
      *   angleMode() is set to DEGREES, the value will be
      *   -90 to 90. If it is set to RADIANS, the value will
      *   be -PI/2 to PI/2. pRotationY can also be used with
      *   rotationY to determine the rotate direction of the
      *   device along the Y-axis.
      */
    @JSGlobal("pRotationY")
    @js.native
    def pRotationY: Double = js.native
    inline def pRotationY_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pRotationY")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable pRotationZ always contains the
      *   rotation of the device along the z axis in the
      *   frame previous to the current frame. If the sketch
      *   angleMode() is set to DEGREES, the value will be 0
      *   to 360. If it is set to RADIANS, the value will be
      *   0 to 2*PI. pRotationZ can also be used with
      *   rotationZ to determine the rotate direction of the
      *   device along the Z-axis.
      */
    @JSGlobal("pRotationZ")
    @js.native
    def pRotationZ: Double = js.native
    inline def pRotationZ_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pRotationZ")(x.asInstanceOf[js.Any])
    
    /**
      *   Sets a perspective projection for the current
      *   camera in a 3D sketch. This projection represents
      *   depth through foreshortening: objects that are
      *   close to the camera appear their actual size while
      *   those that are further away from the camera appear
      *   smaller. The parameters to this function define
      *   the viewing frustum (the truncated pyramid within
      *   which objects are seen by the camera) through
      *   vertical field of view, aspect ratio (usually
      *   width/height), and near and far clipping planes.
      *
      *   If no parameters are given, the following default
      *   is used: perspective(PI/3, width/height, eyeZ/10,
      *   eyeZ*10), where eyeZ is equal to ((height/2) /
      *   tan(PI/6)).
      *   @param [fovy] camera frustum vertical field of
      *   view, from bottom to top of view, in angleMode
      *   units
      *   @param [aspect] camera frustum aspect ratio
      *   @param [near] frustum near plane length
      *   @param [far] frustum far plane length
      *   @chainable
      */
    inline def perspective(): ^ = js.Dynamic.global.applyDynamic("perspective")().asInstanceOf[^]
    inline def perspective(fovy: Double): ^ = js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def perspective(fovy: Double, aspect: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Double, aspect: Double, near: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Double, aspect: Double, near: Double, far: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Double, aspect: Double, near: Unit, far: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Double, aspect: Unit, near: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Double, aspect: Unit, near: Double, far: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Double, aspect: Unit, near: Unit, far: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Unit, aspect: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Unit, aspect: Double, near: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Unit, aspect: Double, near: Double, far: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Unit, aspect: Double, near: Unit, far: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Unit, aspect: Unit, near: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Unit, aspect: Unit, near: Double, far: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def perspective(fovy: Unit, aspect: Unit, near: Unit, far: Double): ^ = (js.Dynamic.global.applyDynamic("perspective")(fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Sets the pixel scaling for high pixel density
      *   displays. By default pixel density is set to match
      *   display density, call pixelDensity(1) to turn this
      *   off. Calling pixelDensity() with no arguments
      *   returns the current pixel density of the sketch.
      *   @return current pixel density of the sketch
      */
    inline def pixelDensity(): Double = js.Dynamic.global.applyDynamic("pixelDensity")().asInstanceOf[Double]
    /**
      *   Sets the pixel scaling for high pixel density
      *   displays. By default pixel density is set to match
      *   display density, call pixelDensity(1) to turn this
      *   off. Calling pixelDensity() with no arguments
      *   returns the current pixel density of the sketch.
      *   @param val whether or how much the sketch should
      *   scale
      *   @chainable
      */
    inline def pixelDensity(`val`: Double): ^ = js.Dynamic.global.applyDynamic("pixelDensity")(`val`.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Uint8ClampedArray containing the values for all
      *   the pixels in the display window. These values are
      *   numbers. This array is the size (include an
      *   appropriate factor for pixelDensity) of the
      *   display window x4, representing the R, G, B, A
      *   values in order for each pixel, moving from left
      *   to right across each row, then down each column.
      *   Retina and other high density displays will have
      *   more pixels[] (by a factor of pixelDensity^2). For
      *   example, if the image is 100×100 pixels, there
      *   will be 40,000. On a retina display, there will be
      *   160,000. The first four values (indices 0-3) in
      *   the array will be the R, G, B, A values of the
      *   pixel at (0, 0). The second four values (indices
      *   4-7) will contain the R, G, B, A values of the
      *   pixel at (1, 0). More generally, to set values for
      *   a pixel at (x, y):
      *
      *   let d = pixelDensity(); for (let i = 0; i < d;
      *   i++) { for (let j = 0; j < d; j++) { // loop over
      *   index = 4 * ((y * d + j) * width * d + (x * d +
      *   i)); pixels[index] = r; pixels[index+1] = g;
      *   pixels[index+2] = b; pixels[index+3] = a; } }
      *
      *   While the above method is complex, it is flexible
      *   enough to work with any pixelDensity. Note that
      *   set() will automatically take care of setting all
      *   the appropriate values in pixels[] for a given (x,
      *   y) at any pixelDensity, but the performance may
      *   not be as fast when lots of modifications are made
      *   to the pixel array.
      *
      *   Before accessing this array, the data must loaded
      *   with the loadPixels() function. After the array
      *   data has been modified, the updatePixels()
      *   function must be run to update the changes.
      *
      *   Note that this is not a standard javascript array.
      *   This means that standard javascript functions such
      *   as slice() or arrayCopy() do not work.
      */
    @JSGlobal("pixels")
    @js.native
    def pixels: js.Array[Double] = js.native
    inline def pixels_=(x: js.Array[Double]): Unit = js.Dynamic.global.updateDynamic("pixels")(x.asInstanceOf[js.Any])
    
    /**
      *   Draw a plane with given a width and height
      *   @param [width] width of the plane
      *   @param [height] height of the plane
      *   @param [detailX] Optional number of triangle
      *   subdivisions in x-dimension
      *   @param [detailY] Optional number of triangle
      *   subdivisions in y-dimension
      *   @chainable
      */
    inline def plane(): ^ = js.Dynamic.global.applyDynamic("plane")().asInstanceOf[^]
    inline def plane(width: Double): ^ = js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def plane(width: Double, height: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Double, height: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Double, height: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Double, height: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Double, height: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Double, height: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Double, height: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Unit, height: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Unit, height: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Unit, height: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Unit, height: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Unit, height: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Unit, height: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def plane(width: Unit, height: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("plane")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   The system variable pmouseX always contains the
      *   horizontal position of the mouse or finger in the
      *   frame previous to the current frame, relative to
      *   (0, 0) of the canvas. The value at the top-left
      *   corner is (0, 0) for 2-D and (-width/2, -height/2)
      *   for WebGL. Note: pmouseX will be reset to the
      *   current mouseX value at the start of each touch
      *   event.
      */
    @JSGlobal("pmouseX")
    @js.native
    def pmouseX: Double = js.native
    inline def pmouseX_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pmouseX")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable pmouseY always contains the
      *   vertical position of the mouse or finger in the
      *   frame previous to the current frame, relative to
      *   (0, 0) of the canvas. The value at the top-left
      *   corner is (0, 0) for 2-D and (-width/2, -height/2)
      *   for WebGL. Note: pmouseY will be reset to the
      *   current mouseY value at the start of each touch
      *   event.
      */
    @JSGlobal("pmouseY")
    @js.native
    def pmouseY: Double = js.native
    inline def pmouseY_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pmouseY")(x.asInstanceOf[js.Any])
    
    /**
      *   Draws a point, a coordinate in space at the
      *   dimension of one pixel. The first parameter is the
      *   horizontal value for the point, the second param
      *   is the vertical value for the point. The color of
      *   the point is changed with the stroke() function.
      *   The size of the point can be changed with the
      *   strokeWeight() function.
      *   @param coordinate_vector the coordinate vector
      *   @chainable
      */
    inline def point(coordinate_vector: Vector): ^ = js.Dynamic.global.applyDynamic("point")(coordinate_vector.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Draws a point, a coordinate in space at the
      *   dimension of one pixel. The first parameter is the
      *   horizontal value for the point, the second param
      *   is the vertical value for the point. The color of
      *   the point is changed with the stroke() function.
      *   The size of the point can be changed with the
      *   strokeWeight() function.
      *   @param x the x-coordinate
      *   @param y the y-coordinate
      *   @param [z] the z-coordinate (for WebGL mode)
      *   @chainable
      */
    inline def point(x: Double, y: Double): ^ = (js.Dynamic.global.applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def point(x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    
    inline def pointLight(color: String, position: Vector): ^ = (js.Dynamic.global.applyDynamic("pointLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def pointLight(color: String, x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("pointLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Creates a point light with a color and a light
      *   position A maximum of 5 pointLight can be active
      *   at one time
      *   @param color color Array, CSS color string, or
      *   p5.Color value
      *   @param position the position of the light
      *   @chainable
      */
    inline def pointLight(color: js.Array[Double], position: Vector): ^ = (js.Dynamic.global.applyDynamic("pointLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Creates a point light with a color and a light
      *   position A maximum of 5 pointLight can be active
      *   at one time
      *   @param color color Array, CSS color string, or
      *   p5.Color value
      *   @param x x axis position
      *   @param y y axis position
      *   @param z z axis position
      *   @chainable
      */
    inline def pointLight(color: js.Array[Double], x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("pointLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def pointLight(color: Color, position: Vector): ^ = (js.Dynamic.global.applyDynamic("pointLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def pointLight(color: Color, x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("pointLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Creates a point light with a color and a light
      *   position A maximum of 5 pointLight can be active
      *   at one time
      *   @param v1 red or hue value (depending on the
      *   current color mode),
      *   @param v2 green or saturation value
      *   @param v3 blue or brightness value
      *   @param position the position of the light
      *   @chainable
      */
    inline def pointLight(v1: Double, v2: Double, v3: Double, position: Vector): ^ = (js.Dynamic.global.applyDynamic("pointLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Creates a point light with a color and a light
      *   position A maximum of 5 pointLight can be active
      *   at one time
      *   @param v1 red or hue value (depending on the
      *   current color mode),
      *   @param v2 green or saturation value
      *   @param v3 blue or brightness value
      *   @param x x axis position
      *   @param y y axis position
      *   @param z z axis position
      *   @chainable
      */
    inline def pointLight(v1: Double, v2: Double, v3: Double, x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("pointLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   The push() function saves the current drawing
      *   style settings and transformations, while pop()
      *   restores these settings. Note that these functions
      *   are always used together. They allow you to change
      *   the style and transformation settings and later
      *   return to what you had. When a new state is
      *   started with push(), it builds on the current
      *   style and transform information. The push() and
      *   pop() functions can be embedded to provide more
      *   control. (See the second example for a
      *   demonstration.) push() stores information related
      *   to the current transformation state and style
      *   settings controlled by the following functions:
      *   fill(), noFill(), noStroke(), stroke(), tint(),
      *   noTint(), strokeWeight(), strokeCap(),
      *   strokeJoin(), imageMode(), rectMode(),
      *   ellipseMode(), colorMode(), textAlign(),
      *   textFont(), textSize(), textLeading(),
      *   applyMatrix(), resetMatrix(), rotate(), scale(),
      *   shearX(), shearY(), translate(), noiseSeed().
      *
      *   In WEBGL mode additional style settings are
      *   stored. These are controlled by the following
      *   functions: setCamera(), ambientLight(),
      *   directionalLight(), pointLight(), texture(),
      *   specularMaterial(), shininess(), normalMaterial()
      *   and shader().
      */
    inline def pop(): Unit = js.Dynamic.global.applyDynamic("pop")().asInstanceOf[Unit]
    
    /**
      *   Facilitates exponential expressions. The pow()
      *   function is an efficient way of multiplying
      *   numbers by themselves (or their reciprocals) in
      *   large quantities. For example, pow(3, 5) is
      *   equivalent to the expression 3 × 3 × 3 × 3 × 3 and
      *   pow(3, -5) is equivalent to 1 / 3 × 3 × 3 × 3 × 3.
      *   Maps to Math.pow().
      *   @param n base of the exponential expression
      *   @param e power by which to raise the base
      *   @return n^e
      */
    inline def pow(n: Double, e: Double): Double = (js.Dynamic.global.applyDynamic("pow")(n.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   The print() function writes to the console area of
      *   your browser. This function is often helpful for
      *   looking at the data a program is producing. This
      *   function creates a new line of text for each call
      *   to the function. Individual elements can be
      *   separated with quotes ("") and joined with the
      *   addition operator (+). Note that calling print()
      *   without any arguments invokes the window.print()
      *   function which opens the browser's print dialog.
      *   To print a blank line to console you can write
      *   print('\n').
      *   @param contents any combination of Number, String,
      *   Object, Boolean, Array to print
      */
    inline def print(contents: Any): Unit = js.Dynamic.global.applyDynamic("print")(contents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The push() function saves the current drawing
      *   style settings and transformations, while pop()
      *   restores these settings. Note that these functions
      *   are always used together. They allow you to change
      *   the style and transformation settings and later
      *   return to what you had. When a new state is
      *   started with push(), it builds on the current
      *   style and transform information. The push() and
      *   pop() functions can be embedded to provide more
      *   control. (See the second example for a
      *   demonstration.) push() stores information related
      *   to the current transformation state and style
      *   settings controlled by the following functions:
      *   fill(), noFill(), noStroke(), stroke(), tint(),
      *   noTint(), strokeWeight(), strokeCap(),
      *   strokeJoin(), imageMode(), rectMode(),
      *   ellipseMode(), colorMode(), textAlign(),
      *   textFont(), textSize(), textLeading(),
      *   applyMatrix(), resetMatrix(), rotate(), scale(),
      *   shearX(), shearY(), translate(), noiseSeed().
      *
      *   In WEBGL mode additional style settings are
      *   stored. These are controlled by the following
      *   functions: setCamera(), ambientLight(),
      *   directionalLight(), pointLight(), texture(),
      *   specularMaterial(), shininess(), normalMaterial()
      *   and shader().
      */
    inline def push(): Unit = js.Dynamic.global.applyDynamic("push")().asInstanceOf[Unit]
    
    /**
      *   The system variable pwinMouseX always contains the
      *   horizontal position of the mouse in the frame
      *   previous to the current frame, relative to (0, 0)
      *   of the window. Note: pwinMouseX will be reset to
      *   the current winMouseX value at the start of each
      *   touch event.
      */
    @JSGlobal("pwinMouseX")
    @js.native
    def pwinMouseX: Double = js.native
    inline def pwinMouseX_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pwinMouseX")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable pwinMouseY always contains the
      *   vertical position of the mouse in the frame
      *   previous to the current frame, relative to (0, 0)
      *   of the window. Note: pwinMouseY will be reset to
      *   the current winMouseY value at the start of each
      *   touch event.
      */
    @JSGlobal("pwinMouseY")
    @js.native
    def pwinMouseY: Double = js.native
    inline def pwinMouseY_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pwinMouseY")(x.asInstanceOf[js.Any])
    
    /**
      *   Draws a quad on the canvas. A quad is a
      *   quadrilateral, a four sided polygon. It is similar
      *   to a rectangle, but the angles between its edges
      *   are not constrained to ninety degrees. The first
      *   pair of parameters (x1,y1) sets the first vertex
      *   and the subsequent pairs should proceed clockwise
      *   or counter-clockwise around the defined shape.
      *   z-arguments only work when quad() is used in WEBGL
      *   mode.
      *   @param x1 the x-coordinate of the first point
      *   @param y1 the y-coordinate of the first point
      *   @param x2 the x-coordinate of the second point
      *   @param y2 the y-coordinate of the second point
      *   @param x3 the x-coordinate of the third point
      *   @param y3 the y-coordinate of the third point
      *   @param x4 the x-coordinate of the fourth point
      *   @param y4 the y-coordinate of the fourth point
      *   @param [detailX] number of segments in the
      *   x-direction
      *   @param [detailY] number of segments in the
      *   y-direction
      *   @chainable
      */
    inline def quad(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): ^ = (js.Dynamic.global.applyDynamic("quad")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def quad(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      detailX: Double
    ): ^ = (js.Dynamic.global.applyDynamic("quad")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def quad(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      detailX: Double,
      detailY: Double
    ): ^ = (js.Dynamic.global.applyDynamic("quad")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def quad(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      detailX: Unit,
      detailY: Double
    ): ^ = (js.Dynamic.global.applyDynamic("quad")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Draws a quad on the canvas. A quad is a
      *   quadrilateral, a four sided polygon. It is similar
      *   to a rectangle, but the angles between its edges
      *   are not constrained to ninety degrees. The first
      *   pair of parameters (x1,y1) sets the first vertex
      *   and the subsequent pairs should proceed clockwise
      *   or counter-clockwise around the defined shape.
      *   z-arguments only work when quad() is used in WEBGL
      *   mode.
      *   @param x1 the x-coordinate of the first point
      *   @param y1 the y-coordinate of the first point
      *   @param z1 the z-coordinate of the first point
      *   @param x2 the x-coordinate of the second point
      *   @param y2 the y-coordinate of the second point
      *   @param z2 the z-coordinate of the second point
      *   @param x3 the x-coordinate of the third point
      *   @param y3 the y-coordinate of the third point
      *   @param z3 the z-coordinate of the third point
      *   @param x4 the x-coordinate of the fourth point
      *   @param y4 the y-coordinate of the fourth point
      *   @param z4 the z-coordinate of the fourth point
      *   @param [detailX] number of segments in the
      *   x-direction
      *   @param [detailY] number of segments in the
      *   y-direction
      *   @chainable
      */
    inline def quad(
      x1: Double,
      y1: Double,
      z1: Double,
      x2: Double,
      y2: Double,
      z2: Double,
      x3: Double,
      y3: Double,
      z3: Double,
      x4: Double,
      y4: Double,
      z4: Double
    ): ^ = (js.Dynamic.global.applyDynamic("quad")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], z3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], z4.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def quad(
      x1: Double,
      y1: Double,
      z1: Double,
      x2: Double,
      y2: Double,
      z2: Double,
      x3: Double,
      y3: Double,
      z3: Double,
      x4: Double,
      y4: Double,
      z4: Double,
      detailX: Double
    ): ^ = (js.Dynamic.global.applyDynamic("quad")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], z3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], z4.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def quad(
      x1: Double,
      y1: Double,
      z1: Double,
      x2: Double,
      y2: Double,
      z2: Double,
      x3: Double,
      y3: Double,
      z3: Double,
      x4: Double,
      y4: Double,
      z4: Double,
      detailX: Double,
      detailY: Double
    ): ^ = (js.Dynamic.global.applyDynamic("quad")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], z3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], z4.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def quad(
      x1: Double,
      y1: Double,
      z1: Double,
      x2: Double,
      y2: Double,
      z2: Double,
      x3: Double,
      y3: Double,
      z3: Double,
      x4: Double,
      y4: Double,
      z4: Double,
      detailX: Unit,
      detailY: Double
    ): ^ = (js.Dynamic.global.applyDynamic("quad")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], z3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], z4.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Specifies vertex coordinates for quadratic Bezier
      *   curves. Each call to quadraticVertex() defines the
      *   position of one control points and one anchor
      *   point of a Bezier curve, adding a new segment to a
      *   line or shape. The first time quadraticVertex() is
      *   used within a beginShape() call, it must be
      *   prefaced with a call to vertex() to set the first
      *   anchor point. For WebGL mode quadraticVertex() can
      *   be used in 2D as well as 3D mode. 2D mode expects
      *   4 parameters, while 3D mode expects 6 parameters
      *   (including z coordinates). This function must be
      *   used between beginShape() and endShape() and only
      *   when there is no MODE or POINTS parameter
      *   specified to beginShape().
      *   @param cx x-coordinate for the control point
      *   @param cy y-coordinate for the control point
      *   @param cz z-coordinate for the control point (for
      *   WebGL mode)
      *   @param x3 x-coordinate for the anchor point
      *   @param y3 y-coordinate for the anchor point
      *   @param z3 z-coordinate for the anchor point (for
      *   WebGL mode)
      *   @chainable
      */
    inline def quadraticVertex(cx: Double, cy: Double, cz: Double, x3: Double, y3: Double, z3: Double): ^ = (js.Dynamic.global.applyDynamic("quadraticVertex")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], cz.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], z3.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Specifies vertex coordinates for quadratic Bezier
      *   curves. Each call to quadraticVertex() defines the
      *   position of one control points and one anchor
      *   point of a Bezier curve, adding a new segment to a
      *   line or shape. The first time quadraticVertex() is
      *   used within a beginShape() call, it must be
      *   prefaced with a call to vertex() to set the first
      *   anchor point. For WebGL mode quadraticVertex() can
      *   be used in 2D as well as 3D mode. 2D mode expects
      *   4 parameters, while 3D mode expects 6 parameters
      *   (including z coordinates). This function must be
      *   used between beginShape() and endShape() and only
      *   when there is no MODE or POINTS parameter
      *   specified to beginShape().
      *   @param cx x-coordinate for the control point
      *   @param cy y-coordinate for the control point
      *   @param x3 x-coordinate for the anchor point
      *   @param y3 y-coordinate for the anchor point
      *   @chainable
      */
    inline def quadraticVertex(cx: Double, cy: Double, x3: Double, y3: Double): ^ = (js.Dynamic.global.applyDynamic("quadraticVertex")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Converts a degree measurement to its corresponding
      *   value in radians. Radians and degrees are two ways
      *   of measuring the same thing. There are 360 degrees
      *   in a circle and 2*PI radians in a circle. For
      *   example, 90° = PI/2 = 1.5707964. This function
      *   does not take into account the current angleMode.
      *   @param degrees the degree value to convert to
      *   radians
      *   @return the converted angle
      */
    inline def radians(degrees: Double): Double = js.Dynamic.global.applyDynamic("radians")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Return a random floating-point number. Takes
      *   either 0, 1 or 2 arguments.
      *
      *   If no argument is given, returns a random number
      *   from 0 up to (but not including) 1.
      *
      *   If one argument is given and it is a number,
      *   returns a random number from 0 up to (but not
      *   including) the number.
      *
      *   If one argument is given and it is an array,
      *   returns a random element from that array.
      *
      *   If two arguments are given, returns a random
      *   number from the first argument up to (but not
      *   including) the second argument.
      *   @param [min] the lower bound (inclusive)
      *   @param [max] the upper bound (exclusive)
      *   @return the random number
      */
    inline def random(): Double = js.Dynamic.global.applyDynamic("random")().asInstanceOf[Double]
    /**
      *   Return a random floating-point number. Takes
      *   either 0, 1 or 2 arguments.
      *
      *   If no argument is given, returns a random number
      *   from 0 up to (but not including) 1.
      *
      *   If one argument is given and it is a number,
      *   returns a random number from 0 up to (but not
      *   including) the number.
      *
      *   If one argument is given and it is an array,
      *   returns a random element from that array.
      *
      *   If two arguments are given, returns a random
      *   number from the first argument up to (but not
      *   including) the second argument.
      *   @param choices the array to choose from
      *   @return the random element from the array
      */
    inline def random(choices: js.Array[Any]): Any = js.Dynamic.global.applyDynamic("random")(choices.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def random(min: Double): Double = js.Dynamic.global.applyDynamic("random")(min.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def random(min: Double, max: Double): Double = (js.Dynamic.global.applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def random(min: Unit, max: Double): Double = (js.Dynamic.global.applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   Returns a random number fitting a Gaussian, or
      *   normal, distribution. There is theoretically no
      *   minimum or maximum value that randomGaussian()
      *   might return. Rather, there is just a very low
      *   probability that values far from the mean will be
      *   returned; and a higher probability that numbers
      *   near the mean will be returned. Takes either 0, 1
      *   or 2 arguments. If no args, returns a mean of 0
      *   and standard deviation of 1.
      *
      *   If one arg, that arg is the mean (standard
      *   deviation is 1).
      *
      *   If two args, first is mean, second is standard
      *   deviation.
      *   @param [mean] the mean
      *   @param [sd] the standard deviation
      *   @return the random number
      */
    inline def randomGaussian(): Double = js.Dynamic.global.applyDynamic("randomGaussian")().asInstanceOf[Double]
    inline def randomGaussian(mean: Double): Double = js.Dynamic.global.applyDynamic("randomGaussian")(mean.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def randomGaussian(mean: Double, sd: Double): Double = (js.Dynamic.global.applyDynamic("randomGaussian")(mean.asInstanceOf[js.Any], sd.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def randomGaussian(mean: Unit, sd: Double): Double = (js.Dynamic.global.applyDynamic("randomGaussian")(mean.asInstanceOf[js.Any], sd.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   Sets the seed value for random(). By default,
      *   random() produces different results each time the
      *   program is run. Set the seed parameter to a
      *   constant to return the same pseudo-random numbers
      *   each time the software is run.
      *   @param seed the seed value
      */
    inline def randomSeed(seed: Double): Unit = js.Dynamic.global.applyDynamic("randomSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   Draws a rectangle on the canvas. A rectangle is a
      *   four-sided closed shape with every angle at ninety
      *   degrees. By default, the first two parameters set
      *   the location of the upper-left corner, the third
      *   sets the width, and the fourth sets the height.
      *   The way these parameters are interpreted, may be
      *   changed with the rectMode() function. The fifth,
      *   sixth, seventh and eighth parameters, if
      *   specified, determine corner radius for the
      *   top-left, top-right, lower-right and lower-left
      *   corners, respectively. An omitted corner radius
      *   parameter is set to the value of the previously
      *   specified radius value in the parameter list.
      *   @param x x-coordinate of the rectangle.
      *   @param y y-coordinate of the rectangle.
      *   @param w width of the rectangle.
      *   @param [h] height of the rectangle.
      *   @param [tl] optional radius of top-left corner.
      *   @param [tr] optional radius of top-right corner.
      *   @param [br] optional radius of bottom-right
      *   corner.
      *   @param [bl] optional radius of bottom-left corner.
      *   @chainable
      */
    inline def rect(x: Double, y: Double, w: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Draws a rectangle on the canvas. A rectangle is a
      *   four-sided closed shape with every angle at ninety
      *   degrees. By default, the first two parameters set
      *   the location of the upper-left corner, the third
      *   sets the width, and the fourth sets the height.
      *   The way these parameters are interpreted, may be
      *   changed with the rectMode() function. The fifth,
      *   sixth, seventh and eighth parameters, if
      *   specified, determine corner radius for the
      *   top-left, top-right, lower-right and lower-left
      *   corners, respectively. An omitted corner radius
      *   parameter is set to the value of the previously
      *   specified radius value in the parameter list.
      *   @param x x-coordinate of the rectangle.
      *   @param y y-coordinate of the rectangle.
      *   @param w width of the rectangle.
      *   @param h height of the rectangle.
      *   @param [detailX] number of segments in the
      *   x-direction (for WebGL mode)
      *   @param [detailY] number of segments in the
      *   y-direction (for WebGL mode)
      *   @chainable
      */
    inline def rect(x: Double, y: Double, w: Double, h: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Double, tr: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Double, tr: Double, br: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Double, tr: Double, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Double, tr: Double, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Double, tr: Unit, br: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Double, tr: Unit, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Double, tr: Unit, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Unit, tr: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Unit, tr: Double, br: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Unit, tr: Double, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Unit, tr: Double, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Unit, tr: Unit, br: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Unit, tr: Unit, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Double, tl: Unit, tr: Unit, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Double, tr: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Double, tr: Double, br: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Double, tr: Double, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Double, tr: Double, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Double, tr: Unit, br: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Double, tr: Unit, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Double, tr: Unit, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Unit, tr: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Unit, tr: Double, br: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Unit, tr: Double, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Unit, tr: Double, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Unit, tr: Unit, br: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Unit, tr: Unit, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rect(x: Double, y: Double, w: Double, h: Unit, tl: Unit, tr: Unit, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Modifies the location from which rectangles are
      *   drawn by changing the way in which parameters
      *   given to rect() are interpreted. The default mode
      *   is CORNER, which interprets the first two
      *   parameters as the upper-left corner of the shape,
      *   while the third and fourth parameters are its
      *   width and height.
      *
      *   rectMode(CORNERS) interprets the first two
      *   parameters as the location of one of the corners,
      *   and the third and fourth parameters as the
      *   location of the diagonally opposite corner. Note,
      *   the rectangle is drawn between the coordinates, so
      *   it is not neccesary that the first corner be the
      *   upper left corner.
      *
      *   rectMode(CENTER) interprets the first two
      *   parameters as the shape's center point, while the
      *   third and fourth parameters are its width and
      *   height.
      *
      *   rectMode(RADIUS) also uses the first two
      *   parameters as the shape's center point, but uses
      *   the third and fourth parameters to specify half of
      *   the shape's width and height respectively.
      *
      *   The parameter to this method must be written in
      *   ALL CAPS because they are predefined as constants
      *   in ALL CAPS and Javascript is a case-sensitive
      *   language.
      *   @param mode either CORNER, CORNERS, CENTER, or
      *   RADIUS
      *   @chainable
      */
    inline def rectMode(mode: RECT_MODE): ^ = js.Dynamic.global.applyDynamic("rectMode")(mode.asInstanceOf[js.Any]).asInstanceOf[^]
    
    inline def red(color: String): Double = js.Dynamic.global.applyDynamic("red")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def red(color: js.Array[Double]): Double = js.Dynamic.global.applyDynamic("red")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      *   Extracts the red value from a color or pixel
      *   array.
      *   @param color p5.Color object, color components, or
      *   CSS color
      *   @return the red value
      */
    inline def red(color: Color): Double = js.Dynamic.global.applyDynamic("red")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Executes the code within draw() one time. This
      *   function allows the program to update the display
      *   window only when necessary, for example when an
      *   event registered by mousePressed() or keyPressed()
      *   occurs. In structuring a program, it only makes
      *   sense to call redraw() within events such as
      *   mousePressed(). This is because redraw() does not
      *   run draw() immediately (it only sets a flag that
      *   indicates an update is needed).
      *
      *   The redraw() function does not work properly when
      *   called inside draw().To enable/disable animations,
      *   use loop() and noLoop().
      *
      *   In addition you can set the number of redraws per
      *   method call. Just add an integer as single
      *   parameter for the number of redraws.
      *   @param [n] Redraw for n-times. The default value
      *   is 1.
      */
    inline def redraw(): Unit = js.Dynamic.global.applyDynamic("redraw")().asInstanceOf[Unit]
    inline def redraw(n: Double): Unit = js.Dynamic.global.applyDynamic("redraw")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   Removes all elements created by p5, except any
      *   canvas / graphics elements created by createCanvas
      *   or createGraphics. Event handlers are removed, and
      *   element is removed from the DOM.
      */
    inline def removeElements(): Unit = js.Dynamic.global.applyDynamic("removeElements")().asInstanceOf[Unit]
    
    /**
      *   Removes an item that was stored with storeItem()
      */
    inline def removeItem(key: String): Unit = js.Dynamic.global.applyDynamic("removeItem")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The function requestPointerLock() locks the
      *   pointer to its current position and makes it
      *   invisible. Use movedX and movedY to get the
      *   difference the mouse was moved since the last call
      *   of draw. Note that not all browsers support this
      *   feature. This enables you to create experiences
      *   that aren't limited by the mouse moving out of the
      *   screen even if it is repeatedly moved into one
      *   direction. For example, a first person perspective
      *   experience.
      */
    inline def requestPointerLock(): Unit = js.Dynamic.global.applyDynamic("requestPointerLock")().asInstanceOf[Unit]
    
    /**
      *   Replaces the current matrix with the identity
      *   matrix.
      *   @chainable
      */
    inline def resetMatrix(): ^ = js.Dynamic.global.applyDynamic("resetMatrix")().asInstanceOf[^]
    
    /**
      *   Restores the default shaders. Code that runs after
      *   resetShader() will not be affected by the shader
      *   previously set by shader()
      *   @chainable
      */
    inline def resetShader(): ^ = js.Dynamic.global.applyDynamic("resetShader")().asInstanceOf[^]
    
    /**
      *   Resizes the canvas to given width and height. The
      *   canvas will be cleared and draw will be called
      *   immediately, allowing the sketch to re-render
      *   itself in the resized canvas.
      *   @param w width of the canvas
      *   @param h height of the canvas
      *   @param [noRedraw] don't redraw the canvas
      *   immediately
      */
    inline def resizeCanvas(w: Double, h: Double): Unit = (js.Dynamic.global.applyDynamic("resizeCanvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def resizeCanvas(w: Double, h: Double, noRedraw: Boolean): Unit = (js.Dynamic.global.applyDynamic("resizeCanvas")(w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], noRedraw.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Reverses the order of an array, maps to
      *   Array.reverse()
      *   @param list Array to reverse
      *   @return the reversed list
      */
    inline def reverse(list: js.Array[Any]): js.Array[Any] = js.Dynamic.global.applyDynamic("reverse")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    /**
      *   Rotates a shape by the amount specified by the
      *   angle parameter. This function accounts for
      *   angleMode, so angles can be entered in either
      *   RADIANS or DEGREES. Objects are always rotated
      *   around their relative position to the origin and
      *   positive numbers rotate objects in a clockwise
      *   direction. Transformations apply to everything
      *   that happens after and subsequent calls to the
      *   function accumulates the effect. For example,
      *   calling rotate(HALF_PI) and then rotate(HALF_PI)
      *   is the same as rotate(PI). All transformations are
      *   reset when draw() begins again.
      *
      *   Technically, rotate() multiplies the current
      *   transformation matrix by a rotation matrix. This
      *   function can be further controlled by the push()
      *   and pop().
      *   @param angle the angle of rotation, specified in
      *   radians or degrees, depending on current angleMode
      *   @param [axis] (in 3d) the axis to rotate around
      *   @chainable
      */
    inline def rotate(angle: Double): ^ = js.Dynamic.global.applyDynamic("rotate")(angle.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def rotate(angle: Double, axis: js.Array[Double]): ^ = (js.Dynamic.global.applyDynamic("rotate")(angle.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def rotate(angle: Double, axis: Vector): ^ = (js.Dynamic.global.applyDynamic("rotate")(angle.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Rotates a shape around X axis by the amount
      *   specified in angle parameter. The angles can be
      *   entered in either RADIANS or DEGREES. Objects are
      *   always rotated around their relative position to
      *   the origin and positive numbers rotate objects in
      *   a clockwise direction. All transformations are
      *   reset when draw() begins again.
      *   @param angle the angle of rotation, specified in
      *   radians or degrees, depending on current angleMode
      *   @chainable
      */
    inline def rotateX(angle: Double): ^ = js.Dynamic.global.applyDynamic("rotateX")(angle.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Rotates a shape around Y axis by the amount
      *   specified in angle parameter. The angles can be
      *   entered in either RADIANS or DEGREES. Objects are
      *   always rotated around their relative position to
      *   the origin and positive numbers rotate objects in
      *   a clockwise direction. All transformations are
      *   reset when draw() begins again.
      *   @param angle the angle of rotation, specified in
      *   radians or degrees, depending on current angleMode
      *   @chainable
      */
    inline def rotateY(angle: Double): ^ = js.Dynamic.global.applyDynamic("rotateY")(angle.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Rotates a shape around Z axis by the amount
      *   specified in angle parameter. The angles can be
      *   entered in either RADIANS or DEGREES. This method
      *   works in WEBGL mode only.
      *
      *   Objects are always rotated around their relative
      *   position to the origin and positive numbers rotate
      *   objects in a clockwise direction. All
      *   transformations are reset when draw() begins
      *   again.
      *   @param angle the angle of rotation, specified in
      *   radians or degrees, depending on current angleMode
      *   @chainable
      */
    inline def rotateZ(angle: Double): ^ = js.Dynamic.global.applyDynamic("rotateZ")(angle.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   The system variable rotationX always contains the
      *   rotation of the device along the x axis. If the
      *   sketch  angleMode() is set to DEGREES, the value
      *   will be -180 to 180. If it is set to RADIANS, the
      *   value will be -PI to PI. Note: The order the
      *   rotations are called is important, ie. if used
      *   together, it must be called in the order Z-X-Y or
      *   there might be unexpected behaviour.
      */
    @JSGlobal("rotationX")
    @js.native
    def rotationX: Double = js.native
    inline def rotationX_=(x: Double): Unit = js.Dynamic.global.updateDynamic("rotationX")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable rotationY always contains the
      *   rotation of the device along the y axis. If the
      *   sketch  angleMode() is set to DEGREES, the value
      *   will be -90 to 90. If it is set to RADIANS, the
      *   value will be -PI/2 to PI/2. Note: The order the
      *   rotations are called is important, ie. if used
      *   together, it must be called in the order Z-X-Y or
      *   there might be unexpected behaviour.
      */
    @JSGlobal("rotationY")
    @js.native
    def rotationY: Double = js.native
    inline def rotationY_=(x: Double): Unit = js.Dynamic.global.updateDynamic("rotationY")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable rotationZ always contains the
      *   rotation of the device along the z axis. If the
      *   sketch  angleMode() is set to DEGREES, the value
      *   will be 0 to 360. If it is set to RADIANS, the
      *   value will be 0 to 2*PI. Unlike rotationX and
      *   rotationY, this variable is available for devices
      *   with a built-in compass only.
      *
      *   Note: The order the rotations are called is
      *   important, ie. if used together, it must be called
      *   in the order Z-X-Y or there might be unexpected
      *   behaviour.
      */
    @JSGlobal("rotationZ")
    @js.native
    def rotationZ: Double = js.native
    inline def rotationZ_=(x: Double): Unit = js.Dynamic.global.updateDynamic("rotationZ")(x.asInstanceOf[js.Any])
    
    /**
      *   Calculates the integer closest to the n parameter.
      *   For example, round(133.8) returns the value 134.
      *   Maps to Math.round().
      *   @param n number to round
      *   @param [decimals] number of decimal places to
      *   round to, default is 0
      *   @return rounded number
      */
    inline def round(n: Double): Double = js.Dynamic.global.applyDynamic("round")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def round(n: Double, decimals: Double): Double = (js.Dynamic.global.applyDynamic("round")(n.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      *   Returns a number representing the sample rate, in
      *   samples per second, of all sound objects in this
      *   audio context. It is determined by the sampling
      *   rate of your operating system's sound card, and it
      *   is not currently possile to change. It is often
      *   44100, or twice the range of human hearing.
      *   @return samplerate samples per second
      */
    inline def sampleRate(): Double = js.Dynamic.global.applyDynamic("sampleRate")().asInstanceOf[Double]
    
    inline def saturation(color: String): Double = js.Dynamic.global.applyDynamic("saturation")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def saturation(color: js.Array[Double]): Double = js.Dynamic.global.applyDynamic("saturation")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      *   Extracts the saturation value from a color or
      *   pixel array. Saturation is scaled differently in
      *   HSB and HSL. This function will return the HSB
      *   saturation when supplied with an HSB color object
      *   (or when supplied with a pixel array while the
      *   color mode is HSB), but will default to the HSL
      *   saturation otherwise.
      *   @param color p5.Color object, color components, or
      *   CSS color
      *   @return the saturation value
      */
    inline def saturation(color: Color): Double = js.Dynamic.global.applyDynamic("saturation")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Saves a given element(image, text, json, csv, wav,
      *   or html) to the client's computer. The first
      *   parameter can be a pointer to element we want to
      *   save. The element can be one of p5.Element,an
      *   Array of Strings, an Array of JSON, a JSON object,
      *   a p5.Table , a p5.Image, or a p5.SoundFile
      *   (requires p5.sound). The second parameter is a
      *   filename (including extension).The third parameter
      *   is for options specific to this type of object.
      *   This method will save a file that fits the given
      *   parameters. If it is called without specifying an
      *   element, by default it will save the whole canvas
      *   as an image file. You can optionally specify a
      *   filename as the first parameter in such a case.
      *   Note that it is not recommended to call this
      *   method within draw, as it will open a new save
      *   dialog on every render.
      *   @param [objectOrFilename] If filename is provided,
      *   will save canvas as an image with either png or
      *   jpg extension depending on the filename. If object
      *   is provided, will save depending on the object and
      *   filename (see examples above).
      *   @param [filename] If an object is provided as the
      *   first parameter, then the second parameter
      *   indicates the filename, and should include an
      *   appropriate file extension (see examples above).
      *   @param [options] Additional options depend on
      *   filetype. For example, when saving JSON, true
      *   indicates that the output will be optimized for
      *   filesize, rather than readability.
      */
    inline def save(): Unit = js.Dynamic.global.applyDynamic("save")().asInstanceOf[Unit]
    inline def save(objectOrFilename: String): Unit = js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def save(objectOrFilename: String, filename: String): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: String, filename: String, options: String): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: String, filename: String, options: Boolean): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: String, filename: Unit, options: String): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: String, filename: Unit, options: Boolean): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: js.Object): Unit = js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def save(objectOrFilename: js.Object, filename: String): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: js.Object, filename: String, options: String): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: js.Object, filename: String, options: Boolean): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: js.Object, filename: Unit, options: String): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: js.Object, filename: Unit, options: Boolean): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: Unit, filename: String): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: Unit, filename: String, options: String): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: Unit, filename: String, options: Boolean): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: Unit, filename: Unit, options: String): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def save(objectOrFilename: Unit, filename: Unit, options: Boolean): Unit = (js.Dynamic.global.applyDynamic("save")(objectOrFilename.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Save the current canvas as an image. The browser
      *   will either save the file immediately, or prompt
      *   the user with a dialogue window.
      *   @param [extension] 'jpg' or 'png'
      */
    inline def saveCanvas(): Unit = js.Dynamic.global.applyDynamic("saveCanvas")().asInstanceOf[Unit]
    inline def saveCanvas(filename: String): Unit = js.Dynamic.global.applyDynamic("saveCanvas")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def saveCanvas(filename: String, `extension`: String): Unit = (js.Dynamic.global.applyDynamic("saveCanvas")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveCanvas(filename: Unit, `extension`: String): Unit = (js.Dynamic.global.applyDynamic("saveCanvas")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Save the current canvas as an image. The browser
      *   will either save the file immediately, or prompt
      *   the user with a dialogue window.
      *   @param selectedCanvas a variable representing a
      *   specific html5 canvas (optional)
      *   @param [extension] 'jpg' or 'png'
      */
    inline def saveCanvas(selectedCanvas: Element): Unit = js.Dynamic.global.applyDynamic("saveCanvas")(selectedCanvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def saveCanvas(selectedCanvas: Element, filename: String): Unit = (js.Dynamic.global.applyDynamic("saveCanvas")(selectedCanvas.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveCanvas(selectedCanvas: Element, filename: String, `extension`: String): Unit = (js.Dynamic.global.applyDynamic("saveCanvas")(selectedCanvas.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveCanvas(selectedCanvas: Element, filename: Unit, `extension`: String): Unit = (js.Dynamic.global.applyDynamic("saveCanvas")(selectedCanvas.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveCanvas(selectedCanvas: HTMLCanvasElement): Unit = js.Dynamic.global.applyDynamic("saveCanvas")(selectedCanvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def saveCanvas(selectedCanvas: HTMLCanvasElement, filename: String): Unit = (js.Dynamic.global.applyDynamic("saveCanvas")(selectedCanvas.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveCanvas(selectedCanvas: HTMLCanvasElement, filename: String, `extension`: String): Unit = (js.Dynamic.global.applyDynamic("saveCanvas")(selectedCanvas.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveCanvas(selectedCanvas: HTMLCanvasElement, filename: Unit, `extension`: String): Unit = (js.Dynamic.global.applyDynamic("saveCanvas")(selectedCanvas.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Capture a sequence of frames that can be used to
      *   create a movie. Accepts a callback. For example,
      *   you may wish to send the frames to a server where
      *   they can be stored or converted into a movie. If
      *   no callback is provided, the browser will pop up
      *   save dialogues in an attempt to download all of
      *   the images that have just been created. With the
      *   callback provided the image data isn't saved by
      *   default but instead passed as an argument to the
      *   callback function as an array of objects, with the
      *   size of array equal to the total number of frames.
      *   Note that saveFrames() will only save the first 15
      *   frames of an animation. To export longer
      *   animations, you might look into a library like
      *   ccapture.js.
      *   @param extension 'jpg' or 'png'
      *   @param duration Duration in seconds to save the
      *   frames for.
      *   @param framerate Framerate to save the frames in.
      *   @param [callback] A callback function that will be
      *   executed to handle the image data. This function
      *   should accept an array as argument. The array will
      *   contain the specified number of frames of objects.
      *   Each object has three properties: imageData - an
      *   image/octet-stream, filename and extension.
      */
    inline def saveFrames(filename: String, `extension`: String, duration: Double, framerate: Double): Unit = (js.Dynamic.global.applyDynamic("saveFrames")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], framerate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveFrames(
      filename: String,
      `extension`: String,
      duration: Double,
      framerate: Double,
      callback: js.Function1[/* p1 */ js.Array[Any], Any]
    ): Unit = (js.Dynamic.global.applyDynamic("saveFrames")(filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], framerate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Writes the contents of an Array or a JSON object
      *   to a .json file. The file saving process and
      *   location of the saved file will vary between web
      *   browsers.
      *   @param [optimize] If true, removes line breaks and
      *   spaces from the output file to optimize filesize
      *   (but not readability).
      */
    inline def saveJSON(json: js.Array[Any], filename: String): Unit = (js.Dynamic.global.applyDynamic("saveJSON")(json.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveJSON(json: js.Array[Any], filename: String, optimize: Boolean): Unit = (js.Dynamic.global.applyDynamic("saveJSON")(json.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], optimize.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveJSON(json: js.Object, filename: String): Unit = (js.Dynamic.global.applyDynamic("saveJSON")(json.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveJSON(json: js.Object, filename: String, optimize: Boolean): Unit = (js.Dynamic.global.applyDynamic("saveJSON")(json.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], optimize.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Save a p5.SoundFile as a .wav file. The browser
      *   will prompt the user to download the file to their
      *   device. For uploading audio to a server, use
      *   p5.SoundFile.saveBlob.
      *   @param soundFile p5.SoundFile that you wish to
      *   save
      *   @param fileName name of the resulting .wav file.
      */
    inline def saveSound(soundFile: SoundFile, fileName: String): Unit = (js.Dynamic.global.applyDynamic("saveSound")(soundFile.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Writes an array of Strings to a text file, one
      *   line per String. The file saving process and
      *   location of the saved file will vary between web
      *   browsers.
      *   @param list string array to be written
      *   @param filename filename for output
      *   @param [extension] the filename's extension
      *   @param [isCRLF] if true, change line-break to CRLF
      */
    inline def saveStrings(list: js.Array[String], filename: String): Unit = (js.Dynamic.global.applyDynamic("saveStrings")(list.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveStrings(list: js.Array[String], filename: String, `extension`: String): Unit = (js.Dynamic.global.applyDynamic("saveStrings")(list.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveStrings(list: js.Array[String], filename: String, `extension`: String, isCRLF: Boolean): Unit = (js.Dynamic.global.applyDynamic("saveStrings")(list.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], isCRLF.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveStrings(list: js.Array[String], filename: String, `extension`: Unit, isCRLF: Boolean): Unit = (js.Dynamic.global.applyDynamic("saveStrings")(list.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], isCRLF.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Writes the contents of a Table object to a file.
      *   Defaults to a text file with
      *   comma-separated-values ('csv') but can also use
      *   tab separation ('tsv'), or generate an HTML table
      *   ('html'). The file saving process and location of
      *   the saved file will vary between web browsers.
      *   @param Table the Table object to save to a file
      *   @param filename the filename to which the Table
      *   should be saved
      *   @param [options] can be one of "tsv", "csv", or
      *   "html"
      */
    inline def saveTable(Table: Table, filename: String): Unit = (js.Dynamic.global.applyDynamic("saveTable")(Table.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveTable(Table: Table, filename: String, options: String): Unit = (js.Dynamic.global.applyDynamic("saveTable")(Table.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def scale(s: js.Array[Double]): ^ = js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def scale(s: js.Array[Double], y: Double): ^ = (js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def scale(s: js.Array[Double], y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def scale(s: js.Array[Double], y: Unit, z: Double): ^ = (js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Increases or decreases the size of a shape by
      *   expanding or contracting vertices. Objects always
      *   scale from their relative origin to the coordinate
      *   system. Scale values are specified as decimal
      *   percentages. For example, the function call
      *   scale(2.0) increases the dimension of a shape by
      *   200%. Transformations apply to everything that
      *   happens after and subsequent calls to the function
      *   multiply the effect. For example, calling
      *   scale(2.0) and then scale(1.5) is the same as
      *   scale(3.0). If scale() is called within draw(),
      *   the transformation is reset when the loop begins
      *   again.
      *
      *   Using this function with the z parameter is only
      *   available in WEBGL mode. This function can be
      *   further controlled with push() and pop().
      *   @param s percent to scale the object, or
      *   percentage to scale the object in the x-axis if
      *   multiple arguments are given
      *   @param [y] percent to scale the object in the
      *   y-axis
      *   @param [z] percent to scale the object in the
      *   z-axis (webgl only)
      *   @chainable
      */
    inline def scale(s: Double): ^ = js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def scale(s: Double, y: Double): ^ = (js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def scale(s: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def scale(s: Double, y: Unit, z: Double): ^ = (js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Increases or decreases the size of a shape by
      *   expanding or contracting vertices. Objects always
      *   scale from their relative origin to the coordinate
      *   system. Scale values are specified as decimal
      *   percentages. For example, the function call
      *   scale(2.0) increases the dimension of a shape by
      *   200%. Transformations apply to everything that
      *   happens after and subsequent calls to the function
      *   multiply the effect. For example, calling
      *   scale(2.0) and then scale(1.5) is the same as
      *   scale(3.0). If scale() is called within draw(),
      *   the transformation is reset when the loop begins
      *   again.
      *
      *   Using this function with the z parameter is only
      *   available in WEBGL mode. This function can be
      *   further controlled with push() and pop().
      *   @param scales per-axis percents to scale the
      *   object
      *   @chainable
      */
    inline def scale(s: Vector): ^ = js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def scale(s: Vector, y: Double): ^ = (js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def scale(s: Vector, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def scale(s: Vector, y: Unit, z: Double): ^ = (js.Dynamic.global.applyDynamic("scale")(s.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   p5.js communicates with the clock on your
      *   computer. The second() function returns the
      *   current second as a value from 0 - 59.
      *   @return the current second
      */
    inline def second(): Double = js.Dynamic.global.applyDynamic("second")().asInstanceOf[Double]
    
    /**
      *   Searches the page for the first element that
      *   matches the given CSS selector string (can be an
      *   ID, class, tag name or a combination) and returns
      *   it as a p5.Element. The DOM node itself can be
      *   accessed with .elt. Returns null if none found.
      *   You can also specify a container to search within.
      *   @param selectors CSS selector string of element to
      *   search for
      *   @param [container] CSS selector string,
      *   p5.Element, or HTML element to search within
      *   @return p5.Element containing node found
      */
    inline def select(selectors: String): Element | Null = js.Dynamic.global.applyDynamic("select")(selectors.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def select(selectors: String, container: String): Element | Null = (js.Dynamic.global.applyDynamic("select")(selectors.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def select(selectors: String, container: Element): Element | Null = (js.Dynamic.global.applyDynamic("select")(selectors.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def select(selectors: String, container: HTMLElement): Element | Null = (js.Dynamic.global.applyDynamic("select")(selectors.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    /**
      *   Searches the page for elements that match the
      *   given CSS selector string (can be an ID a class,
      *   tag name or a combination) and returns them as
      *   p5.Elements in an array. The DOM node itself can
      *   be accessed with .elt. Returns an empty array if
      *   none found. You can also specify a container to
      *   search within.
      *   @param selectors CSS selector string of elements
      *   to search for
      *   @param [container] CSS selector string, p5.Element
      *   , or HTML element to search within
      *   @return Array of p5.Elements containing nodes
      *   found
      */
    inline def selectAll(selectors: String): js.Array[Element] = js.Dynamic.global.applyDynamic("selectAll")(selectors.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
    inline def selectAll(selectors: String, container: String): js.Array[Element] = (js.Dynamic.global.applyDynamic("selectAll")(selectors.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def selectAll(selectors: String, container: Element): js.Array[Element] = (js.Dynamic.global.applyDynamic("selectAll")(selectors.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def selectAll(selectors: String, container: HTMLElement): js.Array[Element] = (js.Dynamic.global.applyDynamic("selectAll")(selectors.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    
    inline def set(x: Double, y: Double, c: js.Array[Double]): Unit = (js.Dynamic.global.applyDynamic("set")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def set(x: Double, y: Double, c: js.Object): Unit = (js.Dynamic.global.applyDynamic("set")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Changes the color of any pixel, or writes an image
      *   directly to the display window. The x and y
      *   parameters specify the pixel to change and the c
      *   parameter specifies the color value. This can be a
      *   p5.Color object, or [R, G, B, A] pixel array. It
      *   can also be a single grayscale value. When setting
      *   an image, the x and y parameters define the
      *   coordinates for the upper-left corner of the
      *   image, regardless of the current imageMode().
      *   After using set(), you must call updatePixels()
      *   for your changes to appear. This should be called
      *   once all pixels have been set, and must be called
      *   before calling .get() or drawing the image.
      *
      *   Setting the color of a single pixel with set(x, y)
      *   is easy, but not as fast as putting the data
      *   directly into pixels[]. Setting the pixels[]
      *   values directly may be complicated when working
      *   with a retina display, but will perform better
      *   when lots of pixels need to be set directly on
      *   every loop. See the reference for pixels[] for
      *   more information.
      *   @param x x-coordinate of the pixel
      *   @param y y-coordinate of the pixel
      *   @param c insert a grayscale value | a pixel array
      *   | a p5.Color object | a p5.Image to copy
      */
    inline def set(x: Double, y: Double, c: Double): Unit = (js.Dynamic.global.applyDynamic("set")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Set attributes for the WebGL Drawing context. This
      *   is a way of adjusting how the WebGL renderer works
      *   to fine-tune the display and performance. Note
      *   that this will reinitialize the drawing context if
      *   called after the WebGL canvas is made.
      *
      *   If an object is passed as the parameter, all
      *   attributes not declared in the object will be set
      *   to defaults.
      *
      *   The available attributes are:
      *
      *   alpha - indicates if the canvas contains an alpha
      *   buffer default is true
      *
      *   depth - indicates whether the drawing buffer has a
      *   depth buffer of at least 16 bits - default is true
      *
      *   stencil - indicates whether the drawing buffer has
      *   a stencil buffer of at least 8 bits
      *
      *   antialias - indicates whether or not to perform
      *   anti-aliasing default is false (true in Safari)
      *
      *   premultipliedAlpha - indicates that the page
      *   compositor will assume the drawing buffer contains
      *   colors with pre-multiplied alpha default is false
      *
      *   preserveDrawingBuffer - if true the buffers will
      *   not be cleared and and will preserve their values
      *   until cleared or overwritten by author (note that
      *   p5 clears automatically on draw loop) default is
      *   true
      *
      *   perPixelLighting - if true, per-pixel lighting
      *   will be used in the lighting shader otherwise
      *   per-vertex lighting is used. default is true.
      *   @param key Name of attribute
      *   @param value New value of named attribute
      */
    inline def setAttributes(key: String, value: Boolean): Unit = (js.Dynamic.global.applyDynamic("setAttributes")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Set attributes for the WebGL Drawing context. This
      *   is a way of adjusting how the WebGL renderer works
      *   to fine-tune the display and performance. Note
      *   that this will reinitialize the drawing context if
      *   called after the WebGL canvas is made.
      *
      *   If an object is passed as the parameter, all
      *   attributes not declared in the object will be set
      *   to defaults.
      *
      *   The available attributes are:
      *
      *   alpha - indicates if the canvas contains an alpha
      *   buffer default is true
      *
      *   depth - indicates whether the drawing buffer has a
      *   depth buffer of at least 16 bits - default is true
      *
      *   stencil - indicates whether the drawing buffer has
      *   a stencil buffer of at least 8 bits
      *
      *   antialias - indicates whether or not to perform
      *   anti-aliasing default is false (true in Safari)
      *
      *   premultipliedAlpha - indicates that the page
      *   compositor will assume the drawing buffer contains
      *   colors with pre-multiplied alpha default is false
      *
      *   preserveDrawingBuffer - if true the buffers will
      *   not be cleared and and will preserve their values
      *   until cleared or overwritten by author (note that
      *   p5 clears automatically on draw loop) default is
      *   true
      *
      *   perPixelLighting - if true, per-pixel lighting
      *   will be used in the lighting shader otherwise
      *   per-vertex lighting is used. default is true.
      *   @param obj object with key-value pairs
      */
    inline def setAttributes(obj: js.Object): Unit = js.Dynamic.global.applyDynamic("setAttributes")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   Set the global tempo, in beats per minute, for all
      *   p5.Parts. This method will impact all active
      *   p5.Parts.
      *   @param BPM Beats Per Minute
      *   @param rampTime Seconds from now
      */
    inline def setBPM(BPM: Double, rampTime: Double): Unit = (js.Dynamic.global.applyDynamic("setBPM")(BPM.asInstanceOf[js.Any], rampTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Sets the current (active) camera of a 3D sketch.
      *   Allows for switching between multiple cameras.
      *   @param cam p5.Camera object
      */
    inline def setCamera(cam: Camera): Unit = js.Dynamic.global.applyDynamic("setCamera")(cam.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The setMoveThreshold() function is used to set the
      *   movement threshold for the deviceMoved() function.
      *   The default threshold is set to 0.5.
      *   @param value The threshold value
      */
    inline def setMoveThreshold(value: Double): Unit = js.Dynamic.global.applyDynamic("setMoveThreshold")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The setShakeThreshold() function is used to set
      *   the movement threshold for the deviceShaken()
      *   function. The default threshold is set to 30.
      *   @param value The threshold value
      */
    inline def setShakeThreshold(value: Double): Unit = js.Dynamic.global.applyDynamic("setShakeThreshold")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   Sets the p5.Shader object to be used to render
      *   subsequent shapes. Custom shaders can be created
      *   using the createShader() and loadShader()
      *   functions.
      *
      *   Use resetShader() to restore the default shaders.
      *
      *   Note, shaders can only be used in WEBGL mode.
      *   @param s the p5.Shader object to use for rendering
      *   shapes.
      *   @chainable
      */
    inline def shader(s: Shader): ^ = js.Dynamic.global.applyDynamic("shader")(s.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Shears a shape around the x-axis by the amount
      *   specified by the angle parameter. Angles should be
      *   specified in the current angleMode. Objects are
      *   always sheared around their relative position to
      *   the origin and positive numbers shear objects in a
      *   clockwise direction. Transformations apply to
      *   everything that happens after and subsequent calls
      *   to the function accumulates the effect. For
      *   example, calling shearX(PI/2) and then
      *   shearX(PI/2) is the same as shearX(PI). If
      *   shearX() is called within the draw(), the
      *   transformation is reset when the loop begins
      *   again.
      *
      *   Technically, shearX() multiplies the current
      *   transformation matrix by a rotation matrix. This
      *   function can be further controlled by the push()
      *   and pop() functions.
      *   @param angle angle of shear specified in radians
      *   or degrees, depending on current angleMode
      *   @chainable
      */
    inline def shearX(angle: Double): ^ = js.Dynamic.global.applyDynamic("shearX")(angle.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Shears a shape around the y-axis the amount
      *   specified by the angle parameter. Angles should be
      *   specified in the current angleMode. Objects are
      *   always sheared around their relative position to
      *   the origin and positive numbers shear objects in a
      *   clockwise direction. Transformations apply to
      *   everything that happens after and subsequent calls
      *   to the function accumulates the effect. For
      *   example, calling shearY(PI/2) and then
      *   shearY(PI/2) is the same as shearY(PI). If
      *   shearY() is called within the draw(), the
      *   transformation is reset when the loop begins
      *   again.
      *
      *   Technically, shearY() multiplies the current
      *   transformation matrix by a rotation matrix. This
      *   function can be further controlled by the push()
      *   and pop() functions.
      *   @param angle angle of shear specified in radians
      *   or degrees, depending on current angleMode
      *   @chainable
      */
    inline def shearY(angle: Double): ^ = js.Dynamic.global.applyDynamic("shearY")(angle.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Sets the amount of gloss in the surface of shapes.
      *   Used in combination with specularMaterial() in
      *   setting the material properties of shapes. The
      *   default and minimum value is 1.
      *   @param shine Degree of Shininess. Defaults to 1.
      *   @chainable
      */
    inline def shininess(shine: Double): ^ = js.Dynamic.global.applyDynamic("shininess")(shine.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Decreases an array by one element and returns the
      *   shortened array, maps to Array.pop().
      *   @param list Array to shorten
      *   @return shortened Array
      */
    inline def shorten(list: js.Array[Any]): js.Array[Any] = js.Dynamic.global.applyDynamic("shorten")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    /**
      *   Randomizes the order of the elements of an array.
      *   Implements  Fisher-Yates Shuffle Algorithm.
      *   @param array Array to shuffle
      *   @param [bool] modify passed array
      *   @return shuffled Array
      */
    inline def shuffle(array: js.Array[Any]): js.Array[Any] = js.Dynamic.global.applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def shuffle(array: js.Array[Any], bool: Boolean): js.Array[Any] = (js.Dynamic.global.applyDynamic("shuffle")(array.asInstanceOf[js.Any], bool.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      *   Calculates the sine of an angle. This function
      *   takes into account the current angleMode. Values
      *   are returned in the range -1 to 1.
      *   @param angle the angle
      *   @return the sine of the angle
      */
    inline def sin(angle: Double): Double = js.Dynamic.global.applyDynamic("sin")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Draws all geometry with smooth (anti-aliased)
      *   edges. smooth() will also improve image quality of
      *   resized images. Note that smooth() is active by
      *   default in 2D mode; noSmooth() can be used to
      *   disable smoothing of geometry, images, and fonts.
      *   In 3D mode, noSmooth() is enabled by default, so
      *   it is necessary to call smooth() if you would like
      *   smooth (antialiased) edges on your geometry.
      *   @chainable
      */
    inline def smooth(): ^ = js.Dynamic.global.applyDynamic("smooth")().asInstanceOf[^]
    
    /**
      *   Sorts an array of numbers from smallest to
      *   largest, or puts an array of words in alphabetical
      *   order. The original array is not modified; a
      *   re-ordered array is returned. The count parameter
      *   states the number of elements to sort. For
      *   example, if there are 12 elements in an array and
      *   count is set to 5, only the first 5 elements in
      *   the array will be sorted.
      *   @param list Array to sort
      *   @param [count] number of elements to sort,
      *   starting from 0
      *   @return the sorted list
      */
    inline def sort(list: js.Array[Any]): js.Array[Any] = js.Dynamic.global.applyDynamic("sort")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def sort(list: js.Array[Any], count: Double): js.Array[Any] = (js.Dynamic.global.applyDynamic("sort")(list.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      *   List the SoundFile formats that you will include.
      *   LoadSound will search your directory for these
      *   extensions, and will pick a format that is
      *   compatable with the client's web browser. Here is
      *   a free online file converter.
      *   @param [formats] i.e. 'mp3', 'wav', 'ogg'
      */
    inline def soundFormats(): Unit = js.Dynamic.global.applyDynamic("soundFormats")().asInstanceOf[Unit]
    inline def soundFormats(formats: String): Unit = js.Dynamic.global.applyDynamic("soundFormats")(formats.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   p5.soundOut is the p5.sound final output bus. It
      *   sends output to the destination of this window's
      *   web audio context. It contains Web Audio API nodes
      *   including a dyanmicsCompressor (.limiter), and
      *   Gain Nodes for .input and .output.
      */
    @JSGlobal("soundOut")
    @js.native
    def soundOut: js.Object = js.native
    inline def soundOut_=(x: js.Object): Unit = js.Dynamic.global.updateDynamic("soundOut")(x.asInstanceOf[js.Any])
    
    /**
      *   Set's the color of the specular highlight when
      *   using a specular material and specular light. This
      *   method can be combined with specularMaterial() and
      *   shininess() functions to set specular highlights.
      *   The default color is white, ie (255, 255, 255),
      *   which is used if this method is not called before
      *   specularMaterial(). If this method is called
      *   without specularMaterial(), There will be no
      *   effect.
      *
      *   Note: specularColor is equivalent to the
      *   processing function lightSpecular.
      *   @param color the ambient light color
      *   @chainable
      */
    inline def specularColor(color: Color): ^ = js.Dynamic.global.applyDynamic("specularColor")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Set's the color of the specular highlight when
      *   using a specular material and specular light. This
      *   method can be combined with specularMaterial() and
      *   shininess() functions to set specular highlights.
      *   The default color is white, ie (255, 255, 255),
      *   which is used if this method is not called before
      *   specularMaterial(). If this method is called
      *   without specularMaterial(), There will be no
      *   effect.
      *
      *   Note: specularColor is equivalent to the
      *   processing function lightSpecular.
      *   @param gray a gray value
      *   @chainable
      */
    inline def specularColor(gray: Double): ^ = js.Dynamic.global.applyDynamic("specularColor")(gray.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Set's the color of the specular highlight when
      *   using a specular material and specular light. This
      *   method can be combined with specularMaterial() and
      *   shininess() functions to set specular highlights.
      *   The default color is white, ie (255, 255, 255),
      *   which is used if this method is not called before
      *   specularMaterial(). If this method is called
      *   without specularMaterial(), There will be no
      *   effect.
      *
      *   Note: specularColor is equivalent to the
      *   processing function lightSpecular.
      *   @param v1 red or hue value relative to the current
      *   color range
      *   @param v2 green or saturation value relative to
      *   the current color range
      *   @param v3 blue or brightness value relative to the
      *   current color range
      *   @chainable
      */
    inline def specularColor(v1: Double, v2: Double, v3: Double): ^ = (js.Dynamic.global.applyDynamic("specularColor")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Set's the color of the specular highlight when
      *   using a specular material and specular light. This
      *   method can be combined with specularMaterial() and
      *   shininess() functions to set specular highlights.
      *   The default color is white, ie (255, 255, 255),
      *   which is used if this method is not called before
      *   specularMaterial(). If this method is called
      *   without specularMaterial(), There will be no
      *   effect.
      *
      *   Note: specularColor is equivalent to the
      *   processing function lightSpecular.
      *   @param value a color string
      *   @chainable
      */
    inline def specularColor(value: String): ^ = js.Dynamic.global.applyDynamic("specularColor")(value.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Set's the color of the specular highlight when
      *   using a specular material and specular light. This
      *   method can be combined with specularMaterial() and
      *   shininess() functions to set specular highlights.
      *   The default color is white, ie (255, 255, 255),
      *   which is used if this method is not called before
      *   specularMaterial(). If this method is called
      *   without specularMaterial(), There will be no
      *   effect.
      *
      *   Note: specularColor is equivalent to the
      *   processing function lightSpecular.
      *   @param values an array containing the
      *   red,green,blue & and alpha components of the color
      *   @chainable
      */
    inline def specularColor(values: js.Array[Double]): ^ = js.Dynamic.global.applyDynamic("specularColor")(values.asInstanceOf[js.Any]).asInstanceOf[^]
    
    inline def specularMaterial(color: String): ^ = js.Dynamic.global.applyDynamic("specularMaterial")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Specular material for geometry with a given color.
      *   Specular material is a shiny reflective material.
      *   Like ambient material it also defines the color
      *   the object reflects under ambient lighting. For
      *   example, if the specular material of an object is
      *   pure red, but the ambient lighting only contains
      *   green, the object will not reflect any light. For
      *   all other types of light like point and
      *   directional light, a specular material will
      *   reflect the color of the light source to the
      *   viewer. Here's an example containing all possible
      *   materials.
      *   @param color color Array, or CSS color string
      *   @chainable
      */
    inline def specularMaterial(color: js.Array[Double]): ^ = js.Dynamic.global.applyDynamic("specularMaterial")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def specularMaterial(color: Color): ^ = js.Dynamic.global.applyDynamic("specularMaterial")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Specular material for geometry with a given color.
      *   Specular material is a shiny reflective material.
      *   Like ambient material it also defines the color
      *   the object reflects under ambient lighting. For
      *   example, if the specular material of an object is
      *   pure red, but the ambient lighting only contains
      *   green, the object will not reflect any light. For
      *   all other types of light like point and
      *   directional light, a specular material will
      *   reflect the color of the light source to the
      *   viewer. Here's an example containing all possible
      *   materials.
      *   @param gray number specifying value between white
      *   and black.
      *   @param [alpha] alpha value relative to current
      *   color range (default is 0-255)
      *   @chainable
      */
    inline def specularMaterial(gray: Double): ^ = js.Dynamic.global.applyDynamic("specularMaterial")(gray.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def specularMaterial(gray: Double, alpha: Double): ^ = (js.Dynamic.global.applyDynamic("specularMaterial")(gray.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Specular material for geometry with a given color.
      *   Specular material is a shiny reflective material.
      *   Like ambient material it also defines the color
      *   the object reflects under ambient lighting. For
      *   example, if the specular material of an object is
      *   pure red, but the ambient lighting only contains
      *   green, the object will not reflect any light. For
      *   all other types of light like point and
      *   directional light, a specular material will
      *   reflect the color of the light source to the
      *   viewer. Here's an example containing all possible
      *   materials.
      *   @param v1 red or hue value relative to the current
      *   color range
      *   @param v2 green or saturation value relative to
      *   the current color range
      *   @param v3 blue or brightness value relative to the
      *   current color range
      *   @param [alpha] alpha value relative to current
      *   color range (default is 0-255)
      *   @chainable
      */
    inline def specularMaterial(v1: Double, v2: Double, v3: Double): ^ = (js.Dynamic.global.applyDynamic("specularMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def specularMaterial(v1: Double, v2: Double, v3: Double, alpha: Double): ^ = (js.Dynamic.global.applyDynamic("specularMaterial")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Draw a sphere with given radius. DetailX and
      *   detailY determines the number of subdivisions in
      *   the x-dimension and the y-dimension of a sphere.
      *   More subdivisions make the sphere seem smoother.
      *   The recommended maximum values are both 24. Using
      *   a value greater than 24 may cause a warning or
      *   slow down the browser.
      *   @param [radius] radius of circle
      *   @param [detailX] optional number of subdivisions
      *   in x-dimension
      *   @param [detailY] optional number of subdivisions
      *   in y-dimension
      *   @chainable
      */
    inline def sphere(): ^ = js.Dynamic.global.applyDynamic("sphere")().asInstanceOf[^]
    inline def sphere(radius: Double): ^ = js.Dynamic.global.applyDynamic("sphere")(radius.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def sphere(radius: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("sphere")(radius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def sphere(radius: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("sphere")(radius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def sphere(radius: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("sphere")(radius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def sphere(radius: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("sphere")(radius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def sphere(radius: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("sphere")(radius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def sphere(radius: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("sphere")(radius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Inserts a value or an array of values into an
      *   existing array. The first parameter specifies the
      *   initial array to be modified, and the second
      *   parameter defines the data to be inserted. The
      *   third parameter is an index value which specifies
      *   the array position from which to insert data.
      *   (Remember that array index numbering starts at
      *   zero, so the first position is 0, the second
      *   position is 1, and so on.)
      *   @param list Array to splice into
      *   @param value value to be spliced in
      *   @param position in the array from which to insert
      *   data
      *   @return the list
      */
    inline def splice(list: js.Array[Any], value: Any, position: Double): js.Array[Any] = (js.Dynamic.global.applyDynamic("splice")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      *   The split() function maps to String.split(), it
      *   breaks a String into pieces using a character or
      *   string as the delimiter. The delim parameter
      *   specifies the character or characters that mark
      *   the boundaries between each piece. A String[]
      *   array is returned that contains each of the
      *   pieces. The splitTokens() function works in a
      *   similar fashion, except that it splits using a
      *   range of characters instead of a specific
      *   character or sequence.
      *   @param value the String to be split
      *   @param delim the String used to separate the data
      *   @return Array of Strings
      */
    inline def split(value: String, delim: String): js.Array[String] = (js.Dynamic.global.applyDynamic("split")(value.asInstanceOf[js.Any], delim.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      *   The splitTokens() function splits a String at one
      *   or many character delimiters or "tokens." The
      *   delim parameter specifies the character or
      *   characters to be used as a boundary. If no delim
      *   characters are specified, any whitespace character
      *   is used to split. Whitespace characters include
      *   tab (\t), line feed (\n), carriage return (\r),
      *   form feed (\f), and space.
      *   @param value the String to be split
      *   @param [delim] list of individual Strings that
      *   will be used as separators
      *   @return Array of Strings
      */
    inline def splitTokens(value: String): js.Array[String] = js.Dynamic.global.applyDynamic("splitTokens")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def splitTokens(value: String, delim: String): js.Array[String] = (js.Dynamic.global.applyDynamic("splitTokens")(value.asInstanceOf[js.Any], delim.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    inline def spotLight(color: String, position: Vector, direction: Vector): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, position: Vector, direction: Vector, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, position: Vector, direction: Vector, angle: Double, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, position: Vector, direction: Vector, angle: Unit, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, position: Vector, rx: Double, ry: Double, rz: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, position: Vector, rx: Double, ry: Double, rz: Double, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, position: Vector, rx: Double, ry: Double, rz: Double, angle: Double, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, position: Vector, rx: Double, ry: Double, rz: Double, angle: Unit, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, x: Double, y: Double, z: Double, direction: Vector): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, x: Double, y: Double, z: Double, direction: Vector, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, x: Double, y: Double, z: Double, direction: Vector, angle: Double, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, x: Double, y: Double, z: Double, direction: Vector, angle: Unit, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, x: Double, y: Double, z: Double, rx: Double, ry: Double, rz: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: String, x: Double, y: Double, z: Double, rx: Double, ry: Double, rz: Double, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      color: String,
      x: Double,
      y: Double,
      z: Double,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Double,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      color: String,
      x: Double,
      y: Double,
      z: Double,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Unit,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Creates a spotlight with a given color, position,
      *   direction of light, angle and concentration. Here,
      *   angle refers to the opening or aperture of the
      *   cone of the spotlight, and concentration is used
      *   to focus the light towards the center. Both angle
      *   and concentration are optional, but if you want to
      *   provide concentration, you will also have to
      *   specify the angle. A maximum of 5 spotLight can be
      *   active at one time
      *   @param color color Array, CSS color string, or
      *   p5.Color value
      *   @param position the position of the light
      *   @param direction the direction of the light
      *   @param [angle] optional parameter for angle.
      *   Defaults to PI/3
      *   @param [conc] optional parameter for
      *   concentration. Defaults to 100
      */
    inline def spotLight(color: js.Array[Double], position: Vector, direction: Vector): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: js.Array[Double], position: Vector, direction: Vector, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: js.Array[Double], position: Vector, direction: Vector, angle: Double, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: js.Array[Double], position: Vector, direction: Vector, angle: Unit, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Creates a spotlight with a given color, position,
      *   direction of light, angle and concentration. Here,
      *   angle refers to the opening or aperture of the
      *   cone of the spotlight, and concentration is used
      *   to focus the light towards the center. Both angle
      *   and concentration are optional, but if you want to
      *   provide concentration, you will also have to
      *   specify the angle. A maximum of 5 spotLight can be
      *   active at one time
      *   @param color color Array, CSS color string, or
      *   p5.Color value
      *   @param position the position of the light
      *   @param rx x axis direction of light
      *   @param ry y axis direction of light
      *   @param rz z axis direction of light
      *   @param [angle] optional parameter for angle.
      *   Defaults to PI/3
      *   @param [conc] optional parameter for
      *   concentration. Defaults to 100
      */
    inline def spotLight(color: js.Array[Double], position: Vector, rx: Double, ry: Double, rz: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: js.Array[Double], position: Vector, rx: Double, ry: Double, rz: Double, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      color: js.Array[Double],
      position: Vector,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Double,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      color: js.Array[Double],
      position: Vector,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Unit,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Creates a spotlight with a given color, position,
      *   direction of light, angle and concentration. Here,
      *   angle refers to the opening or aperture of the
      *   cone of the spotlight, and concentration is used
      *   to focus the light towards the center. Both angle
      *   and concentration are optional, but if you want to
      *   provide concentration, you will also have to
      *   specify the angle. A maximum of 5 spotLight can be
      *   active at one time
      *   @param color color Array, CSS color string, or
      *   p5.Color value
      *   @param x x axis position
      *   @param y y axis position
      *   @param z z axis position
      *   @param direction the direction of the light
      *   @param [angle] optional parameter for angle.
      *   Defaults to PI/3
      *   @param [conc] optional parameter for
      *   concentration. Defaults to 100
      */
    inline def spotLight(color: js.Array[Double], x: Double, y: Double, z: Double, direction: Vector): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: js.Array[Double], x: Double, y: Double, z: Double, direction: Vector, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      color: js.Array[Double],
      x: Double,
      y: Double,
      z: Double,
      direction: Vector,
      angle: Double,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      color: js.Array[Double],
      x: Double,
      y: Double,
      z: Double,
      direction: Vector,
      angle: Unit,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Creates a spotlight with a given color, position,
      *   direction of light, angle and concentration. Here,
      *   angle refers to the opening or aperture of the
      *   cone of the spotlight, and concentration is used
      *   to focus the light towards the center. Both angle
      *   and concentration are optional, but if you want to
      *   provide concentration, you will also have to
      *   specify the angle. A maximum of 5 spotLight can be
      *   active at one time
      *   @param color color Array, CSS color string, or
      *   p5.Color value
      *   @param x x axis position
      *   @param y y axis position
      *   @param z z axis position
      *   @param rx x axis direction of light
      *   @param ry y axis direction of light
      *   @param rz z axis direction of light
      *   @param [angle] optional parameter for angle.
      *   Defaults to PI/3
      *   @param [conc] optional parameter for
      *   concentration. Defaults to 100
      */
    inline def spotLight(color: js.Array[Double], x: Double, y: Double, z: Double, rx: Double, ry: Double, rz: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      color: js.Array[Double],
      x: Double,
      y: Double,
      z: Double,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      color: js.Array[Double],
      x: Double,
      y: Double,
      z: Double,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Double,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      color: js.Array[Double],
      x: Double,
      y: Double,
      z: Double,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Unit,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, position: Vector, direction: Vector): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, position: Vector, direction: Vector, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, position: Vector, direction: Vector, angle: Double, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, position: Vector, direction: Vector, angle: Unit, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, position: Vector, rx: Double, ry: Double, rz: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, position: Vector, rx: Double, ry: Double, rz: Double, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, position: Vector, rx: Double, ry: Double, rz: Double, angle: Double, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, position: Vector, rx: Double, ry: Double, rz: Double, angle: Unit, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, x: Double, y: Double, z: Double, direction: Vector): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, x: Double, y: Double, z: Double, direction: Vector, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, x: Double, y: Double, z: Double, direction: Vector, angle: Double, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, x: Double, y: Double, z: Double, direction: Vector, angle: Unit, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, x: Double, y: Double, z: Double, rx: Double, ry: Double, rz: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(color: Color, x: Double, y: Double, z: Double, rx: Double, ry: Double, rz: Double, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      color: Color,
      x: Double,
      y: Double,
      z: Double,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Double,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      color: Color,
      x: Double,
      y: Double,
      z: Double,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Unit,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(color.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Creates a spotlight with a given color, position,
      *   direction of light, angle and concentration. Here,
      *   angle refers to the opening or aperture of the
      *   cone of the spotlight, and concentration is used
      *   to focus the light towards the center. Both angle
      *   and concentration are optional, but if you want to
      *   provide concentration, you will also have to
      *   specify the angle. A maximum of 5 spotLight can be
      *   active at one time
      *   @param v1 red or hue value (depending on the
      *   current color mode),
      *   @param v2 green or saturation value
      *   @param v3 blue or brightness value
      *   @param position the position of the light
      *   @param direction the direction of the light
      *   @param [angle] optional parameter for angle.
      *   Defaults to PI/3
      *   @param [conc] optional parameter for
      *   concentration. Defaults to 100
      */
    inline def spotLight(v1: Double, v2: Double, v3: Double, position: Vector, direction: Vector): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(v1: Double, v2: Double, v3: Double, position: Vector, direction: Vector, angle: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      v1: Double,
      v2: Double,
      v3: Double,
      position: Vector,
      direction: Vector,
      angle: Double,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(v1: Double, v2: Double, v3: Double, position: Vector, direction: Vector, angle: Unit, conc: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Creates a spotlight with a given color, position,
      *   direction of light, angle and concentration. Here,
      *   angle refers to the opening or aperture of the
      *   cone of the spotlight, and concentration is used
      *   to focus the light towards the center. Both angle
      *   and concentration are optional, but if you want to
      *   provide concentration, you will also have to
      *   specify the angle. A maximum of 5 spotLight can be
      *   active at one time
      *   @param v1 red or hue value (depending on the
      *   current color mode),
      *   @param v2 green or saturation value
      *   @param v3 blue or brightness value
      *   @param position the position of the light
      *   @param rx x axis direction of light
      *   @param ry y axis direction of light
      *   @param rz z axis direction of light
      *   @param [angle] optional parameter for angle.
      *   Defaults to PI/3
      *   @param [conc] optional parameter for
      *   concentration. Defaults to 100
      */
    inline def spotLight(v1: Double, v2: Double, v3: Double, position: Vector, rx: Double, ry: Double, rz: Double): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      v1: Double,
      v2: Double,
      v3: Double,
      position: Vector,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      v1: Double,
      v2: Double,
      v3: Double,
      position: Vector,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Double,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      v1: Double,
      v2: Double,
      v3: Double,
      position: Vector,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Unit,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], position.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Creates a spotlight with a given color, position,
      *   direction of light, angle and concentration. Here,
      *   angle refers to the opening or aperture of the
      *   cone of the spotlight, and concentration is used
      *   to focus the light towards the center. Both angle
      *   and concentration are optional, but if you want to
      *   provide concentration, you will also have to
      *   specify the angle. A maximum of 5 spotLight can be
      *   active at one time
      *   @param v1 red or hue value (depending on the
      *   current color mode),
      *   @param v2 green or saturation value
      *   @param v3 blue or brightness value
      *   @param x x axis position
      *   @param y y axis position
      *   @param z z axis position
      *   @param direction the direction of the light
      *   @param [angle] optional parameter for angle.
      *   Defaults to PI/3
      *   @param [conc] optional parameter for
      *   concentration. Defaults to 100
      */
    inline def spotLight(v1: Double, v2: Double, v3: Double, x: Double, y: Double, z: Double, direction: Vector): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      v1: Double,
      v2: Double,
      v3: Double,
      x: Double,
      y: Double,
      z: Double,
      direction: Vector,
      angle: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      v1: Double,
      v2: Double,
      v3: Double,
      x: Double,
      y: Double,
      z: Double,
      direction: Vector,
      angle: Double,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def spotLight(
      v1: Double,
      v2: Double,
      v3: Double,
      x: Double,
      y: Double,
      z: Double,
      direction: Vector,
      angle: Unit,
      conc: Double
    ): Unit = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Creates a spotlight with a given color, position,
      *   direction of light, angle and concentration. Here,
      *   angle refers to the opening or aperture of the
      *   cone of the spotlight, and concentration is used
      *   to focus the light towards the center. Both angle
      *   and concentration are optional, but if you want to
      *   provide concentration, you will also have to
      *   specify the angle. A maximum of 5 spotLight can be
      *   active at one time
      *   @param v1 red or hue value (depending on the
      *   current color mode),
      *   @param v2 green or saturation value
      *   @param v3 blue or brightness value
      *   @param x x axis position
      *   @param y y axis position
      *   @param z z axis position
      *   @param rx x axis direction of light
      *   @param ry y axis direction of light
      *   @param rz z axis direction of light
      *   @param [angle] optional parameter for angle.
      *   Defaults to PI/3
      *   @param [conc] optional parameter for
      *   concentration. Defaults to 100
      *   @chainable
      */
    inline def spotLight(
      v1: Double,
      v2: Double,
      v3: Double,
      x: Double,
      y: Double,
      z: Double,
      rx: Double,
      ry: Double,
      rz: Double
    ): ^ = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def spotLight(
      v1: Double,
      v2: Double,
      v3: Double,
      x: Double,
      y: Double,
      z: Double,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Double
    ): ^ = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def spotLight(
      v1: Double,
      v2: Double,
      v3: Double,
      x: Double,
      y: Double,
      z: Double,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Double,
      conc: Double
    ): ^ = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def spotLight(
      v1: Double,
      v2: Double,
      v3: Double,
      x: Double,
      y: Double,
      z: Double,
      rx: Double,
      ry: Double,
      rz: Double,
      angle: Unit,
      conc: Double
    ): ^ = (js.Dynamic.global.applyDynamic("spotLight")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], conc.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Squares a number (multiplies a number by itself).
      *   The result is always a positive number, as
      *   multiplying two negative numbers always yields a
      *   positive result. For example, -1 * -1 = 1.
      *   @param n number to square
      *   @return squared number
      */
    inline def sq(n: Double): Double = js.Dynamic.global.applyDynamic("sq")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Calculates the square root of a number. The square
      *   root of a number is always positive, even though
      *   there may be a valid negative root. The square
      *   root s of number a is such that s*s = a. It is the
      *   opposite of squaring. Maps to Math.sqrt().
      *   @param n non-negative number to square root
      *   @return square root of number
      */
    inline def sqrt(n: Double): Double = js.Dynamic.global.applyDynamic("sqrt")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Draws a square to the screen. A square is a
      *   four-sided shape with every angle at ninety
      *   degrees, and equal side size. This function is a
      *   special case of the rect() function, where the
      *   width and height are the same, and the parameter
      *   is called "s" for side size. By default, the first
      *   two parameters set the location of the upper-left
      *   corner, the third sets the side size of the
      *   square. The way these parameters are interpreted,
      *   may be changed with the rectMode() function. The
      *   fourth, fifth, sixth and seventh parameters, if
      *   specified, determine corner radius for the
      *   top-left, top-right, lower-right and lower-left
      *   corners, respectively. An omitted corner radius
      *   parameter is set to the value of the previously
      *   specified radius value in the parameter list.
      *   @param x x-coordinate of the square.
      *   @param y y-coordinate of the square.
      *   @param s side size of the square.
      *   @param [tl] optional radius of top-left corner.
      *   @param [tr] optional radius of top-right corner.
      *   @param [br] optional radius of bottom-right
      *   corner.
      *   @param [bl] optional radius of bottom-left corner.
      *   @chainable
      */
    inline def square(x: Double, y: Double, s: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Double, tr: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Double, tr: Double, br: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Double, tr: Double, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Double, tr: Double, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Double, tr: Unit, br: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Double, tr: Unit, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Double, tr: Unit, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Unit, tr: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Unit, tr: Double, br: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Unit, tr: Double, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Unit, tr: Double, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Unit, tr: Unit, br: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Unit, tr: Unit, br: Double, bl: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def square(x: Double, y: Double, s: Double, tl: Unit, tr: Unit, br: Unit, bl: Double): ^ = (js.Dynamic.global.applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], s.asInstanceOf[js.Any], tl.asInstanceOf[js.Any], tr.asInstanceOf[js.Any], br.asInstanceOf[js.Any], bl.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Stores a value in local storage under the key
      *   name. Local storage is saved in the browser and
      *   persists between browsing sessions and page
      *   reloads. The key can be the name of the variable
      *   but doesn't have to be. To retrieve stored items
      *   see getItem. Sensitive data such as passwords or
      *   personal information should not be stored in local
      *   storage.
      */
    inline def storeItem(key: String, value: String): Unit = (js.Dynamic.global.applyDynamic("storeItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def storeItem(key: String, value: js.Object): Unit = (js.Dynamic.global.applyDynamic("storeItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def storeItem(key: String, value: Boolean): Unit = (js.Dynamic.global.applyDynamic("storeItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def storeItem(key: String, value: Double): Unit = (js.Dynamic.global.applyDynamic("storeItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def storeItem(key: String, value: Color): Unit = (js.Dynamic.global.applyDynamic("storeItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def storeItem(key: String, value: Vector): Unit = (js.Dynamic.global.applyDynamic("storeItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Converts a boolean, string or number to its string
      *   representation. When an array of values is passed
      *   in, then an array of strings of the same length is
      *   returned.
      *   @param n value to parse
      *   @return string representation of value
      */
    inline def str(n: String): String = js.Dynamic.global.applyDynamic("str")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def str(n: js.Array[Any]): String = js.Dynamic.global.applyDynamic("str")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def str(n: Boolean): String = js.Dynamic.global.applyDynamic("str")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def str(n: Double): String = js.Dynamic.global.applyDynamic("str")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      *   Sets the color used to draw lines and borders
      *   around shapes. This color is either specified in
      *   terms of the RGB or HSB color depending on the
      *   current colorMode() (the default color space is
      *   RGB, with each value in the range from 0 to 255).
      *   The alpha range by default is also 0 to 255. If a
      *   single string argument is provided, RGB, RGBA and
      *   Hex CSS color strings and all named color strings
      *   are supported. In this case, an alpha number value
      *   as a second argument is not supported, the RGBA
      *   form should be used.
      *
      *   A p5 Color object can also be provided to set the
      *   stroke color.
      *   @param color the stroke color
      *   @chainable
      */
    inline def stroke(color: Color): ^ = js.Dynamic.global.applyDynamic("stroke")(color.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Sets the color used to draw lines and borders
      *   around shapes. This color is either specified in
      *   terms of the RGB or HSB color depending on the
      *   current colorMode() (the default color space is
      *   RGB, with each value in the range from 0 to 255).
      *   The alpha range by default is also 0 to 255. If a
      *   single string argument is provided, RGB, RGBA and
      *   Hex CSS color strings and all named color strings
      *   are supported. In this case, an alpha number value
      *   as a second argument is not supported, the RGBA
      *   form should be used.
      *
      *   A p5 Color object can also be provided to set the
      *   stroke color.
      *   @param gray a gray value
      *   @chainable
      */
    inline def stroke(gray: Double): ^ = js.Dynamic.global.applyDynamic("stroke")(gray.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def stroke(gray: Double, alpha: Double): ^ = (js.Dynamic.global.applyDynamic("stroke")(gray.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Sets the color used to draw lines and borders
      *   around shapes. This color is either specified in
      *   terms of the RGB or HSB color depending on the
      *   current colorMode() (the default color space is
      *   RGB, with each value in the range from 0 to 255).
      *   The alpha range by default is also 0 to 255. If a
      *   single string argument is provided, RGB, RGBA and
      *   Hex CSS color strings and all named color strings
      *   are supported. In this case, an alpha number value
      *   as a second argument is not supported, the RGBA
      *   form should be used.
      *
      *   A p5 Color object can also be provided to set the
      *   stroke color.
      *   @param v1 red or hue value relative to the current
      *   color range
      *   @param v2 green or saturation value relative to
      *   the current color range
      *   @param v3 blue or brightness value relative to the
      *   current color range
      *   @chainable
      */
    inline def stroke(v1: Double, v2: Double, v3: Double): ^ = (js.Dynamic.global.applyDynamic("stroke")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def stroke(v1: Double, v2: Double, v3: Double, alpha: Double): ^ = (js.Dynamic.global.applyDynamic("stroke")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Sets the color used to draw lines and borders
      *   around shapes. This color is either specified in
      *   terms of the RGB or HSB color depending on the
      *   current colorMode() (the default color space is
      *   RGB, with each value in the range from 0 to 255).
      *   The alpha range by default is also 0 to 255. If a
      *   single string argument is provided, RGB, RGBA and
      *   Hex CSS color strings and all named color strings
      *   are supported. In this case, an alpha number value
      *   as a second argument is not supported, the RGBA
      *   form should be used.
      *
      *   A p5 Color object can also be provided to set the
      *   stroke color.
      *   @param value a color string
      *   @chainable
      */
    inline def stroke(value: String): ^ = js.Dynamic.global.applyDynamic("stroke")(value.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Sets the color used to draw lines and borders
      *   around shapes. This color is either specified in
      *   terms of the RGB or HSB color depending on the
      *   current colorMode() (the default color space is
      *   RGB, with each value in the range from 0 to 255).
      *   The alpha range by default is also 0 to 255. If a
      *   single string argument is provided, RGB, RGBA and
      *   Hex CSS color strings and all named color strings
      *   are supported. In this case, an alpha number value
      *   as a second argument is not supported, the RGBA
      *   form should be used.
      *
      *   A p5 Color object can also be provided to set the
      *   stroke color.
      *   @param values an array containing the
      *   red,green,blue & and alpha components of the color
      *   @chainable
      */
    inline def stroke(values: js.Array[Double]): ^ = js.Dynamic.global.applyDynamic("stroke")(values.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Sets the style for rendering line endings. These
      *   ends are either rounded, squared or extended, each
      *   of which specified with the corresponding
      *   parameters: ROUND, SQUARE and PROJECT. The default
      *   cap is ROUND. The parameter to this method must be
      *   written in ALL CAPS because they are predefined as
      *   constants in ALL CAPS and Javascript is a
      *   case-sensitive language.
      *   @param cap either ROUND, SQUARE or PROJECT
      *   @chainable
      */
    inline def strokeCap(cap: STROKE_CAP): ^ = js.Dynamic.global.applyDynamic("strokeCap")(cap.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Sets the style of the joints which connect line
      *   segments. These joints are either mitered, beveled
      *   or rounded and specified with the corresponding
      *   parameters MITER, BEVEL and ROUND. The default
      *   joint is MITER. The parameter to this method must
      *   be written in ALL CAPS because they are predefined
      *   as constants in ALL CAPS and Javascript is a
      *   case-sensitive language.
      *   @param join either MITER, BEVEL, ROUND
      *   @chainable
      */
    inline def strokeJoin(join: STROKE_JOIN): ^ = js.Dynamic.global.applyDynamic("strokeJoin")(join.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Sets the width of the stroke used for lines,
      *   points and the border around shapes. All widths
      *   are set in units of pixels. Note that it is
      *   affected by any transformation or scaling that has
      *   been applied previously.
      *   @param weight the weight of the stroke (in pixels)
      *   @chainable
      */
    inline def strokeWeight(weight: Double): ^ = js.Dynamic.global.applyDynamic("strokeWeight")(weight.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Extracts an array of elements from an existing
      *   array. The list parameter defines the array from
      *   which the elements will be copied, and the start
      *   and count parameters specify which elements to
      *   extract. If no count is given, elements will be
      *   extracted from the start to the end of the array.
      *   When specifying the start, remember that the first
      *   array element is 0. This function does not change
      *   the source array.
      *   @param list Array to extract from
      *   @param start position to begin
      *   @param [count] number of values to extract
      *   @return Array of extracted elements
      */
    inline def subset(list: js.Array[Any], start: Double): js.Array[Any] = (js.Dynamic.global.applyDynamic("subset")(list.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def subset(list: js.Array[Any], start: Double, count: Double): js.Array[Any] = (js.Dynamic.global.applyDynamic("subset")(list.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      *   Calculates the tangent of an angle. This function
      *   takes into account the current angleMode. Values
      *   are returned in the range of all real numbers.
      *   @param angle the angle
      *   @return the tangent of the angle
      */
    inline def tan(angle: Double): Double = js.Dynamic.global.applyDynamic("tan")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Draws text to the screen. Displays the information
      *   specified in the first parameter on the screen in
      *   the position specified by the additional
      *   parameters. A default font will be used unless a
      *   font is set with the textFont() function and a
      *   default size will be used unless a font is set
      *   with textSize(). Change the color of the text with
      *   the fill() function. Change the outline of the
      *   text with the stroke() and strokeWeight()
      *   functions. The text displays in relation to the
      *   textAlign() function, which gives the option to
      *   draw to the left, right, and center of the
      *   coordinates.
      *
      *   The x2 and y2 parameters define a rectangular area
      *   to display within and may only be used with string
      *   data. When these parameters are specified, they
      *   are interpreted based on the current rectMode()
      *   setting. Text that does not fit completely within
      *   the rectangle specified will not be drawn to the
      *   screen. If x2 and y2 are not specified, the
      *   baseline alignment is the default, which means
      *   that the text will be drawn upwards from x and y.
      *
      *   WEBGL: Only opentype/truetype fonts are supported.
      *   You must load a font using the loadFont() method
      *   (see the example above). stroke() currently has no
      *   effect in webgl mode. Learn more about working
      *   with text in webgl mode on the wiki.
      *   @param str the alphanumeric symbols to be
      *   displayed
      *   @param x x-coordinate of text
      *   @param y y-coordinate of text
      *   @param [x2] by default, the width of the text box,
      *   see rectMode() for more info
      *   @param [y2] by default, the height of the text
      *   box, see rectMode() for more info
      *   @chainable
      */
    inline def text(str: String, x: Double, y: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: String, x: Double, y: Double, x2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: String, x: Double, y: Double, x2: Double, y2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: String, x: Double, y: Double, x2: Unit, y2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: js.Array[Any], x: Double, y: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: js.Array[Any], x: Double, y: Double, x2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: js.Array[Any], x: Double, y: Double, x2: Double, y2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: js.Array[Any], x: Double, y: Double, x2: Unit, y2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: js.Object, x: Double, y: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: js.Object, x: Double, y: Double, x2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: js.Object, x: Double, y: Double, x2: Double, y2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: js.Object, x: Double, y: Double, x2: Unit, y2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: Boolean, x: Double, y: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: Boolean, x: Double, y: Double, x2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: Boolean, x: Double, y: Double, x2: Double, y2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: Boolean, x: Double, y: Double, x2: Unit, y2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: Double, x: Double, y: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: Double, x: Double, y: Double, x2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: Double, x: Double, y: Double, x2: Double, y2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def text(str: Double, x: Double, y: Double, x2: Unit, y2: Double): ^ = (js.Dynamic.global.applyDynamic("text")(str.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Sets the current alignment for drawing text.
      *   Accepts two arguments: horizAlign (LEFT, CENTER,
      *   or RIGHT) and vertAlign (TOP, BOTTOM, CENTER, or
      *   BASELINE). The horizAlign parameter is in
      *   reference to the x value of the text() function,
      *   while the vertAlign parameter is in reference to
      *   the y value.
      *
      *   So if you write textAlign(LEFT), you are aligning
      *   the left edge of your text to the x value you give
      *   in text(). If you write textAlign(RIGHT, TOP), you
      *   are aligning the right edge of your text to the x
      *   value and the top of edge of the text to the y
      *   value.
      */
    inline def textAlign(): js.Object = js.Dynamic.global.applyDynamic("textAlign")().asInstanceOf[js.Object]
    /**
      *   Sets the current alignment for drawing text.
      *   Accepts two arguments: horizAlign (LEFT, CENTER,
      *   or RIGHT) and vertAlign (TOP, BOTTOM, CENTER, or
      *   BASELINE). The horizAlign parameter is in
      *   reference to the x value of the text() function,
      *   while the vertAlign parameter is in reference to
      *   the y value.
      *
      *   So if you write textAlign(LEFT), you are aligning
      *   the left edge of your text to the x value you give
      *   in text(). If you write textAlign(RIGHT, TOP), you
      *   are aligning the right edge of your text to the x
      *   value and the top of edge of the text to the y
      *   value.
      *   @param horizAlign horizontal alignment, either
      *   LEFT, CENTER, or RIGHT
      *   @param [vertAlign] vertical alignment, either TOP,
      *   BOTTOM, CENTER, or BASELINE
      *   @chainable
      */
    inline def textAlign(horizAlign: HORIZ_ALIGN): ^ = js.Dynamic.global.applyDynamic("textAlign")(horizAlign.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def textAlign(horizAlign: HORIZ_ALIGN, vertAlign: VERT_ALIGN): ^ = (js.Dynamic.global.applyDynamic("textAlign")(horizAlign.asInstanceOf[js.Any], vertAlign.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Returns the ascent of the current font at its
      *   current size. The ascent represents the distance,
      *   in pixels, of the tallest character above the
      *   baseline.
      */
    inline def textAscent(): Double = js.Dynamic.global.applyDynamic("textAscent")().asInstanceOf[Double]
    
    /**
      *   Returns the descent of the current font at its
      *   current size. The descent represents the distance,
      *   in pixels, of the character with the longest
      *   descender below the baseline.
      */
    inline def textDescent(): Double = js.Dynamic.global.applyDynamic("textDescent")().asInstanceOf[Double]
    
    /**
      *   Sets the current font that will be drawn with the
      *   text() function. If textFont() is called without
      *   any argument, it will return the current font if
      *   one has been set already. If not, it will return
      *   the name of the default font as a string. If
      *   textFont() is called with a font to use, it will
      *   return the p5 object. WEBGL: Only fonts loaded via
      *   loadFont() are supported.
      *   @return the current font / p5 Object
      */
    inline def textFont(): js.Object = js.Dynamic.global.applyDynamic("textFont")().asInstanceOf[js.Object]
    inline def textFont(font: String): ^ = js.Dynamic.global.applyDynamic("textFont")(font.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def textFont(font: String, size: Double): ^ = (js.Dynamic.global.applyDynamic("textFont")(font.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   Sets the current font that will be drawn with the
      *   text() function. If textFont() is called without
      *   any argument, it will return the current font if
      *   one has been set already. If not, it will return
      *   the name of the default font as a string. If
      *   textFont() is called with a font to use, it will
      *   return the p5 object. WEBGL: Only fonts loaded via
      *   loadFont() are supported.
      *   @param font a font loaded via loadFont(), or a
      *   String representing a web safe font (a font that
      *   is generally available across all systems)
      *   @param [size] the font size to use
      *   @chainable
      */
    inline def textFont(font: js.Object): ^ = js.Dynamic.global.applyDynamic("textFont")(font.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def textFont(font: js.Object, size: Double): ^ = (js.Dynamic.global.applyDynamic("textFont")(font.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Sets/gets the spacing, in pixels, between lines of
      *   text. This setting will be used in all subsequent
      *   calls to the text() function.
      */
    inline def textLeading(): Double = js.Dynamic.global.applyDynamic("textLeading")().asInstanceOf[Double]
    /**
      *   Sets/gets the spacing, in pixels, between lines of
      *   text. This setting will be used in all subsequent
      *   calls to the text() function.
      *   @param leading the size in pixels for spacing
      *   between lines
      *   @chainable
      */
    inline def textLeading(leading: Double): ^ = js.Dynamic.global.applyDynamic("textLeading")(leading.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   textOutput() creates a screenreader accessible
      *   output that describes the shapes present on the
      *   canvas. The general description of the canvas
      *   includes canvas size, canvas color, and number of
      *   elements in the canvas (example: 'Your output is
      *   a, 400 by 400 pixels, lavender blue canvas
      *   containing the following 4 shapes:'). This
      *   description is followed by a list of shapes where
      *   the color, position, and area of each shape are
      *   described (example: "orange ellipse at top left
      *   covering 1% of the canvas"). Each element can be
      *   selected to get more details. A table of elements
      *   is also provided. In this table, shape, color,
      *   location, coordinates and area are described
      *   (example: "orange ellipse location=top left
      *   area=2"). textOutput() and textOutput(FALLBACK)
      *   make the output available in  a sub DOM inside the
      *   canvas element which is accessible to screen
      *   readers. textOutput(LABEL) creates an additional
      *   div with the output adjacent to the canvas, this
      *   is useful for non-screen reader users that might
      *   want to display the output outside of the canvas'
      *   sub DOM as they code. However, using LABEL will
      *   create unnecessary redundancy for screen reader
      *   users. We recommend using LABEL only as part of
      *   the development process of a sketch and removing
      *   it before publishing or sharing with screen reader
      *   users.
      *   @param [display] either FALLBACK or LABEL
      */
    inline def textOutput(): Unit = js.Dynamic.global.applyDynamic("textOutput")().asInstanceOf[Unit]
    inline def textOutput(display: TEXT_DISPLAY): Unit = js.Dynamic.global.applyDynamic("textOutput")(display.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   Sets/gets the current font size. This size will be
      *   used in all subsequent calls to the text()
      *   function. Font size is measured in pixels.
      */
    inline def textSize(): Double = js.Dynamic.global.applyDynamic("textSize")().asInstanceOf[Double]
    /**
      *   Sets/gets the current font size. This size will be
      *   used in all subsequent calls to the text()
      *   function. Font size is measured in pixels.
      *   @param theSize the size of the letters in units of
      *   pixels
      *   @chainable
      */
    inline def textSize(theSize: Double): ^ = js.Dynamic.global.applyDynamic("textSize")(theSize.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Sets/gets the style of the text for system fonts
      *   to NORMAL, ITALIC, BOLD or BOLDITALIC. Note: this
      *   may be is overridden by CSS styling. For
      *   non-system fonts (opentype, truetype, etc.) please
      *   load styled fonts instead.
      */
    inline def textStyle(): String = js.Dynamic.global.applyDynamic("textStyle")().asInstanceOf[String]
    /**
      *   Sets/gets the style of the text for system fonts
      *   to NORMAL, ITALIC, BOLD or BOLDITALIC. Note: this
      *   may be is overridden by CSS styling. For
      *   non-system fonts (opentype, truetype, etc.) please
      *   load styled fonts instead.
      *   @param theStyle styling for text, either NORMAL,
      *   ITALIC, BOLD or BOLDITALIC
      *   @chainable
      */
    inline def textStyle(theStyle: THE_STYLE): ^ = js.Dynamic.global.applyDynamic("textStyle")(theStyle.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Calculates and returns the width of any character
      *   or text string.
      *   @param theText the String of characters to measure
      *   @return the calculated width
      */
    inline def textWidth(theText: String): Double = js.Dynamic.global.applyDynamic("textWidth")(theText.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *   Specifies how lines of text are wrapped within a
      *   text box. This requires a max-width set on the
      *   text area, specified in text() as parameter x2.
      *   WORD wrap style only breaks lines at spaces. A
      *   single string without spaces that exceeds the
      *   boundaries of the canvas or text area is not
      *   truncated, and will overflow the desired area,
      *   disappearing at the canvas edge.
      *
      *   CHAR wrap style breaks lines wherever needed to
      *   stay within the text box.
      *
      *   WORD is the default wrap style, and both styles
      *   will still break lines at any line breaks (\n)
      *   specified in the original text. The text area
      *   max-height parameter (y2) also still applies to
      *   wrapped text in both styles, lines of text that do
      *   not fit within the text area will not be drawn to
      *   the screen.
      *   @param wrapStyle text wrapping style, either WORD
      *   or CHAR
      *   @return wrapStyle
      */
    inline def textWrap(wrapStyle: WRAP_STYLE): String = js.Dynamic.global.applyDynamic("textWrap")(wrapStyle.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def texture(tex: Graphics): ^ = js.Dynamic.global.applyDynamic("texture")(tex.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Sets the texture that will be used to render
      *   subsequent shapes. A texture is like a "skin" that
      *   wraps around a 3D geometry. Currently supported
      *   textures are images, video, and offscreen renders.
      *
      *   To texture a geometry created with beginShape(),
      *   you will need to specify uv coordinates in
      *   vertex().
      *
      *   Note, texture() can only be used in WEBGL mode.
      *
      *   You can view more materials in this example.
      *   @param tex image to use as texture
      *   @chainable
      */
    inline def texture(tex: Image): ^ = js.Dynamic.global.applyDynamic("texture")(tex.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def texture(tex: MediaElement): ^ = js.Dynamic.global.applyDynamic("texture")(tex.asInstanceOf[js.Any]).asInstanceOf[^]
    
    /**
      *   Sets the coordinate space for texture mapping. The
      *   default mode is IMAGE which refers to the actual
      *   coordinates of the image. NORMAL refers to a
      *   normalized space of values ranging from 0 to 1.
      *   With IMAGE, if an image is 100×200 pixels, mapping
      *   the image onto the entire size of a quad would
      *   require the points (0,0) (100, 0) (100,200)
      *   (0,200). The same mapping in NORMAL is (0,0) (1,0)
      *   (1,1) (0,1).
      *   @param mode either IMAGE or NORMAL
      */
    inline def textureMode(mode: TEXTURE_MODE): Unit = js.Dynamic.global.applyDynamic("textureMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   Sets the global texture wrapping mode. This
      *   controls how textures behave when their uv's go
      *   outside of the 0 to 1 range. There are three
      *   options: CLAMP, REPEAT, and MIRROR. CLAMP causes
      *   the pixels at the edge of the texture to extend to
      *   the bounds. REPEAT causes the texture to tile
      *   repeatedly until reaching the bounds. MIRROR works
      *   similarly to REPEAT but it flips the texture with
      *   every new tile.
      *
      *   REPEAT & MIRROR are only available if the texture
      *   is a power of two size (128, 256, 512, 1024,
      *   etc.).
      *
      *   This method will affect all textures in your
      *   sketch until a subsequent textureWrap() call is
      *   made.
      *
      *   If only one argument is provided, it will be
      *   applied to both the horizontal and vertical axes.
      *   @param wrapX either CLAMP, REPEAT, or MIRROR
      *   @param [wrapY] either CLAMP, REPEAT, or MIRROR
      */
    inline def textureWrap(wrapX: WRAP_X): Unit = js.Dynamic.global.applyDynamic("textureWrap")(wrapX.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def textureWrap(wrapX: WRAP_X, wrapY: WRAP_Y): Unit = (js.Dynamic.global.applyDynamic("textureWrap")(wrapX.asInstanceOf[js.Any], wrapY.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   Sets the fill value for displaying images. Images
      *   can be tinted to specified colors or made
      *   transparent by including an alpha value. To apply
      *   transparency to an image without affecting its
      *   color, use white as the tint color and specify an
      *   alpha value. For instance, tint(255, 128) will
      *   make an image 50% transparent (assuming the
      *   default alpha range of 0-255, which can be changed
      *   with colorMode()).
      *
      *   The value for the gray parameter must be less than
      *   or equal to the current maximum value as specified
      *   by colorMode(). The default maximum value is 255.
      *   @param color the tint color
      */
    inline def tint(color: Color): Unit = js.Dynamic.global.applyDynamic("tint")(color.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /**
      *   Sets the fill value for displaying images. Images
      *   can be tinted to specified colors or made
      *   transparent by including an alpha value. To apply
      *   transparency to an image without affecting its
      *   color, use white as the tint color and specify an
      *   alpha value. For instance, tint(255, 128) will
      *   make an image 50% transparent (assuming the
      *   default alpha range of 0-255, which can be changed
      *   with colorMode()).
      *
      *   The value for the gray parameter must be less than
      *   or equal to the current maximum value as specified
      *   by colorMode(). The default maximum value is 255.
      *   @param gray a gray value
      */
    inline def tint(gray: Double): Unit = js.Dynamic.global.applyDynamic("tint")(gray.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def tint(gray: Double, alpha: Double): Unit = (js.Dynamic.global.applyDynamic("tint")(gray.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Sets the fill value for displaying images. Images
      *   can be tinted to specified colors or made
      *   transparent by including an alpha value. To apply
      *   transparency to an image without affecting its
      *   color, use white as the tint color and specify an
      *   alpha value. For instance, tint(255, 128) will
      *   make an image 50% transparent (assuming the
      *   default alpha range of 0-255, which can be changed
      *   with colorMode()).
      *
      *   The value for the gray parameter must be less than
      *   or equal to the current maximum value as specified
      *   by colorMode(). The default maximum value is 255.
      *   @param v1 red or hue value relative to the current
      *   color range
      *   @param v2 green or saturation value relative to
      *   the current color range
      *   @param v3 blue or brightness value relative to the
      *   current color range
      */
    inline def tint(v1: Double, v2: Double, v3: Double): Unit = (js.Dynamic.global.applyDynamic("tint")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def tint(v1: Double, v2: Double, v3: Double, alpha: Double): Unit = (js.Dynamic.global.applyDynamic("tint")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      *   Sets the fill value for displaying images. Images
      *   can be tinted to specified colors or made
      *   transparent by including an alpha value. To apply
      *   transparency to an image without affecting its
      *   color, use white as the tint color and specify an
      *   alpha value. For instance, tint(255, 128) will
      *   make an image 50% transparent (assuming the
      *   default alpha range of 0-255, which can be changed
      *   with colorMode()).
      *
      *   The value for the gray parameter must be less than
      *   or equal to the current maximum value as specified
      *   by colorMode(). The default maximum value is 255.
      *   @param value a color string
      */
    inline def tint(value: String): Unit = js.Dynamic.global.applyDynamic("tint")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /**
      *   Sets the fill value for displaying images. Images
      *   can be tinted to specified colors or made
      *   transparent by including an alpha value. To apply
      *   transparency to an image without affecting its
      *   color, use white as the tint color and specify an
      *   alpha value. For instance, tint(255, 128) will
      *   make an image 50% transparent (assuming the
      *   default alpha range of 0-255, which can be changed
      *   with colorMode()).
      *
      *   The value for the gray parameter must be less than
      *   or equal to the current maximum value as specified
      *   by colorMode(). The default maximum value is 255.
      *   @param values an array containing the
      *   red,green,blue & and alpha components of the color
      */
    inline def tint(values: js.Array[Double]): Unit = js.Dynamic.global.applyDynamic("tint")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   Draw a torus with given radius and tube radius
      *   DetailX and detailY determine the number of
      *   subdivisions in the x-dimension and the
      *   y-dimension of a torus. More subdivisions make the
      *   torus appear to be smoother. The default and
      *   maximum values for detailX and detailY are 24 and
      *   16, respectively. Setting them to relatively small
      *   values like 4 and 6 allows you to create new
      *   shapes other than a torus.
      *   @param [radius] radius of the whole ring
      *   @param [tubeRadius] radius of the tube
      *   @param [detailX] number of segments in
      *   x-dimension, the more segments the smoother
      *   geometry default is 24
      *   @param [detailY] number of segments in
      *   y-dimension, the more segments the smoother
      *   geometry default is 16
      *   @chainable
      */
    inline def torus(): ^ = js.Dynamic.global.applyDynamic("torus")().asInstanceOf[^]
    inline def torus(radius: Double): ^ = js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any]).asInstanceOf[^]
    inline def torus(radius: Double, tubeRadius: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Double, tubeRadius: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Double, tubeRadius: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Double, tubeRadius: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Double, tubeRadius: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Double, tubeRadius: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Double, tubeRadius: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Unit, tubeRadius: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Unit, tubeRadius: Double, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Unit, tubeRadius: Double, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Unit, tubeRadius: Double, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Unit, tubeRadius: Unit, detailX: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Unit, tubeRadius: Unit, detailX: Double, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def torus(radius: Unit, tubeRadius: Unit, detailX: Unit, detailY: Double): ^ = (js.Dynamic.global.applyDynamic("torus")(radius.asInstanceOf[js.Any], tubeRadius.asInstanceOf[js.Any], detailX.asInstanceOf[js.Any], detailY.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   The touchEnded() function is called every time a
      *   touch ends. If no touchEnded() function is
      *   defined, the mouseReleased() function will be
      *   called instead if it is defined. Browsers may have
      *   different default behaviors attached to various
      *   touch events. To prevent any default behavior for
      *   this event, add "return false" to the end of the
      *   method.
      *   @param [event] optional TouchEvent callback
      *   argument.
      */
    inline def touchEnded(): Unit = js.Dynamic.global.applyDynamic("touchEnded")().asInstanceOf[Unit]
    inline def touchEnded(event: js.Object): Unit = js.Dynamic.global.applyDynamic("touchEnded")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The touchMoved() function is called every time a
      *   touch move is registered. If no touchMoved()
      *   function is defined, the mouseDragged() function
      *   will be called instead if it is defined. Browsers
      *   may have different default behaviors attached to
      *   various touch events. To prevent any default
      *   behavior for this event, add "return false" to the
      *   end of the method.
      *   @param [event] optional TouchEvent callback
      *   argument.
      */
    inline def touchMoved(): Unit = js.Dynamic.global.applyDynamic("touchMoved")().asInstanceOf[Unit]
    inline def touchMoved(event: js.Object): Unit = js.Dynamic.global.applyDynamic("touchMoved")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The touchStarted() function is called once after
      *   every time a touch is registered. If no
      *   touchStarted() function is defined, the
      *   mousePressed() function will be called instead if
      *   it is defined. Browsers may have different default
      *   behaviors attached to various touch events. To
      *   prevent any default behavior for this event, add
      *   "return false" to the end of the method.
      *   @param [event] optional TouchEvent callback
      *   argument.
      */
    inline def touchStarted(): Unit = js.Dynamic.global.applyDynamic("touchStarted")().asInstanceOf[Unit]
    inline def touchStarted(event: js.Object): Unit = js.Dynamic.global.applyDynamic("touchStarted")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   The system variable touches[] contains an array of
      *   the positions of all current touch points,
      *   relative to (0, 0) of the canvas, and IDs
      *   identifying a unique touch as it moves. Each
      *   element in the array is an object with x, y, and
      *   id properties. The touches[] array is not
      *   supported on Safari and IE on touch-based desktops
      *   (laptops).
      */
    @JSGlobal("touches")
    @js.native
    def touches: js.Array[js.Object] = js.native
    inline def touches_=(x: js.Array[js.Object]): Unit = js.Dynamic.global.updateDynamic("touches")(x.asInstanceOf[js.Any])
    
    /**
      *   Specifies an amount to displace objects within the
      *   display window. The x parameter specifies
      *   left/right translation, the y parameter specifies
      *   up/down translation. Transformations are
      *   cumulative and apply to everything that happens
      *   after and subsequent calls to the function
      *   accumulates the effect. For example, calling
      *   translate(50, 0) and then translate(20, 0) is the
      *   same as translate(70, 0). If translate() is called
      *   within draw(), the transformation is reset when
      *   the loop begins again. This function can be
      *   further controlled by using push() and pop().
      *   @param vector the vector to translate by
      *   @chainable
      */
    inline def translate(vector: Vector): ^ = js.Dynamic.global.applyDynamic("translate")(vector.asInstanceOf[js.Any]).asInstanceOf[^]
    /**
      *   Specifies an amount to displace objects within the
      *   display window. The x parameter specifies
      *   left/right translation, the y parameter specifies
      *   up/down translation. Transformations are
      *   cumulative and apply to everything that happens
      *   after and subsequent calls to the function
      *   accumulates the effect. For example, calling
      *   translate(50, 0) and then translate(20, 0) is the
      *   same as translate(70, 0). If translate() is called
      *   within draw(), the transformation is reset when
      *   the loop begins again. This function can be
      *   further controlled by using push() and pop().
      *   @param x left/right translation
      *   @param y up/down translation
      *   @param [z] forward/backward translation (webgl
      *   only)
      *   @chainable
      */
    inline def translate(x: Double, y: Double): ^ = (js.Dynamic.global.applyDynamic("translate")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    inline def translate(x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("translate")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Draws a triangle to the canvas. A triangle is a
      *   plane created by connecting three points. The
      *   first two arguments specify the first point, the
      *   middle two arguments specify the second point, and
      *   the last two arguments specify the third point.
      *   @param x1 x-coordinate of the first point
      *   @param y1 y-coordinate of the first point
      *   @param x2 x-coordinate of the second point
      *   @param y2 y-coordinate of the second point
      *   @param x3 x-coordinate of the third point
      *   @param y3 y-coordinate of the third point
      *   @chainable
      */
    inline def triangle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): ^ = (js.Dynamic.global.applyDynamic("triangle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   Removes whitespace characters from the beginning
      *   and end of a String. In addition to standard
      *   whitespace characters such as space, carriage
      *   return, and tab, this function also removes the
      *   Unicode "nbsp" character.
      *   @param str a String to be trimmed
      *   @return a trimmed String
      */
    inline def trim(str: String): String = js.Dynamic.global.applyDynamic("trim")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
      *   Removes whitespace characters from the beginning
      *   and end of a String. In addition to standard
      *   whitespace characters such as space, carriage
      *   return, and tab, this function also removes the
      *   Unicode "nbsp" character.
      *   @param strs an Array of Strings to be trimmed
      *   @return an Array of trimmed Strings
      */
    inline def trim(strs: js.Array[Any]): js.Array[String] = js.Dynamic.global.applyDynamic("trim")(strs.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      *   When a device is rotated, the axis that triggers
      *   the deviceTurned() method is stored in the
      *   turnAxis variable. The turnAxis variable is only
      *   defined within the scope of deviceTurned().
      */
    @JSGlobal("turnAxis")
    @js.native
    def turnAxis: String = js.native
    inline def turnAxis_=(x: String): Unit = js.Dynamic.global.updateDynamic("turnAxis")(x.asInstanceOf[js.Any])
    
    /**
      *   Converts a single-character string to its
      *   corresponding integer representation. When an
      *   array of single-character string values is passed
      *   in, then an array of integers of the same length
      *   is returned.
      *   @param n value to parse
      *   @return integer representation of value
      */
    inline def unchar(n: String): Double = js.Dynamic.global.applyDynamic("unchar")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      *   Converts a single-character string to its
      *   corresponding integer representation. When an
      *   array of single-character string values is passed
      *   in, then an array of integers of the same length
      *   is returned.
      *   @param ns values to parse
      *   @return integer representation of values
      */
    inline def unchar(ns: js.Array[Any]): js.Array[Double] = js.Dynamic.global.applyDynamic("unchar")(ns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    /**
      *   Converts a string representation of a hexadecimal
      *   number to its equivalent integer value. When an
      *   array of strings in hexadecimal notation is passed
      *   in, an array of integers of the same length is
      *   returned.
      *   @param n value to parse
      *   @return integer representation of hexadecimal
      *   value
      */
    inline def unhex(n: String): Double = js.Dynamic.global.applyDynamic("unhex")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    /**
      *   Converts a string representation of a hexadecimal
      *   number to its equivalent integer value. When an
      *   array of strings in hexadecimal notation is passed
      *   in, an array of integers of the same length is
      *   returned.
      *   @param ns values to parse
      *   @return integer representations of hexadecimal
      *   value
      */
    inline def unhex(ns: js.Array[Any]): js.Array[Double] = js.Dynamic.global.applyDynamic("unhex")(ns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    /**
      *   Updates the display window with the data in the
      *   pixels[] array. Use in conjunction with
      *   loadPixels(). If you're only reading pixels from
      *   the array, there's no need to call updatePixels()
      *   — updating is only necessary to apply changes.
      *   updatePixels() should be called anytime the pixels
      *   array is manipulated or set() is called, and only
      *   changes made with set() or direct changes to
      *   pixels[] will occur.
      *   @param [x] x-coordinate of the upper-left corner
      *   of region to update
      *   @param [y] y-coordinate of the upper-left corner
      *   of region to update
      *   @param [w] width of region to update
      *   @param [h] height of region to update
      */
    inline def updatePixels(): Unit = js.Dynamic.global.applyDynamic("updatePixels")().asInstanceOf[Unit]
    inline def updatePixels(x: Double): Unit = js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def updatePixels(x: Double, y: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Double, y: Double, w: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Double, y: Double, w: Double, h: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Double, y: Double, w: Unit, h: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Double, y: Unit, w: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Double, y: Unit, w: Double, h: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Double, y: Unit, w: Unit, h: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Unit, y: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Unit, y: Double, w: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Unit, y: Double, w: Double, h: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Unit, y: Double, w: Unit, h: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Unit, y: Unit, w: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Unit, y: Unit, w: Double, h: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updatePixels(x: Unit, y: Unit, w: Unit, h: Double): Unit = (js.Dynamic.global.applyDynamic("updatePixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *   All shapes are constructed by connecting a series
      *   of vertices. vertex() is used to specify the
      *   vertex coordinates for points, lines, triangles,
      *   quads, and polygons. It is used exclusively within
      *   the beginShape() and endShape() functions.
      *   @param x x-coordinate of the vertex
      *   @param y y-coordinate of the vertex
      *   @chainable
      */
    inline def vertex(x: Double, y: Double): ^ = (js.Dynamic.global.applyDynamic("vertex")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[^]
    /**
      *   All shapes are constructed by connecting a series
      *   of vertices. vertex() is used to specify the
      *   vertex coordinates for points, lines, triangles,
      *   quads, and polygons. It is used exclusively within
      *   the beginShape() and endShape() functions.
      *   @param x x-coordinate of the vertex
      *   @param y y-coordinate of the vertex
      *   @param z z-coordinate of the vertex. Defaults to 0
      *   if not specified.
      *   @chainable
      */
    inline def vertex(x: Double, y: Double, z: Double): ^ = (js.Dynamic.global.applyDynamic("vertex")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[^]
    
    /**
      *   System variable that stores the width of the
      *   drawing canvas. This value is set by the first
      *   parameter of the createCanvas() function. For
      *   example, the function call createCanvas(320, 240)
      *   sets the width variable to the value 320. The
      *   value of width defaults to 100 if createCanvas()
      *   is not used in a program.
      */
    @JSGlobal("width")
    @js.native
    def width: Double = js.native
    inline def width_=(x: Double): Unit = js.Dynamic.global.updateDynamic("width")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable winMouseX always contains the
      *   current horizontal position of the mouse, relative
      *   to (0, 0) of the window.
      */
    @JSGlobal("winMouseX")
    @js.native
    def winMouseX: Double = js.native
    inline def winMouseX_=(x: Double): Unit = js.Dynamic.global.updateDynamic("winMouseX")(x.asInstanceOf[js.Any])
    
    /**
      *   The system variable winMouseY always contains the
      *   current vertical position of the mouse, relative
      *   to (0, 0) of the window.
      */
    @JSGlobal("winMouseY")
    @js.native
    def winMouseY: Double = js.native
    inline def winMouseY_=(x: Double): Unit = js.Dynamic.global.updateDynamic("winMouseY")(x.asInstanceOf[js.Any])
    
    /**
      *   System variable that stores the height of the
      *   inner window, it maps to window.innerHeight.
      */
    @JSGlobal("windowHeight")
    @js.native
    def windowHeight: Double = js.native
    inline def windowHeight_=(x: Double): Unit = js.Dynamic.global.updateDynamic("windowHeight")(x.asInstanceOf[js.Any])
    
    /**
      *   The windowResized() function is called once every
      *   time the browser window is resized. This is a good
      *   place to resize the canvas or do any other
      *   adjustments to accommodate the new window size.
      *   @param [event] optional Event callback argument.
      */
    inline def windowResized(): Unit = js.Dynamic.global.applyDynamic("windowResized")().asInstanceOf[Unit]
    inline def windowResized(event: js.Object): Unit = js.Dynamic.global.applyDynamic("windowResized")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *   System variable that stores the width of the inner
      *   window, it maps to window.innerWidth.
      */
    @JSGlobal("windowWidth")
    @js.native
    def windowWidth: Double = js.native
    inline def windowWidth_=(x: Double): Unit = js.Dynamic.global.updateDynamic("windowWidth")(x.asInstanceOf[js.Any])
    
    /**
      *   p5.js communicates with the clock on your
      *   computer. The year() function returns the current
      *   year as an integer (2014, 2015, 2016, etc).
      *   @return the current year
      */
    inline def year(): Double = js.Dynamic.global.applyDynamic("year")().asInstanceOf[Double]
  }
}
