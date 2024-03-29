package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("node-sass", "types.Color")
@js.native
open class ColorCls protected ()
  extends StObject
     with Color {
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
