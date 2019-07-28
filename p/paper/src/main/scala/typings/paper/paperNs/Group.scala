package typings.paper.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Group")
@js.native
/**
  * Creates a new Group item and places it at the top of the active layer.
  * @param children [optional] - An array of Item Objects children that will be added to the newly created group.
  */
class Group () extends Item {
  def this(children: js.Array[Item]) = this()
  def this(`object`: js.Any) = this()
  /**
    * Specifies whether the group item is to be clipped.
    * When setting to true, the first child in the group is automatically defined as the clipping mask.
    */
  var clipped: Boolean = js.native
}

