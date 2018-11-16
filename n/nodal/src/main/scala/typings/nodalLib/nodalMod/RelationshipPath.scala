package typings
package nodalLib.nodalMod

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
  def getModel(): ScalablyTyped.runtime.Instantiable3[
    /* modelData */ js.Object, 
    /* fromStorage */ js.UndefOr[/* fromStorage */ scala.Boolean], 
    /* fromSeed */ js.UndefOr[/* fromSeed */ scala.Boolean], 
    Model
  ] = js.native
  def immediateMultiple(): scala.Boolean = js.native
  def joinName(): java.lang.String = js.native
  def joinName(reverse: scala.Boolean): java.lang.String = js.native
  def joins(): js.Array[IJoin] = js.native
  def joins(alias: java.lang.String): js.Array[IJoin] = js.native
  def joins(alias: java.lang.String, firstTable: java.lang.String): js.Array[IJoin] = js.native
  def joins(alias: scala.Null, firstTable: java.lang.String): js.Array[IJoin] = js.native
  def multiple(): scala.Boolean = js.native
}

