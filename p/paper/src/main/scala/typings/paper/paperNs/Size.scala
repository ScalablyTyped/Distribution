package typings.paper.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Size")
@js.native
class Size protected () extends Base {
  /**
    * Creates a Size object using the numbers in the given array as dimensions.
    * @param array - an array of numbers
    */
  def this(array: js.Array[Double]) = this()
  /**
    * Creates a Size object using the properties in the given object.
    * @param object - the object literal containing properies (width:10, height:10 etc)
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a Size object using the point.x and point.y values of the given Point object.
    * @param point - the point from which to create a size
    */
  def this(point: Point) = this()
  /**
    * Creates a Size object using the coordinates of the given Size object.
    * @param size - the size to duplicate from
    */
  def this(size: Size) = this()
  /**
    * Creates a Size object with the given width and height values.
    * @param width - the width
    * @param height - the height
    */
  def this(width: Double, height: Double) = this()
  /**
    * The height of the size
    */
  var height: Double = js.native
  /**
    * The width of the size
    */
  var width: Double = js.native
  /**
    * Returns a new size with the absolute values of the specified width and height values. The object itself is not modified!
    */
  def abs(): Size = js.native
  def add(size: js.Array[Double]): Size = js.native
  def add(size: Double): Size = js.native
  /*
    * Returns a new size
    * @param size - The size you want to add with
    */
  def add(size: Size): Size = js.native
  /**
    * Returns a new size with the nearest greater non-fractional values to the specified width and height values. The object itself is not modified!
    */
  def ceil(): Size = js.native
  def divide(size: js.Array[Double]): Size = js.native
  def divide(size: Double): Size = js.native
  /*
    * Returns the new divided size
    * @param size - The size you want to divide with
    */
  def divide(size: Size): Size = js.native
  /**
    * Checks whether the width and height of the size are equal to those of the supplied size.
    */
  def equals(size: Size): Boolean = js.native
  /**
    * Returns a new size with the nearest smaller non-fractional values to the specified width and height values. The object itself is not modified!
    */
  def floor(): Size = js.native
  /**
    * Checks if the width or the height of the size are NaN.
    */
  def isNaN(): Boolean = js.native
  /**
    * Checks if this size has both the width and height set to 0.
    */
  def isZero(): Boolean = js.native
  def modulo(size: js.Array[Double]): Size = js.native
  def modulo(size: Double): Size = js.native
  /**
    * Returns the new modulo size
    * @param size - The size you want to modulo with
    */
  def modulo(size: Size): Size = js.native
  def multiply(size: js.Array[Double]): Size = js.native
  def multiply(size: Double): Size = js.native
  /*
    * Returns the new multiplied size
    * @param size - The size you want to multiply with
    */
  def multiply(size: Size): Size = js.native
  /**
    * Returns a new size with rounded width and height values. The object itself is not modified!
    */
  def round(): Size = js.native
  /**
    * Sets the size using the numbers in the given array as dimensions.
    * @param array - an array of numbers
    */
  def set(array: js.Array[Double]): Size = js.native
  /**
    * Sets the size using the properties in the given object.
    * @param object - the object literal containing properies (width:10, height:10 etc)
    */
  def set(`object`: js.Any): Size = js.native
  /**
    * Sets the size using the point.x and point.y values of the given Point object.
    * @param point - the point from which to create a size
    */
  def set(point: Point): Size = js.native
  /**
    * Sets the size using the coordinates of the given Size object.
    * @param size - the size to duplicate from
    */
  def set(size: Size): Size = js.native
  /**
    * Sets the size with the given width and height values.
    * @param width - the width
    * @param height - the height
    */
  def set(width: Double, height: Double): Size = js.native
  def subtract(size: js.Array[Double]): Size = js.native
  def subtract(size: Double): Size = js.native
  /*
    * Returns a new size
    * @param size - The size you want to subtract with
    */
  def subtract(size: Size): Size = js.native
}

/* static members */
@JSGlobal("paper.Size")
@js.native
object Size extends js.Object {
  /**
    * Returns a new size object with the largest width and height of the supplied sizes.
    * @param size1 - the first size
    * @param size2 - the second size
    */
  def max(size1: Size, size2: Size): Size = js.native
  /**
    * Returns a new size object with the smallest width and height of the supplied sizes.
    * @param size1 - the first size
    * @param size2 - the second size
    */
  def min(size1: Size, size2: Size): Size = js.native
  /**
    * Returns a size object with random width and height values between 0 and 1.
    */
  def random(): Size = js.native
}

