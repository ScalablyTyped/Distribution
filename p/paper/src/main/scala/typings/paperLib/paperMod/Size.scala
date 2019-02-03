package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Size")
@js.native
class Size protected ()
  extends paperLib.paperNs.Size {
  /**
    * Creates a Size object using the numbers in the given array as dimensions.
    * @param array - an array of numbers
    */
  def this(array: js.Array[scala.Double]) = this()
  /**
    * Creates a Size object using the properties in the given object.
    * @param object - the object literal containing properies (width:10, height:10 etc)
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a Size object using the point.x and point.y values of the given Point object.
    * @param point - the point from which to create a size
    */
  def this(point: paperLib.paperNs.Point) = this()
  /**
    * Creates a Size object using the coordinates of the given Size object.
    * @param size - the size to duplicate from
    */
  def this(size: paperLib.paperNs.Size) = this()
  /**
    * Creates a Size object with the given width and height values.
    * @param width - the width
    * @param height - the height
    */
  def this(width: scala.Double, height: scala.Double) = this()
}

/* static members */
@JSImport("paper", "Size")
@js.native
object Size extends js.Object {
  /**
    * Returns a new size object with the largest width and height of the supplied sizes.
    * @param size1 - the first size
    * @param size2 - the second size
    */
  def max(size1: paperLib.paperNs.Size, size2: paperLib.paperNs.Size): paperLib.paperNs.Size = js.native
  /**
    * Returns a new size object with the smallest width and height of the supplied sizes.
    * @param size1 - the first size
    * @param size2 - the second size
    */
  def min(size1: paperLib.paperNs.Size, size2: paperLib.paperNs.Size): paperLib.paperNs.Size = js.native
  /**
    * Returns a size object with random width and height values between 0 and 1.
    */
  def random(): paperLib.paperNs.Size = js.native
}

