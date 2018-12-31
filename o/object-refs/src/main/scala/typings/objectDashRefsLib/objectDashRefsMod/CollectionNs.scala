package typings
package objectDashRefsLib.objectDashRefsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("object-refs", "Collection")
@js.native
object CollectionNs extends js.Object {
  /** Extends a collection with Refs aware methods */
  def extend(
    collection: js.Array[_],
    refs: objectDashRefsLib.objectDashRefsMod.Refs,
    property: java.lang.String,
    target: js.Any
  ): js.Any = js.native
  def extend(
    collection: js.Array[_],
    refs: objectDashRefsLib.objectDashRefsMod.Refs,
    property: objectDashRefsLib.objectDashRefsMod.RefsNs.AttributeDescriptor,
    target: js.Any
  ): js.Any = js.native
  def isExtended(collection: js.Array[_]): scala.Boolean = js.native
}

