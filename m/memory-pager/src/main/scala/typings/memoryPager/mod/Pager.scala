package typings.memoryPager.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pager
  extends /**
  * Create a new pager.
  * @param pageSize defaults to 1024.
  */
Instantiable0[PagerInstance]
     with Instantiable1[/* pageSize */ Double, PagerInstance] {
  /**
    * Create a new pager.
    * @param pageSize defaults to 1024.
    */
  def apply(): PagerInstance = js.native
  def apply(pageSize: Double): PagerInstance = js.native
}

