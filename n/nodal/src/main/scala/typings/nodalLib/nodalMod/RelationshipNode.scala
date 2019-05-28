package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "RelationshipNode")
@js.native
class RelationshipNode protected () extends js.Object {
  def this(Graph: RelationshipGraph, mModel: nodalLib.TypeofClassModel) = this()
  var Graph: RelationshipGraph = js.native
  var Model: nodalLib.TypeofClassModel = js.native
  var edges: js.Array[RelationshipEdge] = js.native
  def cascade(): js.Array[RelationshipPath] = js.native
  def childEdges(): js.Array[RelationshipEdge] = js.native
  def find(name: java.lang.String): RelationshipPath | scala.Null = js.native
  def findExplicit(pathname: java.lang.String): RelationshipPath | scala.Null = js.native
  def joinsTo(mModel: nodalLib.TypeofClassModel, options: IOptions): RelationshipEdge | scala.Null = js.native
}

