package typings
package olLib.collectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Collection", JSImport.Default)
@js.native
/**
  * @classdesc
  * An expanded version of standard JS Array, adding convenience methods for
  * manipulation. Add and remove changes to the Collection trigger a Collection
  * event. Note that this does not cover changes to the objects _within_ the
  * Collection; they trigger events on the appropriate object, not on the
  * Collection as a whole.
  *
  * @fires ol.Collection.Event
  * @param opt_array Array.
  * @template T
  * @api stable
  */
class default[T] ()
  extends openlayersLib.openlayersMod.Collection[T] {
  def this(opt_array: js.Array[T]) = this()
}

