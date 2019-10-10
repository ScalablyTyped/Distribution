package typings.paper

import org.scalablytyped.runtime.Instantiable2
import typings.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassSize extends Instantiable2[/* width */ Double, /* height */ Double, Size] {
  /** 
    * Returns a new size object with the largest {@link #width} and
    * {@link #height} of the supplied sizes.
    * 
    * @return the newly created size object
    */
  def max(size1: Size, size2: Size): Size = js.native
  /** 
    * Returns a new size object with the smallest {@link #width} and
    * {@link #height} of the supplied sizes.
    * 
    * @return the newly created size object
    */
  def min(size1: Size, size2: Size): Size = js.native
  /** 
    * Returns a size object with random {@link #width} and {@link #height}
    * values between `0` and `1`.
    * 
    * @return the newly created size object
    */
  def random(): Size = js.native
}

