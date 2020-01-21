package typings.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-object-hash/dist/objectSorter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Object sorter consturctor
    * @param options object transformation options
    * @returns function that transforms object to strings
    */
  def apply(): js.Function1[/* obj */ js.Any, String] = js.native
  def apply(options: SorterOptions): js.Function1[/* obj */ js.Any, String] = js.native
}

