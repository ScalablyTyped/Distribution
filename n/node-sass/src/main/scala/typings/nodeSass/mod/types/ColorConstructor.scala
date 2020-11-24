package typings.nodeSass.mod.types

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorConstructor
  extends /**
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
Instantiable1[/* hexN */ Double, Color]
     with /**
  * Constructs a new Sass color given the RGBA component values. Do not invoke with the `new` keyword.
  *
  * @param r integer 0-255 inclusive
  * @param g integer 0-255 inclusive
  * @param b integer 0-255 inclusive
  * @param [a] float 0 - 1 inclusive
  * @returns a SassColor instance.
  */
Instantiable3[/* r */ Double, /* g */ Double, /* b */ Double, Color]
     with Instantiable4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ Double, Color] {
  
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
  def apply(hexN: Double): Color = js.native
  /**
    * Constructs a new Sass color given the RGBA component values. Do not invoke with the `new` keyword.
    *
    * @param r integer 0-255 inclusive
    * @param g integer 0-255 inclusive
    * @param b integer 0-255 inclusive
    * @param [a] float 0 - 1 inclusive
    * @returns a SassColor instance.
    */
  def apply(r: Double, g: Double, b: Double): Color = js.native
  def apply(r: Double, g: Double, b: Double, a: Double): Color = js.native
}
