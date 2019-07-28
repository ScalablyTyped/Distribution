package typings.nodeDashSass.nodeDashSassMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.nodeDashSass.nodeDashSassMod.typesNs.BooleanConstructor
import typings.nodeDashSass.nodeDashSassMod.typesNs.ColorConstructor
import typings.nodeDashSass.nodeDashSassMod.typesNs.Enumerable
import typings.nodeDashSass.nodeDashSassMod.typesNs.ErrorConstructor
import typings.nodeDashSass.nodeDashSassMod.typesNs.ListConstructor
import typings.nodeDashSass.nodeDashSassMod.typesNs.MapConstructor
import typings.nodeDashSass.nodeDashSassMod.typesNs.NullConstructor
import typings.nodeDashSass.nodeDashSassMod.typesNs.NumberConstructor
import typings.nodeDashSass.nodeDashSassMod.typesNs.ReturnValue
import typings.nodeDashSass.nodeDashSassMod.typesNs.StringConstructor
import typings.nodeDashSass.nodeDashSassMod.typesNs.Value
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
    var FALSE: typings.nodeDashSass.nodeDashSassMod.typesNs.Boolean = js.native
    var TRUE: typings.nodeDashSass.nodeDashSassMod.typesNs.Boolean = js.native
    def apply(bool: scala.Boolean): typings.nodeDashSass.nodeDashSassMod.typesNs.Boolean = js.native
  }
  
  trait Color extends Value {
    /**
    		 * Get the alpha transparency component of the color.
    		 * @returns number between 0 and 1 inclusive;
    		 */
    def getA(): Double
    /**
    		 * Get the blue component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    def getB(): Double
    /**
    		 * Get the green component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    def getG(): Double
    /**
    		 * Get the red component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    def getR(): Double
    /**
    		 * Set the alpha component of the color.
    		 * @param a number between 0 and 1 inclusive;
    		 */
    def setA(a: Double): Unit
    /**
    		 * Set the blue component of the color.
    		 * @param b integer between 0 and 255 inclusive;
    		 */
    def setB(b: Double): Unit
    /**
    		 * Set the green component of the color.
    		 * @param g integer between 0 and 255 inclusive;
    		 */
    def setG(g: Double): Unit
    /**
    		 * Set the red component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    def setR(r: Double): Unit
  }
  
  @js.native
  class ColorCls protected ()
    extends typings.nodeDashSass.nodeDashSassMod.typesNs.Color {
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
    def this(hexN: Double) = this()
    /**
    		 * Constructs a new Sass color given the RGBA component values. Do not invoke with the `new` keyword.
    		 *
    		 * @param r integer 0-255 inclusive
    		 * @param g integer 0-255 inclusive
    		 * @param b integer 0-255 inclusive
    		 * @param [a] float 0 - 1 inclusive
    		 * @returns a SassColor instance.
    		 */
    def this(r: Double, g: Double, b: Double) = this()
    def this(r: Double, g: Double, b: Double, a: Double) = this()
    /**
    		 * Get the alpha transparency component of the color.
    		 * @returns number between 0 and 1 inclusive;
    		 */
    /* CompleteClass */
    override def getA(): Double = js.native
    /**
    		 * Get the blue component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    /* CompleteClass */
    override def getB(): Double = js.native
    /**
    		 * Get the green component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    /* CompleteClass */
    override def getG(): Double = js.native
    /**
    		 * Get the red component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    /* CompleteClass */
    override def getR(): Double = js.native
    /**
    		 * Set the alpha component of the color.
    		 * @param a number between 0 and 1 inclusive;
    		 */
    /* CompleteClass */
    override def setA(a: Double): Unit = js.native
    /**
    		 * Set the blue component of the color.
    		 * @param b integer between 0 and 255 inclusive;
    		 */
    /* CompleteClass */
    override def setB(b: Double): Unit = js.native
    /**
    		 * Set the green component of the color.
    		 * @param g integer between 0 and 255 inclusive;
    		 */
    /* CompleteClass */
    override def setG(g: Double): Unit = js.native
    /**
    		 * Set the red component of the color.
    		 * @returns integer between 0 and 255 inclusive;
    		 */
    /* CompleteClass */
    override def setR(r: Double): Unit = js.native
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
  Instantiable3[
          /* r */ Double, 
          /* g */ Double, 
          /* b */ Double, 
          typings.nodeDashSass.nodeDashSassMod.typesNs.Color
        ]
       with Instantiable4[
          /* r */ Double, 
          /* g */ Double, 
          /* b */ Double, 
          /* a */ Double, 
          typings.nodeDashSass.nodeDashSassMod.typesNs.Color
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
  Instantiable1[/* hexN */ Double, typings.nodeDashSass.nodeDashSassMod.typesNs.Color] {
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
    def apply(hexN: Double): typings.nodeDashSass.nodeDashSassMod.typesNs.Color = js.native
    /**
    		 * Constructs a new Sass color given the RGBA component values. Do not invoke with the `new` keyword.
    		 *
    		 * @param r integer 0-255 inclusive
    		 * @param g integer 0-255 inclusive
    		 * @param b integer 0-255 inclusive
    		 * @param [a] float 0 - 1 inclusive
    		 * @returns a SassColor instance.
    		 */
    def apply(r: Double, g: Double, b: Double): typings.nodeDashSass.nodeDashSassMod.typesNs.Color = js.native
    def apply(r: Double, g: Double, b: Double, a: Double): typings.nodeDashSass.nodeDashSassMod.typesNs.Color = js.native
  }
  
  trait Enumerable extends js.Object {
    def getLength(): Double
    def getValue(index: Double): Value
    def setValue(index: Double, value: Value): Unit
  }
  
  trait Error
    extends ReturnValue
       with _ImporterReturnType {
    /**
    		 * This property doesn't exist, but its presence forces the typescript
    		 * compiler to properly type check this type. Without it, it seems to
    		 * allow things that aren't types.Error to match it in case statements and
    		 * assignments.
    		 */
    val ___SASS_ERROR___ : js.Symbol
  }
  
  @js.native
  class ErrorCls protected ()
    extends typings.nodeDashSass.nodeDashSassMod.typesNs.Error {
    /**
    		 * An error return value for async functions.
    		 * For synchronous functions, this can be returned or a standard error object can be thrown.
    		 */
    def this(message: java.lang.String) = this()
    /**
    		 * This property doesn't exist, but its presence forces the typescript
    		 * compiler to properly type check this type. Without it, it seems to
    		 * allow things that aren't types.Error to match it in case statements and
    		 * assignments.
    		 */
    /* CompleteClass */
    override val ___SASS_ERROR___ : js.Symbol = js.native
  }
  
  @js.native
  trait ErrorConstructor
    extends /**
  		 * An error return value for async functions.
  		 * For synchronous functions, this can be returned or a standard error object can be thrown.
  		 */
  Instantiable1[/* message */ java.lang.String, typings.nodeDashSass.nodeDashSassMod.typesNs.Error] {
    /**
    		 * An error return value for async functions.
    		 * For synchronous functions, this can be returned or a standard error object can be thrown.
    		 */
    def apply(message: java.lang.String): typings.nodeDashSass.nodeDashSassMod.typesNs.Error = js.native
  }
  
  trait List
    extends Value
       with Enumerable {
    def getSeparator(): scala.Boolean
    def setSeparator(isComma: scala.Boolean): Unit
  }
  
  @js.native
  class ListCls protected ()
    extends typings.nodeDashSass.nodeDashSassMod.typesNs.List {
    def this(length: Double) = this()
    def this(length: Double, commaSeparator: scala.Boolean) = this()
    /* CompleteClass */
    override def getLength(): Double = js.native
    /* CompleteClass */
    override def getSeparator(): scala.Boolean = js.native
    /* CompleteClass */
    override def getValue(index: Double): Value = js.native
    /* CompleteClass */
    override def setSeparator(isComma: scala.Boolean): Unit = js.native
    /* CompleteClass */
    override def setValue(index: Double, value: Value): Unit = js.native
  }
  
  @js.native
  trait ListConstructor
    extends Instantiable1[/* length */ Double, typings.nodeDashSass.nodeDashSassMod.typesNs.List]
       with Instantiable2[
          /* length */ Double, 
          /* commaSeparator */ scala.Boolean, 
          typings.nodeDashSass.nodeDashSassMod.typesNs.List
        ] {
    def apply(length: Double): typings.nodeDashSass.nodeDashSassMod.typesNs.List = js.native
    def apply(length: Double, commaSeparator: scala.Boolean): typings.nodeDashSass.nodeDashSassMod.typesNs.List = js.native
  }
  
  trait Map
    extends Value
       with Enumerable {
    def getKey(index: Double): Value
    def setKey(index: Double, key: Value): Unit
  }
  
  @js.native
  class MapCls protected ()
    extends typings.nodeDashSass.nodeDashSassMod.typesNs.Map {
    def this(length: Double) = this()
    /* CompleteClass */
    override def getKey(index: Double): Value = js.native
    /* CompleteClass */
    override def getLength(): Double = js.native
    /* CompleteClass */
    override def getValue(index: Double): Value = js.native
    /* CompleteClass */
    override def setKey(index: Double, key: Value): Unit = js.native
    /* CompleteClass */
    override def setValue(index: Double, value: Value): Unit = js.native
  }
  
  @js.native
  trait MapConstructor
    extends Instantiable1[/* length */ Double, typings.nodeDashSass.nodeDashSassMod.typesNs.Map] {
    def apply(length: Double): typings.nodeDashSass.nodeDashSassMod.typesNs.Map = js.native
  }
  
  trait Null
    extends Value
       with _ImporterReturnType {
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
    var NULL: typings.nodeDashSass.nodeDashSassMod.typesNs.Null = js.native
    def apply(): typings.nodeDashSass.nodeDashSassMod.typesNs.Null = js.native
  }
  
  trait Number extends Value {
    def getUnit(): java.lang.String
    def getValue(): Double
    def setUnit(u: java.lang.String): Unit
    def setValue(n: Double): Unit
  }
  
  @js.native
  class NumberCls protected ()
    extends typings.nodeDashSass.nodeDashSassMod.typesNs.Number {
    /**
    		 * Constructs a new Sass number. Does not require use of the `new` keyword.
    		 */
    def this(value: Double) = this()
    def this(value: Double, unit: java.lang.String) = this()
    /* CompleteClass */
    override def getUnit(): java.lang.String = js.native
    /* CompleteClass */
    override def getValue(): Double = js.native
    /* CompleteClass */
    override def setUnit(u: java.lang.String): Unit = js.native
    /* CompleteClass */
    override def setValue(n: Double): Unit = js.native
  }
  
  @js.native
  trait NumberConstructor
    extends /**
  		 * Constructs a new Sass number. Does not require use of the `new` keyword.
  		 */
  Instantiable1[/* value */ Double, typings.nodeDashSass.nodeDashSassMod.typesNs.Number]
       with Instantiable2[
          /* value */ Double, 
          /* unit */ java.lang.String, 
          typings.nodeDashSass.nodeDashSassMod.typesNs.Number
        ] {
    /**
    		 * Constructs a new Sass number. Can also be used with the `new` keyword.
    		 */
    def apply(value: Double): typings.nodeDashSass.nodeDashSassMod.typesNs.Number = js.native
    def apply(value: Double, unit: java.lang.String): typings.nodeDashSass.nodeDashSassMod.typesNs.Number = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeDashSass.nodeDashSassMod.typesNs.Value
    - typings.nodeDashSass.nodeDashSassMod.typesNs.Error
  */
  trait ReturnValue extends js.Object
  
  trait String extends Value {
    def getValue(): java.lang.String
    def setValue(s: java.lang.String): Unit
  }
  
  @js.native
  class StringCls protected ()
    extends typings.nodeDashSass.nodeDashSassMod.typesNs.String {
    /**
    		 * Constructs a new Sass string. Does not require use of the `new` keyword.
    		 */
    def this(value: java.lang.String) = this()
    /* CompleteClass */
    override def getValue(): java.lang.String = js.native
    /* CompleteClass */
    override def setValue(s: java.lang.String): Unit = js.native
  }
  
  @js.native
  trait StringConstructor
    extends /**
  		 * Constructs a new Sass string. Does not require use of the `new` keyword.
  		 */
  Instantiable1[/* value */ java.lang.String, typings.nodeDashSass.nodeDashSassMod.typesNs.String] {
    /**
    		 * Constructs a new Sass string. Can also be used with the `new` keyword.
    		 */
    def apply(value: java.lang.String): typings.nodeDashSass.nodeDashSassMod.typesNs.String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeDashSass.nodeDashSassMod.typesNs.Null
    - typings.nodeDashSass.nodeDashSassMod.typesNs.Number
    - typings.nodeDashSass.nodeDashSassMod.typesNs.String
    - typings.nodeDashSass.nodeDashSassMod.typesNs.Color
    - typings.nodeDashSass.nodeDashSassMod.typesNs.Boolean
    - typings.nodeDashSass.nodeDashSassMod.typesNs.List
    - typings.nodeDashSass.nodeDashSassMod.typesNs.Map
  */
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

