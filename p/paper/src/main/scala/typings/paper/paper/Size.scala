package typings.paper.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Size object is used to describe the size or dimensions of
  * something, through its {@link #width} and {@link #height} properties.
  */
@js.native
trait Size extends StObject {
  
  /** 
    * Returns a new size with the absolute values of the specified
    * {@link #width} and {@link #height} values. The object itself is not
    * modified!
    */
  def abs(): Size = js.native
  
  /** 
    * Returns the addition of the supplied value to the width and height of the
    * size as a new size. The object itself is not modified!
    * 
    * @param number - the number to add
    * 
    * @return the addition of the size and the value as a new size
    */
  def add(number: Double): Size = js.native
  /** 
    * Returns the addition of the width and height of the supplied size to the
    * size as a new size. The object itself is not modified!
    * 
    * @param size - the size to add
    * 
    * @return the addition of the two sizes as a new size
    */
  def add(size: Size): Size = js.native
  
  /** 
    * Returns a new size with the nearest greater non-fractional values to the
    * specified {@link #width} and {@link #height} values. The object itself is
    * not modified!
    */
  def ceil(): Size = js.native
  
  /** 
    * Returns the division of the supplied value by the width and height of the
    * size as a new size. The object itself is not modified!
    * 
    * @param number - the number to divide by
    * 
    * @return the division of the size and the value as a new size
    */
  def divide(number: Double): Size = js.native
  /** 
    * Returns the division of the width and height of the supplied size by the
    * size as a new size. The object itself is not modified!
    * 
    * @param size - the size to divide by
    * 
    * @return the division of the two sizes as a new size
    */
  def divide(size: Size): Size = js.native
  
  /** 
    * Checks whether the width and height of the size are equal to those of the
    * supplied size.
    * 
    * @param size - the size to compare to
    */
  def equals(size: Size): Boolean = js.native
  
  /** 
    * Returns a new size with the nearest smaller non-fractional values to the
    * specified {@link #width} and {@link #height} values. The object itself is
    * not modified!
    */
  def floor(): Size = js.native
  
  /** 
    * The height of the size
    */
  var height: Double = js.native
  
  /** 
    * Checks if the width or the height of the size are NaN.
    * 
    * @return true if the width or height of the size are NaN
    */
  def isNaN(): Boolean = js.native
  
  /** 
    * Checks if this size has both the width and height set to 0.
    * 
    * @return true if both width and height are 0
    */
  def isZero(): Boolean = js.native
  
  /** 
    * The modulo operator returns the integer remainders of dividing the size
    * by the supplied size as a new size.
    * 
    * @return the integer remainders of dividing the sizes by each
    * other as a new size
    */
  def modulo(size: Size): Size = js.native
  /** 
    * The modulo operator returns the integer remainders of dividing the size
    * by the supplied value as a new size.
    * 
    * @return the integer remainders of dividing the size by the value
    * as a new size
    */
  def modulo(value: Double): Size = js.native
  
  /** 
    * Returns the multiplication of the supplied value with the width and
    * height of the size as a new size. The object itself is not modified!
    * 
    * @param number - the number to multiply by
    * 
    * @return the multiplication of the size and the value as a new size
    */
  def multiply(number: Double): Size = js.native
  /** 
    * Returns the multiplication of the width and height of the supplied size
    * with the size as a new size. The object itself is not modified!
    * 
    * @param size - the size to multiply by
    * 
    * @return the multiplication of the two sizes as a new size
    */
  def multiply(size: Size): Size = js.native
  
  /** 
    * Returns a new size with rounded {@link #width} and {@link #height}
    * values. The object itself is not modified!
    */
  def round(): Size = js.native
  
  /** 
    * Sets the size to the passed values. Note that any sequence of parameters
    * that is supported by the various {@link Size} constructors also work
    * for calls of `set()`.
    */
  def set(values: js.Any*): Size = js.native
  
  /** 
    * Returns the subtraction of the supplied value from the width and height
    * of the size as a new size. The object itself is not modified!
    * The object itself is not modified!
    * 
    * @param number - the number to subtract
    * 
    * @return the subtraction of the size and the value as a new size
    */
  def subtract(number: Double): Size = js.native
  /** 
    * Returns the subtraction of the width and height of the supplied size from
    * the size as a new size. The object itself is not modified!
    * 
    * @param size - the size to subtract
    * 
    * @return the subtraction of the two sizes as a new size
    */
  def subtract(size: Size): Size = js.native
  
  /** 
    * The width of the size
    */
  var width: Double = js.native
}
