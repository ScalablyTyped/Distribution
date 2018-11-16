package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Group")
@js.native
class Group () extends Item {
  /**
           * Creates a new Group item and places it at the top of the active layer.
           * @param children [optional] - An array of Item Objects children that will be added to the newly created group.
           */
  def this(children: js.Array[Item]) = this()
  /**
           * Creates a new Group item and places it at the top of the active layer.
           * @param object [optional] - an object literal containing the properties to be set on the group.
           */
  def this(`object`: js.Any) = this()
  /**
           * Specifies whether the group item is to be clipped.
           * When setting to true, the first child in the group is automatically defined as the clipping mask.
           */
  var clipped: scala.Boolean = js.native
}

