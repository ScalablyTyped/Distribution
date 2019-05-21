package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Height
  extends org.scalablytyped.runtime.Instantiable2[/* width */ scala.Double, /* height */ scala.Double, paperLib.paperNs.Size] {
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

