package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A Group is a collection of items. When you transform a Group, its
  * children are treated as a single unit without changing their relative
  * positions.
  */
@JSGlobal("paper.Group")
@js.native
/** 
  * Creates a new Group item and places it at the top of the active layer.
  * 
  * @param children - An array of children that will be added to the
  * newly created group
  */
class Group () extends Item {
  def this(children: js.Array[Item]) = this()
  /** 
    * Creates a new Group item and places it at the top of the active layer.
    * 
    * @param object - an object containing the properties to be set on
    *     the group
    */
  def this(`object`: js.Object) = this()
  /** 
    * Specifies whether the group item is to be clipped. When setting to
    * `true`, the first child in the group is automatically defined as the
    * clipping mask.
    */
  var clipped: Boolean | Null = js.native
}

