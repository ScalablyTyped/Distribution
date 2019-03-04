package typings
package nodeDashSassLib.nodeDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-sass", "types")
@js.native
object typesNs extends js.Object {
  trait Boolean extends Value {
    def getValue(): scala.Boolean
  }
  
  @js.native
  trait BooleanConstructor extends js.Object {
    var FALSE: Boolean = js.native
    var TRUE: Boolean = js.native
    def apply(bool: scala.Boolean): Boolean = js.native
  }
  
  trait Color extends Value {
    /**
    		 * Get the alpha transparency component of the color.
    		 * @returns number between 0 and 1 inclusive;
    		 */
    def getA(): scala.Double
    /**
    		 * Get the blue component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    def getB(): scala.Double
    /**
    		 * Get the green component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    def getG(): scala.Double
    /**
    		 * Get the red component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    def getR(): scala.Double
    /**
    		 * Set the alpha component of the color.
    		 * @param a number between 0 and 1 inclusive;
    		 */
    def setA(a: scala.Double): scala.Unit
    /**
    		 * Set the blue component of the color.
    		 * @param b integer between 0 and 255 inclusive;
    		 */
    def setB(b: scala.Double): scala.Unit
    /**
    		 * Set the green component of the color.
    		 * @param g integer between 0 and 255 inclusive;
    		 */
    def setG(g: scala.Double): scala.Unit
    /**
    		 * Set the red component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    def setR(r: scala.Double): scala.Unit
  }
  
  @js.native
  trait ColorConstructor
    extends /**
  		 * Constructs a new Sass color given the RGBA component values. Do not invoke with the `new` keyword.
  		 *
  		 * @param r integer 0-255 inclusive
  		 * @param g integer 0-255 inclusive
  		 * @param b integer 0-255 inclusive
  		 * @param [a] float 0 - 1 inclusive
  		 * @returns a SassColor instance.
  		 */
  org.scalablytyped.runtime.Instantiable3[/* r */ scala.Double, /* g */ scala.Double, /* b */ scala.Double, Color]
       with org.scalablytyped.runtime.Instantiable4[
          /* r */ scala.Double, 
          /* g */ scala.Double, 
          /* b */ scala.Double, 
          /* a */ scala.Double, 
          Color
        ]
       with /**
  		 * Constructs a new Sass color given a 4 byte number. Do not invoke with the `new` keyword.
  		 *
  		 * If a single number is passed it is assumed to be a number that contains
  		 * all the components which are extracted using bitmasks and bitshifting.
  		 *
  		 * @param hexN A number that is usually written in hexadecimal form. E.g. 0xff0088cc.
  		 * @returns a Sass Color instance.
  		 * @example
  		 *   // Comparison with byte array manipulation
  		 *   let a = new ArrayBuffer(4);
  		 *   let hexN = 0xCCFF0088; // 0xAARRGGBB
  		 *   let a32 = new Uint32Array(a); // Uint32Array [ 0 ]
  		 *   a32[0] = hexN;
  		 *   let a8 = new Uint8Array(a); // Uint8Array [ 136, 0, 255, 204 ]
  		 *   let componentBytes = [a8[2], a8[1], a8[0], a8[3] / 255] // [ 136, 0, 255, 0.8 ]
  		 *   let c = sass.types.Color(hexN);
  		 *   let components = [c.getR(), c.getG(), c.getR(), c.getA()] // [ 136, 0, 255, 0.8 ]
  		 *   assert.deepEqual(componentBytes, components); // does not raise.
  		 */
  org.scalablytyped.runtime.Instantiable1[/* hexN */ scala.Double, Color] {
    /**
    		 * Constructs a new Sass color given a 4 byte number. Do not invoke with the `new` keyword.
    		 *
    		 * If a single number is passed it is assumed to be a number that contains
    		 * all the components which are extracted using bitmasks and bitshifting.
    		 *
    		 * @param hexN A number that is usually written in hexadecimal form. E.g. 0xff0088cc.
    		 * @returns a Sass Color instance.
    		 * @example
    		 *   // Comparison with byte array manipulation
    		 *   let a = new ArrayBuffer(4);
    		 *   let hexN = 0xCCFF0088; // 0xAARRGGBB
    		 *   let a32 = new Uint32Array(a); // Uint32Array [ 0 ]
    		 *   a32[0] = hexN;
    		 *   let a8 = new Uint8Array(a); // Uint8Array [ 136, 0, 255, 204 ]
    		 *   let componentBytes = [a8[2], a8[1], a8[0], a8[3] / 255] // [ 136, 0, 255, 0.8 ]
    		 *   let c = sass.types.Color(hexN);
    		 *   let components = [c.getR(), c.getG(), c.getR(), c.getA()] // [ 136, 0, 255, 0.8 ]
    		 *   assert.deepEqual(componentBytes, components); // does not raise.
    		 */
    def apply(hexN: scala.Double): Color = js.native
    /**
    		 * Constructs a new Sass color given the RGBA component values. Do not invoke with the `new` keyword.
    		 *
    		 * @param r integer 0-255 inclusive
    		 * @param g integer 0-255 inclusive
    		 * @param b integer 0-255 inclusive
    		 * @param [a] float 0 - 1 inclusive
    		 * @returns a SassColor instance.
    		 */
    def apply(r: scala.Double, g: scala.Double, b: scala.Double): Color = js.native
    def apply(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): Color = js.native
  }
  
