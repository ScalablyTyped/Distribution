package typings.objectRefs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("object-refs", "Collection")
@js.native
object Collection extends js.Object {
  /** Extends a collection with Refs aware methods */
  def extend(collection: js.Array[_], refs: Refs, property: String, target: js.Any): js.Any = js.native
  def extend(collection: js.Array[_], refs: Refs, property: AttributeDescriptor, target: js.Any): js.Any = js.native
  def isExtended(collection: js.Array[_]): Boolean = js.native
}

