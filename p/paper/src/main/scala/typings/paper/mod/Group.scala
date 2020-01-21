package typings.paper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

