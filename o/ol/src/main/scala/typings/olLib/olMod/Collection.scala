package typings
package olLib.olMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "Collection")
@js.native
class Collection[T] ()
  extends olLib.collectionMod.default[T] {
  def this(opt_array: js.Array[T]) = this()
  def this(opt_array: js.Array[T], opt_options: olLib.collectionMod.Options) = this()
}

