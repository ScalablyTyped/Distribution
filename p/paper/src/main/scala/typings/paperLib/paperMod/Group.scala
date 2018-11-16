package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Group")
@js.native
class Group ()
  extends paperLib.paperNs.Group {
  /**
           * Creates a new Group item and places it at the top of the active layer.
           * @param children [optional] - An array of Item Objects children that will be added to the newly created group.
           */
  def this(children: js.Array[paperLib.paperNs.Item]) = this()
  /**
           * Creates a new Group item and places it at the top of the active layer.
           * @param object [optional] - an object literal containing the properties to be set on the group.
           */
  def this(`object`: js.Any) = this()
}