  trait Enumerable extends js.Object {
    def getLength(): scala.Double
    def getValue(index: scala.Double): Value
    def setValue(index: scala.Double, value: Value): scala.Unit
  }
  
  trait Error
    extends ReturnValue
       with nodeDashSassLib.nodeDashSassMod._ImporterReturnType {
    /**
    		 * This property doesn't exist, but its presence forces the typescript
    		 * compiler to properly type check this type. Without it, it seems to
    		 * allow things that aren't types.Error to match it in case statements and
    		 * assignments.
    		 */
    val ___SASS_ERROR___ : js.Symbol
  }
  
  @js.native
  trait ErrorConstructor
    extends /**
  		 * An error return value for async functions.
  		 * For synchronous functions, this can be returned or a standard error object can be thrown.
  		 */
  org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, Error] {
    /**
    		 * An error return value for async functions.
    		 * For synchronous functions, this can be returned or a standard error object can be thrown.
    		 */
    def apply(message: java.lang.String): Error = js.native
  }
  
  trait List
    extends Value
       with Enumerable {
    def getSeparator(): scala.Boolean
    def setSeparator(isComma: scala.Boolean): scala.Unit
  }
  
  @js.native
  trait ListConstructor
    extends org.scalablytyped.runtime.Instantiable1[/* length */ scala.Double, List]
       with org.scalablytyped.runtime.Instantiable2[/* length */ scala.Double, /* commaSeparator */ scala.Boolean, List] {
    def apply(length: scala.Double): List = js.native
    def apply(length: scala.Double, commaSeparator: scala.Boolean): List = js.native
  }
  
  trait Map
    extends Value
       with Enumerable {
    def getKey(index: scala.Double): Value
    def setKey(index: scala.Double, key: Value): scala.Unit
  }
  
  @js.native
  trait MapConstructor
    extends org.scalablytyped.runtime.Instantiable1[/* length */ scala.Double, Map] {
    def apply(length: scala.Double): Map = js.native
  }
  
  trait Null
    extends Value
       with nodeDashSassLib.nodeDashSassMod._ImporterReturnType {
    /**
    		 * This property doesn't exist, but its presence forces the typescript
    		 * compiler to properly type check this type. Without it, it seems to
    		 * allow things that aren't types.Null to match it in case statements and
    		 * assignments.
    		 */
    val ___NULL___ : js.Symbol
  }
  
  @js.native
  trait NullConstructor extends js.Object {
    var NULL: Null = js.native
    def apply(): Null = js.native
  }
  
  trait Number extends Value {
    def getUnit(): java.lang.String
    def getValue(): scala.Double
    def setUnit(u: java.lang.String): scala.Unit
    def setValue(n: scala.Double): scala.Unit
  }
  
  @js.native
  trait NumberConstructor
    extends /**
  		 * Constructs a new Sass number. Does not require use of the `new` keyword.
  		 */
  org.scalablytyped.runtime.Instantiable1[/* value */ scala.Double, Number]
       with org.scalablytyped.runtime.Instantiable2[/* value */ scala.Double, /* unit */ java.lang.String, Number] {
    /**
    		 * Constructs a new Sass number. Can also be used with the `new` keyword.
    		 */
    def apply(value: scala.Double): Number = js.native
    def apply(value: scala.Double, unit: java.lang.String): Number = js.native
  }
  
  trait ReturnValue extends js.Object
  
  trait String extends Value {
    def getValue(): java.lang.String
    def setValue(s: java.lang.String): scala.Unit
  }
  
  @js.native
  trait StringConstructor
    extends /**
  		 * Constructs a new Sass string. Does not require use of the `new` keyword.
  		 */
  org.scalablytyped.runtime.Instantiable1[/* value */ java.lang.String, String] {
    /**
    		 * Constructs a new Sass string. Can also be used with the `new` keyword.
    		 */
    def apply(value: java.lang.String): String = js.native
  }
  
  trait Value extends ReturnValue
  
  val Boolean: BooleanConstructor = js.native
  val Color: ColorConstructor = js.native
  val Error: ErrorConstructor = js.native
  val List: ListConstructor = js.native
  val Map: MapConstructor = js.native
  val Null: NullConstructor = js.native
  val Number: NumberConstructor = js.native
  val String: StringConstructor = js.native
}

