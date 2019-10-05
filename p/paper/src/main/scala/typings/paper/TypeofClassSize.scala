package typings.paper

import org.scalablytyped.runtime.Instantiable2
import typings.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassSize extends Instantiable2[/* width */ Double, /* height */ Double, Size] {
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

