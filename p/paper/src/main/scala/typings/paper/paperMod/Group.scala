package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A Group is a collection of items. When you transform a Group, its
  * children are treated as a single unit without changing their relative
  * positions.
  */
@JSImport("paper", "Group")
@js.native
/** 
  * Creates a new Group item and places it at the top of the active layer.
  * 
  * @param children - An array of children that will be added to the
  * newly created group
  */
class Group ()
  extends typings.paper.paper.Group {
  def this(children: js.Array[typings.paper.paper.Item]) = this()
  /** 
    * Creates a new Group item and places it at the top of the active layer.
    * 
    * @param object - an object containing the properties to be set on
    *     the group
    */
  def this(`object`: js.Object) = this()
}

