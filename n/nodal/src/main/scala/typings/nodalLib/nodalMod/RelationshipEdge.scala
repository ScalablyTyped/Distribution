package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "RelationshipEdge")
@js.native
class RelationshipEdge protected () extends js.Object {
  def this(parent: RelationshipNode, child: RelationshipNode, options: IOptions) = this()
  var child: RelationshipNode = js.native
  var id: scala.Double = js.native
  var options: IOptions = js.native
  var parent: RelationshipNode = js.native
  def hasChild(child: RelationshipNode): scala.Boolean = js.native
  def hasParent(parent: RelationshipNode): scala.Boolean = js.native
  def opposite(node: RelationshipNode): RelationshipNode | scala.Null = js.native
}

