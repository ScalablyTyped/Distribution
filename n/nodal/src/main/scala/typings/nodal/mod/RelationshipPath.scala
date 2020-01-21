package typings.nodal.mod

import typings.nodal.TypeofClassModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "RelationshipPath")
@js.native
class RelationshipPath protected () extends js.Object {
  def this(path: js.Array[RelationshipEdge | RelationshipNode]) = this()
  var constructor: js.Any = js.native
  var path: js.Array[RelationshipEdge | RelationshipNode] = js.native
  def add(node: RelationshipNode, edge: RelationshipEdge): RelationshipPath = js.native
  def getModel(): TypeofClassModel = js.native
  def immediateMultiple(): Boolean = js.native
  def joinName(): String = js.native
  def joinName(reverse: Boolean): String = js.native
  def joins(): js.Array[IJoin] = js.native
  def joins(alias: String): js.Array[IJoin] = js.native
  def joins(alias: String, firstTable: String): js.Array[IJoin] = js.native
  def joins(alias: Null, firstTable: String): js.Array[IJoin] = js.native
  def multiple(): Boolean = js.native
}

