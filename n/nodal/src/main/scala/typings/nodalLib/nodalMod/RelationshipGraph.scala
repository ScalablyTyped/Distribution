package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "RelationshipGraph")
@js.native
class RelationshipGraph () extends js.Object {
  var edges: js.Array[RelationshipEdge] = js.native
  var nodes: js.Array[RelationshipNode] = js.native
  def of(mModel: nodalLib.Anon_CalcField): RelationshipNode = js.native
}

